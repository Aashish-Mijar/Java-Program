import java.util.*;

public class Jv_06_Practice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        System.out.println("How many times you want to enter");
//        int num=sc.nextInt();
//
//        int count1=0, count2=0, count3=0;
//        for(int i=1; i<=num; i++){
//            System.out.println("Enter number");
//            int num2=sc.nextInt();
//
//            if(num2>0){
//                count1=count1+1;
//            }
//
//            if(num2<0){
//                count2=count2+1;
//            }
//
//            if(num2==0){
//                count3=count3+1;
//            }
//        }
//        System.out.println("Positive count "+count1);
//        System.out.println("Negative count "+count2);
//        System.out.println("Zeros count "+count3);

        int x=sc.nextInt();
        int n=sc.nextInt();

        System.out.println("Result :"+(int)Math.pow(x, n));
    }
}
