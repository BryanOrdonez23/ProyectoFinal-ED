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
public class Rol {

    private String nombreRol;

    public Rol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public Rol() {
    }   
    

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
    
}
