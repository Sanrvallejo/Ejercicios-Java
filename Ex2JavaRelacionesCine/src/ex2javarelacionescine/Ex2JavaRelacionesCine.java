package ex2javarelacionescine;

import java.util.Random;

public class Ex2JavaRelacionesCine {

    public static void main(String[] args) {
        Random nRandom = new Random();
        String[][] s = new String[8][6];   
        
        //filas
        int k = 0;
        
        //columnas
        int j = 0;
        
        for (int i = 0; i < 43; i++) {
            k = nRandom.nextInt(8);
            j = nRandom.nextInt(6);
            
            //System.out.println(j + " y " + k);
            
            switch (j) {
                case 0:
                    if (s[k][j] == null) {
                        s[k][j] = "A" + (k+1) + "X";
                    }
                    break;
                case 1:
                    if (s[k][j] == null) {
                        s[k][j] = "B" + (k+1) + "X";
                    }
                    break;
                case 2:
                    if (s[k][j] == null) {
                        s[k][j] = "C" + (k+1) + "X";    
                    }
                    break;
                case 3:
                    if (s[k][j] == null) {
                        s[k][j] = "D" + (k+1) + "X";
                    }
                    break;
                case 4:
                    if (s[k][j] == null) {
                        s[k][j] = "E" + (k+1) + "X";
                    }
                    break;
                case 5:
                    if (s[k][j] == null) {
                        s[k][j] = "E" + (k+1) + "X";
                    }
                    break;
                default:
                    if (s[k][j] == null) {
                        s[k][j] = "   ";
                    }
            } 
        }
        
        String fila = "";
        String arrayCompleto = "";
        
        for (int m = 7; m >= 0; m--) {
            //reestablecer string para escribir siguiente fila
            fila = "";
            
            //armar fila con cada columna
            for (int l = 0; l < 6; l++) {
                if (s[m][l] == null) {
                    fila += "|     ";
                }else {
                    fila += "| " + s[m][l] + " ";
                }
                
            }
            //poner cada fila
            arrayCompleto += fila + "\n";
        }
        
        System.out.println(arrayCompleto);
        
    }
    
}
