/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author sunny
 */
public class ApprovedOrders {
    ArrayList<FinalOrder> approvedOrders = new ArrayList<FinalOrder>();
 
    public ArrayList<FinalOrder> getApprovedOrders() {
        return approvedOrders;
    }

    public void setAcceptedOrders(ArrayList<FinalOrder> approvedOrders) {
        this.approvedOrders = approvedOrders;
    }
    
}
