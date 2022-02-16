package jm.task.core.jdbc.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    private static final String USER_NAME = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/pp_1_1_3-4_jdbc_hibernate-master";
    private static final String PASSWORD = "21842008E.v.g";
    private static final SessionFactory SESSION_FACTORY;

    static {
        Properties prop = new Properties();
        prop.setProperty("hibernate.connection.url", URL);
        prop.setProperty("dialect", "org.hibernate.dialect.MySQL5Dialect");
        prop.setProperty("hibernate.connection.username", USER_NAME);
        prop.setProperty("hibernate.connection.password", PASSWORD);
        prop.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
        SESSION_FACTORY = new Configuration().addProperties(prop).buildSessionFactory();
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
    }

    public static Session getSession() {
        return SESSION_FACTORY.openSession();
    }

}

