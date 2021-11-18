/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Staff;

import java.util.ArrayList;

/**
 *
 * @author sunny
 */
public class StaffDirectory {
    
    private ArrayList<Staff> staffList;

    public StaffDirectory() {
        staffList = new ArrayList();
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }
    
    public Staff createStaff(String name){
        Staff staff = new Staff();
        staff.setStaffName(name);
        staffList.add(staff);
        return staff;
    }
}