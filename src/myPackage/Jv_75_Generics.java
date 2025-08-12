package myPackage;

class Box<T>{
    T item;
    public void setItem(T item){
        this.item=item;
    }
    public T getItem(){
        return this.item;
    }
}
class Product<T, U>{
    T prod;
    U price;

    Product(T prod, U price){
        this.prod=prod;
        this.price=price;
    }
    void displayProduct(){
        System.out.println("The product is "+prod+" and its price is "+price);
    }

}
public class Jv_75_Generics {
    public static void main(String[] args) {
        // Generics= A concept where you can write a class, interface or method
        //          that is compatible with different data types.
        //          <T> type parameter (placeholder that gets replaced with a real type)
        //          <String> type argument(specifies the type)
        Box<String> box=new Box<>();
        box.setItem("Hello");
//        box.getItem();
//        System.out.println(box.getItem());

        Product<String, Integer>  product=new Product<>("Sensor Module", 2500);
        product.displayProduct();
    }

}
