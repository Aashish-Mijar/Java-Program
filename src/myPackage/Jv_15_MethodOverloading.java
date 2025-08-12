package myPackage;
import java.util.*;
public class Jv_15_MethodOverloading {

    static void callPerson(){
        System.out.println("Good morning");
    }
    static void callPerson(int a){
        System.out.println("Good morning "+ a + " Bae");
    }
   static void callPerson(double a, double b){
        double sum=a+b;
       System.out.println("The sum is "+sum);
   }
    public static void main(String[] args) {
        callPerson();
        callPerson(200);
        callPerson(2.4, 4.5);
    }
}
