import java.util.*;
public class Main{
    public static void main(String args[]){
        Student s1 = new Student("A.K.Patel");
        System.out.println(s1.name);
    }
}

class Student{
    String name;
    int roll;
    
    Student(String name){
        this.name = name;
    }
}
