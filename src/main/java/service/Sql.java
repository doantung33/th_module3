package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sql {
    public static String jdbcURL = "jdbc:mysql://localhost:3306/th_module3";
    public static String jdbcUser = "root";
    public static String jdbcPassword = "123456";
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);

            } catch (ClassNotFoundException e) {
                System.out.println("khong co driver");
            } catch (SQLException throwable) {
                System.out.println("khong co thu vien");
            }
            System.out.println("ket noi thanh cong");
        }
        return connection;
    }
}
