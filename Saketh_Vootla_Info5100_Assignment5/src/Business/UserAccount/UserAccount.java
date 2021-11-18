/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Staff.Staff;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author sunny
 */
public class UserAccount {
    
    private String userName;
    private String pwd;
    private Staff Staff;
    private Role role;
    private WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Role getRole() {
        return role;
    }

    public void setStaff(Staff staff) {
        this.Staff = staff;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Staff getStaff() {
        return Staff;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return userName;
    }
    
    
    
}