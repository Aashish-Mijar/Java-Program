class NumberUtils{
    boolean isEven(int number){
        if(number%2==0){
            System.out.println("True");
            return true;
        }
        else{
            System.out.println("False");
            return false;
        }
    }
}
public class Problem6 {
    public static void main(String[] args) {
        NumberUtils check=new NumberUtils();
        check.isEven(5);
    }
}
