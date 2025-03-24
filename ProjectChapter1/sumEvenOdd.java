package projectChapter1;

class arrSum{
    int[] numbers={1,2,3,4,5,6,7,8,9,10};
    int sumEven=0;
    int sumOdd=0;
    // void display(){
    //     for(int num:numbers){
    //         System.out.print(num);
    //     }
    // }


    void add(){
       for(int i=1; i<=numbers[i]; i++){
        if(numbers[i]%2==0){
            sumEven+=numbers[i];
        }
        else
        sumOdd+=numbers[i];
       }  
       System.out.println("The sum of even numbers in array is "+sumEven);
       System.out.println("The sum of odd numbers in array is "+sumOdd);

    }

}
public class sumEvenOdd {
    public static void main(String[] args) {
        arrSum ar=new arrSum();
        ar.add();
    }
    
}
