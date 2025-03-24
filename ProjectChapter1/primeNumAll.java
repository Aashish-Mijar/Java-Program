package projectChapter1;
import java.util.*;
class Prime{
    Scanner scan;
    int start;
    int end;
    Prime(){
        scan=new Scanner(System.in);
        System.out.println("Enter the start and end limit for prime number");
        start=scan.nextInt();
        end=scan.nextInt();
    }
    void findAndDisplay(){
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean isPrime(int num){
        if(num<2){
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
}
public class primeNumAll {
    public static void main(String[] args) {
        Prime prime=new Prime();
        prime.findAndDisplay();
    }
}
