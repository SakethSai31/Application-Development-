/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Consumer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author sunny
 */
public class ConsumerDirectory {
    ArrayList<Consumer> consumerList = new ArrayList<Consumer>();

    public ArrayList<Consumer> getConsumerList() {
        return consumerList;
    }

    public void setConsumerList(ArrayList<Consumer> consumerList) {
        this.consumerList = consumerList;
    }
    
    public Consumer getCustoo(UserAccount ua)
    {
        for(Consumer c: consumerList)
        {
            if(ua.getUserName().equals(c.getUa().getUserName()))
                return c;
        }
        
        return null; 
    }
    
    public void addCusto(Consumer c)
    {
        this.consumerList.add(c);
    }
}
