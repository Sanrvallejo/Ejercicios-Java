package ex2javarelacionescine.entities;

/**
 *
 * @author Sanrvallejo
 */
public class Pelicula {
    private String titulo;
    private int edadMin;
    private int duracion;

    public Pelicula(String titulo, int edadMin, int duracion) {
        this.titulo = titulo;
        this.edadMin = edadMin;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula:" + 
                "\nTítulo:" + titulo +
                "\nEdad mínima:" + edadMin + 
                "\nDuración:" + duracion;
    }
    
    
}
