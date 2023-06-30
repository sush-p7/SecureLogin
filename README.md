# SecureLogin
Simple Java servlet-based login application with MySQL integration.
## Login Application

This is a simple login application written in Java using the Servlet API and MySQL database. It allows users to register by entering their email and password, which are then stored in a MySQL database.

### Prerequisites

To run this application, you will need the following:

- Java Development Kit (JDK) installed
- Apache Tomcat or any other servlet container
- MySQL database server

### Setup

1. Clone or download the project to your local machine.

2. Open the project in your preferred Java Integrated Development Environment (IDE).

3. Ensure that the MySQL JDBC driver JAR file is included in the project's classpath. You can download the JDBC driver from the MySQL website (https://dev.mysql.com/downloads/connector/j/) and add it to your project's dependencies.

4. Create a MySQL database named `credentials` by executing the following SQL command:

   ```sql
   CREATE DATABASE credentials;
   ```

5. Create a table named `login` with two columns (`email` and `password`) in the `credentials` database using the following SQL command:

   ```sql
   CREATE TABLE login (
     email VARCHAR(255) NOT NULL,
     password VARCHAR(255) NOT NULL
   );
   ```

6. Update the database connection details in the `HelloServlet.java` file. Modify the following line with your MySQL server details:

   ```java
   Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/credentials", "root", "Sushantp@9");
   ```

   Replace `"root"` with your MySQL username and `"Sushantp@9"` with your MySQL password. If your MySQL server is running on a different port, modify `3306` accordingly.

7. Build the project to generate the WAR (Web Application Archive) file.

8. Deploy the WAR file to your servlet container (e.g., Apache Tomcat).

9. Start the servlet container.

10. Access the application by navigating to `http://localhost:8080/hello-servlet` in your web browser.

### Usage

1. The login form will be displayed on the web page.

2. Enter your email and password in the respective input fields.

3. Click the "Submit" button to register and store the entered email and password in the MySQL database.

4. If the registration is successful, the message "done" will be displayed on the webpage.

5. If any error occurs during the registration process, the error message will be displayed on the webpage.

### Note: Connecting to the Database

In order to connect to the MySQL database, you need to ensure that the MySQL server is installed and running on your system. Additionally, you need to provide the correct username and password to establish the database connection.

If you have a different MySQL username and password or your MySQL server is running on a different host or port, make sure to update the connection details in the `HelloServlet.java` file accordingly.

For example, if your MySQL username is "myuser" and the password is "mypassword", and your MySQL server is running on the default host (localhost) and port (3306), the connection line would look like this:

```java
Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/credentials", "myuser", "mypassword");
```

Make sure to modify the connection details based on your specific MySQL configuration.

### Conclusion

This is a basic login application using Java Servlets and MySQL. It demonstrates how to handle form data, establish a database connection, and perform database operations. Feel free to customize and enhance the application according to your requirements.
