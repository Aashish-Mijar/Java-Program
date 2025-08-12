import java.util.*;
class Book{
    String title;
    String author;
    int price;

    Scanner sc=new Scanner(System.in);
    Book(){
        System.out.println("Enter title of ther book:");
        title=sc.nextLine();
        System.out.println("Enter author of ther book:");
        author=sc.nextLine();
        System.out.println("Enter price of ther book:");
        price=sc.nextInt();

    }

    void displayBookDetail(){
        System.out.println("The title of the book is "+title);
        System.out.println("The author of the book is "+author);
        System.out.println("The price of the book is "+price);
    }
}
public class Problem1{
    public static void main(String[] args) {
        Book book=new Book();
        book.displayBookDetail();
        
    }
}