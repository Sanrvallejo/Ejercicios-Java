package ex6javapooahorcado;

import java.util.Scanner;

public class Service {
    Scanner sc = new Scanner(System.in); 
    Ahorcado game = new Ahorcado();
    String[] wordCopy = new String[game.getWord().length];
    String word;
    int attempts;
    boolean foundWord = false;
    
    //methods
    
    public void createGame() {
        //wordCopy
        for (int i = 0; i < wordCopy.length; i++) {
            wordCopy[i] = "_";
        }
        
        //set word vector
        System.out.println("Enter a word to guess");
        word = sc.nextLine();
        game.setWord(word.toLowerCase());
        
        //set attempts
        System.out.println("Enter allowed attempts");
        attempts =  sc.nextInt();
        game.setAttempts(attempts);
    }
    
    public void showLength() {
        System.out.println("Length of the word to guess" + game.getWord().length);
    }
    
    public boolean foundLetter(String l){
        boolean foundLetter = false;
        foundLetter = searchLetter(l, foundLetter);
        int i = 0;
        
        //modify attempts
        if (foundLetter) {
            for (String letter : game.getWord()) {
                if (letter.equalsIgnoreCase(l)){
                    wordCopy[i] = letter;
                }else {
                    attempts--;
                    game.setAttempts(attempts);
                } 
                i++;
            }
        }
        
        return foundLetter;
        
    }
    
    public boolean searchLetter(String l, boolean foundLetter){
        //compare letter with word array
        for (String letter : game.getWord()) {
            if (l.equalsIgnoreCase(letter)) {
                foundLetter = true;
            }else {
                continue;
            }
        }
        
        return foundLetter;
    }
    
    public void game() {
        String letter;
        String guessedWord = "";
        
        //game settings:
        System.out.println("Game settings: Don't let the other player see these settings");
        createGame();
        
        //game
        System.out.printf("The word to guess has %d letters and ypu have %d attempts %n", 
                game.getWord().length, game.getAttempts());
        
        while (game.getAttempts() > 0) {            
            
            System.out.println("Please, enter a letter");
            letter = sc.nextLine();
            foundLetter(letter);
            if(foundLetter(letter)) {
                System.out.println("Good guess");
            }else {
                System.out.println("Wrong guess");
            }
            
            for (String l : wordCopy) {
                guessedWord += (l + " ");
            }
            
            System.out.printf("Your word: %d%n Attempts: %d%n", guessedWord, attempts);
        }
        
        if(wordCopy.equals(game.getWord())) {
            System.out.println("You won, game over");
        }else {
            System.out.println("You have lost, game over");
        }
            
               
        
    }
}
