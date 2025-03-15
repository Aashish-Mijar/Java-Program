class emp{
    int id;
    int salary;
    static String ceo;

    public void display(){
        System.out.println(id+" "+ salary+" "+ ceo);
    }
}

public class Jv_35_StaticKeyword {

    // Static= modifier. A single copy of a variable/method is created and shared.
    // The class "owns" the static member
    // To access static variable we don't need object
    public static void main(String[] args) {
        emp Aashish=new emp();
        Aashish.id=234;
        Aashish.salary=8000;
        Aashish.ceo="Mira";

        emp minu=new emp();
        minu.id=294;
        minu.salary=8000;
        minu.ceo="Mira";

        Aashish.display();
        minu.display();
    }


}
