/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.listaSA.ListaSimpleAvanzada;
import Modelo.CuentaBancaria;
import Modelo.Persona;

/**
 *
 * @author Jean Agreda,Rubier Padilla y Bryan Ordoñez
 */
public class controlador_CB {

    private CuentaBancaria cuentaB = new CuentaBancaria();
    private ListaSimpleAvanzada lista_Cb = new ListaSimpleAvanzada();
    private Persona persona = new Persona();

    public CuentaBancaria getCuentaB() {
        if (cuentaB==null) {
            cuentaB = new CuentaBancaria();
        }
        return cuentaB;
    }

    public void setCuentaB(CuentaBancaria cuentaB) {
        this.cuentaB = cuentaB;
    }

    public ListaSimpleAvanzada getLista_Cb() {
        return lista_Cb;
    }

    public void setLista_Cb(ListaSimpleAvanzada lista_Cb) {
        this.lista_Cb = lista_Cb;
    }

    public Persona getPersona() {
        if (persona == null) {
            persona = new Persona();
        }
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    
    /**
     * 
     * @return Retornamos true si la cuenta Bancaria se guardo en la lista
     */
    public boolean guardarCB() {
        try {
            lista_Cb.insertar(ClonarCB());
            setCuentaB(null);
            return true;
        } catch (Exception e) {
            System.out.println("error al guardar P" + e);
            return false;
        }
    }

    /**
     * 
     * @return el objeto CuentaBancaria clonado
     */
    public CuentaBancaria ClonarCB() {
        CuentaBancaria aux = new CuentaBancaria();
        aux.setListapolizas(cuentaB.getListapolizas());
        aux.setListaprestamos(cuentaB.getListaprestamos());
        aux.setListatransacciones(cuentaB.getListatransacciones());
        aux.setNum_Cuenta(cuentaB.getNum_Cuenta());
        aux.setPersona(cuentaB.getPersona());
        aux.setPoliza_yn(cuentaB.isPoliza_yn());
        aux.setPrestamo_yn(cuentaB.isPrestamo_yn());
        aux.setSaldo(cuentaB.getSaldo());
        aux.setTipoCuenta(cuentaB.getTipoCuenta());
        return aux;
    }
    

}
