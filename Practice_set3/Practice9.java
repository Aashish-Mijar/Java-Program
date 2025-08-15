// import java.lang.*;
public class Practice9 {
    static int DigitalCheck(int num){
            num=Math.abs(num);
            int count=0;
            while(num>0){
                num/=10;
                count++;
            }
            return count > 0 ? count : 1;
            
        }
    public static void main(String[] args){
        int number=23435;
        System.out.println(DigitalCheck(number));
}
}
