
class Calculator{
    int number1;
    int number2;

    Calculator(int number1, int number2){
        this.number1=number1;
        this.number2=number2;
    }

    void addition(){
        int result= number1+number2;
        System.out.println("The addition of "+number1+" and "+number2+" is: "+result);
    }

    void subtract(){
        int result= number1-number2;
        System.out.println("The subtract of "+number1+" and "+number2+" is: "+result);
    }

    void multiply(){
        int result= number1*number2;
        System.out.println("The addition of "+number1+" and "+number2+" is: "+result);
    }

    void division() throws Exception{
        int result= number1/number2;
        System.out.println("The addition of "+number1+" and "+number2+" is: "+result);
    }
}
public class Problem4 {
    public static void main(String[] args) {
        Calculator calc=new Calculator(12, 6);
        calc.addition();
        calc.subtract();
        calc.multiply();
        
            try {
                calc.division();
            } catch (Exception e) {
    
                e.printStackTrace();
            }
        }
       
    }
    

