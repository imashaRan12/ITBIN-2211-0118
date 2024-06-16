
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.DBSearch;
import static view.Appointment.aDNameField;
import static view.Appointment.aWardField;
import view.AppointmentView;
import static view.AppointmentView.pDatelbl;
import static view.AppointmentView.pIdlbl;
import static view.AppointmentView.pTimelbl;

//this SelectController is make to logic part when select some field in Appointment then the auto fill the details  
public class SelectController {
    
    public static String getPatientName(String patientId) {
        
        try {
            ResultSet rs = new DBSearch().patientDeleteId(patientId);
            if (rs.next()) {
                return rs.getString("name");
            }
        } catch (SQLException e) {
            
        }
        return "";
    }
    
    public static ArrayList<String> getDoctorId(String doctorType) {
        
        ArrayList<String> doctorIds = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = new DBSearch().searchDoctorByType(doctorType);
            
            while (rs.next()) {
                doctorIds.add(rs.getString("id"));
            }
        } catch (SQLException e) {
            
        } finally {
            try {
                if (rs != null) rs.close();
            } catch (SQLException e) {
                
            }
        }
        return doctorIds;
    }
    
    public ArrayList<String> fetchDoctorTypes() {
        ArrayList<String> doctorTypes = new ArrayList<>();
        ResultSet rs = null;

        try {
            rs = new DBSearch().fetchDistinctDoctorTypes();
            
            while (rs.next()) {
                doctorTypes.add(rs.getString("dept"));
            }
        } catch (SQLException e) {
            
        } finally {
            try {
                if (rs != null) rs.close();
            } catch (SQLException e) {
                
            }
        }
        return doctorTypes;
    }
    
    public ArrayList<String> getPatientId() {
        ArrayList<String> patId = new ArrayList<>();
        ResultSet rs = null;

        try {
            rs = new DBSearch().searchPatient();
            
            while (rs.next()) {
                patId.add(rs.getString("id"));
            }
        } catch (SQLException e) {
            
        } finally {
            try {
                if (rs != null) rs.close();
            } catch (SQLException e) {
                
            }
        }
        return patId;
    }
    
    public static void getDoctorNameWard(String doctorId) {
        
        try {
            ResultSet rs = new DBSearch().doctorDeleteId(doctorId);
            if (rs.next()) {
                String doctorName = rs.getString("name");
                int wardNo = rs.getInt("ward");

                aDNameField.setText(doctorName);
                aWardField.removeAllItems();
                aWardField.addItem(String.valueOf(wardNo));
                
            }
        } catch (SQLException e) {
            
        }
    }
    
    //to access the AppointmentView by the doctor who login
    public static ArrayList<String> sendNames = new ArrayList<>();

    public static ArrayList<String> getPatientNames(String doctorName) {
        ArrayList<String> patientNames = new ArrayList<>();
        
        try {
            ResultSet rs = new DBSearch().getPatientNameByDocName(doctorName);
            while (rs.next()) {
                patientNames.add(rs.getString("pName"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // For debugging
        }
        return patientNames;
    }
    
    
    public static void appointmentViewByDocName(String docName, JFrame frame) {
        sendNames = getPatientNames(docName);
        if (!sendNames.isEmpty()) {
            AppointmentView apv = new AppointmentView(docName, sendNames);
            apv.setVisible(true);
            frame.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Appointment list is Empty");
        } 
    }
    
    public static void getPatientInfoByAppointment(String Patname) {
            
        
        try {
            ResultSet rs = new DBSearch().getAppointmentInfoByPatName(Patname);
            if (rs.next()) {
                String patientId = rs.getString("pId");
                String appointDate = rs.getString("appDate");
                String appointTime = rs.getString("appTime");
                
                pIdlbl.setText(patientId);
                pDatelbl.setText(appointDate);
                pTimelbl.setText(appointTime);
                
            }
        } catch (SQLException e) {
            
        }
    }
}
