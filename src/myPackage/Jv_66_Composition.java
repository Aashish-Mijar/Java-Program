package myPackage;

class CarM{
    String model;
    int year;
    Engine engine;

    CarM(String model, int year, String engineType){
        this.model=model;
        this.year=year;
        this.engine= new Engine(engineType);
    }
}
class Engine{
    String type;
    Engine(String type){
        this.type=type;
    }
}
public class Jv_66_Composition {
        // composition= Represents a "part of" relationship between objects.
//                        For example, an Engine is "part of " a Car.
//                        Allows complex objects to be constructed from smaller objects
        public static void main(String[] args) {
            CarM car=new CarM("Corvette", 2025, "V8");
            System.out.println(car.model);
            System.out.println(car.year);
            System.out.println(car.engine);
        }
}
