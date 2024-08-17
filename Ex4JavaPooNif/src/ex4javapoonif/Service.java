/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4javapoonif;

import java.util.Scanner;

public class Service {
    Scanner sc =  new Scanner(System.in);
    Nif nif = new Nif();
    
    public void start() {
        
        System.out.println("Enter your DNI");
        long dni = sc.nextLong();
        
        nif.createNif(dni);
        
    }


}
