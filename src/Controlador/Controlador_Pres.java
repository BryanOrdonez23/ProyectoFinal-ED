package Controlador;

import Modelo.Prestamo;
import Controlador.listaSA.ListaSimpleAvanzada;

public class Controlador_Pres {

    private Prestamo prestamo = new Prestamo();
    private ListaSimpleAvanzada listaPrestamos = new ListaSimpleAvanzada();

    public Prestamo getPrestamo() {
        if (prestamo == null) {
            prestamo = new Prestamo();
        }
        return prestamo;
    } 

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public ListaSimpleAvanzada getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(ListaSimpleAvanzada listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

}
