package myPackage;
import java.io.*;
public class Jv_68_FilesRead {
    public static void main(String[] args) {
        // How to read files

        // BufferedReader+FileReader= Best for reading text files line-ny-line
        // FileInputStream= Best for binary files(eg. images, audio files)
        // RandomAccessFile= Best fo read/write specific portions of a large file

        String filePath="C:\\Users\\dell\\Desktop\\Test.txt";

        try( BufferedReader red=new BufferedReader(new FileReader(filePath));){
            System.out.println("That file exists");
//            System.out.println("Content of File is :"+red.readLine());
            String Line;
            while((Line=red.readLine())!=null){
                System.out.println(Line);
            }

        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate files");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }

    }
}
