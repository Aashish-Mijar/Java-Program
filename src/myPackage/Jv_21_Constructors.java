import java.util.*;
class MyMainEmployee{
    private int id;
    private String name;
    private int salary;

//    constructor is a member function used ot initialize an object while creating it
// constructor overloading is also possible
    //---UN PARAMETERIZED CONSTRUCTOR
//    public MyMainEmployee(){
//        id=45;
//        name="Aashish";
//    }

    //----PARAMETERIZED CONSTRUCTOR
    public MyMainEmployee(int myId, String myName){
        id=myId;
        name=myName;
    }
    public MyMainEmployee(int mySalary){
        salary=mySalary;
    }

    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int n){
        this.id=n;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
}
public class Jv_21_Constructors {
    public static void main(String[] args) {
        MyMainEmployee e1=new MyMainEmployee(1001, "Meera");
        MyMainEmployee e2=new MyMainEmployee(20000);
//        e1.setName("Aashish");
//        e1.setId(123);

        System.out.println(e1.getName());
        System.out.println(e1.getId());
        System.out.println(e2.getSalary());
    }
}
