import java.io.IOException;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch=(char)System.in.read();
        sc.close();

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("The entered character is vowel");
        }
        else
        System.out.println("The entered character is consonant");

    

    }
}
