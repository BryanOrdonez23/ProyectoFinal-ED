package Controlador;

import Controlador.Pilas.Pila;
import Modelo.Prestamo;
import Modelo.Pago;
import Controlador.listaSA.ListaSimpleAvanzada;

public class Controlador_Pago { // trabajar con cola o pila

    private Pila listaPrestamos = new Pila();
    private Prestamo prestamo = new Prestamo();
    private Pago pagos = new Pago();

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Pago getPagos() {
        if (pagos == null) {
            pagos = new Pago();
        }
        return pagos;
    }

    public Pago clonar_Pago() {
        Pago p = new Pago();
        p.setInteres_p_pago(pagos.getInteres_p_pago());
        p.setInteres_mora(pagos.getInteres_mora());
        p.setMonto_a_pagar(pagos.getMonto_a_pagar());
        p.setPrestamo(pagos.getPrestamo());
        return p;
    }

//    public Boolean guardarPago() {
//        boolean band = true;
//        try {
//            Prestamo prestamo = this.prestamo;
//            if (prestamo.getCuota_mensual() == pagos.getMonto_a_pagar()) {
//            prestamo.setMonto_final(prestamo.getMonto_final() - pagos.getMonto_a_pagar());
//            } else {
//               band = false;
//                System.out.println("Debe ser el monto a pagar");
//            }
//                        
//           
//            
////            if (transaccion.getTipo().equals("DEPOSITO")) {
////                cuenta.setSaldo(cuenta.getSaldo() + transaccion.getMonto());
////                this.nro_depositos = nro_depositos + 1;
////            } else {
////                if (cuenta.getSaldo() >= transaccion.getMonto()) {
////                    cuenta.setSaldo(cuenta.getSaldo() - transaccion.getMonto());
////                    this.nro_retiros = nro_retiros + 1;
////                } else {
////                    band = false;
////                }
////            }
//
//            if (band) {
//                prestamo.getListaPagos().insertar(clonar_Pago()); //Le puse cuenta
//                int pos = listaPrestamos.obtenerPorPosicion();
//                listaCuentas.editar(pos, cuenta);
//                setCuentaBancaria(null);
//                setTransaccion(null); //Añadi esto
//            }
//        } catch (Exception e) {
//            System.out.println("Hubo un error en guardar transaccion");
//            band = false;
//        }
//        return band;
//    }
    public void setPagos(Pago pagos) {
        this.pagos = pagos;
    }

    public Pila getListaPagos() {
        return listaPrestamos;
    }

    public void setListaPagos(Pila listaPagos) {
        this.listaPrestamos = listaPagos;
    }

}
