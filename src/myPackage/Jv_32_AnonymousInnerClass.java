package myPackage;
import java.util.*;
class outerClass{
    public void display(){
        System.out.println("This is outer class");
    }
}
public class Jv_32_AnonymousInnerClass {
    public static void main(String[] args) {
        outerClass obj=new outerClass()
        {
            public void display(){
                System.out.println("This is Anonymous Inner class");
            }
        };
        obj.display();
    }
}
