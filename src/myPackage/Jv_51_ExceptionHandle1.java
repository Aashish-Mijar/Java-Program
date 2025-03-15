import java.util.*;
public class Jv_51_ExceptionHandle1 {
    public static void main(String[] args) {
        // exception= an event that occurs during the execution of a program that
        // disrupts the normal flow of instruction
        Scanner scanner=new Scanner(System.in);
        String s=null;
        String s1="abc";
        int[] num={2,4,5,8};
        try{
//            System.out.println("Enter Dividend(whole number only): ");
//            int dividend=scanner.nextInt();
//
//            System.out.println("Enter divisor(whole number only):");
//            int divisor=scanner.nextInt();
//
//            int result=dividend/divisor;
//            System.out.println("Result is "+result);

//            int length=s.length();
//            System.out.println("Length of the string is "+length);

//            int number=Integer.parseInt(s1);
//            System.out.println("The number equivalent of string is "+number);
            int idx=5;
            int val=num[idx];
        }
        catch(ArithmeticException e){
            System.out.println("Error: Divisor must not be zero.");
        }
        catch(InputMismatchException e){
            System.out.println("Error: Input must not be strings");
        }
        catch(NullPointerException e){
            System.out.println("Error: Null reference encountered.");
        }
        catch(NumberFormatException e){
            System.out.println("Error: Unable to parse the string as an integer.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Index is out of bounds.");
        }
    }
}
