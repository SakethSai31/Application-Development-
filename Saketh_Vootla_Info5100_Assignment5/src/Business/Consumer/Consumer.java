/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Consumer;

import Business.Order.OrderCart;
import Business.Order.Order;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author sunny
 */
public class Consumer {
    String consumerName;
    UserAccount ua;
    public Consumer(UserAccount ua)
    {
        this.ua = ua;
        this.consumerName = ua.getUsername();
    }
    
    ArrayList<Order> previousOrders = new ArrayList<Order>();

    ArrayList<OrderCart> cart = new ArrayList<OrderCart>();

    public ArrayList<OrderCart> getCart() {
        return cart;
    }

    public void setCart(ArrayList<OrderCart> cart) {
        this.cart = cart;
    }
    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String customerName) {
        this.consumerName = customerName;
    }

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }

    public ArrayList<Order> getPreviousOrders() {
        return previousOrders;
    }

    public void setPreviousOrders(ArrayList<Order> previousOrders) {
        this.previousOrders = previousOrders;
    }
    
    public void addToCart(OrderCart c)
    {
        this.cart.add(c);
    }
    
    
    
}
