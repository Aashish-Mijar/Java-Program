package projectChapter1;
import java.util.*;
class Fact{
    Scanner scanner;
    int num;
    int res=1;
    Fact(){
        scanner=new Scanner(System.in);
        System.out.println("Enter number to find factorial");
        num=scanner.nextInt();
    }
    void draw(){
        if(num<0){
            System.out.println("Cannot find factorial for negative number");
        }
        else{
            for(int i=1; i<=num; i++){
                res*=i;
            }
            System.out.println("The factorial of "+num+" is "+res);
        }
       
    }
}
public class factorial {
    public static void main(String[] args) {
        Fact ft=new Fact();
        ft.draw();
    }
}
