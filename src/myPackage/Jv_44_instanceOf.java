package myPackage;
class simple1{
}
class simple2 extends simple1{
}
public class Jv_44_instanceOf {
    public static void main(String[] args) {
//        instanceof operator is used to test whether the object is an instance of
//        the specified type(class or subclass or interface)

//        simple2 sim=new simple2();
        simple2 sim=null;
        System.out.println(sim instanceof simple1);
    }
}
