package myPackage;
interface sampleInterface{
    void method1();
    void method2();
}
interface childSampleInterface extends sampleInterface{
    void method3();
    void method4();
}
class mySampleClass implements childSampleInterface{
    public void method3(){
        System.out.println("Method 3 is running.....");
    }
    public void method4(){
        System.out.println("Method 4 is running.....");
    }
    public void method2(){
        System.out.println("Method 2 is running.....");
    }
    public void method1(){
        System.out.println("Method 1 is running.....");
    }
}
public class Jv_39_1_InheritanceInInterface {
    public static void main(String[] args) {
        mySampleClass myS=new mySampleClass();
        myS.method1();
        myS.method2();
        myS.method3();
        myS.method4();
    }
}
