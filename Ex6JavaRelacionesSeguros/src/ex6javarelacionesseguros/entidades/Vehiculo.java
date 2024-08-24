package ex6javarelacionesseguros.entidades;

//gestion de vehiculos
public class Vehiculo {
    //Marca, modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
    private String marca;
    private String modelo;
    private int anio;
    private String nMotor; //numero del motor
    private String nChasis; //numero del chasis
    private String color;
    private String tipo; //camioneta, sedan, camion, etc.

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, String nMotor, String nChasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.nMotor = nMotor;
        this.nChasis = nChasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getnMotor() {
        return nMotor;
    }

    public void setnMotor(String nMotor) {
        this.nMotor = nMotor;
    }

    public String getnChasis() {
        return nChasis;
    }

    public void setnChasis(String nChasis) {
        this.nChasis = nChasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("marca: ").append(marca);
        sb.append(", modelo: ").append(modelo);
        sb.append(", anio: ").append(anio);
        sb.append(", nMotor: ").append(nMotor);
        sb.append(", nChasis: ").append(nChasis);
        sb.append(", color: ").append(color);
        sb.append(", tipo: ").append(tipo);
        sb.append('}');
        return sb.toString();
    }

    
    
    
}
