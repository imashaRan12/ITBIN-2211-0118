
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.DBSearch;

public class DeleteController {
    
    public static void DeleteDoctor(String docId){
        if(docId.length()==0){
            JOptionPane.showMessageDialog(null, "Please Enter a Doctor's Id", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                ResultSet rs = new DBSearch().doctorDeleteId(docId);
                if(rs.next()==false){
                    JOptionPane.showMessageDialog(null, " Invalid Doctor's Id", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    new model.DeleteRecord().DeleteDoctor(docId);
                    JOptionPane.showMessageDialog(null, "Doctor has been Deleted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch (SQLException ex) {
            }
        }
    }
    
    public static void DeleteReceptionist(String recepId){
        if(recepId.length()==0){
            JOptionPane.showMessageDialog(null, "Please Enter a Receptionist's Id", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                ResultSet rs = new DBSearch().receptionistDeleteId(recepId);
                if(rs.next()==false){
                    JOptionPane.showMessageDialog(null, " Invalid Receptionist's Id", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    new model.DeleteRecord().DeleteReceptionist(recepId);
                    JOptionPane.showMessageDialog(null, "Receptionist has been Deleted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch (SQLException ex) {
            }
        }
    }
    
    public static void DeletePatient(String patId){
        if(patId.length()==0){
            JOptionPane.showMessageDialog(null, "Please Enter a Patient's Id", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                ResultSet rs = new DBSearch().patientDeleteId(patId);
                if(rs.next()==false){
                    JOptionPane.showMessageDialog(null, " Invalid Patient's Id", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    new model.DeleteRecord().DeletePatient(patId);
                    JOptionPane.showMessageDialog(null, "Patient has been Deleted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch (SQLException ex) {
            }
        }
    }
}
