# 💰 Expense Tracker

A simple and user-friendly **Expense Tracker web application** built using **Java, Spring Boot, Spring Data JPA, and MySQL**.

The application allows users to add, view, edit, and delete expenses while displaying useful expense summaries.

## 🚀 Features

* Add a new expense
* View all expenses
* Edit existing expenses
* Delete expenses
* Expense categories
* Automatic date recording
* Total expense calculation
* Total transaction count
* Average expense calculation
* Input validation
* Exception handling
* Responsive web interface

## 🛠️ Technologies Used

* **Java**
* **Spring Boot**
* **Spring Data JPA**
* **Hibernate**
* **MySQL**
* **HTML**
* **CSS**
* **JavaScript**
* **Maven**
* **VS Code**

## 📂 Project Structure

```text
src/main/java/com/example/expensetracker
│
├── controller
│   └── ExpenseController.java
│
├── entity
│   └── Expense.java
│
├── exception
│   ├── ResourceNotFoundException.java
│   └── GlobalExceptionHandler.java
│
├── repository
│   └── ExpenseRepository.java
│
└── service
    └── ExpenseService.java

src/main/resources
│
├── static
│   └── index.html
│
└── application.properties
```

## 🔄 Application Flow

```text
Frontend
   ↓
REST Controller
   ↓
Service Layer
   ↓
Repository
   ↓
MySQL Database
```

## 🔗 REST API Endpoints

| Method | Endpoint         | Description       |
| ------ | ---------------- | ----------------- |
| POST   | `/expenses`      | Add an expense    |
| GET    | `/expenses`      | Get all expenses  |
| PUT    | `/expenses/{id}` | Update an expense |
| DELETE | `/expenses/{id}` | Delete an expense |

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

### 2. Configure MySQL

Create a MySQL database:

```sql
CREATE DATABASE expense_tracker;
```

Configure your database connection in `application.properties`.

### 3. Run the application

Using Maven:

```bash
mvn spring-boot:run
```

Or run `ExpenseTrackerApplication.java` directly from VS Code.

### 4. Open the application

Open:

```text
http://localhost:8080
```

## 📌 Future Improvements

* User authentication and login
* Expense filtering by category
* Monthly expense reports
* Expense charts and visualizations
* Export expenses to CSV/PDF

## 👩‍💻 Author

**Shruti Sahu**
