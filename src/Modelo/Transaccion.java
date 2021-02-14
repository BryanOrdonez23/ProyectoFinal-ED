/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Jean Agreda,Rubier Padilla y Bryan Ordoñez
 */
public class Transaccion {

    private String tipo_trans;
    private Date fecha_trans;
    private Double monto_trans;
    private String external_NumCuenta;
    private String fecha;

//    private CuentaBancaria cuentaBancaria;
//    private ListaSimpleAvanzada ListaMovimientos;
    public Transaccion() {
    }

    public Transaccion(String tipo_trans, Double monto_trans, String external_NumCuenta, String fecha) {
        this.tipo_trans = tipo_trans;
        this.monto_trans = monto_trans;
        this.external_NumCuenta = external_NumCuenta;
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getExternal_NumCuenta() {
        return external_NumCuenta;
    }

    public void setExternal_NumCuenta(String external_NumCuenta) {
        this.external_NumCuenta = external_NumCuenta;
    }

    public String getTipo_trans() {
        return tipo_trans;
    }

    public void setTipo_trans(String tipo_trans) {
        this.tipo_trans = tipo_trans;
    }

    public Date getFecha_trans() {
        return fecha_trans;
    }

    public void setFecha_trans(Date fecha_trans) {
        this.fecha_trans = fecha_trans;
    }

    public Double getMonto_trans() {
        return monto_trans;
    }

    public void setMonto_trans(Double monto_trans) {
        this.monto_trans = monto_trans;
    }
}
