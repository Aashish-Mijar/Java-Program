import java.util.*;

//  DO NOT MODIFY THE NAME OF THE CLASS
class WordSearch {
    

    /**
     * Generate a 10x10 word search puzzle containing the given words.
     * 
     * @param words A list of strings to include in the puzzle.
     * @return A 2D char array representing the word search puzzle.
     */
    public static char[][] create_crossword(List<String> words) {

       // WRITE YOUR CODE HERE
       
       int size = 10;
       char [][] grid = new char[size][size];
       Random rand = new Random();
       
    }
    


    // --- Main execution block. DO NOT MODIFY.  ---
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String wordsInput = scanner.nextLine().trim();
            String[] wordArray = wordsInput.split(",");
            List<String> words = new ArrayList<>();
            
            for (String word : wordArray) {
                words.add(word.trim());
            }
            
            char[][] puzzle = create_crossword(words);
            
            // Print the result as a 2D grid
            for (char[] row : puzzle) {
                System.out.println(new String(row));
            }
            
            scanner.close();
            
        } catch (IllegalArgumentException e) {
            System.err.println("Input Error: " + e.getMessage());
            System.exit(1);
        } catch (NoSuchElementException e) {
            System.err.println("Error: Not enough input lines provided.");
            System.exit(1);
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            System.exit(1);
        }
    }
}