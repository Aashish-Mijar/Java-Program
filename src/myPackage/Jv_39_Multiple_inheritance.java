interface numbers{
    // public, static and final
    int tMarks=500;

    // public and abstract
    void displayMarks();
    static int cube(int n){
        return n*n*n;
    }
}
interface score{
    int score=8;
    void displayScore();
}
class result implements numbers, score{
    int result=tMarks+score;
   public void displayMarks(){
        System.out.println("The marks of the student is "+tMarks);
    }
    public void displayScore(){
        System.out.println("The score of the student is "+score);
    }
    public void displayTotal(){
        System.out.println("The Total is "+result);
    }
}
public class Jv_39_Multiple_inheritance {
    public static void main(String[] args) {
    result res=new result();
    res.displayMarks();
    res.displayScore();
    res.displayTotal();

    System.out.println("The cube of the number is "+numbers.cube(3));
    }
}
