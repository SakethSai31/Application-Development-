/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryPerson;

import Business.Order.FinalOrder;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author sunny
 */
public class DeliveryPerson {
    String dlyName;
    String dlyStatus;
    UserAccount ua;

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }
    
    public DeliveryPerson(UserAccount ua)
    {
        this.ua = ua;
        this.dlyName = ua.getUsername();
    }

    public String getdlyName() {
        return dlyName;
    }

    public void setdlyName(String name) {
        this.dlyName = name;
    }

    public String getdlyStatus() {
        return dlyStatus;
    }

    public void setdlyStatus(String status) {
        this.dlyStatus = status;
    }

    public ArrayList<FinalOrder> getrdersCompleted() {
        return ordersCompleted;
    }

    public void setOrdersCompleted(ArrayList<FinalOrder> deliveredOrders) {
        this.ordersCompleted = deliveredOrders;
    }
    ArrayList<FinalOrder> ordersCompleted = new ArrayList<FinalOrder>();
    public void addOrdersCompleted(FinalOrder f)
    {
        ordersCompleted.add(f);
    }
}
