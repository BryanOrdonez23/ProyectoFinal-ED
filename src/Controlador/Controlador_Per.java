/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Controlador.listaSA.ListaSimpleAvanzada;
import Modelo.Persona;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Jean Agreda,Rubier Padilla y Bryan Ordoñez
 */
public class Controlador_Per {
    private Persona pers = new Persona();
    
    ListaSimpleAvanzada lspersona = new ListaSimpleAvanzada();

    public Persona getPers() {
        if (pers == null) {
            pers = new Persona();
        }
        return pers;
    }

    public void setPers(Persona pers) {
        this.pers = pers;
    }

    public ListaSimpleAvanzada getLspersona() {
        return lspersona;
    }

    public void setLspersona(ListaSimpleAvanzada lspersona) {
        this.lspersona = lspersona;
    }
    /**
     *
     * @return se clona persona - para que no se repita en todo la ultima persona guardada
     */
    public Persona clonar_Persona(){
       Persona p = new Persona();
       p.setNombre(pers.getNombre());
       p.setCedula(pers.getCedula());
       p.setCorrecoElectronico(pers.getCorrecoElectronico());
       p.setDireccion(pers.getDireccion());
       p.setEdad(pers.getEdad());
       p.setTelefono(pers.getTelefono());
       p.setRol(pers.getRol());
       return  p;
   }
    
    public boolean guardarPersona(){
       try {
             lspersona.insertar(clonar_Persona());
            //setPers(null);
             return true;
       } catch (Exception e) {
           System.out.println("error al guardar P"+ e);
           return false;
       }
   }
      
    public boolean ingresar_Persona(Persona p){
        boolean aux = false;
        if (p.getRol().getNombreRol().equals("EMPLEADO")) { // Atencion al Cliente      Oficial de Polizas     Oficiales de Prestamos
           //crear nuevo persona cliente
           aux = guardarPersona();
        }
        return aux;    
    }
    

    
    
}
