package DBtest;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ifti
 */

public class ConnectionProvider {

    static final String DB_URL = "jdbc:mysql://localhost:3306/LMS";
    static final String USER = "root";
    static final String PASS = "password";

    public static void main(String[] args) throws SQLException {
        // Open a connection
        System.out.println("main");
        try {
            getCon();
            new Login1().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static java.sql.Connection getCon() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("success");
        }
        return null;

    }
}
