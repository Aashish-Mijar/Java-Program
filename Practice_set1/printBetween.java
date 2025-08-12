package projectChapter1;

public class printBetween {
    public static void main(String[] args) {
        int i;
        for(i=1; i<=20; i++){
            if(i%5==0){
                continue;
            }
            else{
                if(i>=16)
                break;
                else
                System.out.print(i+" ");
            }
        }
        
    }
}
