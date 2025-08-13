 class rectangle {
    int length;
    int breadth;

    void calculate(){
        int sum = length * breadth;
        System.out.println(sum);
    }
    rectangle(int a, int b){
        this.length = a;
        this.breadth = b;
    }
}
public class Problem12 {
  
    public static void main(String[] args) {
        rectangle rec = new rectangle(5, 5);
        rec.calculate();
    }
}
