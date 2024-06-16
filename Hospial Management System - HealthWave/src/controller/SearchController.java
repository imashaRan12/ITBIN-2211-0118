
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.DBSearch;

public class SearchController {
    
    public static void SearchDoctor(String docName){
        if(docName.length()==0){
            JOptionPane.showMessageDialog(null, "Please Enter a Doctor's Name", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                ResultSet rs = new DBSearch().doctorSearchName(docName);
                if(rs.next()==false){
                    JOptionPane.showMessageDialog(null, "Invalid Doctor's Name", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Doctor has been Founded", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch (SQLException ex) {
            }
        }
    }
    
    public static void SearchReceptionist(String recepName){
        if(recepName.length()==0){
            JOptionPane.showMessageDialog(null, "Please Enter a Receptionist's Name", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                ResultSet rs = new DBSearch().receptionistSearchName(recepName);
                if(rs.next()==false){
                    JOptionPane.showMessageDialog(null, "Invalid Receptionist's Name", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Receptionist has been Founded", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch (SQLException ex) {
            }
        }
    }
    
    public static void SearchPatient(String patName){
        if(patName.length()==0){
            JOptionPane.showMessageDialog(null, "Please Enter a Patient's Name", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                ResultSet rs = new DBSearch().patientSearchName(patName);
                if(rs.next()==false){
                    JOptionPane.showMessageDialog(null, "Invalid Patient's Name", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Patient has been Founded", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch (SQLException ex) {
            }
        }
    }
}
