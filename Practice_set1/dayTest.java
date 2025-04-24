package projectChapter1;
import java.util.*;
class Day{
    Scanner scanner;
    int num;
    Day(){
        scanner=new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7");
        num=scanner.nextInt();
    }
    void show(){
        switch(num){
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Invalid number entered");
        }
    }
}
public class dayTest {
    public static void main(String[] args) {
        Day dy=new Day();
        dy.show();
        
    }
}
