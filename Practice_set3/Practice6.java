import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number limit: ");
        int n=sc.nextInt();
        sc.close();
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println("The sum of n natural number is: "+sum);
    }
    
}
