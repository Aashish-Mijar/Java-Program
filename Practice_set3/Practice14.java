public class Practice14 {
    static int fact(int num){
            if(num==0){
                return 1;
            }
            if(num<0){
                System.out.println("Enter positive number! ");
                return -1;
            }
            return num*fact(num-1);
            
             
        }
        public static void main(String[] args) {
            int result=fact(-5);
        System.out.println("The factorial of given number is :"+result);
    }
}
