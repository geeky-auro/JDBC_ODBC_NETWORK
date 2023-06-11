# JDBC_ODBC_NETWORK
JDBC (Java Database Connectivity) is a Java API that provides a standard way for Java programs to interact with databases. <br>
It allows Java applications to connect to and manipulate data in relational databases using SQL (Structured Query Language). <br>

**Here are some key points about JDBC:**

1. Database Connectivity: JDBC provides a set of classes and interfaces that allow Java applications to establish connections to various types of databases, such as Oracle, MySQL, SQL Server, and more.

2. JDBC Drivers: To connect to a specific database, you need a JDBC driver. The JDBC driver acts as a bridge between the Java application and the database. Each database vendor typically provides its own JDBC driver implementation.

3. JDBC API: The JDBC API consists of a set of interfaces and classes that define methods for performing common database operations, such as executing SQL statements, querying databases, retrieving and updating data, and managing database transactions.

4. Core JDBC Components: The core components of the JDBC API include the DriverManager, Connection, Statement, ResultSet, and SQLException classes.

5. JDBC Workflow: The typical workflow for using JDBC involves loading the appropriate JDBC driver, establishing a connection to the database, creating SQL statements, executing the statements, processing the result sets, and handling any exceptions that may occur.

6. SQL Operations: With JDBC, you can perform various SQL operations, including executing queries, retrieving and updating data, inserting new records, deleting records, and managing database transactions.

7. PreparedStatement: JDBC provides a PreparedStatement interface that allows you to pre-compile SQL statements with parameters. This can improve performance and security by preventing SQL injection attacks.

8. Exception Handling: JDBC uses the SQLException class to handle database-related exceptions. It provides information about the cause of the exception, such as syntax errors, connection failures, and constraint violations.
