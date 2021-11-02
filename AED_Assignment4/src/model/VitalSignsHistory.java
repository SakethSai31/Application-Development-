/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Saketh
 */
public class VitalSignsHistory {
    static ArrayList<VitalSigns> array = new ArrayList<VitalSigns>();

    public static ArrayList<VitalSigns> getArray() {
        //if(array.size() == 1)
        //return array;
        //else
        //Collections.sort(array,VitalSignsHistory.dateComparator);
        return array;
    }

    public static void setArray(ArrayList<VitalSigns> array) {
        VitalSignsHistory.array = array;
    }
    
    public static void addVitalSigns(VitalSigns vs)
    {
        array.add(vs);
    }
    
   public static Comparator<VitalSigns> dateComparator = (VitalSigns v1, VitalSigns v2) -> {
       LocalDateTime date1 = v1.getEntryDateTime();
       LocalDateTime date2 = v2.getEntryDateTime();
       //descending  order
       return date2.compareTo(date1);
       
    };
}
