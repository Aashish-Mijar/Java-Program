import java.util.*;
class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is :"+id);
        System.out.println("My name is :"+name);
    }
    public int getSalary(){
        return salary;
    }
}
public class Jv_18_CustomClass {
    public static void main(String[] args) {
        //Instantiating a new Employee object
        Employee e1=new Employee();
        Employee e2=new Employee();
        // Setting Attributes
        e1.id=123;
        e1.name="Aashish";
        e1.salary=340000;

        e2.id=234;
        e2.name="Meera";
        e2.salary=200000;
//        System.out.println(e1.id);
//        System.out.println(e1.name);
        e1.printDetails();
        e2.printDetails();
        int salary=e1.getSalary();
        System.out.println("Salary of Mira is  :"+salary);
    }
}
