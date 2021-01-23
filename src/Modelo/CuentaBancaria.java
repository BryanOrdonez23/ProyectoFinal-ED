/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.listaSA.ListaSimpleAvanzada;

/**
 *
 * @author Jean Agreda
 */
public class CuentaBancaria {
    private String tipoCuenta;
    private String num_Cuenta;
    private Double saldo;
    private boolean prestamo_yn;
    private boolean poliza_yn;
    private Persona persona;
    private Poliza poliza;
    private Transaccion transaccion;
    private Prestamo prestamo;
    private ListaSimpleAvanzada Listatransacciones = new ListaSimpleAvanzada();
    private ListaSimpleAvanzada Listaprestamos = new ListaSimpleAvanzada();
    private ListaSimpleAvanzada Listapolizas = new ListaSimpleAvanzada();

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public Transaccion getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getNum_Cuenta() {
        return num_Cuenta;
    }

    public void setNum_Cuenta(String num_Cuenta) {
        this.num_Cuenta = num_Cuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean isPrestamo_yn() {
        return prestamo_yn;
    }

    public void setPrestamo_yn(boolean prestamo_yn) {
        this.prestamo_yn = prestamo_yn;
    }

    public boolean isPoliza_yn() {
        return poliza_yn;
    }

    public void setPoliza_yn(boolean poliza_yn) {
        this.poliza_yn = poliza_yn;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public ListaSimpleAvanzada getListatransacciones() {
        return Listatransacciones;
    }

    public void setListatransacciones(ListaSimpleAvanzada Listatransacciones) {
        this.Listatransacciones = Listatransacciones;
    }

    public ListaSimpleAvanzada getListaprestamos() {
        return Listaprestamos;
    }

    public void setListaprestamos(ListaSimpleAvanzada Listaprestamos) {
        this.Listaprestamos = Listaprestamos;
    }

    public ListaSimpleAvanzada getListapolizas() {
        return Listapolizas;
    }

    public void setListapolizas(ListaSimpleAvanzada Listapolizas) {
        this.Listapolizas = Listapolizas;
    }
    
    
}
