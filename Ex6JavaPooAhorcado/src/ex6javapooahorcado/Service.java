package ex6javapooahorcado;

import java.util.Scanner;

public class Service {
    Scanner sc = new Scanner(System.in); 
    Ahorcado game = new Ahorcado();
    String word;
    int attempts;
    
    //methods
    
    public void createGame() {
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
    
    public void searchLetter(String l){
        for (String letter : game.getWord()) {
            if (l.equalsIgnoreCase(letter)) {
                //foundedLetter(l);
            }else {
                continue;
            }
        }
    }
}
