/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Logger;

/**
 *
 * @author Jean Agreda
 */
public class Controlador_Inicio_Sesion {

    public String autenticar(String user, String password) {
        // String clave = leerClave();
        String encontrado = leerUsuario(user, password);
        System.out.println("encontrador "+ encontrado);
        if (encontrado != null) {
            System.out.println("Bienvenido....ingresa! " + user);
            return encontrado;
        } else {
            System.out.println("Clave incorrecta");
            System.out.println("No puedes ingresar");
            return encontrado;
        }

    }

//    public String leerClave() {
//        String data = "";
//        try {
//            File f = new File("Cuentas_Usuario.txt");
//            Scanner sc = new Scanner(f);
//            while (sc.hasNextLine()) {
//                data = sc.nextLine();
//                System.out.println(data);
//            }
//            sc.close();
//        } catch (FileNotFoundException ex) {
//            
//        } finally {
//            System.out.println("se a leido datos");
//        }
//        return data;
//    }
    public String leerUsuario(String usuario, String contrasena) {
        String admin = "";
        String contra = "";
        String ced = "";
        String rol = null;
        boolean b = false;
        try {
            File f = new File("Cuentas_Usuario.txt");
            Scanner sc = new Scanner(f);

            File f_pers = new File("Personas.txt");
            Scanner sc_pers = new Scanner(f);
            while (sc.hasNextLine()) {
                StringTokenizer st = new StringTokenizer(String.valueOf(sc), ",");
                String uno_ced = st.nextToken();
                String dos_us = st.nextToken();
                String tres_contra = st.nextToken();
                if (dos_us.equals(usuario) && tres_contra.equals(contrasena)) {
                    ced = uno_ced;
                    admin = dos_us;
                    contra = tres_contra;

                    b = true;
                    while (sc_pers.hasNextLine()) {
                        StringTokenizer st_per = new StringTokenizer(String.valueOf(sc_pers), ",");
                        String uno_cedula = st_per.nextToken();
                        String dos_rol = st_per.nextToken();

                        if (uno_cedula.equals(ced) ) {
                            rol = dos_rol;
                            // b = true;
                        }

                        System.out.println(admin + " " + contra + " "+ rol);
                    }
                }

                System.out.println(admin + " " + contra);
            }
            sc.close();
        } catch (FileNotFoundException ex) {

        } finally {
            System.out.println("se a leido datos");
        }
        return rol;
    }
}
