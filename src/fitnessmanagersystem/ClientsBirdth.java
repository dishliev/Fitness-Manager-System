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
public class ClientsBirdth {
    


    
    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirdth;
    private String sex;
    private int telephone;
    private String email;
   

  
  
    
    public ClientsBirdth(int ID, String FirstName, String LastName, String DateOfBirdth, String Sex, int Telephone, String Email){
    
        this.id = ID;
        this.firstName= FirstName;
        this.lastName = LastName;
        this.dateOfBirdth = DateOfBirdth;
        this.sex = Sex;
        this.telephone = Telephone;
        this.email = Email;
      
           
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
      
                 public String getEmail(){
            return email;
        }
            
           
    }

