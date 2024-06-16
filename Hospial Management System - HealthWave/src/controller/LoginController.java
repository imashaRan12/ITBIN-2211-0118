
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.DBSearch;
import view.AdminActivity;
import view.DoctorActivity;
import view.ReceptionistActivity;

public class LoginController {
    
    public static void adminLogin(String username, String password, JFrame frame) {
       
        ResultSet result;
        String usernameDB = "", passwordDB = "";
        
        if(username.equals("") || password.equals("") ){
            JOptionPane.showMessageDialog(null, "Empty Fields", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            result = new DBSearch().adminLogin(username);
            try {
                while(result.next()){
                    usernameDB = result.getString("username");
                    passwordDB = result.getString("password");
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(username.equals(usernameDB) && password.equals(passwordDB)){
                System.out.println("Login Successfull");
                AdminActivity ad = new AdminActivity();
                ad.username = usernameDB;
                ad.adminName1.setText(username);
                ad.setVisible(true);
                frame.dispose();
                JOptionPane.showMessageDialog(null, "Login Successful", "Welcome " + username, JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "Error", JOptionPane.WARNING_MESSAGE);
            }  
        }
    }
    
    
    public static void receptionistLogin(String username, String password, JFrame frame) {
       
        ResultSet result;
        String usernameDB = "", passwordDB = "";
        
        if(username.equals("") || password.equals("") ){
            JOptionPane.showMessageDialog(null, "Empty Fields", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            result = new DBSearch().receptionistLogin(username);
            try {
                while(result.next()){
                    usernameDB = result.getString("username");
                    passwordDB = result.getString("password");
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(username.equals(usernameDB) && password.equals(passwordDB)){
                System.out.println("Login Successfull");
                ReceptionistActivity rep = new ReceptionistActivity();
                rep.username = usernameDB;
                rep.adminName.setText(username);
                rep.setVisible(true);
                frame.dispose();
                JOptionPane.showMessageDialog(null, "Login Successful", "Welcome " + username, JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "Error", JOptionPane.WARNING_MESSAGE);
            }  
        }
    }
    
    
    public static void doctorLogin(String username, String password, JFrame frame) {
       
        ResultSet result;
        String usernameDB = "", passwordDB = "";
        
        if(username.equals("") || password.equals("") ){
            JOptionPane.showMessageDialog(null, "Empty Fields", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            result = new DBSearch().doctorLogin(username);
            try {
                while(result.next()){
                    usernameDB = result.getString("username");
                    passwordDB = result.getString("password");
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(username.equals(usernameDB) && password.equals(passwordDB)){
                System.out.println("Login Successfull");
                DoctorActivity doc = new DoctorActivity(username);
                doc.setVisible(true);
                frame.dispose();
                JOptionPane.showMessageDialog(null, "Login Successful", "Welcome " + username, JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "Error", JOptionPane.WARNING_MESSAGE);
            }  
        }
    }
    
    
}
