package myPackage;
import java.lang.Cloneable;
class Student21 implements Cloneable{
    String name;
    int rollNo;

    Student21(String name, int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
public class Jv_47_ObjectCloning {
    public static void main(String[] args) {
        try{
            Student21 s1=new Student21("Aashish", 01);
            Student21 s2=(Student21)s1.clone();
            System.out.println(s1.name+" "+s1.rollNo);
            System.out.println(s2.name+" "+s2.rollNo);
        }
        catch(CloneNotSupportedException c){
            System.out.println("Error occur!");
        }
    }
}
