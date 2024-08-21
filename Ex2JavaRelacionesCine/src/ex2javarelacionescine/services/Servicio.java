package ex2javarelacionescine.services;

import ex2javarelacionescine.entities.Cine;
import ex2javarelacionescine.entities.Espectador;
import ex2javarelacionescine.entities.Pelicula;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sanrvallejo
 */
public class Servicio {
    Scanner sc = new Scanner(System.in);
    
    //automatizar la edad mínima de la película y la duración
    Random nRandom = new Random();
    
    //objetos globales
    Espectador espectador;
    Pelicula pelicula;
    Cine cine;
    
    public void crearEspectador() {
        String nombre;
        double dinero;
        int edad;
        
        System.out.println("Ingrese su nombre");
        nombre = sc.next();
        
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de dinero disponible");
        dinero = sc.nextDouble();
        
        espectador = new Espectador(nombre, edad, dinero);
    }
    
    public void crearPelicula() {
        int edadMinima = nRandom.nextInt(21);
        
        //establecer edad mínima según un rango de edades
        if (edadMinima > 11 && edadMinima < 18) {
            edadMinima = 12;
        }else if (edadMinima > 17) {
            edadMinima = 18;
        }else {
            edadMinima = 6;
        }
        
        pelicula = new Pelicula("Harry Pooter", edadMinima, nRandom.nextInt(240));
    }
    
    public void llenarSala(String[][] s) {
        String fila = "";
        String arrayCompleto = "";
        
        //filas
        int k = 0;
        
        //columnas
        int j = 0;
        
        //aquí se asignan los puestos aleatoriamente con ayuda de random
        for (int i = 0; i < 43; i++) {
            k = nRandom.nextInt(8);
            j = nRandom.nextInt(6);
            
            //convertir J a letra en el string
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
        
        //construir columna
        for (int i = 7; i >= 0; i--) {
            //reestablecer string para escribir siguiente fila
            fila = "";
            
            //armar fila con cada columna
            for (int l = 0; l < 6; l++) {
                if (s[i][l] == null) {
                    fila += "|     ";
                }else {
                    fila += "| " + s[i][l] + " ";
                }
                
            }
            //poner cada fila
            arrayCompleto += fila + "\n";
        }   
        System.out.println(arrayCompleto);
    }
    
    
}
