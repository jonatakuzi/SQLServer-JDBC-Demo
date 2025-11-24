package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlServerDbAccessor {

    private static final String HOST = "csdata.cd4sevot432y.us-east-1.rds.amazonaws.com";
    private static final String DB   = "StudTest";
    private static final String USER = "csc312cloud";
    private static final String PASS = "c3s!c2Cld";

    // ✅ working connection string
    public static final String defaultConnUrl =
            "jdbc:sqlserver://" + HOST +
                    ";databaseName=" + DB +
                    ";user=" + USER +
                    ";password=" + PASS +
                    ";encrypt=true;trustServerCertificate=true;loginTimeout=10";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(defaultConnUrl);
    }
}