import java.util.*;
class MyEmployee{
   private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setId(int n){
        this.id=n;
    }
    public int getId(){
        return id;
    }
}
public class Jv_20_AccessModifiers {
    public static void main(String[] args) {
    MyEmployee e1=new MyEmployee();
//    e1.id=101;
//    e1.name="Aashish";
        
        e1.setId(234);
        System.out.println("Id is :"+e1.getId());
        e1.setName("Aashish");
        System.out.println("Name is :"+e1.getName());
    }
}
