package Controlador;

import Modelo.Poliza;
import Modelo.CuentaBancaria;
import Controlador.listaSA.ListaSimpleAvanzada;

public class Controlador_Poliza {

    private ListaSimpleAvanzada listaCuentaBancariaPolizas = new ListaSimpleAvanzada();
    private CuentaBancaria cuentaBancaria = new CuentaBancaria();
    private controlador_CB conroladorCB = new controlador_CB();
    private Poliza poliza = new Poliza();

    public ListaSimpleAvanzada getListaCuentaBancariaPolizas() {
        if (listaCuentaBancariaPolizas == null) {
            listaCuentaBancariaPolizas = new ListaSimpleAvanzada();
        }

        return listaCuentaBancariaPolizas;
    }

    public void setListaCuentaBancariaPolizas(ListaSimpleAvanzada listaCuentaBancariaPolizas) {
        this.listaCuentaBancariaPolizas = listaCuentaBancariaPolizas;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public Poliza getPoliza() {
        if (poliza == null) {
            poliza = new Poliza();
        }

        return poliza;
    }

    public controlador_CB getConroladorCB() {        
        return conroladorCB;
    }

    public void setConroladorCB(controlador_CB conroladorCB) {
        this.conroladorCB = conroladorCB;
    }   
    

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    /**
     * 
     * @return Clonamos el objeto de tipo poliza
     */
    public Poliza clonarPoliza() {
        Poliza aux = new Poliza();
        aux.setCuentaBancaria(poliza.getCuentaBancaria());
        aux.setFehca_inicio_poliza(poliza.getFehca_inicio_poliza());
        aux.setFehca_final_poliza(poliza.getFehca_final_poliza());
        aux.setMonto_poliza(poliza.getMonto_poliza());
        aux.setInteres_poliza(poliza.getInteres_poliza());
        return aux;
    }
    
    
    /**
     * 
     * @return Guardamos la poliza en una lista simple
     */
//    public Boolean guardarPoliza() {
//        boolean band = true;
//        try {
//            CuentaBancaria cuenta = this.cuentaBancaria;
//            cuenta.setSaldo(cuenta.getSaldo() + (poliza.getMonto_poliza() + (poliza.getMonto_poliza() * poliza.getInteres_poliza() / 100)));
//
//            if (band) {
//                cuenta.getListapolizas().insertar(clonarPoliza());
//                int pos = listaCuentaBancariaPolizas.buscarPorNroCuentaPos(cuenta.getNum_Cuenta());
//                listaCuentaBancariaPolizas.editarPorPosicion(pos, cuenta);
//                setCuentaBancaria(null);
//                setPoliza(null);
//            }
//        } catch (Exception e) {
//            System.out.println("Hubo un error en guardar transaccion");
//            band = false;
//        }
//        return band;
//    }
    
    /**
     * Guardamos la cuenta bancaria en la lista
     */
    public void GuardarCuenta()
    {
        conroladorCB.guardarCB();
    }
//    public CuentaBancaria clonarCuentaB() {
//        CuentaBancaria aux = new CuentaBancaria();
//        aux.setNum_Cuenta(cuentaBancaria.getNum_Cuenta());
//        aux.setTipoCuenta(cuentaBancaria.getTipoCuenta());
//        aux.setSaldo(cuentaBancaria.getSaldo());
//        aux.setPrestamo_yn(cuentaBancaria.isPrestamo_yn());
//        aux.setPoliza_yn(cuentaBancaria.isPoliza_yn());
//        aux.setPersona(cuentaBancaria.getPersona());
//        aux.setListapolizas(cuentaBancaria.getListapolizas());
//        aux.setListaprestamos(cuentaBancaria.getListaprestamos());
//        aux.setListatransacciones(cuentaBancaria.getListatransacciones());
//        return aux;
//    }
//
//    public Boolean guardarCuenta() {
//        try {
//            listaCuentaBancariaPolizas.insertar(clonarCuentaB());
//            setCuentaBancaria(null);
//            return true;
//        } catch (Exception e) {
//            System.out.println("Error en guardar cuenta " + e);
//            return false;
//        }
//    }

}
