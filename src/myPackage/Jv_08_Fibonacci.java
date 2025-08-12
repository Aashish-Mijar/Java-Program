package myPackage;
import java.util.*;
public class Jv_08_Fibonacci {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int number=sc.nextInt();

            int firstNum=0, secondNum=1;
        System.out.print(firstNum+" ");
        if(number>1){
            for(int i=2; i<=number; i++){
                System.out.print(secondNum+" ");
                int temp=secondNum;
                secondNum=firstNum+secondNum;
                firstNum=temp;
            }
            System.out.println();
        }
    }
}
