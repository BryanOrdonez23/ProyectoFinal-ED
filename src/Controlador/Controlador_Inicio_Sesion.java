/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Logger;

/**
 *
 * @author Jean Agreda
 */
public class Controlador_Inicio_Sesion {  

    
    private String rol;

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    /**
     * 
     * @param user     Usuario para ingesar al sistema
     * @param password contraseña para ingresar al sistema
     * @return Retorna el rol de la persona
     */
    public String  ValidarRolAcceso(String user, String password) {
        String Rol = Autenticar(user, password);
        System.out.println("encontrador "+ Rol);        
        if (Rol != null) {
            return Rol;
        } else {
            return null;
        }
    }
    
    /**
     * 
     * @param usuario  
     * @param contrasena
     * @return Obtiene el rol de la persona que quiera ingresar al sistema
     */
    public String Autenticar(String usuario, String contrasena) {
        String admin = "";
        String contra = "";
        String ced = "";
        String rol = null;

        try {
            File f = new File("Cuentas_Usuario.txt");
            Scanner sc = new Scanner(f);
            File f_pers = new File("Personas.txt");
            Scanner sc_pers = new Scanner(f_pers);
            while (sc.hasNextLine()) {
                StringTokenizer st = new StringTokenizer(String.valueOf(sc), ",");
                String uno_ced = st.nextToken();
                String dos_us = st.nextToken();
                String tres_contra = st.nextToken();
                if (dos_us.equals(usuario) && tres_contra.equals(contrasena)) {
                    ced = uno_ced;
                    admin = dos_us;
                    contra = tres_contra;

                    while (sc_pers.hasNextLine()) {
                        StringTokenizer st_per = new StringTokenizer(String.valueOf(sc_pers), ",");
                        String uno_cedula = st_per.nextToken();
                        String dos_rol = st_per.nextToken();                        
                        if (uno_cedula.equals(ced) ) {
                            rol = dos_rol;
                            System.out.println(admin + " " + contra + " "+ rol);
                            break;
                        }                        
                    }
                }
            }
        sc.close();
        } catch (FileNotFoundException ex) {

        } finally {
            System.out.println("se a leido datos");
        }
        return rol;
    }
    
    /**
     * 
     * @param usuario  
     * @param contrasena
     * @return  Validamos el inicio de sesion de el empleado al sistema
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public boolean InicioSesionEmpleado(String usuario , String contrasena) throws FileNotFoundException, IOException{
            File f = new File("Cuentas_Empleados.txt");
            BufferedReader leer = new BufferedReader(new FileReader(f));
            boolean entra = false;
             String linea = "";
            while ((linea = leer.readLine()) != null) { 
                StringTokenizer st = new StringTokenizer(linea, ",");                
                String uno_rol = st.nextToken();
                String dos_us = st.nextToken();
                String tres_contra = st.nextToken();                
                if (dos_us.equals(usuario) && tres_contra.equals(contrasena)) {
                    setRol(uno_rol);
                    entra=true;
                    break;
                }
            }
            leer.close();
            return entra;
    }
}
