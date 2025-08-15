import java.util.*;
public class Practice1 {

    public static void main(String[] args) {
        int a, b;

        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        int s = a + b;
        System.out.println(s);

        
    }
}