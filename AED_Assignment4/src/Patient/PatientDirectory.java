/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patient;

import Persona.Person;
import model.VitalSigns;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author sunny
 */
public class PatientDirectory {
    
    ArrayList<Patient> patientDir;
    
        while ((line = bufferedReader.readLine()) != null){
        Patient pat_obj = new Patient();
        Person per_obj = new Person();
        VitalSigns vs_obj = new VitalSigns();
       String[] col = line.split(",");
        
        HashMap<String, Person> personPatientId = new HashMap<String, Person>();
        HashMap<String, VitalSigns> vitalSignsPatientId = new HashMap<String, VitalSigns>();
        
        if (check_record(col[0])){
            
            pat_obj.setPersonPatientId(col[10]);
            per_obj.setName(col[1]);
            per_obj.setAge(Integer.parseInt(col[2]));
            per_obj.setGender(col[4]);
            vs_obj.setRespiratoryRate(Double.parseDouble(col[5]));
            vs_obj.setpulse(Double.parseDouble(col[6]));
            vs_obj.setSysBP(Double.parseDouble(col[7]));
            vs_obj.setDiaBP(Double.parseDouble(col[8]));
            vs_obj.setTemparature(Double.parseDouble(col[9]));
            personPatientId.put(col[10], per_obj);
            vitalSignsPatientId.put(col[10], vs_obj);
            pat_obj.setVitalSignsPatientId(vitalSignsPatientId);             
            pat_obj.setPersonPatientId(personPatientId);
            patientDir.add(pat_obj);
        }
    }
}
            
            
            
            
            
            
            
//        }
//        
//}
//
//    private boolean check_record(String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
    
    
