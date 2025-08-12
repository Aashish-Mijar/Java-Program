package myPackage;
import java.util.*;
class Animal{
    void sound(){
        System.out.println("Most animals have different sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meow");
    }
}
public class Jv_33_methodOverRide {
    public static void main(String[] args) {
        Animal myDog=new Dog();
        myDog.sound();
    }
}
