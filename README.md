# BasicCrud 🛠️

A beginner-friendly CRUD (Create, Read, Update, Delete) web application built with **Spring Boot**, **Thymeleaf**, **MySQL**, and **Aiven**.

> 📌 This project demonstrates full-stack CRUD operations with both a UI and RESTful API layer.

---

## 🚀 Features

- 🌐 Web Interface using Thymeleaf templates
- 🧩 RESTful APIs to support client-side or external integrations
- 🗃️ MySQL database integration via Spring Data JPA
- 🔐 Validation with Spring Boot Starter Validation
- 📡 Aiven-managed MySQL for cloud database hosting (configurable)

---

## 📁 Project Structure

```bash
BasicCrud/
├── src/
│   ├── main/
│   │   ├── java/com/example/CRUD/BasicCrud/
│   │   │   ├── controller/       # Web & API controllers
│   │   │   ├── models/           # DTOs and Entity classes
│   │   │   ├── repositories/     # Spring JPA Repositories
│   │   │   └── BasicCrudApplication.java
│   │   └── resources/
│   │       ├── templates/        # Thymeleaf HTML templates
│   │       └── application.properties  # (Not committed, contains Aiven Password)
├── pom.xml
└── README.md

```
---

## ⚙️ Setup Instructions

### Prerequisites
Java 17+

Maven

MySQL or Aiven DB instance

### Clone the repository
```bash
git clone https://github.com/your-username/BasicCrud.git
cd BasicCrud
```
### Configure the database
Create a file src/main/resources/application.properties and add:
```bash
spring.datasource.url=jdbc:mysql://<your-host>:<port>/<dbname>
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
### Run the application
```bash
./mvnw spring-boot:run
```
Then visit: http://localhost:8080

---

## 📬 Testing the API with Postman

You can test the REST API using [Postman](https://www.postman.com/).

### Example: Create a Client

- Method: `POST`
- URL: `http://localhost:8080/api/clients`
- Headers:
  - `Content-Type: application/json`
- Body (raw JSON):
```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "phone": "1234567890"
}
```
### Example: Get All Clients
Method: GET
URL: http://localhost:8080/api/clients

### Example: Update a Client
Method: PUT
URL: http://localhost:8080/api/clients/1

Body:

```json
{
  "name": "John Updated",
  "email": "john.updated@example.com",
  "phone": "9876543210"
}
```

### Example: Delete a Client
Method: DELETE
URL: http://localhost:8080/api/clients/1
