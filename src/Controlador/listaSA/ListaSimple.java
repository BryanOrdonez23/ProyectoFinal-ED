package Controlador.listaSA;


public class ListaSimple {

    //Punteros para saber el inicio y el final
    protected Nodo inicio;

    public ListaSimple() {
        this.inicio = null;

    }

    //Metodo para verificar su la lista esta vacia
    public boolean estaVAcia() {
        return (this.inicio == null);
        

    }

    //Metodo para agregar un elelemnto al inicio
    public void insertar(Object dato) {
        //Se crea el nodo con el elemento e inicio
        Nodo tem = new Nodo(dato, null);
        tem.setSiguiente(inicio);
        inicio = tem;
        

    }

    //Metodo mostrar la lista
    public void mostrarLista() {
        if (!estaVAcia()) {
            Nodo recorrer = inicio;

            while (recorrer != null) {
                if (recorrer.getDato() == null ) {
                    System.out.println("");
                    recorrer =recorrer.getSiguiente();
                    
                }else {
                  System.out.print("-- " + recorrer.getDato() + " --\n");
                recorrer = recorrer.getSiguiente();
                }
            }
            System.out.println();
        } else {
            System.out.println("La lista esta vacia");
        }

    }
    
    

    public Object verdatoPosicio(int pos) {
        Object dato=null;
        if (!estaVAcia()&&pos >=0) {
            Nodo tmp=inicio;
            for (int i = 0; i < pos; i++) {
                tmp = tmp.getSiguiente();
                if (tmp==null) 
                    break;
                
                //System.out.println(tmp.getDato());
            }
            dato = (tmp != null)? tmp.getDato() : null;
            
        }
        return dato;

    }
   

 
}
