package projectChapter1;
import java.util.*;
class primeNum{
    Scanner sc;
   static int number;
    primeNum(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not");
        number=sc.nextInt();
    }
    static boolean check(){
        if(number<2){
            return false;
        }
       for(int i=2; i<=Math.sqrt(number); i++){
        if(number%i==0){
            return false;
        }
       
       }
           return true;
    }
}
public class primeNumberTest {
    public static void main(String[] args) {
        if(primeNum.check()){
        System.out.println(primeNum.number+" is a prime number");
       }
       else{
        System.out.println(primeNum.number+" is not a prime number");
       }
    }
}
