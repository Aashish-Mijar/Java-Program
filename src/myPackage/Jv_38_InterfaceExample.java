// Example 1
interface Bank{
    float rateOfInterest();
}

class SBI implements Bank{
    public float rateOfInterest(){
        return 10.3f;
    }
}
class Nabil implements Bank{
    public float rateOfInterest(){
        return 12.3f;
    }
}

public class Jv_38_InterfaceExample {
    public static void main(String[] args) {
        Bank objB=new SBI();
        System.out.println("The interest rate of SBI bank is "+objB.rateOfInterest());

        Bank objC=new Nabil();
        System.out.println("The interest rate of Nabil bank is "+objC.rateOfInterest());
    }
}
