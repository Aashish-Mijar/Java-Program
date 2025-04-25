package projectChapter1;

public class smallLargeInArray {
    public static void main(String[] args) {
        int[] numbers={23, 5,7,45,35,98};
        int smallest=numbers[0];
        int largest=numbers[0];

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
            else if(numbers[i]>largest){
                largest=numbers[i];
            }
        }

        System.out.println("Smallest numbers: "+smallest);
        System.out.println("Largest numbers: "+largest);
    }
    
}
