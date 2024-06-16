
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Connector {
    static Connection connection = null;
    static Statement stmt = null;

    public static Statement ConnectDb() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb?useSSL=true", "root", "");
//            JOptionPane.showMessageDialog(null, "Connection Established");
            stmt = connection.createStatement();     
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return stmt;
    }
    
    public static void closeCon() throws SQLException{
    connection.close();
    }
}

