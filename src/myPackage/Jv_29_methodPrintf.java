import java.util.*;
public class Jv_29_methodPrintf {
    public static void main(String[] args) {

        boolean myBoolean=true;
        char myChar='#';
        String myString="John";
        int myInt=34;
        double myDouble=1000;

//        System.out.printf("%b", myBoolean);
//        System.out.printf("%c", myChar);
//        System.out.printf("%s", myString);
//        System.out.printf("%d", myInt);
//        System.out.printf("%f", myDouble);

        // minimum number of characters to be written as output
//        System.out.printf("Hello %5s", myString);

        // sets number of digits of precision when outputting floating-point values
        System.out.printf("%.2f This is a formated string ", 123.98877);

        /*
         flags
         adds an effect to output based on the flag added to format specifier
         - : left-justify
         + : output a plus (+) or minus(-) sign for a numeric value
         0 : numeric values are zero-padded
         , : comma grouping separator if numbers >1000 eg
        */

//        System.out.printf("This is a formated string %,f ", myDouble);
    }

}
