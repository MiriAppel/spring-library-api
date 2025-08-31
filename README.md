# Library Management System

A REST API for managing library users, books, and magazines built with Spring Boot.

## Features

- **User Management**: Add, update, delete, and view library users
- **Item Management**: Manage books and magazines in the library
- **REST API**: Full CRUD operations via HTTP endpoints

## Technologies Used

- **Java 24**
- **Spring Boot 3.4.4**
- **Spring Data JPA**
- **Hibernate**
- **Microsoft SQL Server**
- **Maven**
- **Lombok**

## API Endpoints

### Users
- `GET /user/getAll` - Get all users
- `POST /user/add` - Add new user
- `PUT /user/update/{id}` - Update user
- `DELETE /user/delete/{id}` - Delete user

### Items
- `GET /item/getAll` - Get all items
- `POST /item/add` - Add new item
- `PUT /item/update/{id}` - Update item
- `DELETE /item/delete/{id}` - Delete item

## Database Configuration

Configure your SQL Server connection in `application.properties`:

```properties
spring.datasource.url=jdbc:sqlserver://[server];database=[database_name];trustServerCertificate=true;
spring.datasource.username=[username]
spring.datasource.password=[password]
```

## How to Run

1. Clone the repository
2. Configure database connection in `application.properties`
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```
4. Access the API at `http://localhost:8080`

## Project Structure

```
src/main/java/com/example/SpringProject/
├── controllers/     # REST controllers
├── entities/        # JPA entities
├── repositories/    # Data repositories
└── services/        # Business logic
```
