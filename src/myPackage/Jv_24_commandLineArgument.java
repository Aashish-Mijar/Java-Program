package myPackage;
public class Jv_24_commandLineArgument {
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Provide two numbers!");
            return;
        }
        else{
//            System.out.println("Command-line arguments are: ");
//            for(int i=0; i<args.length; i++){
//                System.out.println("Args"+(i+1)+": "+args[i]);
//            }
            int sum=0;
            for(String arg:args){
                sum+=Integer.parseInt(arg);
            }
            System.out.println("Sum is :"+sum);
        }
    }
}
