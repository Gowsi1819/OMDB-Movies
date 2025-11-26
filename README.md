OMDB Movie Explorer

A Spring Boot application that allows users to search and explore movie details using the OMDb (Open Movie Database) API.

📌 Overview

OMDB Movie Explorer is a simple and clean Spring Boot application that fetches movie information—such as title, year, genre, cast, plot, and ratings—from the OMDb API based on user input.
This project demonstrates API integration, MVC architecture, and a clean UI for movie search and display.

🚀 Features

Search movies by title

Display full movie details

OMDb API integration

Modular MVC architecture

Fast and lightweight Spring Boot application

Maven-based project with easy build and run

Clean and structured codebase

🛠️ Tech Stack

Backend: Java 17+, Spring Boot

Build Tool: Maven

View Layer: HTML / Thymeleaf (or JSP)

External API: OMDb REST API

Project Structure
omdb-movie-explorer/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ... controller, service, model classes
│   │   ├── resources/
│   │   │   ├── templates/        # UI pages
│   │   │   ├── static/           # JS, CSS
│   │   │   └── application.properties
├── pom.xml
├── mvnw
├── mvnw.cmd
├── README.md
├── HELP.md

⚙️ How to Run the Application
1. Clone the Repository
git clone https://github.com/your-username/omdb-movie-explorer.git
cd omdb-movie-explorer

2. Add Your OMDb API Key

Open:

src/main/resources/application.properties


Add:

omdb.api.key=YOUR_API_KEY_HERE


Get your free API key from:
https://www.omdbapi.com

3. Build the Project
mvn clean install

4. Run the Application
mvn spring-boot:run
