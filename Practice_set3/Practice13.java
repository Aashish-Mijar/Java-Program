import java.util.Scanner;
import java.lang.Math;

public class Practice13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean exit=false;

        while(!exit){
            System.out.println();
            System.out.println("********* SCIENTIFIC CALCULATOR*********");
            System.out.println();
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Mod");
            System.out.println("8. Trigonometrc Functions(sin, cos, tan)");
            System.out.println("9. Exit");
            System.out.println("Choose an option: ");
            System.out.println();

            int choice=sc.nextInt();
            
            switch(choice){
                case 1: // Addition
                    System.out.println("Enter two numbers: ");
                    double add1=sc.nextDouble();
                    double add2=sc.nextDouble();
                    System.out.println("Result : "+(add1+add2));
                    break;

                case 2: // Subtraction
                    System.out.println("Enter two numbers: ");
                    double sub1=sc.nextDouble();
                    double sub2=sc.nextDouble();
                    System.out.println("Result : "+(sub1-sub2));
                    break;

                case 3: // Multiplication
                    System.out.println("Enter two numbers: ");
                    double mul1=sc.nextDouble();
                    double mul2=sc.nextDouble();
                    System.out.println("Result : "+(mul1*mul2));
                    break;

                case 4: // Division
                    System.out.println("Enter two numbers: ");
                    double div1=sc.nextDouble();
                    double div2=sc.nextDouble();
                    try{
                        if(div2!=0){
                            System.out.println("Result : "+(div1/div2));
                        }
                    }catch(ArithmeticException e){
                        System.out.println("Error occured: "+e);
                    }
                    break;

                case 5: // Square Root
                    System.out.println("Enter a numbers: ");
                    double sqr=sc.nextDouble();
                    try{ 
                        if(sqr>=0){
                            System.out.println("Result: "+Math.sqrt(sqr));
                        }
                    }catch(ArithmeticException e){
                        System.out.println("Error caught: "+e);
                    }
                    break;

                
                    case 6: // Power
                        System.out.println("Enter base and exponent : ");
                        double base= sc.nextDouble();
                        double exponent=sc.nextDouble();
                        System.out.println("Result :"+Math.pow(base, exponent));
                        break;

                    case 7: // Mod
                    System.out.println("Enter two number: ");
                    double num1=sc.nextDouble();
                    double num2=sc.nextDouble();
                    System.out.println("Result : "+(num1%num2));
                    break;

                    case 8: // Trignometric function
                    System.out.println("Choose a function 1.sin, 2.cos, 3.tan");
                    int trigChoice=sc.nextInt();
                    System.out.println("Enter angle in degrees: ");
                    double angle=sc.nextDouble();
                    double radians=Math.toRadians(angle);

                    // convert to radians
                    switch(trigChoice){
                        case 1: 
                            System.out.println("Sin("+angle+")= "+Math.sin(radians));
                            break;

                        case 2:
                            System.out.println("Cos("+angle+")= "+Math.cos(radians));
                            break;

                        case 3:
                            System.out.println("Tan("+angle+")= "+Math.tan(radians));
                            break;

                        default:
                        System.out.println("Invalid choice. Please try again.");
                        
                        
                    }

                    case 9:
                        exit=true;
                        System.out.println("See you next time! ");
                        break;

                    default:
                    System.out.println("Invalid choice. Please try again.");
                  
            }
        }
        sc.close();
      
    }
}
