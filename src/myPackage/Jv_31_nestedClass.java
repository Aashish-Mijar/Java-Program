package myPackage;
import java.util.*;
class outer{
    int number;
    public int setNumber(){
        number=34;
        return number;
    }
     public void display(){
        System.out.println("This is outer class");
    }

    class inner{
        int number2=setNumber();
         public void innerDisplay(){
             System.out.println("This is inner class");
             System.out.println("The value of number is "+number2);
         }
    }
}
public class Jv_31_nestedClass {
    public static void main(String[] args) {
        outer obj=new outer();
//        obj.display();

        outer.inner obj2=obj.new inner();
        obj2.innerDisplay();
    }

}
