package ex6javapooahorcado;

/**
 *
 * @author Sanrvallejo
 */
public class Ahorcado {
    private String[] word;
    private char foundLett;
    private int attempts;

    public Ahorcado() {
    }

    public String[] getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = new String [word.length()];
        for (int i = 0; i < word.length(); i++) {
            this.word[i] = String.valueOf(word.charAt(i));
        }
    }

    public char getFoundLett() {
        return foundLett;
    }

    public void setFoundLett(char foundLett) {
        this.foundLett = foundLett;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "word=" + word + ", foundLett=" + foundLett + ", attempts=" + attempts + '}';
    }
    
    
}
