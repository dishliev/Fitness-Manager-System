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
public class Clients {
    

    
    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirdth;
    private String sex;
    private int telephone;
    private String city;
    private String street;
     private String email;
     private String admin;
     private String admin2;
   
    
  
  
    
    public Clients(int ID, String FirstName, String LastName, String DateOfBirdth, String Sex, int Telephone, String City, String Street, String Email, String Admin, String Admin2){
    
        this.id = ID;
        this.firstName= FirstName;
        this.lastName = LastName;
        this.dateOfBirdth = DateOfBirdth;
        this.sex = Sex;
        this.telephone = Telephone;
        this.city = City;
        this.street = Street;
        this.email = Email;
        this.admin = Admin;
        this.admin2 = Admin2;
           
    }

        public int getID(){
            return id;
        }
        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public String getDateOfBirdth(){
            return dateOfBirdth;
        }
        public String getSex(){
            return sex;
        }
        public int getTelephone(){
            return telephone;
        }
         public String getCity(){
            return city;
        }
         public String getStreet(){
             return street;
         }
       
                 public String getEmail(){
            return email;
        }
                 public String getAdmin(){
                 return admin;
                 }
                 
                 public String getAdmin2(){
                 return admin2;
                 }
        
           
    }

