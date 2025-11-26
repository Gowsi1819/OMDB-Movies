package com.omdb.omdb_movie_explorer.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryCache<K, V> {
    
    private final Map<K, CacheItem<V>> cache = new ConcurrentHashMap<>();
    private final long ttlMillis;   // TTL (expiry time)
    private final int maxSize;      // Maximum entries allowed

    public InMemoryCache(long ttlMillis, int maxSize) {
        this.ttlMillis = ttlMillis;
        this.maxSize = maxSize;
    }

    public V get(K key) {
        CacheItem<V> item = cache.get(key);

        if (item == null) return null;

        long now = System.currentTimeMillis();
        if (now - item.timestamp > ttlMillis) {
            cache.remove(key);
            return null;
        }

        return item.value;
    }

    public void put(K key, V value) {

        // If cache is full, remove one entry
        if (cache.size() >= maxSize) {
            K firstKey = cache.keySet().iterator().next();
            cache.remove(firstKey);
        }

        cache.put(key, new CacheItem<>(value));
    }

    private static class CacheItem<V> {
        V value;
        long timestamp;

        CacheItem(V value) {
            this.value = value;
            this.timestamp = System.currentTimeMillis();
        }
    }
}
