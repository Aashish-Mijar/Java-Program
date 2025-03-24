package myPackage;
interface example{
    // by default method is abstract
    void print();
}

class interfaceExample implements example{
    public void print(){
//        Interface= a template that can be applied to a class.
        //      similar to inheritance, but specifies what class has/must do.
        //      Classes can apply more than one interface, inheritance is limited to 1 super
        System.out.println("Hello! this is from implemented class");
    }
}

public class Jv_37_Interface {
    public static void main(String[] args) {
        example obj=new interfaceExample();
        obj.print();
    }
}
