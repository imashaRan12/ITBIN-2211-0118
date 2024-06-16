
package controller;

import javax.swing.JOptionPane;

public class InsertController {
    
     public static void InsertDoctorDetails(String date, String id, String name, String Age, String gender, String blood, String dept, String phone, String email, String status, String address, String Room, String user, String pass){
         if(date.length()==0 || id.length()==0 || name.length()==0 || Age.length()==0 || gender.length()==0 || dept.length()==0 || phone.length()==0 || email.length()==0 || status.length()==0 || address.length()==0 || Room.length()==0 || user.length()==0 || pass.length()==0){
             JOptionPane.showMessageDialog(null, "Fill All the Details", "Message",JOptionPane.INFORMATION_MESSAGE);
         }
         else{
             int age = Integer.parseInt(Age);
             int ward = Integer.parseInt(Room);
             new model.AddRecord().AddDoctorDetails(date, id, name, age, gender, blood, dept, phone, email, status, address, ward, user, pass);
             JOptionPane.showMessageDialog(null, "Details has been Inserted", "Successful",JOptionPane.INFORMATION_MESSAGE);
         }
     }

    public static void InsertReceptionistDetails(String date, String id, String name, String age, String gender, String blood, String email, String phone, String address, String status, String user, String pass) {
        if(date.length()==0 || id.length()==0 || name.length()==0 || age.length()==0 || gender.length()==0 || blood.length()==0 || email.length()==0 || phone.length()==0 || address.length()==0 || status.length()==0 || user.length()==0 || pass.length()==0 ){
            JOptionPane.showMessageDialog(null, "Fill All the Details", "Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            new model.AddRecord().AddReceptionistDetails(date, id, name, age, gender, blood, email, phone, address, status, user, pass);
            JOptionPane.showMessageDialog(null, "Details has been Inserted", "Successful",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void InsertPatientDetails(String date, String id, String name, String Age, String gender, String address, String phone, String status, String disease, String Room) {
        if(date.length()==0 || id.length()==0 || name.length()==0 || Age.length()==0 || gender.length()==0 || address.length()==0 || phone.length()==0 || status.length()==0 || disease.length()==0 || Room.length()==0 ){
            JOptionPane.showMessageDialog(null, "Fill All the Details", "Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            int age = Integer.parseInt(Age);
            int room = Integer.parseInt(Room);
            new model.AddRecord().AddPatientDetails(date, id, name, age, gender, address, phone, status, disease, room);
            JOptionPane.showMessageDialog(null, "Details has been Inserted", "Successful",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void InsertAppointmentDetails(String pId, String pName, String dType, String dId, String dName, String appDate, String appTime, String Ward){
        if(pId.length()==0 || pName.length()==0 || dType.length()==0 || dId.length()==0 || dName.length()==0 || appDate.length()==0 || appTime.length()==0 || Ward.length()==0 ){
            JOptionPane.showMessageDialog(null, "Fill All the Details", "Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            int ward = Integer.parseInt(Ward);
            new model.AddRecord().AddAppointmentDetails(pId, pName, dType, dId, dName, appDate, appTime, ward);
            JOptionPane.showMessageDialog(null, "Details has been Inserted", "Successful",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
