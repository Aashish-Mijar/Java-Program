import java.util.*;
public class Jv_07_GCD {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int i;
        System.out.println("Factor of "+num1+" is ");
        for(i=1; i<=num1; i++){
            if(num1%i==0){
                System.out.print(" "+i);
            }
        }
        System.out.println();
        int j;
        System.out.println("Factor of "+num2+" is ");
        for(j=1; j<=num2; j++){
            if(num2%j==0){
                System.out.print(" "+j);
            }
        }


    }
}
