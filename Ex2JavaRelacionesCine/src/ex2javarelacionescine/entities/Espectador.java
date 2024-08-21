package ex2javarelacionescine.entities;

public class Espectador {
    private double dinero;
    private String nombre;
    private int edad;

    public Espectador(double dinero, String nombre, int edad) {
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
        return "Espectador{" + "dinero=" + dinero + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
