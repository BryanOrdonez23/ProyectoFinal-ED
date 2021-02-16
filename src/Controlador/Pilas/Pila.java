/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Pilas;



/**
 *
 * @author mac
 */
public class Pila {

    private Nodo cabecera;
    private int tamano;

    public Pila(int tamano) {
        cabecera = null;
        this.tamano = tamano;
    }

    public Pila() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean estaVacia() {
        return (this.cabecera == null);
    }

    public int tamano() {
        int tamano = 0;
        if (!estaVacia()) {
            Nodo tmp = cabecera;
            while (tmp != null) {
                tamano++;
                tmp = tmp.getSig();
            }
        }
        return tamano;
    }

    public void push(String dato) {
        if (tamano() < this.tamano) {
                Nodo tem = new Nodo(dato, null);
                tem.setSig(cabecera);
                cabecera = tem;
        } else {
            System.out.println("La pila esta llena");
        }

    }

    public String pop() {
        String dato = null;
        if (!estaVacia()) {
            dato = cabecera.getDato();
            cabecera = cabecera.getSig();
        }
        return dato;
    }

    public void verDatos() {
        if (!estaVacia()) {
            Nodo tmp = cabecera;
            while (tmp != null) {
                System.out.println(tmp.getDato());
                tmp = tmp.getSig();
            }
        }
    }

    
       public Object verdatoPosicio(int pos) {
        Object dato=null;
        if (!estaVacia()&&pos >=0) {
            Nodo tmp=cabecera;
            for (int i = 0; i < pos; i++) {
                tmp = tmp.getSig();
                if (tmp==null) 
                    break;
                
                //System.out.println(tmp.getDato());
            }
            dato = (tmp != null)? tmp.getDato() : null;
            
        }
        return dato;

    }
        public Object obtenerPorPosicion(int pos) {
        Object aux = null;
        if (estaVacia()|| pos < 0) {
            System.out.println("Vacio");

        } else if (pos > (tamano() - 1)) {
            System.out.println("Esta fuera del rango");
            // throw new ArrayIndexOutOfBoundsException("Esta fura del rango");

        } else if (pos == 0) {
            aux = verdatoPosicio(pos);
        } else {
            Nodo iterador = cabecera;
            for (int i = 0; i < pos; i++) {
                iterador = iterador.getSig();
                if (iterador == null) {
                    break;
                }

            }
            if (iterador != null) {
                aux = iterador.getDato();
            }
            //  aux = iterador.getSiguiente().getDato();
        }
        return aux;
    }
}
