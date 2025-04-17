//import java.util.*;
 class Person{
    String schoolName;
    int weight;
}

class Student extends Person{
    int rollNumber;
}


public class Main{
    public static void main(String args[]){
       Student c = new Student (); 
            c.schoolName = "C.M.Rise School";
            c.rollNumber = 90;
            
            
            System.out.println(" schoolName: " + c.schoolName);
            System.out.println("rollNumber: " + c.rollNumber);
        
    }
}
