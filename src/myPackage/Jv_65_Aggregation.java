package myPackage;
class Book{
    String title;
    int pages;

    Book(String title, int pages){
        this.title=title;
        this.pages=pages;
    }

    public String bookDisplay(){
        return this.title +" ("+this.pages+ ") pages";
    }
}
 class Library{
    String lName;
    int year;
    Book[] books;

    Library(String lName, int year, Book[] books){
        this.lName=lName;
        this.year=year;
        this.books=books;
    }

    void displayInfo(){
        System.out.println("The "+this.year+" "+this.lName);
        System.out.println("Books Availabe: ");
        for(Book book:books){
            System.out.println(book.bookDisplay());
        }
    }

 }
public class Jv_65_Aggregation {
    public static void main(String[] args) {
    Book book1=new Book("The Fellow of the Ring", 432);
    Book book2 =new Book("The Two Towers", 434);
    Book book3 =new Book("Atomic Habits", 634);

    Book[] books={book1, book2, book3};

//    for(Book book: books){
//        System.out.println(book.bookDisplay());
//    }
        Library library=new Library("Waling Public Library", 2004, books);
        library.displayInfo();
    }
}
