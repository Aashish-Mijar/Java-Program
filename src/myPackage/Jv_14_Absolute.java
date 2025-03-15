import java.util.*;
public class Jv_14_Absolute {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value: ");
        int value=sc.nextInt();

        if(value<0){
            int abl=-value;
            System.out.println("Absolute: " +abl);
        }
        else{
            System.out.println("Already positive, "+value);
        }
    }
}
