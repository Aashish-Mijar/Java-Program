import java.util.*;
class Game{
   public int noOfGuess=0, ran, inp;
     Game(){
        Random random=new Random();
        ran=random.nextInt(0,100);
    }
    void userInput() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your guess(0 to 100): ");
            inp = sc.nextInt();
    }
    void isCorrectNumber(){
    if(inp>ran){
        System.out.println("Think of Lower number!");
    }
    else if(inp<ran){
        System.out.println("Think of Higher number!");
    }
    else{
        System.out.println("Correct number!");
    }
    }
    public void setnoOfGuess(int guess){
         noOfGuess=guess;
    }
    public int getnoOfGuess(){
         return noOfGuess;
    }
}
public class Jv_22_GuessNumber {
    public static void main(String[] args) {
    Game g1=new Game();
    do{
        g1.userInput();
        if(g1.inp<0||g1.inp>100){
            System.out.println("Number is out of Range!. Try Again");
        }
        g1.setnoOfGuess(++g1.noOfGuess);
        g1.isCorrectNumber();
    }while(g1.inp!=g1.ran);
        System.out.println("Number of Guesses: "+g1.getnoOfGuess());
    }
}
