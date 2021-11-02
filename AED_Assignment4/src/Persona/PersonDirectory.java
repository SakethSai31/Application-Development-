/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import java.util.ArrayList;

/**
 *
 * @author Saketh
 */
public class PersonDirectory {
    
   private ArrayList<Person> personDir;
   
   public PersonDirectory (){
   this.personDir = new ArrayList<Person>();
           }
   
   
    
//   Search Function
//      public ArrayList<Person> searchPerson(String key)
//    {
//        ArrayList<Person> searchPersonDirectory = new ArrayList();
//        for(Person person: personDirectory)
//        {
//            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
//            {
//                searchPersonDirectory.add(person);
//            }
//        }
//        return searchPersonDirectory;
//    }

    public ArrayList<Person> getPersonDir() {
        return personDir;
    }

    public void setPersonDir(ArrayList<Person> personDir) {
        this.personDir = personDir;
    }

    public Person addNewPerson(){
        
        Person newPerson = new Person();
        personDir.add(newPerson);
        return newPerson;
    }    
    
    public void deletepersonDetails(Person personDetails){
        personDir.remove(personDetails);
    }
    
}
