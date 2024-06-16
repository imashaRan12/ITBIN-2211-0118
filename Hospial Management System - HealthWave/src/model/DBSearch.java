
package model;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DBSearch {
    Statement stmt = null;
    ResultSet result = null;
    
    //Login Parts for Searching by username
    public ResultSet adminLogin(String username) {
        stmt = Connector.ConnectDb();
        try {
            String sql = "select username, password from admin where username='" + username + "'";
            result = stmt.executeQuery(sql);
          
        } catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Username or Password incorrect");
        }
        return result;
    }  
    
    public ResultSet receptionistLogin(String username){
        stmt = Connector.ConnectDb();
        try {
            String sql = "select username, password from receptionist where username='" + username + "'";
            result = stmt.executeQuery(sql);
          
        } catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Username or Password incorrect");
        }
        return result;
    }
    
    public ResultSet doctorLogin(String username){
        stmt = Connector.ConnectDb();
        try {
            String sql = "select username, password from doctor where username='" + username + "'";
            result = stmt.executeQuery(sql);
          
        } catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Username or Password incorrect");
        }
        return result;
    }
    
    //Delete Parts for Searching by Id
    public ResultSet doctorDeleteId(String docId){
        stmt = Connector.ConnectDb();
        try {
            String sql = "select * from doctor where id='" + docId + "'";
            result = stmt.executeQuery(sql);
          
        } catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Can't find");
        }
        return result;
    }
    
    public ResultSet receptionistDeleteId(String recepId){
        stmt = Connector.ConnectDb();
        try {
            String sql = "select * from receptionist where id='" + recepId + "'";
            result = stmt.executeQuery(sql);
          
        } catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Can't find");
        }
        return result;
    }
    
    public ResultSet patientDeleteId(String patId){
        stmt = Connector.ConnectDb();
        try {
            String sql = "select * from patient where id='" + patId + "'";
            result = stmt.executeQuery(sql);
          
        } catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Can't find");
        }
        return result;
    }
    
    //To view the Table
    public ResultSet searchDoctor(){
        try{
            stmt=Connector.ConnectDb();
            result =stmt.executeQuery("SELECT * FROM doctor");
        }
        catch(SQLException e){           
        }    
    return result;
    }
    
    public ResultSet searchReceptionist(){
        try{
            stmt=Connector.ConnectDb();
            result =stmt.executeQuery("SELECT * FROM receptionist");
        }
        catch(SQLException e){           
        }    
    return result;
    }
    
    public ResultSet searchPatient(){
        try{
            stmt=Connector.ConnectDb();
            result =stmt.executeQuery("SELECT * FROM patient");
        }
        catch(SQLException e){           
        }    
    return result;
    }

    //Search Part for Searching by name
    public ResultSet doctorSearchName(String docName){
        stmt = Connector.ConnectDb();
        try {
            String sql = "select * from doctor where name='" + docName + "'";
            result = stmt.executeQuery(sql);
          
        } catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Can't find the name");
        }
        return result;
    }
    
    public ResultSet receptionistSearchName(String recepName){
        stmt = Connector.ConnectDb();
        try {
            String sql = "select * from receptionist where name='" + recepName + "'";
            result = stmt.executeQuery(sql);
          
        } catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Can't find the name"); 
        }
        return result;
    }
    
    public ResultSet patientSearchName(String patName){
        stmt = Connector.ConnectDb();
        try {
            String sql = "select * from patient where name='" + patName + "'";
            result = stmt.executeQuery(sql);
          
        } catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Can't find the name");
        }
        return result;
    }
    
    //Apointment part for search by doctor type
    public ResultSet searchDoctorByType(String doctorType) {
        stmt = Connector.ConnectDb();
        try {
            String sql = "SELECT * FROM doctor WHERE dept = '" + doctorType + "'";
            result = stmt.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public ResultSet fetchDistinctDoctorTypes() {
        stmt = Connector.ConnectDb();
        try {
            String sql = "SELECT DISTINCT dept FROM doctor";
            result = stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    //The AppointmentView data searching
    public ResultSet searchAppointment(){
        try{
            stmt=Connector.ConnectDb();
            result =stmt.executeQuery("SELECT * FROM appointment");
        }
        catch(SQLException e){           
        }    
    return result;
    }
    
    public ResultSet getPatientNameByDocName(String doctorName) {
        stmt = Connector.ConnectDb();
        try {
            String sql = "SELECT pName FROM appointment WHERE dName = '" + doctorName + "'";
            result = stmt.executeQuery(sql);
          
        } catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Can't find the name");
        }
        return result;
    }
    
    public ResultSet getAppointmentInfoByPatName(String PatName) {
        stmt = Connector.ConnectDb();
        try {
            String sql = "SELECT * FROM appointment WHERE pName = '" + PatName + "'";
            result = stmt.executeQuery(sql);
          
        } catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Can't find the name");
        }
        return result;
    }
    
}

