/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author sunny
 */
public class MainUser {
    
    private String name;
    private String address;
    private Date dob;
    private Long telephone;
    private Long fax;
    private String Email;
    private Integer ssn;
    private String medical;
    private Integer health;
    private Long account;
    private Integer license;
    private String img_path;

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }
    private String serialnumber;
    private Integer deviceid;
    private String linkedin;
    private String ip;
    private String biometric;
    private String photo;
    private String uniqueid;

    public String getName() {
        return name;
              
    }

    public void setName(String name) {
        
            //String regx = "[a-zA-Z]+\\.?";
            //Pattern pattern = pattern.(regx,Pattern.CASE_INSENSITIVE);
           //Matcher matcher = pattern.matcher(name);
           
        if(( name != null) && name.matches("[a-zA-Z]+\\.?") )//pattern.matcher(name).matches())
        {    
        this.name = name;
        }
        else
               {
            JOptionPane.showMessageDialog(null,"Please enter a Valid Name");
                }
         }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        
        
   //     if(( telephone!=null) && telephone.matcher("[0-9]+") )//pattern.matcher(name).matches())
       {    
        this.telephone = telephone;
       }
     //  else
         //  {
       //JOptionPane.showMessageDialog(null,"Enter a Valid Number");
         //}
        
               
    }

    public Long getFax() {
        return fax;
    }

    public void setFax(Long fax) {
        this.fax = fax;
    }

    public String getEmail() {
                   return Email;      
           
    }

    public void setEmail(String Email) {
           //String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";

           // Pattern p = Pattern.compile(regex);
       
        if((Email!=null) && Email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"))
                {
                       this.Email = Email;
                }
        else
                {
            JOptionPane.showMessageDialog(null,"Enter a valid email Address");
                }
             }

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
        
         
//String regex = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";
 
//Pattern pattern = Pattern.compile(regex);
 
//for (var number : ssns)

   // Pattern p = Pattern.compile(regex);
       
//        if((ssn != null) && ssn.("^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$"))
//                //(p.matcher(ssn).matches()))
//                {
//                       this.ssn = ssn;
//                }
//        else
//        {
////    Matcher matcher = pattern.matcher(number);
//  //  System.out.println(matcher.matches());
//JOptionPane.showMessageDialog(null,"Enter the valid SSN");
//        
//            }
    }
    

    public String getMedical() {
        return medical;
    }

    public void setMedical(String medical) {
        this.medical = medical;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }

    public Integer getLicense() {
        return license;
    }

    public void setLicense(Integer license) {
        this.license = license;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public Integer getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

//    public String getLinkedin() {
//        return linkedin;
//    }
//
//    public void setLinkedin(String linkedin) {
//             
//        //^https:\\/\\/[a-z]{2,3}\\.linkedin\\.com\\/.*$
//        //Pattern p = Pattern.compile(
//              if ((linkedin! = null) && 
//              linkedin.matches('((http(s?)://)*([www])*\.|[linkedin])[linkedin/~\-]+\.[a-za-z0-9/~\-_,&=\?\.;]+[^\.,\s<]'))
//              
//
//    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
       
        
        //IPV4_REGEX =
         //           "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
          //          "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
           //         "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
            //        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
            
    if(( ip != null) && ip.matches(
            "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." + 
                    "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                    "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                    "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$"))
    {   
        this.ip =ip;
    }
    else
    {
        JOptionPane.showMessageDialog(null,"Enter the valid IP");

    }
    }

    public String getBiometric() {
        return biometric;
    }

    public void setBiometric(String biometric) {
        this.biometric = biometric;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }
    
    
}
