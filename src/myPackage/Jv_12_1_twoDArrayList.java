package myPackage;
import java.util.*;
public class Jv_12_1_twoDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> groceryList=new ArrayList<>();
        ArrayList<String> bakeryList=new ArrayList<String>();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic Bread");

        ArrayList<String> produceList=new ArrayList<String>();
        produceList.add("tomatoes");
        produceList.add("zucchini");

        ArrayList<String> drinks=new ArrayList<String>();
        drinks.add("soda");
        drinks.add("coffee");

//        System.out.println(drinks.get(0));
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinks);

        System.out.println(groceryList.get(0));
    }
}
