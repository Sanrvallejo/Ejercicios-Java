package ex6javapooahorcado;

import java.util.Scanner;

public class Service {
    Scanner sc = new Scanner(System.in); 
    Ahorcado game = new Ahorcado();
    String[] wordCopy;
    String word;
    int attempts;
    boolean foundWord = false;
    
    //methods
    
    public void createGame() {
        
        //set word vector
        System.out.println("Enter a word to guess");
        word = sc.nextLine();
        game.setWord(word.toLowerCase());
        wordCopy = new String[game.getWord().length];
        
        //set attempts
        System.out.println("Enter allowed attempts");
        attempts =  sc.nextInt();
        sc.nextLine();
        game.setAttempts(attempts);
        
        //wordCopy
        for (int i = 0; i < wordCopy.length; i++) {
            wordCopy[i] = "_";
        }
    }
    
    public void showLength() {
        System.out.println("Length of the word to guess" + game.getWord().length);
    }
    
    public boolean found(String l){
        boolean foundLetter = searchLetter(l);
        int i = 0;
        
        //modify attempts
        if (foundLetter) {
            for (String letter : game.getWord()) {
                if (letter.equalsIgnoreCase(l)){
                    wordCopy[i] = letter;
                }
                i++;
            }
        }else {
            attempts--;
            game.setAttempts(attempts);
        }
        
        return foundLetter;
        
    }
    
    public boolean searchLetter(String l){
        boolean foundLetter = false;
        
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
    
    public boolean areEquals(String[] array1, String[] array2) {
        for (int i = 0; i < array2.length; i++) {
            if (array1[i] != array2[i]) return false;
        }
        return true;
    }
    
    public void game() {
        String letter;
        String guessedWord = "";
        
        //game settings:
        System.out.println("Game settings: Don't let the other player see these settings");
        createGame();
        
        //game
        System.out.printf("The word to guess has %d letters and you have %d attempts %n", 
                game.getWord().length, game.getAttempts());
        
        while (game.getAttempts() > 0) {
            guessedWord = "";
            System.out.println("Please, enter a letter");
            letter = sc.nextLine();
            
            if(found(letter)) {
                System.out.println("Good guess");
            }else {
                System.out.println("Wrong guess");
            }

            for (String el : wordCopy) {
                guessedWord += " " + el;
            }
            System.out.println(guessedWord);
            System.out.printf("Attempts: %d%n",game.getAttempts());
            showLength();
            
            if(areEquals(wordCopy, game.getWord())) break;
            
        }
        
        if(areEquals(wordCopy, game.getWord())) {
            System.out.println("You have won, game over");
        }else {
            System.out.println("You have lost, game over");
        }
    }
}
