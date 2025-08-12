package myPackage;
class Detail{
    int rollNumber;
    String name;
    Detail(){};
    Detail(int rollNumber, String name){
        this.rollNumber=rollNumber;
        this.name=name;
    }

    public String toString(){
        return this.rollNumber+"\n"+this.name+"\n";
    }
}
class Marks extends Detail{
    int marks;

    Marks(int rollNumber, String name, int marks){
        super(rollNumber, name);
        this.marks=marks;
    }

    public String toString(){
        return super.toString()+this.marks;
    }
}

public class Jv_28_1_SuperKeyEg {
    public static void main(String[] args) {
        Marks mark=new Marks(01, "Aashish", 589);
        System.out.println(mark.toString());
    }
}
