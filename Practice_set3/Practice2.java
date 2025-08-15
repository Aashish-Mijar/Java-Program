public class Practice2 {
    public static void main(String[] args) {
        int a=3;
        int b=4;
      
        System.out.println("The value of a before swapped is : "+a);
        System.out.println("The value of b before swapped is : "+b);
          //Using addition
        // a=a+b;
        // b=a-b;
        // a=a-b;

        // Using XOR
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("The value of a after swapped is : "+a);
        System.out.println("The value of b after swapped is : "+b);
    }
}
