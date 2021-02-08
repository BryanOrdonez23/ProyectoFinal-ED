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
public class Prestamo {

    private Double monto_final;
    private Double cuota_mensual;
    private Date fecha_inicio_prestamo;
    private Date fecha_final_prestamo;
    private Double tasa;

    public Double getTasa() {
        return tasa;
    }

    public void setTasa(Double tasa) {
        this.tasa = tasa;
    }
    private CuentaBancaria cuentaBancaria;
    private ListaSimpleAvanzada listaPagos;

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public ListaSimpleAvanzada getListaPagos() {
        return listaPagos;
    }

    public void setListaPagos(ListaSimpleAvanzada listaPagos) {
        this.listaPagos = listaPagos;
    }

    public Double getMonto_final() {
        return monto_final;
    }

    public void setMonto_final(Double monto_final) {
        this.monto_final = monto_final;
    }

    public Double getCuota_mensual() {
        return cuota_mensual;
    }

    public void setCuota_mensual(Double cuota_mensual) {
        this.cuota_mensual = cuota_mensual;
    }

    public Date getFecha_inicio_prestamo() {
        return fecha_inicio_prestamo;
    }

    public void setFecha_inicio_prestamo(Date fecha_inicio_prestamo) {
        this.fecha_inicio_prestamo = fecha_inicio_prestamo;
    }

    public Date getFecha_final_prestamo() {
        return fecha_final_prestamo;
    }

    public void setFecha_final_prestamo(Date fecha_final_prestamo) {
        this.fecha_final_prestamo = fecha_final_prestamo;
    }

}
