import java.util.*;
class TestArray{
    static void mini(int arr[]){
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }

//    method for anonymous array
    static void printArray(int arr[]){
        for(int i:arr){
            System.out.println("Data is :"+i);
        }
    }
}
public class Jv_45_OOPArray {
    public static void main(String[] args) {
        int a[]={2,4,1,56,34};
//       TestArray.mini(a);

//        providing an anonymous array
        TestArray.printArray(new int[]{23,45,6,34});
    }
}
