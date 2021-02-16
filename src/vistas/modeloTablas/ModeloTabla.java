/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.modeloTablas;


import Modelo.CuentaBancaria;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author CNH
 */
public class ModeloTabla extends AbstractTableModel {

    private Object[] lista;
    private CuentaBancaria[] cuenta;

    public CuentaBancaria[] getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria[] cuenta) {
        this.cuenta = cuenta;
    }

  
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
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CuentaBancaria r = (CuentaBancaria) lista[rowIndex];
        if (r==null) {
            return null;
        }
        switch (columnIndex) {            
            case 0:
                return r.getNum_Cuenta();                
            case 1:                
                return r.getTipoCuenta();
            case 2:                
                return r.getSaldo();
            case 3:                
                return String.valueOf(r.isPoliza_yn()).toUpperCase();
            case 4:
                return String.valueOf(r.isPrestamo_yn()).toUpperCase();
            default:                
                return null;                
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nro.Cuenta";
            case 1:
                return "Tipo Cuenta";
            case 2:
                return "Saldo";
            case 3:
                return "Poliza";
            case 4:
                return "Prestamos";
            default:
                return null;
        }
    }

}
