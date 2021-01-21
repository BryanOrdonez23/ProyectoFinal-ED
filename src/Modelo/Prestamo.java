/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
    
    private CuentaBancaria cuentaBancaria;

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
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

    public Date getFecha_inicio() {
        return fecha_inicio_prestamo;
    }

    public void setFecha_inicio(Date fecha_inicio_prestamo) {
        this.fecha_inicio_prestamo = fecha_inicio_prestamo;
    }

    public Date getFecha_final() {
        return fecha_final_prestamo;
    }

    public void setFecha_final(Date fecha_final_prestamo) {
        this.fecha_final_prestamo = fecha_final_prestamo;
    }
    
}
