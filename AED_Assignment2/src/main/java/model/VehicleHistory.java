/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Saketh
 */
public class VehicleHistory {
    
    private ArrayList<Vehicle> carDetailsHistory;
    public String lastUpdated;
       
     
//    public FleetofCars(){
//        this.carDetailsHistory = new ArrayList<Vehicle>();
//        this.lastUpdated = String.valueOf(new Date());
//    }
//    
    public ArrayList<Vehicle> getcarDetialsHistory() {
        return carDetailsHistory;
    }
    
    public void setAllCars(ArrayList<Vehicle> carDetailsHistory){
        this.carDetailsHistory = carDetailsHistory;
    }
    
    public Vehicle addNewVehicle(){
        Vehicle newVehicle = new Vehicle();
        carDetailsHistory.add(newVehicle);
        this.lastUpdated = String.valueOf(new Date());
        return newVehicle;
        
    }
    
    //private ArrayList<Vehicle> carDetailsHistory;
    
    public VehicleHistory() {
        this.carDetailsHistory = new ArrayList<Vehicle>();
    }

    public ArrayList<Vehicle> getCarDetailsHistory() {
        return carDetailsHistory;
    }

    public void setCarDetailsHistory(ArrayList<Vehicle> carDetailsHistory) {
        this.carDetailsHistory = carDetailsHistory;
    }
    
    public Vehicle addNewCarDetails() {
        Vehicle newCarDetails = new Vehicle();
        carDetailsHistory.add(newCarDetails);
        return newCarDetails;
    }
    
    public void deletecarDetails(Vehicle carDetails){
        carDetailsHistory.remove(carDetails);
    }
    public void updatecarDetails(int index,Vehicle cd)
    {
        carDetailsHistory.set(index,cd);
    }

}
