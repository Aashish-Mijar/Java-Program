package myPackage;
import java.util.*;
class Multiply{
    public int mul(int number1){
        return number1;
    }
    public int mul(int number1, int number2){
        return number1*number2;
    }
    public double mul(double number1, double number2, double number3){
        return number1*number2*number3;
    }
}
public class Jv_42_polymorphism {
    public static void main(String[] args) {
    // polymorphism= greek word for poly means many and morph means form
        //          The ability of an object to identify as more than one type
        // Types=  Compile time(method overloading) and Run time(method overridden)

//        Compile-Time polymorphism
        Multiply multiply=new Multiply();
       int res1= multiply.mul(34);
       int res2=multiply.mul(6, 4);
       double res3=multiply.mul(3.4, 6.5, 3.5);

        System.out.println("Multiplication is: "+res1);
        System.out.println("Multiplication is: "+res2);
        System.out.println("Multiplication is: "+res3);
    }
}
