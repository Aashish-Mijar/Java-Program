public class Problem8 {
    public static void main(String[] args) {
        if(args.length<3){
            System.out.println("Provide three numbers");
        }
        else{
            int sum=0;
            for(String arg:args){
                sum+=Integer.parseInt(arg);
            }
            System.out.println("The sum is "+sum);
        }
    }
}
