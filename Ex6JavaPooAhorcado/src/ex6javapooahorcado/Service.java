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
        game.setWord(word);
        
        //set attempts
        System.out.println("Enter allowed attempts");
        attempts =  sc.nextInt();
        game.setAttempts(attempts);
    }
    
}
