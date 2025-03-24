package myPackage;
import java.util.Scanner;
import java.text.NumberFormat;
public class Jv_03_MortgageCalc {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR=12;
        final byte PERCENTAGE=100;

//        ---MORTGAGE CALCULATOR
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        int principal=scanner.nextInt();

        System.out.print("Enter interest rate: ");
        float annualInterestRate=scanner.nextFloat();
        float monthlyInterestRate=annualInterestRate/PERCENTAGE/MONTHS_IN_YEAR;

        System.out.print("Period(Years): ");
        byte years=scanner.nextByte();
        int numberOfPayments=years*MONTHS_IN_YEAR;

        double mortgage=principal
                *(monthlyInterestRate*Math.pow(1+monthlyInterestRate,numberOfPayments))
                /(Math.pow(1+monthlyInterestRate,numberOfPayments)-1);
        String mortgageFormatted=NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+mortgageFormatted);
    }
}
