package myPackage;
import java.util.*;
public class Jv_11_Arrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size=sc.nextInt();
        /*
        int[] marks=new int[3];
        int marks[]= new int[size];
        marks[0]=34;
        marks[1]=43;
        marks[2]=98;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // input
        for(int i=0; i<size; i++){
            marks[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        // output
        for(int i=0; i<marks.length; i++){
            if(marks[i]==x){
                System.out.println("x found at index "+i);
            }
        }
        */

        //  FOR INPUT
        String names[]=new String[size];
        for(int i=0; i<size; i++){
            names[i]=sc.next();
        }

        // OUTPUT
//        for(int i=0; i<names.length; i++){
//            System.out.println("Names are "+names[i]);
//        }

        //-----Using ForEach Loop
        for(String element:names){
            System.out.println(element);
        }
    }
}
