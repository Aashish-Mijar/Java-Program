import java.util.Scanner;

public class Practice12 {
    static void printPrimeNumbers(int start, int end){
        for(int i=start; i<end; i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }

    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        else{
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num%i==0){
                    return false;
                }
            
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int start=sc.nextInt();

        System.out.println("Enter the ending number: ");
        int end=sc.nextInt();

        System.out.println("Prime numbers between "+start+" and "+ end +" are :" );
        printPrimeNumbers(start, end);
        sc.close();

    }
}
