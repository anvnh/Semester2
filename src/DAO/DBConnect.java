package DAO;
import java.sql.*;
public class DBConnect {
    private Connection conn;
    public DBConnect() throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/employeedb";
        String user = "root";
        String password = "";
        conn = DriverManager.getConnection(url, user, password);
    }
    public Connection getConn()
    {
        return conn;
    }
}