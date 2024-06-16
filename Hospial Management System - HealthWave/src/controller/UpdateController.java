
package controller;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import model.UpdateRecord;

public class UpdateController {
    
    public static void UpdatePatient(String date, String id,String name,int age,String gender,String address,String phone,String status,String disease,int room,int count){
        try {
            new UpdateRecord().UpdatePatient(date, id, name, age, gender, address, phone, status, disease, room, count);
            JOptionPane.showMessageDialog(null, "Data is Updated Successfully");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void UpdateReceptionist(String date, String id, String name, String age, String gender, String blood, String email, String phone, String address, String status, String username, String password, int count){
        try {
            new UpdateRecord().UpdateReceptionist(date, id, name, age, gender, blood, email, phone, address, status, username, password, count);
            JOptionPane.showMessageDialog(null, "Data is Updated Successfully");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void UpdateDoctor(String date, String id, String name, int age, String gender, String blood, String dept, String email, String phone, String status, String address, int ward, String username, String password, int count){
        try {
            new UpdateRecord().UpdateDoctor(date, id, name, age, gender, blood, dept, email, phone, status, address, ward, username, password, count);
            JOptionPane.showMessageDialog(null, "Data is Updated Successfully");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
