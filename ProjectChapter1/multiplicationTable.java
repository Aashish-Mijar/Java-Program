package projectChapter1;
import java.util.*;
class Table{
    Scanner scanner;
    int num;

    Table(){
        scanner =new Scanner(System.in);
        System.out.println("Enter a number to find table: ");
        num=scanner.nextInt();
    }
    void displayTable(){
        for(int i=1; i<=10; i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
public class multiplicationTable {
    public static void main(String[] args) {
        Table tb=new Table();
        tb.displayTable();
    }
}
