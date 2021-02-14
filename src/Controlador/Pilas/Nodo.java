/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Pilas;



/**
 *
 * @author mac Jean Agreda
 */
public class Nodo {

    private String dato;
    private Nodo sig;

    public Nodo() {
          this.sig = null;
        this.dato = null;
    }

    public Nodo(String dato, Nodo sig) {
        this.sig = sig;
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

}
