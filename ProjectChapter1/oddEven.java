package projectChapter1;
import java.util.Scanner;
public class oddEven {
    Scanner scanner;
    int number;
   oddEven(){
    scanner=new Scanner(System.in);
    System.out.println("Enter a number");
     number=scanner.nextInt();
   }
   
    void check(){
        if(number%2==0){
            System.out.println(number+" is even");
        }
        else{
            System.out.println(number+" is odd");
        }
    }
    public static void main(String[] args) {
        oddEven od=new oddEven();
        od.check();
        
    }
    
}
