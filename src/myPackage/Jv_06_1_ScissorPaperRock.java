package myPackage;
import java.util.*;
public class Jv_06_1_ScissorPaperRock {
    public static void main(String[] args) {
        // 0 Paper
        // 1 Rock
        // 2 Scissor

        Scanner sc =new Scanner(System.in);
        System.out.println("0 for Paper\n1 for Rock\n2 for Scissor");
        int userChoice=sc.nextInt();

        Random random=new Random();
        int computerChoice=random.nextInt(3);

        if(userChoice==computerChoice){
            System.out.println("Draw! No one wins");
        }
        else if(userChoice==0 && computerChoice==2||userChoice==1&&computerChoice==0||userChoice==2&&computerChoice==1){
            System.out.println("Computer Wins!");
        }
        else{
            System.out.println("You win!");
        }

        if(computerChoice==0){
            System.out.println("Computer choice is : Paper");
        }
        else if(computerChoice==1){
            System.out.println("Computer choice is : Rock");
        }
        else {
            System.out.println("Computer choice is : Scissor");
        }
    }
}
