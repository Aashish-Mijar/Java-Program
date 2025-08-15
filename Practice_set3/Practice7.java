// import java.util.Scanner;

public class Practice7 {
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // sc.close();
        
        // int fact=1;
        // for(int i=1; i<=a; i++){
        //     fact*=i;
        // }
        // System.out.println("The factorial of n is :"+fact);
    
    int res=factorial(5);
    System.out.println("The factorial is :"+res);
    }
}
