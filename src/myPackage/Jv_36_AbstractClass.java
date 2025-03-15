import java.util.*;
abstract class Vehicle{

    String name;
    int price;

    // constructor
    Vehicle(String name, int price){
        this.name=name;
        this.price=price;
    }

    abstract void speed();// abstract method
    // Concrete method
    void display(){
        System.out.println("The name of the car is "+name+" and the price is "+price);
    }
}
class Car extends Vehicle{
    Car(String name, int price){
        super(name, price);
    }
    @Override
    void speed(){
        System.out.println("The speed of "+name+" is normal");
    }
}
public class Jv_36_AbstractClass {
    public static void main(String[] args) {
        // Abstract= Abstract classes cannot be instantiated, but they can have a subclass
        //             abstract methods are declared without an implementation.

       Vehicle cr=new Car("BMW", 100000);
       cr.speed();
       cr.display();

    }
}
