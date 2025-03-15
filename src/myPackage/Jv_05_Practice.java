import java.util.*;
public class Jv_05_Practice {
//----------Function to print average of three numbers
    public static double calculateAverage(int a, int b, int c){
        double result=(double)(a+b+c)/(double)3;
        return result;
    }

//    ------function to print sum of all odd numbers from 1 to n
    public static int printOdd(int n) {
        int sum = 0;
        int i;
        for (i = 1; i <= n; i++) {
            if (i% 2 == 0) {
                System.out.println("Even "+i);
            } else {
                sum = sum + i;
            }
        }
        return sum;
    }

//    Function to find greatest between two number
    public static int printGreatest(int a, int b){
        int res=(a>b)?a:b;
        return res;
    }

// function to calculate area of circle
    public static double calculateArea(double r){
        final double PI=3.1415;
        double result= PI*r*r;
        return result;
    }

//    function to print eligibility
    public static boolean voteEligible(int age){
        if(age>18){
            System.out.println("You can vote");
            return true;
        }
        else{
            System.out.println("You are minor");
            return false;
        }
    }



    public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
//        double num1=sc.nextDouble();
//        int num2=sc.nextInt();
//        int num3=sc.nextInt();

//    System.out.println("Result is "+ calculateAverage(num1, num2, num3));
//    System.out.println("Sum is "+ printOdd(num1));
//    System.out.println("Greatest is "+printGreatest(num1, num2));
//    System.out.println("Area of Circle is "+calculateArea(num1));
//     System.out.println(voteEligible(num2));

//        infinite loop using do-while condition
//    int a=23;
//        do{
//            System.out.println("Hey Ashu");
//        }while(a<=34);



    }
}
