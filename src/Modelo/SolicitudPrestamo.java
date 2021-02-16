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
public class SolicitudPrestamo {

    private String cedula;
    private String nombre;
    private String lugar;
    private String montoCreditoPrestamo;
    private String tiempoPrestamo;
    private String fechaEmision;

    public SolicitudPrestamo(String cedula, String nombre, String lugar, String montoCreditoPrestamo, String tiempoPrestamo, String fechaEmision) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.lugar = lugar;
        this.montoCreditoPrestamo = montoCreditoPrestamo;
        this.tiempoPrestamo = tiempoPrestamo;
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

    public String getMontoCreditoPrestamo() {
        return montoCreditoPrestamo;
    }

    public void setMontoCreditoPrestamo(String montoCreditoPrestamo) {
        this.montoCreditoPrestamo = montoCreditoPrestamo;
    }

    public String getTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public void setTiempoPrestamo(String tiempoPrestamo) {
        this.tiempoPrestamo = tiempoPrestamo;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
}
