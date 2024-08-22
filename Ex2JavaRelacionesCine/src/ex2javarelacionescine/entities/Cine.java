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
        sala = new String[8][6];
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
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                this.sala[i][j] = sala[i][j];
            }
        }
    }

    public String getElementSala(int i, int j) {
        return sala[i][j];
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
                "\nPelicula: " + pelicula + 
                //"\nSala=" + sala + 
                "\nPrecio: " + precio;
    }
    
    
}
