import java.util.*;
public class Practice3 {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        sc.close();
        if (a % 2 ==0) {
            System.out.println("even");
            
        }
        else{
            System.out.println("odd");
        }
    }
}
