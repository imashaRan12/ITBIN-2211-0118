
package model;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {
    Statement stmt;
    
    public void DeleteDoctor(String docId){
        stmt = Connector.ConnectDb();
        try {
            stmt.executeUpdate("DELETE FROM doctor WHERE id='"+docId+"' ");
          
        } catch(SQLException e){
        }
    }
    
    public void DeleteReceptionist(String recepId){
        stmt = Connector.ConnectDb();
        try {
            stmt.executeUpdate("DELETE FROM receptionist WHERE id='"+recepId+"' ");
          
        } catch(SQLException e){
        }
    }
    
    public void DeletePatient(String patId){
        stmt = Connector.ConnectDb();
        try {
            stmt.executeUpdate("DELETE FROM patient WHERE id='"+patId+"' ");
          
        } catch(SQLException e){
        }
    }
    
}
