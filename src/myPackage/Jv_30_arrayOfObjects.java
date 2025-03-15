import java.util.*;
class Food{
    String name;
    Food(String name){
        this.name=name;
    }
}
public class Jv_30_arrayOfObjects {
    public static void main(String[] args) {
//        Food[] store = new Food[5];
        Food food1 = new Food("Pizza");
        Food food2 = new Food("Burger");
        Food food3 = new Food("Pasta");

        // Creating Array of Objects
        Food[] store={food1, food2, food3};
//        store[0] = food1;
//        store[1] = food2;
//        store[2] = food3;
        System.out.println(store[0].name);
        System.out.println(store[1].name);
        System.out.println(store[2].name);
    }
}
