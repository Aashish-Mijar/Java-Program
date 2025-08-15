import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        int number;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number: ");
         number=sc.nextInt();
        sc.close();

        int answer=0;
        while(number>0){
            int lastDigit=number%10;
            answer=answer*10+lastDigit;
            number=number/10;
        }
        System.out.println("The reverse of number is :"+answer);

    }
    
}
