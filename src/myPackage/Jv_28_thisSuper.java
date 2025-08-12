package myPackage;
import java.util.*;
class Student{
    int rollNo;
    String name;

    Student(){
        System.out.println("Hey coder!");
    }
    Student(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    Student(int x){
        // calling the default constructor
        this();
        System.out.println("Value of x is "+x);
    }
    public void getDetail(){
        System.out.println("Roll number is "+rollNo);
        System.out.println("Name is "+name);
    }
}

class Mark extends Student{
    Mark(int x){
        super(x);
        System.out.println("Derived class constructor");
    }
}

public class Jv_28_thisSuper {
    public static void main(String[] args) {
//        Student s1= new Student(1, "Aashish");
//        s1.getDetail();
//        Student s2=new Student(5);

        Mark m1=new Mark(3);
    }
}
