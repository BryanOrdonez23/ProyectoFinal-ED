/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.listaSA.ListaSimpleAvanzada;
import Modelo.CuentaBancaria;

/**
 *
 * @author Jean Agreda,Rubier Padilla y Bryan Ordoñez
 */
public class controlador_CB {

    private CuentaBancaria cuentaB = new CuentaBancaria();
    private ListaSimpleAvanzada lista_Cb = new ListaSimpleAvanzada();
//    private Persona persona = new Persona();

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
    
    /**
     * 
     * @return Retornamos true si la cuenta Bancaria se guardo en la lista
     */
    public boolean guardarCB() {
        try {
            lista_Cb.insertar(ClonarCB());
            //setCuentaB(null);
            return true;
        } catch (Exception e) {
            System.out.println("error al guardar P" + e);
            return false;
        }
    }

    /**
     * el objeto CuentaBancaria clonado
     * @return 
     */
    public CuentaBancaria ClonarCB() {
        CuentaBancaria aux = new CuentaBancaria();
        aux.setNum_Cuenta(cuentaB.getNum_Cuenta());
        //aux.setPersona(cuentaB.getPersona());
        aux.setPoliza_yn(cuentaB.isPoliza_yn());
        aux.setPrestamo_yn(cuentaB.isPrestamo_yn());
        aux.setSaldo(cuentaB.getSaldo());
        aux.setTipoCuenta(cuentaB.getTipoCuenta());
        return aux;
    }
    
    public String generarBmroCuenta(){
        String num1 = "11"+(int)(Math.random()*100)+(int)(Math.random()*1000001);
        while (num1.length()<10) {
            num1 = "11"+(int)(Math.random()*100)+(int)(Math.random()*1000001);
        }
        return num1;
    }
    

}
