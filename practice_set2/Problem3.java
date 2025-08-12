class Circle{
    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    double areaCircle(){
        final double PI=3.1415;
        return PI*radius*radius;
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Circle circle=new Circle(6);
        double result=circle.areaCircle();
        System.out.println("The area of Circle with radius "+circle.radius+" is "+result);

    }
    
}
