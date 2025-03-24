package myPackage;
class Encap{
    private String Ename;
    private int Evalue;

    Encap(String Ename, int Evalue){
        this.Ename=Ename;
        this.Evalue=Evalue;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public int getEvalue() {
        return Evalue;
    }

    public void setEvalue(int evalue) {
        Evalue = evalue;
    }
}

public class Jv_40_Encapsulation {
    public static void main(String[] args) {
        // Encapsulation   -attributes of a class will be hidden or private
        //                  Can be accessed only through methods (getters ond setters)
        //                  You should make attributes private if you don't have a reason to make
    Encap ecap=new Encap("Model", 23);
    ecap.setEname("NewModel");
        System.out.println(ecap.getEvalue());
        System.out.println(ecap.getEname());

    }
}
