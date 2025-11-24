SQLServer-JDBC-Demo

A minimal Java JDBC project that connects to a SQL Server database and demonstrates two core operations: deleting a record and retrieving stored images from the database. The project uses Microsoft’s JDBC driver to establish a connection and execute SQL commands.

 Overview

This project shows how to:

Connect to a SQL Server instance using a reusable SqlServerDbAccessor class

Execute a DELETE statement on a specific row

Retrieve image data (BLOB) from SQL Server and display it using Swing

Parse results using JDBC’s ResultSet

It serves as a lightweight example of JDBC-based database interaction.

 Project Structure
src/
 ├── SqlServerDbAccessor.java     # Handles DB connection setup
 ├── DeleteTest.java              # Deletes a record by ID
 └── RetrieveTest.java            # Loads and displays an image from the DB
lib/
 └── mssql-jdbc-6.4.0.jre8.jar    # SQL Server JDBC driver

🧪 Features
🔹 Database Connection

All DB access is routed through SqlServerDbAccessor, which provides a consistent connection URL and getConnection() method.

🔹 Delete Operation

DeleteTest runs a SQL command such as:

DELETE FROM DL27Login
WHERE ID = ####;


Used to remove a specific record.

Image Retrieval

RetrieveTest reads VARBINARY(MAX) image data from SQL Server, converts it into an ImageIcon, and displays it using:

JOptionPane.showMessageDialog(null, icon);

 Running the Project

Add the JDBC driver JAR to your Build Path.

Update credentials/URL inside SqlServerDbAccessor if needed.

Run DeleteTest or RetrieveTest directly from your IDE.

 Requirements

Java 8+

SQL Server JDBC driver

A SQL Server table containing IDs and image BLOBs
