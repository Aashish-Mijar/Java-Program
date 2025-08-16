import java.io.*;

public class Practice19 {
    public static void main(String[] args) throws IOException {
        // File file=new File("Sample2.txt");
        
        String original="Hello, this is a simple example!";

        // Write the string into an output Stream
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
        outputStream.write(original.getBytes());

        // convert output stream to string
        String result=outputStream.toString("UTF-8");

        System.out.println("OutputStream converted to String: ");
        System.out.println(result);
        
    }
}
