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
public class Cards {
    
 
    private String type;
    private int visits;
    private int periodDays;
    private double price;
     public Cards( String Type, int Visits, int PeriodDays, double Price){
    
      
        this.type= Type;
        this.visits = Visits;
        this.periodDays = PeriodDays;
        this.price = Price;
           
    }

      
        public String getType(){
            return type;
        }
        public int getVisits(){
            return visits;
        }
        public int getPeriodDays(){
            return periodDays;
        }
        public double getPrice(){
            return price;
        }
    }



