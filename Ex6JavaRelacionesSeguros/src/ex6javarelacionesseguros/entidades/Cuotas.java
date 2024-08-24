package ex6javarelacionesseguros.entidades;

//gestión de cuotas

import java.util.Date;

public class Cuotas {
    private int nCuota;
    private double totalCuota;
    private boolean estaPagada;
    private Date vencimiento;
    private String metodoPago; //tranferencia, efectivo, tarjeta

    public Cuotas() {
    }

    public Cuotas(int nCuota, double totalCuota, boolean estaPagada, Date vencimiento, String metodoPago) {
        this.nCuota = nCuota;
        this.totalCuota = totalCuota;
        this.estaPagada = estaPagada;
        this.vencimiento = vencimiento;
        this.metodoPago = metodoPago;
    }

    public int getnCuota() {
        return nCuota;
    }

    public void setnCuota(int nCuota) {
        this.nCuota = nCuota;
    }

    public double getTotalCuota() {
        return totalCuota;
    }

    public void setTotalCuota(double totalCuota) {
        this.totalCuota = totalCuota;
    }

    public boolean isEstaPagada() {
        return estaPagada;
    }

    public void setEstaPagada(boolean estaPagada) {
        this.estaPagada = estaPagada;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuotas{");
        sb.append("nCuota=").append(nCuota);
        sb.append(", totalCuota=").append(totalCuota);
        sb.append(", estaPagada=").append(estaPagada);
        sb.append(", vencimiento=").append(vencimiento);
        sb.append(", metodoPago=").append(metodoPago);
        sb.append('}');
        return sb.toString();
    }
    
    
}
