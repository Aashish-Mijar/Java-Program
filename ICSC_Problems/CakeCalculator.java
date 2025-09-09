import java.util.InputMismatchException;
import java.util.Scanner;

//  DO NOT MODIFY THE NAME OF THE CLASS
class CakeCalculator {
   
    /**
     * Calculates the maximum number of cakes that can be made and the leftover ingredients.
     * 
     * @param flour An integer larger than 0 specifying the amount of available flour.
     * @param sugar An integer larger than 0 specifying the amount of available sugar.
     * @return An array of three integers: 
     *         [0] the number of cakes that can be made
     *         [1] the amount of leftover flour
     *         [2] the amount of leftover sugar
     */
    public static int[] cake_calculator(int flour, int sugar) {

        // WRITE YOUR CODE HERE
       
//        Ingredients needed or one cake
        int flourNeeded = 100;
        int sugarNeeded = 50;

        
        
    }
   
    
    //  --- Main execution block. DO NOT MODIFY.  ---
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // 1. Read input from stdin
            int flour = Integer.parseInt(scanner.nextLine().trim());
            int sugar = Integer.parseInt(scanner.nextLine().trim());
           
            // 2. Call the cake calculator function
            int[] result = cake_calculator(flour, sugar);
           
            // 3. Print the result to stdout in the required format
            System.out.println(result[0] + " " + result[1] + " " + result[2]);
           
        } catch (NumberFormatException e) {
            // Handle errors during input conversion
            System.err.println("Input Error: Invalid number format: " + e.getMessage());
            System.exit(1);
        } catch (IllegalArgumentException e) {
            // Handle validation errors
            System.err.println("Validation Failed: " + e.getMessage());
            System.exit(1);
        } catch (InputMismatchException e) {
            // Handle input format errors
            System.err.println("Input Error: Invalid input format");
            System.exit(1);
        } catch (Exception e) {
            // Catch any other unexpected errors
            System.err.println("An unexpected error occurred: " + e.getMessage());
            System.exit(1);
        }
    }
}