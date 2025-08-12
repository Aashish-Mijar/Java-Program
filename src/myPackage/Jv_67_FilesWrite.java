package myPackage;
import java.io.*;
public class Jv_67_FilesWrite {
    public static void main(String[] args) throws Exception{
        //Writing files using java(4 popular options)

        // FileWrite= Good for small or medium-sized text files
        // BufferedWrite =Better performance for large amounts of text
        //PrinterWrite= Best for structured data, Like reports or logs
        // FileoutputStream = Best for binary files(e.g images, audio files)
        File fl=new File("Test.txt");
        FileWriter wr=new FileWriter(fl);
        wr.write("I have created file named Test");
        wr.close();
    }
}
