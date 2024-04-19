


# Student CRUD API

This project is a simple CRUD (Create, Read, Update, Delete) API for managing student records. It's built using Spring Boot and MySQL.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed on your machine.
- Maven installed on your machine.
- MySQL installed on your machine.

## Setup

1. Clone the repository:

```
git clone <repository-url>
```

2. Navigate to the project directory:

```
cd student-crud-api
```

3. Update the MySQL database configurations in `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/<database-name>
spring.datasource.username=<username>
spring.datasource.password=<password>
```

4. Run the application:

```
mvn spring-boot:run
```

## Usage

The API exposes the following endpoints:

- `GET /getAllStudent`: Get all students.
- `GET /findById/{id}`: Get a student by ID.
- `POST /addStudent`: Create a new student.
- `PUT  /updateStudent`: Update an existing student.
- `DELETE /deleteStudent/{id}`: Delete a student by ID.

Make sure to replace `{id}` with the ID of the student you want to interact with.



## Contributing

Contributions are welcome! Please feel free to submit a pull request or open an issue.


