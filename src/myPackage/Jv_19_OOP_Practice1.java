import java.util.*;
class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing.......");
    }

    public void vibrate(){
        System.out.println("Vibrating......");
    }
    public void call(){
        System.out.println("Calling a friend.......");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing.......");
    }
}
public class Jv_19_OOP_Practice1 {
    public static void main(String[] args) {
        //---------From class Employee1-----
//        Employee1 e1=new Employee1();
//        e1.setName("Aashish");
//        e1.salary=90000;
//        System.out.println("Your name: "+e1.getName());
//        System.out.println("Salary is :"+e1.getSalary());

        //----------From class cellphone----
//        CellPhone reaMe =new CellPhone();
//        reaMe.ring();
//        reaMe.call();
//        reaMe.vibrate();

        //---------------From class Square----
//        Square sq=new Square();
//        sq.side=5;
//        System.out.println("Area is :"+sq.area());
//        System.out.println("Perimeter is :"+sq.perimeter());

        //--------------From class Tommy---
        Tommy tm=new Tommy();
        tm.hit();
        tm.run();
        tm.fire();

    }
}
