package Controlador.listaSA;

import Controlador.Utiles;
import Modelo.CuentaBancaria;

public class ListaSimpleAvanzada extends ListaSimple {

    public static final int ORDENAR_ASCENDENTE = -1;
    public static final int ORDENAR_DESCENDENTE = 1;

    public ListaSimpleAvanzada() {
        super();
    }

    public int tamano() {
        int tamano = 0;
        if (!estaVAcia()) {
            Nodo tmp = inicio;
            while (tmp != null) {
                tamano++;
                tmp = tmp.getSiguiente();
            }
        }
        return tamano;
    }

    public void insertar(String dato, int pos) {

        if (estaVAcia() || pos <= 0) {
            insertar(dato);
        } else {

            Nodo iterador = this.inicio;
            for (int i = 0; i < pos; i++) {
                //el iterador es la cabecera se reccorre hasta que sea nulo
                if (iterador.getSiguiente() == null) {
                    break;
                }
                iterador = iterador.getSiguiente();
            }
            Nodo tmp = new Nodo(dato, iterador.getSiguiente());
            iterador.setSiguiente(tmp);
        }
    }

    public void insertaFinal(String dato) {
        insertar(dato, tamano() - 1);
    }

    public Object obtenerPorPosicion(int pos) {
        Object aux = null;
        if (estaVAcia() || pos < 0) {
            System.out.println("Vacio");

        } else if (pos > (tamano() - 1)) {
            System.out.println("Esta fuera del rango");
            // throw new ArrayIndexOutOfBoundsException("Esta fura del rango");

        } else if (pos == 0) {
            aux = verdatoPosicio(pos);
        } else {
            Nodo iterador = inicio;
            for (int i = 0; i < pos; i++) {
                iterador = iterador.getSiguiente();
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

    //metodo buscar por dato
    public Object obtenerporDato(String dato) {
        Nodo recorrer = inicio;
        Object aux = null;
        for (int i = 0; i < tamano(); i++) {
            if (recorrer.getSiguiente().getDato().equals(dato)) {
                aux = recorrer.getSiguiente().getDato();
            }
            if (recorrer.getSiguiente().getSiguiente() == null) {
                break;
            }
            recorrer = recorrer.getSiguiente();
        }
        if (aux != null) {
            return aux;
        } else {
            return "El dato no existe";
        }
    }

    public void EliminarPorPosicion(int pos) {
        String aux = null;
        Nodo iterador = inicio;
        if (estaVAcia() || pos < 0) {
            System.out.println("Vacio");

        } else if (pos > (tamano() - 1)) {
            System.out.println("Esta fuera del rango");
            // throw new ArrayIndexOutOfBoundsException("Esta fura del rango");

        } else if (pos == 0) {
            //  iterador.getSiguiente().setDato(null);
            inicio = inicio.getSiguiente();
        } else {

            for (int i = 0; i < pos; i++) {
                if (iterador.getSiguiente().getSiguiente() == null) {
                    break;
                }
                iterador = iterador.getSiguiente();
            }
            Nodo siguiente = iterador.getSiguiente();
            iterador.setSiguiente(siguiente.getSiguiente());
//            iterador.getSiguiente().setDato(null);
//            aux = iterador.getSiguiente().getDato();

        }
    }

    public void editarPorPosicion(int pos, Object dato) {

        if (pos >= 0 && pos < tamano()) {
            if (pos == 0) {
                inicio.setDato(dato);
            } else {
                Nodo aux = inicio;

                for (int i = 0; i < pos; i++) {
                    aux = aux.getSiguiente();
                }
                aux.setDato(dato);
            }

        } else {
            System.out.println("Fuera de rango");
        }
    }

    public Object busquedaBinaria(String dato) {
        int n = tamano();
        Object ds = dato;
        System.out.println("ds " + ds);
        int centro, inf = 0, sup = n - 1;

        while (inf <= sup) {
            //    centro = (sup + inf) / 2;
            centro = (int) Math.floor((sup + inf) / 2);
            System.out.println("centro " + centro + " ss " + String.valueOf(obtenerPorPosicion(centro)) + " saa " + dato);

            if (ds.equals(obtenerPorPosicion(centro))) { // (Integer.parseInt(dato) ==Integer.parseInt(String.valueOf((obtenerPorPosicion(centro)))))       (ds.equals(obtenerPorPosicion(centro)))

                return obtenerPorPosicion(centro);
            } else if (Integer.parseInt(dato) < Integer.parseInt(String.valueOf((obtenerPorPosicion(centro))))) { // (Integer.parseInt(dato) <Integer.parseInt(String.valueOf((obtenerPorPosicion(centro)))))
//System.out.println("------centro " + centro + " ss " + obtenerPorPosicion(centro) + " saa " + dato);
                sup = centro - 1;
                System.out.println(" sup " + sup);
            } else {
                inf = centro + 1;
                System.out.println("inf " + inf);
            }
        }
        return -1;
    }

    //insercion con listas
    public void insercionListas() {
        int cont = 0;
        for (int i = 1; i < tamano(); i++) {
            int j = i - 1;
            int t = Integer.parseInt(String.valueOf(obtenerPorPosicion(i)));
            while (j >= 0 && t < Integer.parseInt(String.valueOf(obtenerPorPosicion(j)))) {
                // datos.getVector()[j + 1] = datos.getVector()[j];
                editarPorPosicion(j + 1, Integer.parseInt(String.valueOf(obtenerPorPosicion(j))));
                j--;
                cont++;
            }
            // datos.getVector()[j+1] = t;
            editarPorPosicion(j + 1, t);
            cont++;
        }
    }



    public void ordenarMejoradoBurbuja() {
        int cont = 0;
        int l = 1;
        int r = tamano() - 1;
        int k = tamano() - 1;
        do {
            for (int j = r; j >= l; j--) {
                if (Integer.parseInt(String.valueOf(obtenerPorPosicion(j - 1))) > Integer.parseInt(String.valueOf(obtenerPorPosicion(j)))) {
                    int aux = Integer.parseInt(String.valueOf(obtenerPorPosicion(j - 1)));
                    // numeros[j - 1] = numeros[j];
                    editarPorPosicion(j - 1, Integer.parseInt(String.valueOf(obtenerPorPosicion(j))));
                    //  numeros[j] = aux;
                    editarPorPosicion(j, aux);
                    k = j;
                }
                cont++;
            }
            l = k + 1;
            for (int j = l; j <= r; j++) {
                if (Integer.parseInt(String.valueOf(obtenerPorPosicion(j - 1))) > Integer.parseInt(String.valueOf(obtenerPorPosicion(j)))) {
                    int aux = Integer.parseInt(String.valueOf(obtenerPorPosicion(j - 1)));
                    editarPorPosicion(j - 1, Integer.parseInt(String.valueOf(obtenerPorPosicion(j))));
                    editarPorPosicion(j, aux);
                    k = j;
                }
                cont++;
            }
            r = k - 1;
            cont++;
        } while (l < r);
        System.out.println("Itero el mejorado " + cont);
    }

    public void shell() {

        int salto = 0, temp = 0, i = 0, temo = 0;
        boolean cambio;
        // System.out.println("salto"+ salto +"tamano"+ array.tamano());
        for (salto = (tamano() / 2); salto != 0; salto = salto / 2) {
            //  System.out.println("salto2 "+ salto);
            cambio = true;
            while (cambio) {
                cambio = false;

                for (i = salto; i < tamano(); i++) {
//((Propiedad)obtenerPorPosicion(i-salto)).getCod_catastro()

                    if (Integer.parseInt(String.valueOf((obtenerPorPosicion(i - salto)))) > Integer.parseInt(String.valueOf((obtenerPorPosicion(i))))) {
                        //System.out.println("--- " + obtenerPorPosicion((i - salto)) + "--- " + obtenerPorPosicion(i));
                        temp = Integer.parseInt(String.valueOf(obtenerPorPosicion((i))));

                        // System.out.println("temsp" + temp + "temo" + temo);
                        editarPorPosicion(i, obtenerPorPosicion(i - salto));
                        editarPorPosicion(i - salto, String.valueOf(temp));

                        //System.out.println("ss1 " + obtenerPorPosicion(i) + " ss2 " + obtenerPorPosicion((i - salto)) + "temp" + temp + "temo" + temo);
                        cambio = true;
                    }

                }
            }
        }
    }

    public void ordenar(int tipo_orden) {
        if (!estaVAcia()) {
            for (int i = 0; i < tamano() - 1; i++) {
                int k = i;
                for (int j = i + 1; j < tamano(); j++) {
                    if (Utiles.compareTo(Integer.parseInt(String.valueOf(obtenerPorPosicion(j))), Integer.parseInt(String.valueOf(obtenerPorPosicion(k)))) == tipo_orden) {
                        k = j;
                    }
                }
                Object aux = obtenerPorPosicion(i);
                editarPorPosicion(i, obtenerPorPosicion(k));
                editarPorPosicion(k, String.valueOf(aux));

            }
        }

    }

    public void verDatos() {
        if (!estaVAcia()) {
            Nodo tmp = inicio;
            while (tmp != null) {
                System.out.print(tmp.getDato() + "\t");
                tmp = tmp.getSiguiente();
            }

        }
        System.out.println("");
    }

    public Boolean existe(String cod) {
        Boolean existe = false;
        if (!estaVAcia()) {
            Nodo tmp = inicio;
            while (tmp != null) {
                if (String.valueOf((tmp.getDato())).equals(cod)) {
                    existe = true;
                    break;
                }
                tmp = tmp.getSiguiente();

            }
        }
        return existe;

    }

    public int buscarPorNroCuentaPos(String nro) {
        int r = -1;
        if (!estaVAcia()) {
            Nodo temporal = inicio;
            while (temporal != null) {
                r++;
                if (((CuentaBancaria) temporal.getDato()).getNum_Cuenta().equals(nro)) {
                    break;
                }
                temporal = temporal.getSiguiente();
            }
        }

        return r;
    }

}
