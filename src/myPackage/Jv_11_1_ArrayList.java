import java.util.*;
public class Jv_11_1_ArrayList {
    public static void main(String[] args) {
        // ArrayList---- a  resizable array. Elements can be added and removed after compilation phase

        ArrayList<String> food=new ArrayList<String>();
        food.add("Mo:Mo");
        food.add("Burger");
        food.add("Pizza");

        food.set(0, "Sushi");
        food.add(0,"Noodles");
        food.remove(2);
//        food.clear();
        for(int i=0; i<food.size(); i++){
            System.out.println("Food is :"+food.get(i));
        }
    }
}
