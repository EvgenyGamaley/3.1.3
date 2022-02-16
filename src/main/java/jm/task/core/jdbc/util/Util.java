package jm.task.core.jdbc.util;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class Util {
    private static final String USER_NAME = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/ugin";
    private static final String PASSWORD = "21842008E.v.g";

    static {
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
    }
}
