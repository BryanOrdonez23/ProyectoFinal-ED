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
public class Persona {
    private  String nombre;
    //private  String apellido;
    private  String cedula;
    private  String correcoElectronico;
    private  String direccion;
    private  String edad;
    private  String telefono;
    private Rol rol;

    public Persona() {
    }

    public Persona(String nombre, String cedula, String correcoElectronico, String direccion, String edad, String telefono, Rol rol) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correcoElectronico = correcoElectronico;
        this.direccion = direccion;
        this.edad = edad;
        this.telefono = telefono;
        this.rol = rol;
    }

    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    public String getApellido() {
//        return apellido;
//    }
//
//    public void setApellido(String apellido) {
//        this.apellido = apellido;
//    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorrecoElectronico() {
        return correcoElectronico;
    }

    public void setCorrecoElectronico(String correcoElectronico) {
        this.correcoElectronico = correcoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    
    
}
