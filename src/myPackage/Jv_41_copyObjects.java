import java.util.*;
 class NewCar{
    private String model;
    private String color;
    private int price;

    NewCar(String model, String color, int price){
        this.model=model;
        this.color=color;
        this.price=price;
    }
    NewCar(NewCar x){
        this.copy(x);
    }
     public String getModel() {
         return model;
     }

     public void setModel(String model) {
         this.model = model;
     }

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public int getPrice() {
         return price;
     }

     public void setPrice(int price) {
         this.price = price;
     }
     public void copy(NewCar x){
        this.setModel(x.getModel());
        this.setColor(x.getColor());
        this.setPrice(x.getPrice());

     }
 }

public class Jv_41_copyObjects {
    public static void main(String[] args) {
    NewCar Ncar=new NewCar("Mustang", "Navy", 500000);
//    NewCar Ncar2=new NewCar("Camaro", "Cherry Red", 300000);

        NewCar Ncar2=new NewCar(Ncar);
    // copying object
        Ncar2.copy(Ncar);
        System.out.println(Ncar);
        System.out.println(Ncar.getModel());
        System.out.println(Ncar.getColor());
        System.out.println(Ncar.getPrice());
        System.out.println();
        System.out.println(Ncar2);
        System.out.println(Ncar2.getModel());
        System.out.println(Ncar2.getColor());
        System.out.println(Ncar2.getPrice());
    }
}
