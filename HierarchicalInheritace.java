import java.util.*;
public class Main{
    public static void main(String args[]){
       Dog dobby = new Dog(); 
       dobby.eat();
       dobby.legs = 4;
       System.out.println(dobby.legs);
    }
}

class Animal{
    String color;
    
    void eat(){
        System.out.println("eats");
    }
    
    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Dog extends Mammal{
    int legs;
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
