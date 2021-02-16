/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.modeloTablas;

import javax.swing.table.AbstractTableModel;
import Modelo.SolicitudPrestamo;

/**
 *
 * @author usuario
 */
public class ModeloTablaPrestamos extends AbstractTableModel {
      private Object[] lista;

    public Object[] getLista() {
        return lista;
    }

    public void setLista(Object[] lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.length;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SolicitudPrestamo r = (SolicitudPrestamo) lista[rowIndex];
        if (r == null) {
            return null;
        }
        switch (columnIndex) {
            case 0:
                return r.getCedula();
            case 1:
                return r.getNombre();
            case 2:
                return r.getLugar();
            case 3:
                return r.getMontoCreditoPrestamo();
            case 4:
                return r.getTiempoPrestamo();
            case 5:
                return r.getFechaEmision();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nro.Cedula";
            case 1:
                return "Nombre";
            case 2:
                return "Direccion";
            case 3:
                return "Monto Credito";
            case 4:
                return "Tiempo";
            case 5:
                return "Fecha emision";
            default:
                return null;
        }
    }
}
