class University{
    // static variable
    static String universityName;

    // instance variable
    String stdName;
    
    University(String stdName){
        this.stdName=stdName;
    }

    void displayUni(){
        System.out.println("Student name is "+stdName+" and name of university is "+universityName);
    }
    
}
public class Problem15 {
    public static void main(String[] args) {
        University.universityName="Kathmandu University";
        University uN=new University("Aashish");
        University uN1=new University("Meera");
        
       
        uN.displayUni();
        uN1.displayUni();

    }
}
