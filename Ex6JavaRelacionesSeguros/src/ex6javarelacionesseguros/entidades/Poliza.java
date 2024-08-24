package ex6javarelacionesseguros.entidades;

//gestión de pólizas

import java.util.Date;

public class Poliza {
    private String nPoliza; //numero de poliza
    private Date fechaInicio;
    private Date fechaFin;
    private String pago; //contado - credito
    private double totalAsegurado;
    private Integer cuotas; //int o null
    private boolean cGranizo; //cobertura de granizo
    private int totalGranizo; //% asegurado por granizo
    private String cobertura; //tipo: total - 80% - contra terceros

    public Poliza() {
    }

    public Poliza(String nPoliza, Date fechaInicio, Date fechaFin, String pago, double totalAsegurado, Integer cuotas, boolean cGranizo, int totalGranizo, String cobertura) {
        this.nPoliza = nPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.pago = pago;
        this.totalAsegurado = totalAsegurado;
        this.cuotas = cuotas;
        this.cGranizo = cGranizo;
        this.totalGranizo = totalGranizo;
        this.cobertura = cobertura;
    }

    public String getnPoliza() {
        return nPoliza;
    }

    public void setnPoliza(String nPoliza) {
        this.nPoliza = nPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public double getTotalAsegurado() {
        return totalAsegurado;
    }

    public void setTotalAsegurado(double totalAsegurado) {
        this.totalAsegurado = totalAsegurado;
    }

    public Integer getCuotas() {
        return cuotas;
    }

    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }

    public boolean iscGranizo() {
        return cGranizo;
    }

    public void setcGranizo(boolean cGranizo) {
        this.cGranizo = cGranizo;
    }

    public int getTotalGranizo() {
        return totalGranizo;
    }

    public void setTotalGranizo(int totalGranizo) {
        this.totalGranizo = totalGranizo;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Poliza{");
        sb.append("nPoliza=").append(nPoliza);
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", fechaFin=").append(fechaFin);
        sb.append(", pago=").append(pago);
        sb.append(", totalAsegurado=").append(totalAsegurado);
        sb.append(", cuotas=").append(cuotas);
        sb.append(", cGranizo=").append(cGranizo);
        sb.append(", totalGranizo=").append(totalGranizo);
        sb.append(", cobertura=").append(cobertura);
        sb.append('}');
        return sb.toString();
    }
    
    
}
