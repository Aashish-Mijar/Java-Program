import java.util.*;
public class Jv_17_Recursion {
    static int fact(int n){
        if(n==0|n==1){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }

    static int fibo(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return (fibo(n-1)+fibo(n-2));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The factorial of 5 is :"+ fact(5));
        for(int i=0; i<n; i++){
            System.out.print(" "+fibo(i));
        }

    }
}
