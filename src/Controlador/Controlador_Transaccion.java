/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.listaSA.ListaSimpleAvanzada;
import Modelo.Transaccion;

/**
 *
 * @author Jean Agreda
 */
public class Controlador_Transaccion {
    private Transaccion trans = new Transaccion();
    private ListaSimpleAvanzada lista_trans = new ListaSimpleAvanzada();

    public Transaccion getTrans() {
        if (trans == null) {
            trans = new Transaccion();
        }
        return trans;
    }

    public void setTrans(Transaccion trans) {
        this.trans = trans;
    }

    public ListaSimpleAvanzada getLista_trans() {
        return lista_trans;
    }

    public void setLista_trans(ListaSimpleAvanzada lista_trans) {
        this.lista_trans = lista_trans;
    }
    
    public Transaccion clonarT(){
        Transaccion t = new Transaccion();
        t.setExternal_NumCuenta(trans.getExternal_NumCuenta());
        t.setFecha_trans(trans.getFecha_trans());
        t.setMonto_trans(trans.getMonto_trans());
        t.setTipo_trans(trans.getTipo_trans());
        return t;
    }
    
    public boolean guardarTrans(){
        try {
          lista_trans.insertar(clonarT());
          
          return true;
        } catch (Exception e) {
            System.out.println("error al guardar trans "+e);
            return false;
        }
    
    }
    
    
 
    
    
}
