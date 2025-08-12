package myPackage;
import java.util.*;
class oddAndEven{

    public void oddOrEven(int num){
        if(num%2==0){
            System.out.println("The given number "+num+" is even");
        }
        else{
            System.out.println("The given number "+num+" is odd");
        }
    }
}
public class Jv_19_1_oddOrEven {
    public static void main(String[] args) {
        oddAndEven obj=new oddAndEven();
        obj.oddOrEven(23);
    }
}
