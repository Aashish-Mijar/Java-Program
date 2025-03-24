package myPackage;
import java.util.*;
public class Jv_04_Function {
    public static void printHello(String name){
        System.out.println(name);
        return;
    }
    public static int calculateSum(int a, int b){
        int sum=a+b;
        return sum;
    }

    public static int calculateMul(int x, int y){
        return x*y;
    }

    public static void factorial(int n){
        int factorial=1;
        if(n<0){
            System.out.println("No factorial");
            return;
        }
        else{
            for(int i=n; i>=1; i--){
                factorial=factorial*i;
            }
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        String name=sc.nextLine();
//    printHello("Name is "+name);
    int num1=sc.nextInt();
//    int num2=sc.nextInt();

//   int result= calculateSum(num1, num2);
//        System.out.println("Result is "+result);

//        System.out.println("Product is "+ calculateMul(num1,num2));

        factorial(num1);
 }
}
