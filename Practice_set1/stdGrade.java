package projectChapter1;
import java.util.*;
class Marks{
    Scanner sc;
    int marks;
    Marks(){
       sc=new Scanner(System.in);
       System.out.println("Enter your total marks in percentage");
        marks=sc.nextInt();
    }
    void display(){
        if(marks>=90 && marks<=100){
            System.out.println("You have obtained Grade 'A'");
        }
        else if(marks>=80 && marks<=89){
            System.out.println("You have obtained Grade 'B'");
        }
        else if(marks>=70 && marks<=79){
            System.out.println("You have obtained Grade 'C'");
        }
        else if(marks>=60 && marks<=69){
            System.out.println("You have obtained Grade 'D'");
        }
        else {
            System.out.println("You have obtained Grade 'F'");
        }
    }

}
public class stdGrade {
    public static void main(String[] args) {
       Marks mrk=new Marks();
       mrk.display(); 
    }
}
