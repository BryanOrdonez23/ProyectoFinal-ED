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
public class Empleado extends Persona{
    
    private String titulo;
    private String experiencia_Laboral;

//    private CuentaBancaria cuentaBancaria;
//
//    public CuentaBancaria getCuentaBancaria() {
//        return cuentaBancaria;
//    }
//
//    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
//        this.cuentaBancaria = cuentaBancaria;
//    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getExperiencia_Laboral() {
        return experiencia_Laboral;
    }

    public void setExperiencia_Laboral(String experiencia_Laboral) {
        this.experiencia_Laboral = experiencia_Laboral;
    }
    
}
