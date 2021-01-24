/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CuentaBancaria;
import Modelo.CuentaUsuario;
import Modelo.Persona;
import Modelo.Poliza;
import Modelo.Prestamo;
import Modelo.Transaccion;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jean Agreda,Rubier Padilla y Bryan Ordoñez
 */
public class txt {

    File archivo_roles = new File("Roles.txt");
    File archivo_Persona = new File("Personas.txt");
    File archivo_CBancaria = new File("Cuentas_Bancarias.txt");
    File archivo_CUsuario = new File("Cuentas_Usuario.txt");
    File archivo_CEmpleados = new File("Cuentas_Empleados.txt");
    File archivo_Polizas = new File("Polizas.txt");
    File archivo_Prestamo = new File("Prestamos.txt");
     File archivo_Transacciones = new File("Transacciones.txt");
    /**
    * Metodo para crear el archivo en directorio en caso de que no hayan sido creado
    * @param f 
    */
    public void crear_Archivo(File f){
        try {
             if (f.exists()){//saber si existe el archivo de texto
                System.out.println("la base de datos ya existe");
            } else {            
                f.createNewFile();
            }
        } catch (IOException ex) {
            Logger.getLogger(txt.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }
    
    /**
     *  se lee los roles que se encuentren en el archivo_roles de texto
     */
    public void leer_Txt_Roles() {
        try {
            crear_Archivo(archivo_roles);
            // archivo_roles.createNewFile();
            Scanner myReader = new Scanner(archivo_roles);
            myReader = new Scanner(archivo_roles);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(" error al leer " + e);
           // Logger.getLogger(txt.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    /**
     * Se guarda las personas en el archivo_Persona de texto
     * @param p  
     */
    public void guardar_PersonaTxt(Persona p) {
        try {
            try ( BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo_Persona, true)))) {
                String fila = p.getCedula()+ ", " +p.getRol().getNombreRol()+ ", " +p.getRol().getIdRol() +", " + p.getCorrecoElectronico()+ ", " + p.getNombre()+
                        ", " + p.getApellido()+", " + p.getTelefono()+ ", " + p.getEdad()+ ", " + p.getDireccion();
                Fescribe.write(fila);
                Fescribe.write("\n");

                System.out.println("El producto ha sido insertado en la base de datos");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    /**
     * Se guarda la cuenta de usuario en archivo_CUsuario con la cedula de la persona como valor de referencia a la Cuenta de Usuario
     * @param p
     * @param cu 
     */
    public void guardar_CuentaUsuarioTxt(Persona p, CuentaUsuario cu) {
        try {
            try ( BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo_CUsuario, true)))) {
                String fila = p.getCedula() + "," + cu.getUsuario()+ "," + cu.getContraseña();
                Fescribe.write(fila);
                Fescribe.write("\n");

                System.out.println("El producto ha sido insertado en la base de datos");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    
        /**
         * Guardar en archivos a las cuentas de empleados
         * @param rol
         * @param usuario
         * @param contra 
         */
        public void guardar_CuentaEmpleadoTxt(String rol, String usuario , String contra) {
        try {
            try ( BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo_CEmpleados, true)))) {
                String fila =rol+","+usuario+ "," + contra;
                Fescribe.write(fila);
                Fescribe.write("\n");

                System.out.println("El producto ha sido insertado en la base de datos");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    
    /**
     * Se guarda los datos de la cuenta bancaria con la cedula de persona como valor de referencia para la Cuenta Bancaria
     * @param p
     * @param cb 
     */
    public void guardar_CuentaBancariaTxt(Persona p, CuentaBancaria cb) {
        try {
            try ( BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo_CBancaria, true)))) {
                String fila = p.getCedula() + ", " + cb.getTipoCuenta() + ", " + cb.getNum_Cuenta() + ", " + cb.getSaldo() + ", " + cb.getPersona().getCedula();
                Fescribe.write(fila);
                Fescribe.write("\n");

                System.out.println("El producto ha sido insertado en la base de datos");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    /**
     *  En caso de tener un prestamo se guardaran los datos del mismo con el Numero de la Cuenta Bancaria como valor de referencia para dicho prestamo
     * @param pre
     * @param cb 
     */
    public void guardar_PrestamosTxt(Prestamo pre, CuentaBancaria cb) {
        try {
            try ( BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo_Prestamo, true)))) {
                String fila =  cb.getNum_Cuenta() + ", " + pre.getMonto_final() + ", " + pre.getCuota_mensual()+ ", " + pre.getFecha_inicio_prestamo() + ", " + pre.getFecha_final_prestamo();
                Fescribe.write(fila);
                Fescribe.write("\n");

                System.out.println("El producto ha sido insertado en la base de datos");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    /**
     *  En caso de tener una poliza se guardaran los datos de la misma
     * con el Numero de la Cuenta Bancaria como valor de referencia para dicha poliza
     * @param pol
     * @param cb 
     */
    public void guardar_PolizasTxt(Poliza pol, CuentaBancaria cb) {
        try {
            try ( BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo_Polizas, true)))) {
                String fila =  cb.getNum_Cuenta() + ", " + pol.getMonto_poliza() + ", " + pol.getInteres_poliza() + ", " + pol.getFehca_inicio_poliza() + ", " + pol.getFehca_final_poliza();
                Fescribe.write(fila);
                Fescribe.write("\n");

                System.out.println("El producto ha sido insertado en la base de datos");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    /**
     * Por cada transaccion ya sea de DEPOSTIO o de RETIRO se guardara el respectivo informe en el archivo de texto
     * @param tra
     * @param cb 
     */
   public void guardar_TransaccionesTxt(Transaccion tra, CuentaBancaria cb) {
        try {
            try ( BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo_Transacciones, true)))) {
                String fila = cb.getNum_Cuenta()+ ", " + tra.getTipo_trans() + ", " +  tra.getMonto_trans()+ ", " +  tra.getFecha_trans();
                Fescribe.write(fila);
                Fescribe.write("\n");

                System.out.println("El producto ha sido insertado en la base de datos");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    
    
    

}
