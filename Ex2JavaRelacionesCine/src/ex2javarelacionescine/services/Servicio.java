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
        int dur = nRandom.nextInt(240);
        //establecer edad mínima según un rango de edades
        if (edadMinima > 11 && edadMinima < 18) {
            edadMinima = 12;
        }else if (edadMinima > 17) {
            edadMinima = 18;
        }else {
            edadMinima = 6;
        }
        
        pelicula = new Pelicula("Harry Pooter", edadMinima, dur);
        cine = new Cine(pelicula, nRandom.nextDouble(6000, 15000));
    }
    
    public void llenarSala() {
        String[][] s = new String[8][6];
        String fila = "";
        String arrayCompleto = "";
        
        //aquí se asignan los puestos aleatoriamente con ayuda de random
        for (int i = 0; i < 43; i++) {
            //filas 
            int k = nRandom.nextInt(8);
            
            //columnas
            int j = nRandom.nextInt(6);
            
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
        
        //llenar sala del objeto cine
        cine.setSala(s);
    }
    
    public boolean verificarSilla(char k, int i) {
         int j = 0;
        
        switch (k) {
            case 'A':
                j = 5;
                break;
            case 'B':
                j = 4;
                break;
            case 'C':
                j = 3;
                break;
            case 'D':
                j = 2;
                break;
            case 'E':
                j = 1;
                break;
            case 'F':
                j = 0;
                break;
            default:
                return true;
        }
        if (cine.getElementSala(i-1, j).equalsIgnoreCase((k)+(i)+"X")) {
            System.out.println("La silla no esta disponible.");
            return true;
        } else {
            return false;
        }
    }
    
    public void simulacion(){
        String silla;
        char k;
        int i;
        
        //crear espectador
        crearEspectador();
        
        //Llenar cine
        crearPelicula();
        llenarSala();
        System.out.println(cine.toString());
        

        //verificar disponibilidad de silla
        do {            
            //elegir silla
            System.out.println("Por favor elija silla: (E2)");
            silla = sc.next();
            silla.toUpperCase();

            k = silla.charAt(0);
            i = (int)silla.charAt(1);
            
        } while (verificarSilla(k, i));
        
        if (espectador.getDinero() >= cine.getPrecio() && espectador.getEdad() > cine.getPelicula().getEdadMin()) {
            System.out.println("Gracias por su compra, disfrute su película");
        }else if (espectador.getEdad() < cine.getPelicula().getEdadMin()) {
            System.out.println("Lamentablemente, no tiene la esas suficiente para ver esta película");
        }else {
            System.out.println("Lamentablemente, no le alcanza");
        }
    }
}
