/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Saketh
 */
public class VitalSigns {

    public Double getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(Double respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public Double getpulse() {
        return pulse;
    } 

    public void setpulse(Double pulse) {
        this.pulse = pulse;
    }

    public Double getSysBP() {
        return sysBP;
    }

    public void setSysBP(Double sysBP) {
        this.sysBP = sysBP;
    }

    public Double getDiaBP() {
        return diaBP;
    }

    public void setDiaBP(Double diaBP) {
        this.diaBP = diaBP;
    }

    public Double getTemparature() {
        return Temparature;
    }

    public void setTemparature(Double Temparature) {
        this.Temparature = Temparature;
    }


    double respiratoryRate;
    double pulse;
    double sysBP;
    double diaBP;
    double Temparature;
    LocalDateTime entryDateTime;

    public LocalDateTime getEntryDateTime() {
        return entryDateTime;
    }

    public void setEntryDateTime(LocalDateTime entryDateTime) {
        this.entryDateTime = entryDateTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    int age;
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    Date dob;
    
}
