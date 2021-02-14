/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author mac
 */
public class Utiles {

    public static int compareTo(Object o, Object o1) {
        int i = 0;
        if (o instanceof Integer && o1 instanceof Integer) {
            Integer uno = (Integer) o;
            Integer dos = (Integer) o1;
            if (uno > dos) {
                i = 1;
            } else if (uno < dos) {
                i = -1;
            }

        }
        return i;

    }
    /**
     * Metodo para validar si un campo es un digito
     * @param cadena
     * @return 
     */
    public boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
