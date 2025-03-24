package myPackage;
public class Jv_52_FinallyExceptionHandle2 {
    public static void main(String[] args) {
        String s1=null;
        try{
            int len=s1.length();
            System.out.println("Length of String is "+len);
        }
      catch(NullPointerException e){
          System.out.println(e+" error occur.");
      }
        finally{
            System.out.println("This block always runs.");
        }
    }
}
