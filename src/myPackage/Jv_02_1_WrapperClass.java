package myPackage;

public class Jv_02_1_WrapperClass {
    public static void main(String[] args) {

        // wrapper class----- provides a way to use primitive data types as reference data types
        //                  reference data types contain useful methods i.e parseInt(), ValueOf()
        //                  can be used with collections( ex. Arraylist, HashMap) but slower in access

        // autoboxing-- the automatic conversion of primitive type to Wrapper class
        // unboxing-- the reverse of autoboxing


        // Autoboxing (primitive to object)
        Boolean flag=true;
        Character b='@';
        Integer num=45;
        Double dec=3.1415;
        String str="Aashish";

        // Unboxing (object to primitive)
        boolean flag1=flag;
        char ch=b;
        int num1=num;

        // Using Wrapper class Methods
        String st="100";
        int parsedVal=Integer.parseInt(st);
        System.out.println("Value is :"+parsedVal*2);

        // Boxing and Unboxing (Manually converting)
        int number=10;
        Integer obj=Integer.valueOf(number);
        System.out.println("Value is: "+obj);

        Integer obj1=Integer.valueOf(20);
        int number1=obj.intValue();
        System.out.println("Value is: "+number1);
    }
}
