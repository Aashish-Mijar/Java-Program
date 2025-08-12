package myPackage;
public class Jv_09_Pattern {
    public static void main(String[] args) {

        int i, j;
        //        Pattern1 ------nested loops --Rectangle
//        for(i=1; i<=4; i++) {
//            for (j = 1; j <= 5; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Pattern2 -------------hollow rectangle
//    for(i=1; i<=4; i++){
//        for(j=1; j<=5; j++){
//            if(i==1||j==1||i==4||j==5){
//                System.out.print("*");
//            }
//            else{
//                System.out.print(" ");
//            }
//        }
//        System.out.println();
//    }


        // Pattern3 ---------Half pyramid
//        for(i=1; i<=4; i++){
//            for(j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Pattern4--------- Inverted Half Pyramid
//        for(i=5; i>=1; i--){
//            for(j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Pattern5 -------- inverted rotated by 180 deg half pyramid
//        for(i=1; i<=4; i++){
//            for(j=1; j<=4-i; j++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=i; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Pattern6 ------ inverted pyramid with numbers
//        for(i=1; i<=4; i++){
//            for(j=1; j<=4-i+1; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        Pattern7 --------Floyd's triangle
//        int number=1;
//        for(i=1;i<=5; i++){
//            for(j=1; j<=i; j++){
//                System.out.print(number+" ");
//                number++;
//            }
//            System.out.println();
//        }

//        Pattern8 ------- 0-1 Triangle
//        for(i=1; i<=5; i++){
//            for(j=1; j<=i; j++){
//                int sum=i+j;
//                if(sum%2==0){
//                    System.out.print("1 ");
//                }
//                else{
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }

//    Pattern9 -------Butterfly pattern
//        Upper Half
//        for (i = 1; i <= 4; i++) {
//            //  first part
//            for (j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            //  spaces
//            for(int k=1; k<=2*(4-i); k++){
//                System.out.print(" ");
//            }
//            //  second part
//            for(int l=1; l<=i; l++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        // lower part
//        for (i = 4; i >= 1; i--) {
//            //  first part
//            for (j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            //  spaces
//            for(int k=1; k<=2*(4-i); k++){
//                System.out.print(" ");
//            }
//            //  second part
//            for(int l=1; l<=i; l++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // Patrern10--------Solid Rhombus
//        for(i=1; i<=5; i++){
//            for(j=1; j<=5-i; j++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=5; k++){
//                System.out.print("*");
//            }
//        System.out.println();
//        }


        // Pattern11   Number Pyramid
//        for(i=1; i<=5; i++){
//            for(j=1; j<=5-i; j++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=i; k++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }


        // Pattern12------ Palindromic Pattern
//        for(i=1; i<=5; i++){
//            for(j=1; j<=5-i; j++) {
//                System.out.print(" ");
//            }
//            for(int k=i; k>=1; k--){
//                System.out.print(k);
//            }
//            for(int l=1; l<=i; l++){
//                System.out.print(l);
//            }
//            System.out.println();
//        }

        // Pattern13 ------ Diamond Pattern
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}