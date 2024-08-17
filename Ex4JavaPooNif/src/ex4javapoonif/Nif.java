/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4javapoonif;

/**
 *
 * @author Usuario
 */
public class Nif {
    private long dni;
    private char letra;
    private String nif;

    public Nif() {
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Nif{" + "dni=" + dni + ", letra=" + letra + ", nif=" + nif + '}';
    }
       
    public void createNif(long dni) {
        this.dni = dni;
        char[] l = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
        'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        String dniS = String.valueOf(dni);
        for (int i = 0; i < l.length; i++) {
            if (dni % 2 == i ) {
                this.letra = l[i];
                showNif(letra);
                break;
            } else {
                continue;
            }
        }
        
    };
    
    public void showNif(char l) {
        this.nif = dni + "-" + letra;
        System.out.println(this.nif);
    }
    
}
