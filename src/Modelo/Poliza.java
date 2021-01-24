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
public class Poliza {
    private double interes_poliza;
    private Date fehca_inicio_poliza;
    private Date fehca_final_poliza;
    private double monto_poliza;
    private CuentaBancaria cuentaBancaria;

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public double getInteres_poliza() {
        return interes_poliza;
    }

    public void setInteres_poliza(double interes_poliza) {
        this.interes_poliza = interes_poliza;
    }

    public Date getFehca_inicio_poliza() {
        return fehca_inicio_poliza;
    }

    public void setFehca_inicio_poliza(Date fehca_inicio_poliza) {
        this.fehca_inicio_poliza = fehca_inicio_poliza;
    }

    public Date getFehca_final_poliza() {
        return fehca_final_poliza;
    }

    public void setFehca_final_poliza(Date fehca_final_poliza) {
        this.fehca_final_poliza = fehca_final_poliza;
    }

    public double getMonto_poliza() {
        return monto_poliza;
    }

    public void setMonto_poliza(double monto_poliza) {
        this.monto_poliza = monto_poliza;
    }
    
}
