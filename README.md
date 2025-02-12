# Employee Management System Backend

This is a Spring Boot application for managing employees. It provides REST APIs for creating, retrieving, updating, and deleting employee records.

## Prerequisites

- Java 17
- Maven
- MySQL

## Getting Started

### Clone the repository

```sh
git clone https://github.com/yourusername/ems-backend.git
cd ems-backend
```

### Configure the Database

Update the application.properties file with your MySQL database credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ems
spring.datasource.username=root
spring.datasource.password=root
```

### Build the Project

Use the Maven wrapper to build the project:

```sh
./mvnw clean install
```

### Run the Application

```sh
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`.

## API Endpoints

### Create Employee

- **URL:** `/api/employees`
- **Method:** `POST`
- **Request Body:**
  ```json
  {
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com"
  }
  ```
- **Response:**
  ```json
  {
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com"
  }
  ```

### Get Employee by ID

- **URL:** `/api/employees/{id}`
- **Method:** `GET`
- **Response:**
  ```json
  {
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com"
  }
  ```

### Get All Employees

- **URL:** `/api/employees`
- **Method:** `GET`
- **Response:**
  ```json
  [
    {
      "id": 1,
      "firstName": "John",
      "lastName": "Doe",
      "email": "john.doe@example.com"
    }
  ]
  ```

### Update Employee

- **URL:** `/api/employees/{id}`
- **Method:** `PUT`
- **Request Body:**
  ```json
  {
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com"
  }
  ```
- **Response:**
  ```json
  {
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com"
  }
  ```

### Delete Employee

- **URL:** `/api/employees/{id}`
- **Method:** `DELETE`
- **Response:**
  ```json
  {
    "message": "Employee deleted"
  }
  ```

## Running Tests

To run the tests, use the following command:

```sh
./mvnw test
```

## License

This project is licensed under the Apache License 2.0. See the LICENSE file for details.

