/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patient;

import Persona.Person;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;   
import java.util.zip.DataFormatException;
import model.VitalSigns;
import model.VitalSignsHistory;

/**
 *
 * @author Saketh
 */
public class Patient {

    
    
    
    HashMap<String, Person> personPatientId = new HashMap<String, Person>();
    HashMap<String, VitalSigns> vitalSignsPatientId = new HashMap<String, VitalSigns>();

    public HashMap<String, Person> getPersonPatientId() {
        return personPatientId;
    }

    public void setPersonPatientId(HashMap<String, Person> personPatientId) {
        this.personPatientId = personPatientId;
    }

    public HashMap<String, VitalSigns> getVitalSignsPatientId() {
        return vitalSignsPatientId;
    }

    public void setVitalSignsPatientId(HashMap<String, VitalSigns> vitalSignsPatientId) {
        this.vitalSignsPatientId = vitalSignsPatientId;
    }
    
    
    
    public boolean isPatientNormal(VitalSigns vs) {
        String ageGroup;
        Double respiratoryRate = vs.getRespiratoryRate();
        Double pulse = vs.getpulse();
        Double sysBP = vs.getSysBP();
        Double diaBP = vs.getDiaBP();
        Double Temparature = vs.getTemparature();
        
        int age = vs.getAge();
        if (age == 0) {
            ageGroup = "Newborn";
        } else if (age > 0 && age <= 12) {
            ageGroup = "Infant";
        } else if (age > 12 && age <= 29) {
            ageGroup = "Adolescent";
        } else if (age > 30 && age <= 60) {
            ageGroup = "Adult";
        } else if (age > 60) {
            ageGroup = "Elderly";
        } else {
            ageGroup = "Out of Bounds";
        }

        switch (ageGroup) {
            case "Newborn":
                if (respiratoryRate > 50 || respiratoryRate < 30 ||
                        pulse < 120 || pulse > 160 || 
                        sysBP > 90 || sysBP < 60 || 
                        diaBP > 60 || diaBP < 20 ||
                        Temparature < 68 || Temparature > 72 ) {
                     
                     {
                        System.out.println("Patient has Abnormal Vitals");
                    }
                    return false;
                }
                break;

            case "Infant":
                if (respiratoryRate > 30 || respiratoryRate < 20 || 
                        pulse < 70 || pulse > 120 || 
                        sysBP > 130 || sysBP < 90 ||
                        diaBP < 50 || diaBP >85 ||
                        Temparature < 96 || Temparature > 99) {
                    {
                        System.out.println("Patient has Abnormal Vitals");
                    }
                    return false;
                }
                break;
            case "Adolescent":
                if (respiratoryRate > 30 || respiratoryRate < 20 ||
                        pulse < 80 || pulse > 130 ||
                        sysBP > 135 || sysBP < 95 ||
                        diaBP < 75 || diaBP > 90 ||
                        Temparature < 96 || Temparature > 99) {
                     {
                        System.out.println("Patient has Abnormal Vitals");
                    }
                    return false;
                }
                break;

            case "Adult":
                if (respiratoryRate > 30 || respiratoryRate < 20 || 
                        pulse < 68 || pulse > 120 || 
                        sysBP > 135 || sysBP < 95 ||
                        diaBP < 75 || diaBP > 90 || 
                        Temparature < 96 || Temparature > 99) {
                     {
                        System.out.println("Patient has Abnormal Vitals");
                    }
                    return false;
                }
                break;

            case "Elderly":
                if (respiratoryRate > 30 || respiratoryRate < 20 || 
                        pulse < 70 || pulse > 110 ||
                        sysBP > 130 || sysBP < 110 ||
                        diaBP > 90 || diaBP < 70 ||
                        Temparature < 96 || Temparature > 99) {
                     {
                        System.out.println("Patient has Abnormal Vitals");
                    }
                    return false;
                }
                break;
        }
        return true;
    }

//    public boolean isThisVitalSignNormal(String vsign) {
//        ArrayList<VitalSigns> result = VitalSignsHistory.getArray();
//        int n = result.size() - 1;
//        
//        System.out.println(n);
//        if (n + 1 == 0) {
//            System.out.println("No Patient records");
//        }
//        Double respiratoryRate = result.get(n).getRespiratoryRate();
//        Double pulse = result.get(n).getpulse();
//        Double sysBP = result.get(n).getSysBP();
//        Double wKg = result.get(n).getWeightKilos();
//        Double wPd = result.get(n).getWeightPounds();
//        int age = result.get(n).getAge();
//
//        if (vsign.equals("Respiratory rate")) {
//            if (age == 0 && (respiratoryRate > 50 || respiratoryRate < 30)) {
//                return false;
//            } else if ((age > 0 && age <= 144) && (respiratoryRate < 20 || respiratoryRate > 30)) {
//                return false;
//            } else if ((age > 144) && (respiratoryRate < 12 || respiratoryRate > 20)) {
//                return false;
//            }
//        } else if (vsign.equals("pulse")) {
//            if (age == 0 && (pulse > 160 || pulse < 120)) {
//                return false;
//            } else if ((age > 0 && age <= 12) && (pulse < 80 || pulse > 140)) {
//                return false;
//            } else if ((age > 12 && age <= 36) && (pulse < 80 || pulse > 130)) {
//                return false;
//            } else if ((age > 36 && age <= 60) && (pulse < 80 || pulse > 120)) {
//                return false;
//            } else if ((age > 60 && age <= 144) && (pulse < 70 || pulse > 110)) {
//                return false;
//            } else if ((age > 144) && (pulse < 55 || pulse > 105)) {
//                return false;
//            }
//        } else if (vsign.equals("Systolic blood pressure")) {
//            if (age == 0 && (sysBP > 70 || sysBP < 50)) {
//                return false;
//            } else if ((age > 0 && age <= 12) && (sysBP < 70 || sysBP > 100)) {
//                return false;
//            } else if ((age > 12 && age <= 60) && (sysBP < 80 || sysBP > 110)) {
//                return false;
//            } else if ((age > 60 && age <= 144) && (sysBP < 80 || sysBP > 120)) {
//                return false;
//            } else if ((age > 144) && (sysBP < 110 || sysBP > 120)) {
//                return false;
//            }
//        } else if (vsign.equals("Weight in kilos")) {
//            if (age == 0 && (wKg > 3 || wKg < 2)) {
//                return false;
//            } else if ((age > 0 && age <= 12) && (wKg < 4 || wKg > 10)) {
//                return false;
//            } else if ((age > 12 && age <= 36) && (wKg < 10 || wKg > 14)) {
//                return false;
//            } else if ((age > 36 && age <= 60) && (wKg < 14 || wKg > 18)) {
//                return false;
//            } else if ((age > 60 && age <= 144) && (wKg < 20 || wKg > 42)) {
//                return false;
//            } else if ((age > 144) && (wKg < 50)) {
//                return false;
//            }
//        }
//        return true;
//    }

//    public static void main(String[] args) throws ParseException, DataFormatException {
//        VitalSigns vs;
//        Patient pt = new Patient();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter PatientId:");
//        String id = scanner.nextLine();
//
//        System.out.println("Enter patient name:");
//        String name = scanner.nextLine();
//        System.out.println("Enter the date of birth (dd/mm/yyyy):");
//        String dob = scanner.nextLine();
//
//////        Pediatric p = new Pediatric(id, name, dob);
////
//        while (true) {
//            vs = new VitalSigns();
//            System.out.println("\nEnter your choice:\n 1.Add new Vital Sign\t2.View Vital history\t3.Check if vital sign normal\t4.Exit");
//            int ch = scanner.nextInt();
//            scanner.nextLine();
//            switch (ch) {
//               
//                case 1: // Add new Vital
//                    try {
//                    Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
//                    LocalDate ld = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//                    Period period = Period.between(ld, LocalDate.now());
//                    int age = (period.getYears() * 12) + period.getMonths();
//                    vs.setAge(age);
//                } catch (Exception e) {
//                    throw new DataFormatException("Enter  date of birth in mentioned format");
//                }
//                System.out.println("Enter Respiratory rate:");
//                vs.setRespiratoryRate(scanner.nextDouble());
//
//                System.out.println("Enter Heart rate:");
//                vs.setpulse(scanner.nextDouble());
//
//                System.out.println("Enter Systolic blood pressure:");
//                vs.setSysBP(scanner.nextDouble());
//
//                System.out.println("Enter Weight in kilos:");
//                vs.setWeightKilos(scanner.nextDouble());
//                vs.setWeightPounds(vs.getWeightKilos() * 2.204);
//                System.out.println("Weight in pounds: " + vs.getWeightPounds());
//                vs.setEntryDateTime(LocalDateTime.now());
//                if (pt.isPatientNormal(vs)) {
//                    System.out.println("Patient " + id + "  is normal");
//                } else {
//                    System.out.println("Patient " + id + " is abnormal");
//                }
//
//                VitalSignsHistory.addVitalSigns(vs);
//                break;
//                
//                case 2: // View vitals history
//                    ArrayList<VitalSigns> result = VitalSignsHistory.getArray();
//                    if (result.size() == 0) {
//                    //    System.out.println("No records found for patient "+p.getPatientName().toUpperCase());
//                        continue;
//                    }
//                    int i = 1;
//                   // System.out.println("Vital Sign History for patient " + p.getPatientName().toUpperCase() + " are as follows : ");
//                    for (VitalSigns v : result) {
//                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//
//                        String formattedDate = formatter.format(v.getEntryDateTime());
//                        System.out.println("VitalSign " + i + "\tEntryDateTime = " + formattedDate + " " + v.toString());
//                        i++;
//                    }
//                    break;
//               
//                case 3: //Check sympton for vital sign
//                    System.out.println("Enter vital sign you wanted to check : (Check is done for the most recent entry)\n 1.Respiratory rate 2.Heart rate 3.Systolic blood pressure 4.Weight in kilos ");
//                    String sign = scanner.nextLine();
//                    if (pt.isThisVitalSignNormal(sign)) {
//                        System.out.println(sign + " is normal");
//                    } else {
//                        System.out.println(sign + " is not normal");
//                    }
//                    break;
//                
//                case 4: //Exit
//                    System.exit(0);
//
//            }
//
//        }

    }


