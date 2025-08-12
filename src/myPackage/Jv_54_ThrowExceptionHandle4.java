package myPackage;
import java.io.FileNotFoundException;
import java.io.*;
public class Jv_54_ThrowExceptionHandle4 {
    public static void method() throws FileNotFoundException{
        FileReader file=new FileReader("D:\\abc.txt");
        BufferedReader fileinput=new BufferedReader(file);

        throw new FileNotFoundException();
    }
    public static void main(String[] args) {
        try{
            method();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("rest of the code");
    }
}
