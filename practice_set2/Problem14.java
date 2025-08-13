class MathHelper{
    static int square(int number){
            return number*number;

    }
}
public class Problem14 {
    public static void main(String[] args) {
       int res= MathHelper.square(4);
       System.out.println("The square of given number is: "+res);
    }
}
