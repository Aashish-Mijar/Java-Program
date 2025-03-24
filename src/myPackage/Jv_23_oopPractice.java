package myPackage;
import java.util.*;
class Cylinder{
    private int radius;
   private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea(){
        return 2*3.14*radius*height+2*3.14*radius*radius;
    }

    public double volume(){
        return 2*Math.PI*radius*height;
    }
}

 class Rectangle{
    private int length;
    private int breadth;

     public Rectangle() {
         this.length = 5;
         this.breadth = 6;
     }
     public Rectangle(int len, int bre) {
         this.length = len;
         this.breadth = bre;
     }

     public int getBreadth() {
         return breadth;
     }

     public int getLength() {
         return length;
     }
 }
public class Jv_23_oopPractice {
    public static void main(String[] args) {
    Cylinder c1=new Cylinder(9, 12);
        /*
    c1.setHeight(23);
    c1.setRadius(10);

     System.out.println(c1.getHeight());
     System.out.println(c1.getRadius());


     System.out.println("Surface Area is :"+c1.surfaceArea());
     System.out.println("Volume is :"+c1.volume());
      */
    Rectangle r1=new Rectangle();
    System.out.println(r1.getBreadth());
    System.out.println(r1.getLength());

    Rectangle r2=new Rectangle(10, 13);
        System.out.println(r2.getBreadth());
        System.out.println(r2.getLength());
    }
}
