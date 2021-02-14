/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.Pilas.Pila;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

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
     * Se lee el archivo de las cuentas bancarias, en el momento de que se
     * encuentre la cuenta buscada, se le guarda su nuevo saldo, ya sea sumando
     * el deposito o restando el retiro
     *
     * @param cuentaBancaria El Nro de la cuenta bancaria que se desea encontrar
     * @param trans el monto de la transaccion
     * @param tipo_Trans el tipo de transaccion - DEPOSITO - RETIRO
     * @throws IOException
     */
    public void cuentaBancariaSaldo(String cuentaBancaria, String trans, String tipo_Trans) throws IOException {

        BufferedReader leer = new BufferedReader(new FileReader(archivo_CBancaria));
        //Dar limite al arreglo dependiendo de el numero de cuentas registradas
        BufferedReader ler = new BufferedReader(new FileReader(archivo_CBancaria));
        String linea = "";
        String le = "";
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
                linea = null;
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
            System.out.println("lin " + l[j]);
            // i++;
            j++;

        }
        grabar_txt_actualizarSaldoCuentaBancaria(l);
        leer.close();
        // return c;
    }

    /**
     * Actualiza el archivo de las cuentas bancarias, actualizando solo el saldo
     * de la cuenta bancaria en la cual se ha iniciado sesion
     *
     * @param linea Se le pasa un arreglo de Strings el cual contiene todas las
     * cuentas bancarias junto con la cuenta actualizada
     */
    public void grabar_txt_actualizarSaldoCuentaBancaria(String[] linea) {
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
     * El metodo busca por el numero de cuenta Bancaria y extrae el saldo actual
     * de esa cuenta
     *
     * @param nroCuenta
     * @return el saldo actual de la cuentaBancaria buscada
     * @throws FileNotFoundException
     * @throws IOException
     */
    public String buscarNroCuenta(String nroCuenta) throws FileNotFoundException, IOException {
        String saldo = "0.0";
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
                saldo = cuatro_Saldo;
            }
        }
        leer.close();
        return saldo;
    }

    /**
     * El metodo verifica si la cuenta Bancaria existe
     *
     * @param nroCuenta
     * @return true si la cuenta bancaria existe, false si la cuenta bancaria no
     * existe
     * @throws FileNotFoundException
     * @throws IOException
     */
    public boolean existeCuenta(String nroCuenta) throws FileNotFoundException, IOException {
        boolean bol = false;
        try ( BufferedReader leer = new BufferedReader(new FileReader(archivo_CBancaria))) {
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

    public List<Prestamo> leerPrestamos() throws IOException, ParseException {
        List<Prestamo> lista = new ArrayList<>();

        try ( BufferedReader reader = new BufferedReader(new FileReader(archivo_Prestamo))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");

                Prestamo prm = new Prestamo();
                CuentaBancaria cuenta = new CuentaBancaria();

                cuenta.setNum_Cuenta(st.nextToken());
                prm.setCuentaBancaria(cuenta);
                prm.setMonto_final(Double.parseDouble(st.nextToken()));
                prm.setCuota_mensual(Double.parseDouble(st.nextToken()));
                prm.setTasa(Double.parseDouble(st.nextToken()));
                prm.setFecha_inicio_prestamo(dateFormat.parse(st.nextToken()));
                prm.setFecha_final_prestamo(dateFormat.parse(st.nextToken()));

                lista.add(prm);
            }
        }

        return lista;
    }
    
     /**
     * Del usuario ingresado, se extrae informacion de su cuenta y se la guarda
     * en una PILA, dicha informacion se utilizara para realizar preguntas de
     * rigor
     *
     * @param usuario
     * @return una pila con las respuestas a las preguntas planteadas
     * @throws FileNotFoundException
     * @throws IOException
     */
    public Pila InicioSesionCliente(String usuario) throws FileNotFoundException, IOException {

        BufferedReader leer = new BufferedReader(new FileReader(archivo_CUsuario)); // lee del archivo de las cuentas de usuario
        BufferedReader leerDosCB = new BufferedReader(new FileReader(archivo_CBancaria)); // lee del archivo cuentas bancarias   
        BufferedReader leerTresP = new BufferedReader(new FileReader(archivo_Persona)); // lee del archivo de personas

        Pila p = new Pila(3);//en caso de querer aumentar el numero de preguntas, cambiar aqui el tamaño maximo
        int tam = 0;
        String cedula = "";
        String linea = "";
        String lineaDos = "";
        String lineaTres = "";
        while ((linea = leer.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(linea, ",");
            String uno_ced = st.nextToken();
            String dos_us = st.nextToken();
            String tres_contra = st.nextToken();
            if (dos_us.equals(usuario)) {

                // cedula = uno_ced;
                while ((lineaDos = leerDosCB.readLine()) != null) {
                    StringTokenizer stCB = new StringTokenizer(lineaDos, ",");
                    String ced_CB = stCB.nextToken();
                    String dos_tipo = stCB.nextToken();
                    String tres_numeroCuenta = stCB.nextToken();
//                    String cuatro_Saldo = stCB.nextToken();
//                    String cinco_poliza = stCB.nextToken();
//                    String seis_prestamo = stCB.nextToken();
                    if (uno_ced.equals(ced_CB)) {

                        while ((lineaTres = leerTresP.readLine()) != null) {
                            StringTokenizer stP = new StringTokenizer(lineaTres, ",");
                            String un_ced = stP.nextToken();
//                            String ds_rol = stP.nextToken();
//                            String trs_correo = stP.nextToken();
//                            String cua_nomb = stP.nextToken();
//                            String cin_tlf = stP.nextToken();
//                            String seis_edad = stP.nextToken();
//                            String site_direccion = stP.nextToken();

                            if (ced_CB.equals(un_ced)) {
//Ultimos 4 digitos de la cedula
                                tam = un_ced.length();
                                int i = 0;
                                int limit = 0;
                                for (i = tam; i >= 0; i--) {
                                    if (limit >= 4) {
                                        break;
                                    }
                                    limit++;
                                }
                                cedula = un_ced.substring(i, tam);
                                System.out.println("ced -- " + cedula);
                                p.push(cedula);
// Primeros dos digitos y ultimos dos digitos de la cedula
                                i = 0;
                                limit = 0;
                                for (i = tam; i >= 0; i--) {
                                    if (limit >= 2) {
                                        break;
                                    }
                                    limit++;
                                }
                                cedula = "";
                                cedula = un_ced.substring(0, 2) + un_ced.substring(i, tam);
                                p.push(cedula);
//5 Ultimos digitos de la Cuenta Bancaria
                                i = 0;
                                limit = 0;
                                tam = tres_numeroCuenta.length();
                                for (i = tam; i >= 0; i--) {
                                    if (limit >= 5) {
                                        break;
                                    }
                                    limit++;
                                }
                                String CB;
                                CB = tres_numeroCuenta.substring(i, tam);
                                p.push(CB);
                            }
                        }
                    }

                }

                break;
            }
        }
        leer.close();
        return p;
    }

    ///////Actualizar
    /**
     * Se lee el archivo de las cuentas de usuario, en el momento de que se
     * encuentre la cuenta buscada, se le guarda su nueva contraseña
     *
     * @param cuentaUsuario
     * @param nuevaContrasena
     * @throws IOException
     */
    public void cuentaUsuarioContraseña(String cuentaUsuario, String nuevaContrasena) throws IOException {

        BufferedReader leer = new BufferedReader(new FileReader(archivo_CUsuario));
        //Dar limite al arreglo dependiendo de el numero de cuentas registradas
        BufferedReader ler = new BufferedReader(new FileReader(archivo_CUsuario));
        String linea = "";
        String le = "";
        int i = 0;
        int j = 0;
        while ((le = ler.readLine()) != null) {
            i++;
        }
        String[] l = new String[i];
        while ((linea = leer.readLine()) != null) {

            /*  cedula  usuario  contraseña*/
            StringTokenizer st = new StringTokenizer(linea, ",");
            String cedula = st.nextToken();
            String usuario = st.nextToken();
            String contrasena = st.nextToken();
            if (cuentaUsuario.equals(cedula)) { // por cedula
                linea = null;
                contrasena = nuevaContrasena;
                System.out.println(" salto final " + nuevaContrasena + " " + contrasena);
                linea = cedula + "," + usuario + "," + contrasena;
            }
            l[j] = linea;
            System.out.println("lin " + l[j]);
            // i++;
            j++;

        }
        grabar_txt_actualizarContraseñaCuentaUsuario(l);
        leer.close();
        // return c;
    }

    /**
     * Actualiza el archivo de las cuentas de usuario, actualizando solo la
     * contraseña de la cuenta bancaria en la cual se ha iniciado sesion
     *
     * @param linea Se le pasa un arreglo de Strings el cual contiene todas las
     * cuentas de usuario junto con la cuenta actualizada
     */
    public void grabar_txt_actualizarContraseñaCuentaUsuario(String[] linea) {
        FileWriter fws;
        PrintWriter pw;

        try {
            fws = new FileWriter(archivo_CUsuario);
            pw = new PrintWriter(fws);
            // pw = new PrintWriter( new FileWriter("Numero.txt"));
            for (int i = 0; i < linea.length; i++) {
                String acumulada = linea[i];
                pw.println(acumulada);
            }
            pw.close();
        } catch (IOException ex) {
            System.out.println("Error al grabar archivo: " + ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }

    /**
     * El metodo regresa la contraseña para validarla a lo que quiera cambiar la contraseña
     * @param Ced
     * @return 
     * @throws FileNotFoundException
     * @throws IOException
     */
    public String CuentaUsuario_Val_Contra(String Ced) throws FileNotFoundException, IOException {
      
        boolean b = false;
         String cedu = "";
          String ctr = "";
        try ( BufferedReader leer = new BufferedReader(new FileReader(archivo_CUsuario))) {
            String linea = "";
           
            String us = "";
           
            while ((linea = leer.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                String cedula = st.nextToken();
                String usuario = st.nextToken();
                String contrasena = st.nextToken();
                if (Ced.equals(cedula)) {
                    System.out.println("encotrada");
                    b = true;
                    cedu = cedula;
                    ctr = contrasena;
                    
                }
            }
          

        }
        System.out.println("ss "+ ctr);
        return ctr;
    }

}
