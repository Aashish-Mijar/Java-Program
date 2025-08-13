class Counter{
    static int count=0;

    Counter(){
        count++;
        System.out.println("Object created number:"+count);
    }
}
public class Problem13 {
    public static void main(String[] args) {
        Counter cnt=new Counter();
        Counter cnt2=new Counter();
    }
}
