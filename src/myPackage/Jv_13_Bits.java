package myPackage;
public class Jv_13_Bits {
    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int oper=sc.nextInt();
        int n=10;
        int pos=2;
//        int oper=1;
        int bitMask=1<<pos;
//        System.out.println(bitMask);
//        int notBitMask=~(bitMask);


//        System.out.println(bitMask);
//        if((bitMask & n)==0){
//            System.out.println("Bit was zero");
//        }
//        else{
//            System.out.println("Bit was one");
//        }

        int number=bitMask | n;
        System.out.println(number);

//        int newNumber=notBitMask&n;
//        System.out.println(newNumber);


//        int bitMask=1<<pos;
//
//        if(oper==1){
//            int newNumber=bitMask | n;
//            System.out.println(newNumber);
//        }
//        else{
//            int newBitMask=~(bitMask);
//            int newNumber= newBitMask & n;
//            System.out.println(newNumber);
//        }


    }
}
