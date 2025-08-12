public class Problem7 {
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Provide at least two strings");
        }
        else{
            System.out.println("Command lIne arguments are: ");
            for(int i=0; i<args.length; i++){
                System.out.println("Args "+(i+1)+" "+args[i]);
            }
        }
    }
}
