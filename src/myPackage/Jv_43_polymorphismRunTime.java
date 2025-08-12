package myPackage;
import java.util.*;
class Area{
    int length=5;
    int breadth=3;
    int height=7;
    int radius=8;
//    Area(int length, int breadth, int height, int radius){
//        this.length=length;
//        this.breadth=breadth;
//        this.height=height;
//        this.radius=radius;
//    }
     void area(){
         System.out.println("This is default area. Area is Zero!");
     }
}
class AreaTriangle extends Area{
   @Override
    void area(){
        double result=(double)(breadth*height)/2;
        System.out.println("The Area of Triangle is "+result);
    }
}
class AreaCircle extends Area{
    @Override
    void area(){
        final double PI=3.1415;
        double result=PI*radius*radius;
        System.out.println("The Area of Circle is "+result);
    }
}

class AreaRectangle extends Area{
    @Override
    void area(){
        int result=length*breadth;
        System.out.println("The Area of Rectangle is "+result);
    }
}

public class Jv_43_polymorphismRunTime {
    public static void main(String[] args) {
        // Run-Time polymorphism(Dynamic polymorphism)
        Scanner scanner=new Scanner(System.in);
        Area area;

        System.out.println("Which shapes' area do you want to find out?");
        System.out.println("(1.Triangle's area), (2. Circle's area), (3. Rectangle's area)");
        int choice=scanner.nextInt();
        if(choice==1){
            area=new AreaTriangle();
            area.area();
        }
        else if(choice==2){
            area=new AreaCircle();
            area.area();
        }
        else if(choice==3){
            area= new AreaRectangle();
            area.area();
        }
        else{
            area=new Area();
            System.out.println("Invalid choice");
            area.area();

        }

    }
}
