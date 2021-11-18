/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Consumer.ConsumerDirectory;
import Business.DeliveryPerson.DeliveryPersonDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author sunny
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private RestaurantDirectory restaurantDirectory;

    public RestaurantDirectory getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    public ConsumerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ConsumerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public DeliveryPersonDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryPersonDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    private ConsumerDirectory customerDirectory;
    private DeliveryPersonDirectory deliveryManDirectory;

    public EcoSystem(RestaurantDirectory restaurantDirectory, ConsumerDirectory customerDirectory, DeliveryPersonDirectory deliveryManDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
        UserAccountDirectory usersList = business.getUserAccountDirectory();
        ArrayList<UserAccount> userAccounts = usersList.getUserAccountList();
        
        for(UserAccount ua : userAccounts)
        {
            if(ua.getUserName().equals(userName))
                return false;
        }
        
       return true;
    }
}
