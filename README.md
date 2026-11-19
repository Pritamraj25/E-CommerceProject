
# 🛒 Product Management System

A responsive **Product Management System** developed using Java, Spring Boot, Spring MVC, Spring Data JPA, Hibernate, Thymeleaf, and MySQL.

This application allows users to manage products efficiently through CRUD operations with a responsive user interface and pagination.

## 🚀 Features

- **Add Product:** Add new products with name, price, category, and quantity.
- **View Products:** Display all available products in a responsive table.
- **Update Product:** Edit existing product information.
- **Delete Product:** Delete products with confirmation before deletion.
- **Pagination:** Navigate through product records using Previous, Next, and numbered pages.
- **Success Messages:** Display confirmation messages after successful operations.
- **Responsive UI:** Mobile-friendly design using Bootstrap 5.
- **Database Integration:** Store and manage product information using MySQL.

## 🛠️ Technologies Used

| Technology      | Purpose                      |
| --------------- | ---------------------------- |
| Java 21         | Programming Language         |
| Spring Boot     | Backend Framework            |
| Spring MVC      | Web Application Architecture |
| Spring Data JPA | Database Operations          |
| Hibernate       | ORM Framework                |
| MySQL           | Database                     |
| Thymeleaf       | Dynamic HTML Templates       |
| HTML5           | Web Page Structure           |
| CSS3            | Styling                      |
| Bootstrap 5     | Responsive UI                |
| JavaScript      | Client-side functionality    |
| Maven           | Dependency Management        |

## 📂 Project Structure

```
ProductManagement/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/pritamraj/
│   │   │       ├── controller/
│   │   │       │   └── ProductsController.java
│   │   │       │
│   │   │       ├── entity/
│   │   │       │   └── Products.java
│   │   │       │
│   │   │       ├── Repository/
│   │   │       │   └── ProductRepository.java
│   │   │       │
│   │   │       ├── service/
│   │   │       │   ├── ProductService.java
│   │   │       │   └── impl/
│   │   │       │       └── ProductServiceimpl.java
│   │   │       │
│   │   │       └── ProductManagementApplication.java
│   │   │
│   │   └── resources/
│   │       ├── templates/
│   │       │   ├── product-form.html
│   │       │   ├── update-form.html
│   │       │   └── products.html
│   │       │
│   │       └── application.properties
│   │
│   └── test/
│
├── pom.xml
└── README.md
```

## 🗄️ Database Configuration

Create a MySQL database:

```
CREATE DATABASE product_management;
```

Configure your `application.properties` file:

```
spring.application.name=ProductManagement

spring.datasource.url=jdbc:mysql://localhost:3306/product_management
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

server.port=8080
```

Replace `YOUR_PASSWORD` with your MySQL password.

## 📋 Product Entity

The application manages products using the following attributes:

| Field    | Data Type | Description        |
| -------- | --------- | ------------------ |
| id       | Integer   | Unique product ID  |
| name     | String    | Product name       |
| price    | Double    | Product price      |
| category | String    | Product category   |
| qty      | Integer   | Available quantity |

## ⚙️ Installation & Setup

Follow these steps to run the project locally.

**1. Clone the Repository**

```
git clone YOUR_GITHUB_REPOSITORY_URL
```

**2. Open the Project**

Import the project into Eclipse or IntelliJ IDEA as an existing Maven project.

**3. Configure MySQL**

- Start your MySQL server.
- Create the `product_management` database.
- Update database credentials in `application.properties`.

**4. Build the Project**

```
mvn clean install
```

**5. Run the Application**

Run the main Spring Boot application class:

```
ProductManagementApplication.java
```

Alternatively, use Maven:

```
mvn spring-boot:run
```

**6. Open in Browser**

```
http://localhost:8080/products
```

## 🌐 Application URLs

| URL               | Method | Description              |
| ----------------- | ------ | ------------------------ |
| `/product-form`   | GET    | Open Add Product Form    |
| `/save`           | POST   | Save or Update Product   |
| `/products`       | GET    | Display All Products     |
| `/update?id={id}` | GET    | Open Product Update Form |
| `/delete?id={id}` | GET    | Delete Product           |

## 🖥️ Application Screenshots

Add your project screenshots here:

### 1. Product Listing Page

\<!-- Add product listing screenshot here -->

### 2. Add Product Page

\<!-- Add add-product screenshot here -->

### 3. Update Product Page

\<!-- Add update-product screenshot here -->

### 4. Pagination

\<!-- Add pagination screenshot here -->

## 🎯 Learning Outcomes

Through this project, I practiced:

- Building MVC-based web applications using Spring Boot.
- Implementing CRUD operations.
- Working with Spring Data JPA and Hibernate.
- Connecting Java applications with MySQL.
- Using Thymeleaf for dynamic web pages.
- Implementing pagination.
- Designing responsive interfaces using Bootstrap.
- Managing application dependencies using Maven.

## 👨‍💻 Author

**Pritamraj Patil**

Java Backend Developer | Spring Boot | Hibernate | MySQL

---

⭐ If you find this project useful, consider giving it a star!

