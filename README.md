# SQLServer-JDBC-Demo

A lightweight Java project demonstrating SQL Server database interaction using JDBC. Covers the full CRUD cycle, binary image storage and retrieval, and reusable connection management via a shared accessor class.

## Features

- Reusable `SqlServerDbAccessor` class for consistent DB connection management
- - **SELECT** — query and print rows using `ResultSet`
  - - **INSERT** — add new records with `PreparedStatement`
    - - **UPDATE** — modify existing rows by ID
      - - **DELETE** — remove specific records by condition
        - - **Image storage** — store and retrieve `VARBINARY(MAX)` image data as `ImageIcon` via Swing
         
          - ## Tech Stack
         
          - - Java 17+
            - - JDBC (Microsoft SQL Server driver `mssql-jdbc`)
              - - SQL Server (local or remote instance)
                - - Java Swing (for image display)
                 
                  - ## Project Structure
                 
                  - ```
                    SQLServer-JDBC-Demo/
                    ├── SqlServerDbAccessor.java   # DB connection setup and getConnection()
                    ├── DeleteTest.java            # DELETE record by ID
                    ├── RetrieveImageTest.java     # Load VARBINARY image from DB and render it
                    └── README.md
                    ```

                    ## Setup

                    1. Clone the repo
                    2. 2. Add the SQL Server JDBC driver (`mssql-jdbc-*.jar`) to your project's classpath
                       3. 3. Update the connection string in `SqlServerDbAccessor.java` with your server, database, username, and password
                          4. 4. Run any test class to see the operation in action
                            
                             5. ## Key Concepts
                            
                             6. - JDBC `Connection`, `Statement`, `PreparedStatement`, and `ResultSet` usage
                                - - Safe parameterized queries to prevent SQL injection
                                  - - Binary data (BLOB) round-trip: file to DB column to rendered image
                                    - - Single-responsibility DB accessor pattern for clean separation of concerns
