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
public class OrderCart {
    String bistro;
    String item;

    
    public OrderCart(String bistro, String item)
    {
        this.bistro = bistro;
        this.item = item;
    }
    public String getBistro() {
        return bistro;
    }

    public void setBistro(String restaurant) {
        this.bistro = restaurant;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
    
}
