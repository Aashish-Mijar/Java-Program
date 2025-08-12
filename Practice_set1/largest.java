package projectChapter1;
import java.util.*;
class Compare{
    Scanner scanner;
    int num1;
    int num2;
    int num3;
    Compare(){
        scanner=new Scanner(System.in);
        System.out.println("Enter three number: ");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        num3=scanner.nextInt();
    }
    void display(){
        if(num1>num2 && num1>num3){
            System.out.println(num1 +" is largest");
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2 +" is largest");
        }
        else{
            System.out.println(num3 +" is largest");
        }
    }
}
public class largest {
    public static void main(String[] args) {
        Compare cp=new Compare();
        cp.display();
    }
}
