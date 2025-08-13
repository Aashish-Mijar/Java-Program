public class Problem9 {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("No words provided!");
        }
        else{
            // String words[]={"Apple", "Banana", "Cantalupe"};
            for(String word: args){
                System.out.println("Word: "+word);
            }
        }
    }
}
