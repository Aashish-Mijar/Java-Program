package myPackage;

import java.io.*;
import java.util.*;
public class Jv_70_hangman_game {
    public static void main(String[] args) throws Exception{
        // JAVA Hangman Game
        File file=new File("words.txt");
        FileWriter fr=new FileWriter(file);
        fr.write("""
                apple
                banana
                orange
                pineapple
                grapes
                pomegranate
                """);
        fr.close();
        ArrayList<String> words=new ArrayList<>();

        try(BufferedReader bf=new BufferedReader(new FileReader("words.txt"))){
            String line;
            while((line=bf.readLine())!=null){
                words.add(line.trim());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not find the file");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
//        System.out.println(words);

        Random random=new Random();
        String word=words.get(random.nextInt(words.size()));
//        System.out.println(word);

//        String word="apple";
        Scanner scanner= new Scanner(System.in);
        ArrayList<Character> wordState=new ArrayList<>();
        int wrongGuesses=0;

        for(int i=0; i<word.length(); i++){
            wordState.add('_');
        }
//        System.out.println(wordState);
        System.out.println("Welcome to Java Hangman");

    while(wrongGuesses<6){
        System.out.println(getHangmanArt(wrongGuesses));
        System.out.print("Word: ");
        for(char c: wordState){
            System.out.print(c+" ");
        }
        System.out.println();
        System.out.println("Guess a letter: ");
        char guess=scanner.next().toLowerCase().charAt(0);

        if(word.indexOf(guess)>=0){
            System.out.println("Correct guess!\n");

            for(int i=0; i<word.length(); i++){
                if(word.charAt(i)==guess){
                    wordState.set(i, guess);
                }
            }
            if(!wordState.contains('_')){
                System.out.println(getHangmanArt(wrongGuesses));
                System.out.println("YOU WIN! ");
                System.out.println("The word was: "+word);
                break;
            }
        }
        else{
            wrongGuesses++;
            System.out.println("Wrong guess!\n");
        }
    }
    if(wrongGuesses>=6){
        System.out.println(getHangmanArt(wrongGuesses));
        System.out.println("GAME OVER");
        System.out.println("The word was: "+word);
    }
        scanner.close();


    }
    static String getHangmanArt(int wrongGuesses){
        return switch(wrongGuesses){
            case 0 -> """
                    
                    
                    
                    """;
            case 1 -> """
                    o
                    
                    """;
            case 2 -> """
                    o
                    |
                    """;
            case 3 -> """
                     o
                    /|\\
                    """;
            case 4 -> """
                      o
                     /|\\
                     /
                    """;
            case 5 -> """
                     o
                    /|\\
                    / \\
                    """;
            default -> "";
        };
    }
}
