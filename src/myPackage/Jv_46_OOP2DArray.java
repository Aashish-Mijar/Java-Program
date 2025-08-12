package myPackage;
class Test2DArray{
static void Arr(int arr[][]){
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
static void JaggedArr(int arr[][]){

    // printing the data of a jagged array
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }

}
}
public class Jv_46_OOP2DArray {
    public static void main(String[] args) {
//        Syntax for 2D Array= dataType[][] arrayVar; dataType [][]arrayVar;
//        dataType arrayVar[][]; dataType[] arrayVar[];
        int arr[][]= {{1,3,4}, {5,3,8},{9,6,1}};
//        Test2DArray.Arr(arr);

        // Declaring a 2D array with odd columns
        int arr2[][]=new int[3][];
        arr2[0]=new int[3];
        arr2[1]=new int[4];
        arr2[2]=new int[2];
        // initializing a jagged array
        int count=0;
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                arr2[i][j]=count++;
            }
        }
        Test2DArray.JaggedArr(arr2);
    }
}
