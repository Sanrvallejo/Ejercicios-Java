package ex2javarelacionescine.entities;

/**
 *
 * @author Sanrvallejo
 */
public class Cine {
    private Pelicula pelicula;
    private String[][] sala;
    private double precio;

    public Cine(Pelicula pelicula, double precio) {
        this.pelicula = pelicula;
        sala = new String[6][8];
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine:" + 
                "\nPelicula:" + pelicula + 
                "\nSala=" + sala + 
                "\nPrecio=" + precio;
    }
    
    
}
