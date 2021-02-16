/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class SolicitudPoliza {

    private String cedula;
    private String nombre;
    private String lugar;
    private String montoCreditoPoliza;
    private String tiempoPoliza;
    private String fechaEmision;

    public SolicitudPoliza(String cedula, String nombre, String lugar, String montoCreditoPoliza, String tiempoPoliza, String fechaEmision) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.lugar = lugar;
        this.montoCreditoPoliza = montoCreditoPoliza;
        this.tiempoPoliza = tiempoPoliza;
        this.fechaEmision = fechaEmision;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getMontoCreditoPoliza() {
        return montoCreditoPoliza;
    }

    public void setMontoCreditoPoliza(String montoCreditoPoliza) {
        this.montoCreditoPoliza = montoCreditoPoliza;
    }

    public String getTiempoPoliza() {
        return tiempoPoliza;
    }

    public void setTiempoPoliza(String tiempoPoliza) {
        this.tiempoPoliza = tiempoPoliza;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

}
