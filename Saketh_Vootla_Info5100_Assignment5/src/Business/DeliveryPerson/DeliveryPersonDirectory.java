/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryPerson;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author sunny
 */
public class DeliveryPersonDirectory {
    ArrayList<DeliveryPerson> deliveryDirectory = new ArrayList<DeliveryPerson>();

    public ArrayList<DeliveryPerson> getDeliveryDirectory() {
        return deliveryDirectory;
    }

    public void setDeliveryDirectory(ArrayList<DeliveryPerson> deliveryDirectory) {
        this.deliveryDirectory = deliveryDirectory;
    }
    
    public void addDelivery(DeliveryPerson d)
    {
        deliveryDirectory.add(d);
    }
    
    public DeliveryPerson getDeliveryPerson(UserAccount  ua)
    {
        for(DeliveryPerson d: deliveryDirectory)
        {
            if(d.getdlyName().equals(ua.getUserName()))
                return d;
        }
        return null;
    }
}

