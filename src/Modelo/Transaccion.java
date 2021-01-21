/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.listaSA.ListaSimpleAvanzada;
import java.util.Date;

/**
 *
 * @author Jean Agreda
 */
public class Transaccion {
    
    private String tipo_trans;
    private Date fecha_trans;
    private Double monto_trans;
    
   // private CuentaBancaria cuentaBancaria;
    private ListaSimpleAvanzada ListaMovimientos;

    public ListaSimpleAvanzada getListaMovimientos() {
        return ListaMovimientos;
    }

    public void setListaMovimientos(ListaSimpleAvanzada ListaMovimientos) {
        this.ListaMovimientos = ListaMovimientos;
    }
    

//    public CuentaBancaria getCuentaBancaria() {
//        return cuentaBancaria;
//    }
//
//    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
//        this.cuentaBancaria = cuentaBancaria;
//    }

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
