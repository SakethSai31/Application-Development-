/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Saketh
 */
public class Vehicle {
    
    private String mfgCompany;
    private String mfgName;
    private String mfgYear;
    private String location;
    private int numSeats;
    private String carAvailability;
    private String serialNum;
    private String mainCert;
    private String modelNum;
    private String vIDNum;

   public String getmfgName() {
        return mfgName;
    }

    public void setmfgName(String mfgName) {
        this.mfgName = mfgName;
    }

    public String getYearOfManufacturing() {
        return mfgYear;
    }

    public void setYearOfManufacturing(String mfgYear) {
        this.mfgYear = mfgYear;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public String getCarAvailability() {
        return carAvailability;
    }

    public String getMfgCompany() {
        return mfgCompany;
    }

    public void setMfgCompany(String mfgCompany) {
        this.mfgCompany = mfgCompany;
    }

    public void setCarAvailability(String carAvailability) {
        this.carAvailability = carAvailability;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public String getvIDNum() {
        return vIDNum;
    }

    public void setvIDNum(String vIDNum) {
        this.vIDNum = vIDNum;
    }

    public String isMainCert() {
        return mainCert;
    }

    public void setMainCert(String mainCert) {
        this.mainCert = mainCert;
    }
    
    @Override
    public String toString(){
        return mfgName;
    }
}
