/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jean Agreda
 */
public class Pago {

    private double interes_p_pago;
    private double interes_mora;
    private double monto_a_pagar;
    private Prestamo prestamo = new Prestamo();

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public double getInteres_mora() {
        return interes_mora;
    }

    public void setInteres_mora(double interes_mora) {
        this.interes_mora = interes_mora;
    }

    public double getInteres_p_pago() {
        return interes_p_pago;
    }

    public void setInteres_p_pago(double interes_p_pago) {
        this.interes_p_pago = interes_p_pago;
    }

    public double getMonto_a_pagar() {
        return monto_a_pagar;
    }

    public void setMonto_a_pagar(double monto_a_pagar) {
        this.monto_a_pagar = monto_a_pagar;
    }

}
