/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessmanagersystem;

/**
 *
 * @author DISHLIEV
 */
public class Admins {
       private int id;
    private String username;
    private String firstName;
    private String lastName;
    private String type;
     public Admins(int ID, String Username, String FirstName, String LastName, String Type){
    
        this.id = ID;
        this.username= Username;
        this.firstName = FirstName;
        this.lastName=LastName;
        this.type = Type;
           
    }

        public int getID(){
            return id;
        }
        public String getUsername(){
            return username;
        }
        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
           public String getType(){
            return type;
        }  
    }





