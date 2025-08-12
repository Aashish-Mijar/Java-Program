package projectChapter1;
import java.util.*;
class sumNnumbers{
    Scanner sc;
    int number;
    int sum=0;
    sumNnumbers(){
        sc=new Scanner(System.in);
        System.out.println("Enter a limit of number");
        number=sc.nextInt();
    }
    void display(){
        for(int i=1;i<=number; i++){
            sum+=i;
        }
        System.out.println("Addition of n numbers is "+sum);
    }
}
public class sumLoop {
    public static void main(String[] args) {
        sumNnumbers sm=new sumNnumbers();
        sm.display();
    }
}
