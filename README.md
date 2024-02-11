<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  
</head>
<body>

  <h1>REST API CRUD Application</h1>

  <p>This is a simple CRUD (Create, Read, Update, Delete) application built using Spring framework. It provides endpoints to perform CRUD operations on a resource, allowing clients to interact with the application over HTTP.</p>

  <h2>Features</h2>

  <ul>
    <li><strong>Create:</strong> Add new records to the database by sending POST requests to the appropriate endpoint.</li>
    <li><strong>Read:</strong> Retrieve existing records from the database using GET requests.</li>
    <li><strong>Update:</strong> Modify existing records in the database by sending PUT or PATCH requests to the appropriate endpoint.</li>
    <li><strong>Delete:</strong> Remove records from the database using DELETE requests.</li>
  </ul>

  <h2>Technologies Used</h2>

  <ul>
    <li><strong>Spring Boot:</strong> Java-based framework for building RESTful web services.</li>
    <li><strong>Spring Data JPA:</strong> Provides easy integration with the JPA (Java Persistence API) for database operations.</li>
    <li><strong>Hibernate:</strong> ORM (Object-Relational Mapping) framework for mapping Java objects to database tables.</li>
    <li><strong>MySQL:</strong> Relational database management system used for storing data.</li>
    <li><strong>Maven:</strong> Dependency management tool for Java projects.</li>
  </ul>

  <h2>Getting Started</h2>

  <h3>Prerequisites</h3>

  <ul>
    <li>Java Development Kit (JDK) installed on your machine.</li>
    <li>Apache Maven installed on your machine.</li>
    <li>MySQL Server installed and running locally.</li>
  </ul>

  <h1>Exception Handling in Spring</h1>
  <p>
    Exception handling in Spring refers to the process of managing errors and unexpected events that may occur during the execution of a Spring application.
  </p>
  <h2>Common Spring Exceptions</h2>
  <ul>
    <li>NotFoundException: This exception occurs when a requested resource is not found, commonly used in RESTful APIs.</li>
    <li>BadRequestException: It indicates that the server cannot process the request due to invalid input or syntax.</li>
    <li>InternalServerErrorException: This exception indicates that something has gone wrong on the server side.</li>
  </ul>
  <h2>Handling Exceptions</h2>
  <p>
    In Spring, exceptions are handled using the `@ExceptionHandler` annotation, where you can define methods to handle specific exceptions.
  </p>
  <h2>Best Practices</h2>
  <ul>
    <li>Use specific exception types to catch and handle different error scenarios.</li>
    <li>Provide meaningful error messages to help users understand the nature of the problem.</li>
    <li>Log exceptions and stack traces for debugging purposes.</li>
  </ul>
  <h2>Example</h2>
  <p>
    Below is a simple example of exception handling in Spring using the `@ExceptionHandler` annotation:
  </p>
  <pre>
    <code>
@ExceptionHandler(NotFoundException.class)
public ResponseEntity<Object> handleNotFoundException(NotFoundException ex, WebRequest request) {
    ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
    return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
}
    </code>
  </pre>
  <p>
    This code snippet defines a method to handle the `NotFoundException` exception and return a customized error response with the appropriate HTTP status code.
  </p>
  <h2>Conclusion</h2>
  <p>
    Effective exception handling is crucial for developing robust and reliable Spring applications, ensuring that errors are handled gracefully and do not disrupt the user experience.
  </p>

</body>
</html>
