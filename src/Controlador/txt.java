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
import Modelo.Rol;
import Modelo.Transaccion;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;

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
     * Metodo para crear el archivo en directorio en caso de que no hayan sido
     * creado
     *
     * @param f
     */
    public void crear_Archivo(File f) {
        try {
            if (f.exists()) {//saber si existe el archivo de texto
                System.out.println("la base de datos ya existe");
            } else {
                f.createNewFile();
            }
        } catch (IOException ex) {
            Logger.getLogger(txt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * se lee los roles que se encuentren en el archivo_roles de texto
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
     *
     * @param p
     */
    public void guardar_PersonaTxt(Persona p) {
        try {
            try ( BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo_Persona, true)))) {
                String fila = p.getCedula() + "," + p.getRol().getNombreRol() + "," + p.getCorrecoElectronico() + "," + p.getNombre()
                        + "," + p.getTelefono() + "," + p.getEdad() + "," + p.getDireccion();

                //1.cedula,2.Rol,3.correo,4.nombre,5.telefono,6.edad,7.direccion
                Fescribe.write(fila);
                Fescribe.write("\n");

                System.out.println("El producto ha sido insertado en la base de datos");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    /**
     * Se guarda la cuenta de usuario en archivo_CUsuario con la cedula de la
     * persona como valor de referencia a la Cuenta de Usuario
     *
     * @param p
     * @param cu
     */
    public void guardar_CuentaUsuarioTxt(Persona p, String contra) {
        try {
            try ( BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo_CUsuario, true)))) {
                String fila = p.getCedula() + "," + p.getCorrecoElectronico() + "," + contra;
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
     *
     * @param rol
     * @param usuario
     * @param contra
     */
    public void guardar_CuentaEmpleadoTxt(String rol, String usuario, String contra) {
        try {
            try ( BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo_CEmpleados, true)))) {
                String fila = rol + "," + usuario + "," + contra;
                Fescribe.write(fila);
                Fescribe.write("\n");

                System.out.println("El producto ha sido insertado en la base de datos");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    /**
     * Se guarda los datos de la cuenta bancaria con la cedula de persona como
     * valor de referencia para la Cuenta Bancaria
     *
     * @param p
     * @param cb
     */
    public void guardar_CuentaBancariaTxt(Persona p, CuentaBancaria cb) {
        try {
            try ( BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo_CBancaria, true)))) {
                String fila = p.getCedula() + "," + cb.getTipoCuenta() + "," + cb.getNum_Cuenta() + "," + cb.getSaldo()
                        + "," + cb.isPoliza_yn() + "," + cb.isPrestamo_yn();
                //1 cuenta, 2 tipo 3 numeroCuenta 4 Saldo, 5 poliza, 6 prestamo
                Fescribe.write(fila);
                Fescribe.write("\n");

                System.out.println("El producto ha sido insertado en la base de datos");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    /**
     * En caso de tener un prestamo se guardaran los datos del mismo con el
     * Numero de la Cuenta Bancaria como valor de referencia para dicho prestamo
     *
     * @param pre
     * @param cb
     */
    public void guardar_PrestamosTxt(Prestamo pre, CuentaBancaria cb) {
        try {
            try ( BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo_Prestamo, true)))) {
                String fila = cb.getNum_Cuenta() + "," + pre.getMonto_final() + "," + pre.getCuota_mensual() + ", " + pre.getFecha_inicio_prestamo() + ", " + pre.getFecha_final_prestamo();
                Fescribe.write(fila);
                Fescribe.write("\n");

                System.out.println("El producto ha sido insertado en la base de datos");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    /**
     * En caso de tener una poliza se guardaran los datos de la misma con el
     * Numero de la Cuenta Bancaria como valor de referencia para dicha poliza
     *
     * @param pol
     * @param cb
     */
    public void guardar_PolizasTxt(Poliza pol, CuentaBancaria cb) {
        try {
            try ( BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo_Polizas, true)))) {
                String fila = cb.getNum_Cuenta() + ", " + pol.getMonto_poliza() + ", " + pol.getInteres_poliza() + ", " + pol.getFehca_inicio_poliza() + ", " + pol.getFehca_final_poliza();
                Fescribe.write(fila);
                Fescribe.write("\n");

                System.out.println("El producto ha sido insertado en la base de datos");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    /**
     * Por cada transaccion ya sea de DEPOSTIO o de RETIRO se guardara el
     * respectivo informe en el archivo de texto
     *
     * @param tra
     * @param cb
     */
    public void guardar_TransaccionesTxt(Transaccion tra) {
        try {
            try ( BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo_Transacciones, true)))) {
                String fila = tra.getExternal_NumCuenta() + ", " + tra.getTipo_trans() + ", " + tra.getMonto_trans() + ", " + tra.getFecha_trans();
                Fescribe.write(fila);
                Fescribe.write("\n");

                System.out.println("El producto ha sido insertado en la base de datos");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }//1.cedula,2.Rol,3.correo,4.nombre,5.telefono,6.edad,7.direccion
//1 cuenta, 2 tipo 3 numeroCuenta 4 Saldo, 5 poliza, 6 prestamo

    /**
     *
     * @param NumeroCuenta
     * @return los objetos persona y cunta bancaria encontrados con el criterio
     * de busqueda de un numero de cuenta bancaria
     * @throws FileNotFoundException
     * @throws IOException
     */
    public Object[] BusquedaCuentas(String NumeroCuenta) throws FileNotFoundException, IOException {
        Object[] aux = new Object[2];
        BufferedReader leer = new BufferedReader(new FileReader(archivo_CBancaria));
        BufferedReader leerp = new BufferedReader(new FileReader(archivo_Persona));
        String linea = "";
        String linea2 = "";
        while ((linea = leer.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(linea, ",");
            String uno_ced = st.nextToken();
            String dos_tipo = st.nextToken().toString();
            String tres_numeroCuenta = st.nextToken().toString();
            String cuatro_Saldo = st.nextToken();
            String cinco_poliza = st.nextToken();
            String seis_prestamo = st.nextToken();
            if (NumeroCuenta.equals(tres_numeroCuenta)) {
                CuentaBancaria cuenta = new CuentaBancaria(dos_tipo, tres_numeroCuenta, Double.parseDouble(cuatro_Saldo), Boolean.valueOf(cinco_poliza), Boolean.valueOf(seis_prestamo));
                aux[0] = cuenta;
                while ((linea2 = leerp.readLine()) != null) {
                    StringTokenizer sts = new StringTokenizer(linea2, ",");
                    String un_ced = sts.nextToken();
                    String ds_rol = sts.nextToken();
                    String trs_correo = sts.nextToken();
                    String cua_nomb = sts.nextToken();
                    String cin_tlf = sts.nextToken();
                    String seis_edad = sts.nextToken();
                    String site_direccion = sts.nextToken();
                    if (uno_ced.equals(un_ced)) {
                        Persona per = new Persona(cua_nomb, un_ced, trs_correo, site_direccion, seis_edad, cin_tlf, new Rol(ds_rol));
                        aux[1] = per;
                        break;
                    }
                }
            }

        }
        leer.close();
        leerp.close();

        return aux;
    }

    /**
     *
     * @param cedula
     * @return los objetos persona y cunta bancaria encontrados con el criterio
     * de busqueda de una cedula
     * @throws FileNotFoundException
     * @throws IOException
     */
    public Object[] BusquedaCuentasCedula(String cedula) throws FileNotFoundException, IOException {
        Object[] aux = new Object[2];
        BufferedReader leer = new BufferedReader(new FileReader(archivo_CBancaria));
        BufferedReader leerp = new BufferedReader(new FileReader(archivo_Persona));
        String linea = "";
        String linea2 = "";
        while ((linea = leer.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(linea, ",");
            String uno_ced = st.nextToken();
            String dos_tipo = st.nextToken().toString();
            String tres_numeroCuenta = st.nextToken().toString();
            String cuatro_Saldo = st.nextToken();
            String cinco_poliza = st.nextToken();
            String seis_prestamo = st.nextToken();
            if (cedula.equals(uno_ced)) {
                CuentaBancaria cuenta = new CuentaBancaria(dos_tipo, tres_numeroCuenta, Double.parseDouble(cuatro_Saldo), Boolean.valueOf(cinco_poliza), Boolean.valueOf(seis_prestamo));
                aux[0] = cuenta;
                while ((linea2 = leerp.readLine()) != null) {
                    StringTokenizer sts = new StringTokenizer(linea2, ",");
                    String un_ced = sts.nextToken();
                    String ds_rol = sts.nextToken();
                    String trs_correo = sts.nextToken();
                    String cua_nomb = sts.nextToken();
                    String cin_tlf = sts.nextToken();
                    String seis_edad = sts.nextToken();
                    String site_direccion = sts.nextToken();
                    if (uno_ced.equals(un_ced)) {
                        Persona per = new Persona(cua_nomb, un_ced, trs_correo, site_direccion, seis_edad, cin_tlf, new Rol(ds_rol));
                        aux[1] = per;
                        break;
                    }
                }
            }

        }
        leer.close();
        leerp.close();

        return aux;
    }

    /**
     *
     * @param cedula
     * @return Busco el numero de cedula del usuario que ingreso al sistema
     * @throws FileNotFoundException
     * @throws IOException
     */
    public String BusquedaCuentasaux(String us, String contr) throws FileNotFoundException, IOException {
        String aux = "";
        BufferedReader leer = new BufferedReader(new FileReader(archivo_CUsuario));
        String linea = "";
        while ((linea = leer.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(linea, ",");
            String uno_ced = st.nextToken();
            String usuario = st.nextToken().toString();
            String contrasena = st.nextToken().toString();
            if (us.equals(usuario) && contr.equals(contrasena)) {
                aux = uno_ced;
            }

        }
        leer.close();

        return aux;
    }

    ///////Actualizar
    /**
     * Se lee el archivo de las cuentas bancarias, en el momento de que se encuentre la cuenta buscada, se le guarda su nuevo saldo, ya sea sumando el deposito o restando el retiro
     * @param cuentaBancaria El Nro de la cuenta bancaria que se desea encontrar
     * @param trans el monto de la transaccion
     * @param tipo_Trans    el tipo de transaccion - DEPOSITO - RETIRO
     * @throws IOException 
     */
    public void cuentaBancariaSaldo(String cuentaBancaria, String trans, String tipo_Trans) throws IOException {

        BufferedReader leer = new BufferedReader(new FileReader(archivo_CBancaria));
        //Dar limite al arreglo dependiendo de el numero de cuentas registradas
        BufferedReader ler = new BufferedReader(new FileReader(archivo_CBancaria));
        String linea = "";
        String le= "";
        double c = 0.0;
        System.out.println("ss");
        int i = 0;
        //   String[] l;
        int j = 0;
        while ((le = ler.readLine()) != null) {
        i++;
           // System.out.println("i"+i);
        }
        String[] l = new String[i];
        while ((linea = leer.readLine()) != null) {
         
            /*  cedula  tipo_Cuenta  Num_Cuenta  Saldo  poliza  prestamo */
            StringTokenizer st = new StringTokenizer(linea, ",");
            String cedula = st.nextToken();
            String tipo_Cuenta = st.nextToken();
            String num_Cuenta = st.nextToken();
            String Saldo = st.nextToken();
            String poliza = st.nextToken();
            String prestamo = st.nextToken();

            if (cuentaBancaria.equals(num_Cuenta)) {
                linea  = null;
                if (tipo_Trans.equals("DEPOSITO")) {
                    c = Double.parseDouble(Saldo) + Double.parseDouble(trans);
                }
                if (tipo_Trans.equals("RETIRO")) {
                    c = Double.parseDouble(Saldo) - Double.parseDouble(trans);
                }
                System.out.println(" salto final " + c);
                linea = cedula + "," + tipo_Cuenta + "," + num_Cuenta + "," + c + "," + poliza + "," + prestamo;

                //  System.out.println("lin "+ linea);
            }

           // System.out.println("lin " + linea);
            l[j] = linea;
            System.out.println("lin "+ l[j]);
           // i++;
           j++;

        }
       grabar_txt_actualizarSaldoCuentaBancaria(l);
       leer.close();
        // return c;
    }

    /**
     * Actualiza el archivo de las cuentas bancarias, actualizando solo el saldo de la cuenta bancaria en la cual se ha iniciado sesion
     * @param linea Se le pasa un arreglo de Strings el cual contiene todas las cuentas bancarias junto con la cuenta actualizada
     */
    public void grabar_txt_actualizarSaldoCuentaBancaria(String [] linea) {
        FileWriter fws;
        PrintWriter pw;

        try {
            fws = new FileWriter(archivo_CBancaria);
            pw = new PrintWriter(fws);
            // pw = new PrintWriter( new FileWriter("Numero.txt"));
             for (int i = 0; i < linea.length; i++) {
                String acumulada = linea[i];
                pw.println(acumulada);
            }       
            
           
         //   pw.println(linea);
            pw.close();
        } catch (IOException ex) {
            System.out.println("Error al grabar archivo: " + ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }
    /**
     * El metodo busca por el numero de cuenta Bancaria y extrae el saldo actual de esa cuenta
     * @param nroCuenta  
     * @return el saldo actual de la cuentaBancaria buscada
     * @throws FileNotFoundException
     * @throws IOException 
     */
     public String buscarNroCuenta(String nroCuenta) throws FileNotFoundException, IOException {
     String saldo ="0.0";
        BufferedReader leer = new BufferedReader(new FileReader(archivo_CBancaria));
        String linea = "";
        while ((linea = leer.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(linea, ",");
            String uno_ced = st.nextToken();
            String dos_tipo = st.nextToken();
            String tres_numeroCuenta = st.nextToken();
            String cuatro_Saldo = st.nextToken();
            String cinco_poliza = st.nextToken();
            String seis_prestamo = st.nextToken();
            if (nroCuenta.equals(tres_numeroCuenta)) {
                saldo =cuatro_Saldo;
            }
        }
        leer.close();
        return saldo;
    }
    /**
     * El metodo verifica si la cuenta Bancaria existe
     * @param nroCuenta
     * @return true si la cuenta bancaria existe, false si la cuenta bancaria no existe
     * @throws FileNotFoundException
     * @throws IOException 
     */ 
    public boolean existeCuenta(String nroCuenta) throws FileNotFoundException, IOException {
     boolean bol =false;
        try (BufferedReader leer = new BufferedReader(new FileReader(archivo_CBancaria))) {
            String linea = "";
            while ((linea = leer.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                String uno_ced = st.nextToken();
                String dos_tipo = st.nextToken();
                String tres_numeroCuenta = st.nextToken();
                String cuatro_Saldo = st.nextToken();
                String cinco_poliza = st.nextToken();
                String seis_prestamo = st.nextToken();
                if (nroCuenta.equals(tres_numeroCuenta)) {
                    System.out.println("encotrada");
                    bol = true;
                }
            }
        }
        return bol;
    }
}
