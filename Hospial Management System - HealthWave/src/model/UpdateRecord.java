
package model;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {
    Statement stmt;
    
    public void UpdateDoctor(String date, String id, String name, int age, String gender, String blood, String dept, String email, String phone, String status, String address, int ward, String username, String password, int count){
       try {
            stmt = Connector.ConnectDb();
            String sql = "Update doctor set date = '" + date + "', id = '" + id + "', name = '" + name + "', age = '" + age + "', gender = '" + gender + "', blood = '" + blood + "', dept = '" + dept + "', phone = '" + phone + "', email = '" + email + "', status = '" + status + "', address = '" + address + "', ward = '" + ward + "', username = '" + username + "', password = '" + password + "' where count = '" + count + "'";
            stmt.executeUpdate(sql);
        }
        catch (SQLException e){ 
    
        }
    }
    
    public void UpdateReceptionist(String date, String id, String name, String age, String gender, String blood, String email, String phone, String address, String status, String username, String password, int count){
       try {
            stmt = Connector.ConnectDb();
            String sql = "Update receptionist set joining = '" + date + "', id = '" + id + "', name = '" + name + "', age = '" + age + "', gender = '" + gender + "', blood = '" + blood + "', email = '" + email + "', phone = '" + phone + "', address = '" + address + "', status = '" + status + "', username = '" + username + "', password = '" + password + "' where count = '" + count + "'";
            stmt.executeUpdate(sql);  
        }
        catch (SQLException e){ 
    
        }
    }
    
    public void UpdatePatient(String date, String id, String name, int age, String gender, String address, String phone, String status, String disease, int room, int count){
       try {
            stmt = Connector.ConnectDb();
            String sql = "Update patient set date = '" + date + "', id = '" + id + "', name = '" + name + "', age = '" + age + "', gender = '" + gender + "', address = '" + address + "', phone = '" + phone + "', status = '" + status + "', disease = '" + disease + "', room = '" + room + "' where count = '" + count + "'";
            stmt.executeUpdate(sql);
            
        }
        catch (SQLException e){ 
    
        }
    }
    
}
