
package model;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

public class AddRecord {
    Statement stmt;
    
    public void AddDoctorDetails(String date, String id, String name, int age, String gender, String blood, String dept, String phone, String email, String status, String address, int ward, String user, String pass){
        stmt = Connector.ConnectDb();
        String sql = String.format("INSERT INTO doctor (date, id, name, age, gender, blood, dept, phone, email, status, address, ward, username, password)" 
                + "VALUES ('%s', '%s', '%s', '%d', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%d', '%s', '%s')", date, id, name, age, gender, blood, dept, phone, email, status, address, ward, user, pass);
        try{
            stmt.executeUpdate(sql);
        }
        catch(SQLException ex){
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void AddReceptionistDetails(String date, String id, String name, String age, String gender, String blood, String email, String phone, String address, String status, String user, String pass){
        stmt = Connector.ConnectDb();
        String sql = String.format("INSERT INTO receptionist (joining, id, name, age, gender, blood, email, phone, address, status, username, password)" 
                + "VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')", date, id, name, age, gender, blood, email, phone, address, status, user, pass);
        try{
            stmt.executeUpdate(sql);
        }
        catch(SQLException ex){
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void AddPatientDetails(String date, String id, String name, int age, String gender, String address, String phone, String status, String disease, int room){
        stmt = Connector.ConnectDb();
        String sql = String.format("INSERT INTO patient (date, id, name, age, gender, address, phone, status, disease, room)" 
                + "VALUES ('%s', '%s', '%s', '%d', '%s', '%s', '%s', '%s', '%s', '%d')", date, id, name, age, gender, address, phone, status, disease, room);
        try{
            stmt.executeUpdate(sql);
        }
        catch(SQLException ex){
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void AddAppointmentDetails(String pId, String pName, String dType, String dId, String dName, String appDate, String appTime, int ward){
        stmt = Connector.ConnectDb();
        String sql = String.format("INSERT INTO appointment (pId, pName, dType, dId, dName, appDate, appTime, ward)" 
                + "VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%d')", pId, pName, dType, dId, dName, appDate, appTime, ward);
        try{
            stmt.executeUpdate(sql);
        }
        catch(SQLException ex){
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
