/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Staff.Staff;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sunny
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUserName().equals(username) && ua.getPwd().equals(password)){
                return ua;
            }
        return null;
    }
    
    public boolean authenticateUserLogin(String username,String password)
    {
        for (UserAccount ua : userAccountList)
            if (ua.getUserName().equals(username) && ua.getPwd().equals(password)){
                return true;
            }
        return false;
    }
    
    public UserAccount createUserAccount(String username, String password, Staff Staff, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName(username);
        userAccount.setPwd(password);
        userAccount.setStaff(Staff);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUserName().equals(username))
                return false;
        }
        return true;
    }

    public UserAccount getUserAccount(String username) {
        for(UserAccount ua: userAccountList)
        {
            if(ua.getUserName().equals(username))
            {
                return ua;
            }
        }
        return null;
    }
}
