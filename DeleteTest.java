package db;

import java.sql.*;

public class DeleteTest {
    public static void main(String[] args) {
        int id = 5;  // your ID

        String sql = "DELETE FROM [DL27Login] WHERE ID = ?";
        try (Connection conn = db.SqlServerDbAccessor.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            System.out.println("Deleted rows: " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}