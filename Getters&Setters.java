import java.util.*;
public class Main{
    public static void main (String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
       // p1.setColor("Yellow");
       p1.setColor ("Yellow");
        System.out.println(p1.getColor());
        
       // BankAccount myAcc = new BankAccount();
        //myAcc.username = "A.K.Patel";
        //myAcc.setPassword("abcdefghi");
    }
}

//class BankAccount{
  //  public String username;
    //private String password;
    //public void setPassword(String pwd){
      //  password = pwd;
    //}
    
//}
class Pen{
     String color;
     int tip;
    
    
    String getColor(){
        return this.color;
    }
    
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
       this.tip = newTip;
    }
}
class student{
    
}
