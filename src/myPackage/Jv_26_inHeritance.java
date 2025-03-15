import java.util.*;
class Base{
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base{
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int sum(){
        return getX()+y;
    }
}
public class Jv_26_inHeritance {
    public static void main(String[] args) {
//    Base b1=new Base();
//    b1.setX(23);

    Derived d1=new Derived();
    d1.setX(23);
    d1.setY(34);

    System.out.println(d1.getY());
    System.out.println(d1.getX());

    System.out.println("Addition is :"+d1.sum());
    }
}
