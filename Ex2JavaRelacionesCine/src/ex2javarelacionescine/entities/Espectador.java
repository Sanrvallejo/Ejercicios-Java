package ex2javarelacionescine.entities;

public class Espectador {
    private String nombre;
    private int edad;
    private double dinero;

    public Espectador(String nombre, int edad, double dinero) {
        this.dinero = dinero;
        this.nombre = nombre;
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Espectador:" + ""
                + "\nDinero:" + dinero + ","
                + "\nNombre:" + nombre + ","
                + "\nEdad:" + edad;
    }
    
    
}
