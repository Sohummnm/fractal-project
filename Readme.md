📘 Java Full-Stack Employee Manager

A simple Java-based full-stack application built with:

✅ JavaFX frontend
✅ Spring Boot backend
✅ Azure MySQL for persistent storage
✅ REST API communication
✅ Containerized with Docker

🚀 Features
Frontend (JavaFX)

Add employees

View all employees in a table

Desktop UI

Backend (Spring Boot)

REST endpoints (/employees)

JPA + Hibernate ORM

Connects to Azure MySQL

☁️ Azure MySQL Configuration

Create a new Azure MySQL Flexible Server and update:

backend/src/main/resources/application-local.properties

🏗️ Running the Project
Backend
cd backend
mvn clean package
java -jar target/backend-1.0.0.jar

Frontend
cd frontend
mvn clean javafx:run

🐳 Running with Docker
Backend
cd backend
docker build -t backend .
docker run -p 8080:8080 backend