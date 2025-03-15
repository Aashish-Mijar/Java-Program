import java.util.*;
// Unchecked Exception
public class Jv_53_ThrowExceptionHandle3 {
    public static void voteAge(int age){
        if(age<18){
            throw new ArithmeticException("Person's age is not valid for vote!");
        }
        else{
            System.out.println("Person's is valid for vote!");
        }
    }
    public static void main(String[] args) {
        voteAge(17);
        System.out.println("Rest of the code!");
    }
}
