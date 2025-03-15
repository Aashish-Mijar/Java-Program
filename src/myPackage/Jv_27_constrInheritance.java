import java.util.*;
class Base1{
    Base1(){
        System.out.println("Base class constructor");
    }
    Base1(int x){
        System.out.println("Overloaded! The value of x is "+x);
    }
}
class Derived1 extends Base1{
    Derived1(){
//        super(3);
        System.out.println("Derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("Overloaded! The value of y is "+y);
    }
}

class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("Derived's child constructor");
    }
    childOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("Overloaded! The value of z is "+z);
    }
}
public class Jv_27_constrInheritance {
    public static void main(String[] args) {
//        Derived1 drv=new Derived1( 6,5);
        childOfDerived cdrv=new childOfDerived(9, 3, 4);
    }
}
