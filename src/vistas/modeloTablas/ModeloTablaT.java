/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.modeloTablas;


import Modelo.Transaccion;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author CNH
 */
public class ModeloTablaT extends AbstractTableModel {

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
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Transaccion r = (Transaccion) lista[rowIndex];
        if (r==null) {
            return null;
        }
        switch (columnIndex) {            
            case 0:
                return r.getFecha();                
            case 1:                
                return r.getExternal_NumCuenta();
            case 2:                
                return r.getMonto_trans();
            case 3:                
                return r.getTipo_trans().toUpperCase();
            default:                
                return null;                
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Fecha T.";
            case 1:
                return "Nro de Cuenta";
            case 2:
                return "Monto";
            case 3:
                return "Tipo Transacciones";
            default:
                return null;
        }
    }

}
