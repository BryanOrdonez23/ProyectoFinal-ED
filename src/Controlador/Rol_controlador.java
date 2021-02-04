/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.listaSA.ListaSimpleAvanzada;
import Modelo.Rol;

/**
 *
 * @author Jean Agreda
 */
public class Rol_controlador {
    private Rol rol = new Rol();
    private ListaSimpleAvanzada lsa = new ListaSimpleAvanzada();

   
    public Rol getRol() {
        if (rol == null) {
            rol = new Rol();
        }
        return rol;
    }
    
    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public ListaSimpleAvanzada getLsa() {
        return lsa;
    }

    public void setLsa(ListaSimpleAvanzada lsa) {
        this.lsa = lsa;
    }
    /**
     * 
     * @return clonar roles para que el ultimo rol guardado no se setee en los anteriores
     */
   public Rol clonar_Roles(){
       Rol r = new Rol();
       r.setNombreRol(rol.getNombreRol());
       return  r;
   }
   /**
    * 
    * @return se guarda un objeto rol en la lista
    */
   public boolean guardarRol(){
       try {
             lsa.insertar(clonar_Roles());
            setRol(null);
             return true;
       } catch (Exception e) {
           System.out.println("error al guardar "+ e);
           return false;
       }
   }
    
}
