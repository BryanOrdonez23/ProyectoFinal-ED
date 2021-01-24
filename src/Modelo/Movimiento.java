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
public class Movimiento {
    private Date fechaMovimiento;
    private String num_Cuenta_Destino;
    private Double monto_mov;
    private Transaccion transaccion;

    public Transaccion getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }
    
    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public String getNum_Cuenta_Destino() {
        return num_Cuenta_Destino;
    }

    public void setNum_Cuenta_Destino(String num_Cuenta_Destino) {
        this.num_Cuenta_Destino = num_Cuenta_Destino;
    }

    public Double getMonto_mov() {
        return monto_mov;
    }

    public void setMonto_mov(Double monto_mov) {
        this.monto_mov = monto_mov;
    }
    
}
