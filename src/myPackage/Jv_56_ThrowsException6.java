import java.io.IOException;
import java.util.*;
public class Jv_56_ThrowsException6 {
    void test1()throws IOException{
        throw new IOException("Device Error");
    }
    void test2() throws IOException{
        test1();
    }
    void test3(){
        try{
            test2();
        }
        catch(Exception ie){
            System.out.println("Exception handled");
        }
    }
    public static void main(String[] args){
        Jv_56_ThrowsException6 jEx=new Jv_56_ThrowsException6();
        jEx.test3();
        System.out.println("Normal flow....");
    }
}
