/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Staff;

/**
 *
 * @author sunny
 */
public class Staff {
    
    private String staffName;
    private int staffID;
    private static int count = 1;

    public Staff() {
        staffID = count;
        count++;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffName(String name) {
        this.staffName = name;
    }

    
    public String getStaffName() {
        return staffName;
    }

    @Override
    public String toString() {
        return staffName;
    }
    
    
}
