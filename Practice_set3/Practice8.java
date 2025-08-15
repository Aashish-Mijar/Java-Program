import java.util.Scanner;

public class Practice8 {
    static int fibo(int n){
            if(n<=1) return n;
            else{
                return fibo(n-1)+fibo(n-2);
            }
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of terms: ");
            int n=sc.nextInt();
            sc.close();
            int firstTerm=0, secondTerm=1;
            System.out.println("Fibonacci series up to "+n+" terms:");
            // for(int i=0; i<n; i++){
            //     System.out.println(fibo(i));
            //  }
         
            // non recursive function
            for(int i=0; i<n; i++){
                System.out.println(firstTerm +" ");
                int nextTerm=firstTerm+secondTerm;
                firstTerm=secondTerm;
                secondTerm=nextTerm;
            }
    }
}
