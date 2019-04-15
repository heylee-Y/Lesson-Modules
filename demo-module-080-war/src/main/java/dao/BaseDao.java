package dao;

import java.sql.*;

public class BaseDao {

    protected Connection connection;
    protected PreparedStatement ps;
    protected ResultSet result;

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER_NAME = "postgres";
    private static final String PASSWORD = "postgres";

    public Connection getConnection() {

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public void close(Connection connection, PreparedStatement ps, ResultSet result) {
        try {
            if (result != null)
                result.close();
            if (ps != null)
                ps.close();
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
