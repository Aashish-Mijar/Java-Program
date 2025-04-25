package projectChapter1;
import java.util.*;
class Rand{
    Scanner sc;
    Random random;
    int num;
    int Uguess=0;

    void displayRandom(){
        sc=new Scanner(System.in);
        random=new Random();
        num=random.nextInt(100)+1;
        // System.out.println(num);

        while(Uguess!=num){
            System.out.println("Enter a number: ");
            Uguess=sc.nextInt();

            if(Uguess<num){
                System.out.println(" Too low! Try again");
            }
            else if(Uguess>num){
                System.out.println(" Too high! Try again" );
            }
            else{
                System.out.println("Correct guess! "+ num);
            }
        }
       
    } 
}
public class numGuess {
    public static void main(String[] args) {
        Rand rd=new Rand();
        rd.displayRandom();
    }
}
