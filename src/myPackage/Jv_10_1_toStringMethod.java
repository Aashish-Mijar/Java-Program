import java.util.*;
 class car{
    String model="Mustang";
    String color="Cherry Red";
    int year=2024;

    public String toString(){
        String myString=model+"\n"+color+"\n"+year;
        return myString;
    }
}
public class Jv_10_1_toStringMethod {
    public static void main(String[] args) {
        // toString()= Special method that all objects inherit,
        //              that returns a string that "textually represents" an object
        //              can be used both implicitly and explicitly
    car c1=new car();
//        System.out.println(c1.toString());
        System.out.println(c1);
    }
}
