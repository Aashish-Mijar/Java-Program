public class Jv_16_VarArgs {
//    static int sum(int a, int b){
//        return a+b;
//    }
//
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }

    static int sum(int x, int ...arr){
        // Available as int [] arr;
        int result=x;
        for(int a:arr){
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum is "+sum(9));
        System.out.println("The sum of 2 and 4 is :"+sum(2, 4));
        System.out.println("The sum of 6, 5 and 7 is :"+sum(6, 5, 7));
        System.out.println("The sum of 6, 5, 9 and 7 is :"+sum(6, 5, 9, 7));
    }
}
