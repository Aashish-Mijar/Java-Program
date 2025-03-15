package myPackage;
import java.util.*;
import java.util.Date;
public class Jv_01_Basic {
    public static void main(String[] args){
        int val1=34;
        int val2=56;
        int sum= val1+val2;
        Date now=new Date();
//        System.out.println(now);
//        System.out.println("Sum is :"+sum);

        /*
//        -----STRINGS --reference type
        String text="Welcome to java programming";
        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.replace("to","coders"));


//        -----ARRAYS
//        1D Array
         int[] numbers=new int[5];
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        numbers[4]=50;
        Arrays.toString(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] num= {2,5,6,7,7};
        System.out.println(Arrays.toString(num));
        System.out.println(num.length);

//        2D ARRAYS
        int [][] values={{1,6,2}, {3,6,7}};
        System.out.println(Arrays.deepToString(values));

//        --CONSTANTS-----keyword-'final'
        final float PI=3.14f;
        System.out.println(PI);

//        -----Operators
        int x=5;
        int y=x--;
        System.out.println(x);
        System.out.println(y);

//        ---CASTING
// Implicit casting   byte>short>int>long>float>double

        short x1=3;
        int y1=x1+2;
        System.out.println(y1);


            // Explicit casting
        double n=2.3;
        int m=(int)n+4;
        System.out.println(m);

        String n1="2";
        int m1=Integer.parseInt(n1)+3;
        System.out.println(m1);

//        --Math class
         int result=Math.round(1.45f);
         System.out.println(result);

         int res=(int)Math.ceil(1.34f);
         System.out.println(res);

         int res1=(int)Math.floor(23.45f);
         System.out.println(res1);


//         ---Random function
        int op=(int)Math.round(Math.random()*100);
        System.out.println(op);

        double x=3.15;
        double y=-12;

        double z=Math.max(x, y);
        double i=Math.min(x,y);
        System.out.println(z);
        System.out.println(i);
 */

        double h;
        double p;
        double b;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter p side");
        p=scanner.nextDouble();

        System.out.println("Enter b side");
        b=scanner.nextDouble();

        h=Math.sqrt((p*p)+(b*b));
        System.out.println("The hypotenuse is :"+h);


    }
}