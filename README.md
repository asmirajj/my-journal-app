# Journal App

A simple journaling web application built with **Spring Boot** and an in-browser **HTML frontend**. It supports creating, viewing, retrieving, and deleting journal entries using a lightweight RESTful backend and an H2 in-memory database.

---

## Features

- Add new journal entries
- View all journal entries
- Get journal entry by ID
- Delete journal entries
- Built-in REST API with JSON support
- Light pastel pink frontend UI
- In-memory database (H2)

---

## Tech Stack

**Backend:**
- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database

**Frontend:**
- HTML5
- CSS3 (pastel pink theme)
- Vanilla JavaScript (for API interaction)

---

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/asmirajj/my-journal-app.git
cd my-journal-app
```

### 2. Build & Run the Application
You can run the project using your IDE or terminal:

```bash
./mvnw spring-boot:run
```
The backend will start on http://localhost:8080.

### 3. Access the Frontend
Open index.html in your browser to use the frontend interface.

## API Endpoints

| Method | Endpoint         | Description         |
|--------|------------------|---------------------|
| GET    | `/entries`       | Get all entries     |
| GET    | `/entries/{id}`  | Get entry by ID     |
| POST   | `/entries`       | Add new entry       |
| DELETE | `/entries/{id}`  | Delete entry by ID  |


