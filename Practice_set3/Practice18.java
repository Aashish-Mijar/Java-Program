import java.io.*;

public class Practice18 {
    public static void main(String[] args) {
        try(FileInputStream fis=new FileInputStream("sample.txt")){
            // Read all bytes from the file
            byte[] byteData=fis.readAllBytes();

            // convert byte array to string using UTF-8 encoding
            String content=new String(byteData, "UTF-8");

            System.out.println("File content as String.");
            System.out.println(content);
        }
        catch(IOException e){
            e.printStackTrace();
        }
       
    }
}
