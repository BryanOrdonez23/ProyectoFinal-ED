/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.Paneles_Cuenta_Cliente;

import Controlador.Controlador_Transaccion;
import Controlador.txt;
import Modelo.CuentaBancaria;
import Modelo.Persona;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author mac
 */
public class Panel_trans_deposito extends javax.swing.JPanel {

    /**
     * Creates new form Panel_trans_deposito
     */
    private Controlador_Transaccion controTrans = new Controlador_Transaccion();
    private txt controlTxt = new txt();

    public Panel_trans_deposito() {

        initComponents();
        limpiar();
    }

    /**
     * Se le manda la cedula del frame principal y se carga los datos de acuerdo
     * a esa cedula
     *
     * @param cedula
     * @return devuelve un arreglo de 2 objetos el 1ero CuentaB y el 2do Persona
     * @throws IOException
     */
    public Object[] CargarData(String cedula) throws IOException {

        Object[] obj = controlTxt.BusquedaCuentasCedula(cedula);
        CuentaBancaria c = (CuentaBancaria) obj[0];
        Persona p = (Persona) obj[1];
        lbl_nombres.setText(p.getNombre());
        lblNroCuenta.setText(c.getNum_Cuenta());
        lbl_cedula.setText(p.getCedula());
        return obj;
    }

    /**
     * Se busca la cuenta en el txt se invoca al metodo para guardar la
     * transaccion en caso de no haber ningun error Se invoca al metodo para
     * guardar Cuenta Bancaria, en este se actualiza el saldo sumando el
     * deposito
     */
    private void ok_guardarDeposito() {
        controTrans.setTrans(null);
        String tipo = "DEPOSITO";
        controTrans.getTrans().setExternal_NumCuenta(lblNroCuenta.getText());
        controTrans.getTrans().setFecha_trans(new Date());
        controTrans.getTrans().setTipo_trans(tipo);
        controTrans.getTrans().setMonto_trans(Double.parseDouble(txt_monto_depositar.getText()));
        System.out.println("antes");
        if (controTrans.guardarTrans()) {
            try {
                System.out.println("ingreso");
                JOptionPane.showMessageDialog(null, " Se ha registrado su transaccion");
                controlTxt.guardar_TransaccionesTxt(controTrans.getTrans());
                controlTxt.cuentaBancariaSaldo(lblNroCuenta.getText(), txt_monto_depositar.getText(), tipo);
                //agregar limpiar
            } catch (IOException ex) {
                Logger.getLogger(Panel_trans_deposito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNroCuenta = new javax.swing.JLabel();
        btn_ok = new javax.swing.JButton();
        txt_monto_depositar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_cedula = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();

        setBackground(new java.awt.Color(133, 142, 229));

        jPanel1.setBackground(new java.awt.Color(40, 59, 224));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("--DEPOSITO");

        jLabel2.setText("Nro Cuenta:");

        lblNroCuenta.setForeground(new java.awt.Color(255, 255, 255));
        lblNroCuenta.setText("--------");
        lblNroCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNroCuenta))
                .addContainerGap())
        );

        btn_ok.setText("OK");
        btn_ok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_okMousePressed(evt);
            }
        });

        txt_monto_depositar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_monto_depositarKeyTyped(evt);
            }
        });

        jLabel4.setText("Monto a Depositar :");

        jLabel5.setText("Nombres:");

        jLabel6.setText("Cedula:");

        lbl_cedula.setText("--------------");

        lbl_nombres.setText("--------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_nombres))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_cedula)
                        .addGap(138, 138, 138)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12)
                        .addComponent(txt_monto_depositar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(674, 674, 674)
                        .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lbl_nombres))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lbl_cedula)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4))
                    .addComponent(txt_monto_depositar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(btn_ok))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_okMousePressed
        //doble confirmacion
        if (!txt_monto_depositar.getText().equals("")) {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de realizar este deposito?", "YES-NO", YES_NO_OPTION);
            if (opcion == 0) {
                ok_guardarDeposito();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Su transaccion a sido cancelada, con exito!", "Info", INFORMATION_MESSAGE);
                limpiar();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar el campo para realizar la transaccion", "WARNING", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_okMousePressed
    public void limpiar() {
        txt_monto_depositar.setText("");
    }
    private void txt_monto_depositarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_monto_depositarKeyTyped
        char car = evt.getKeyChar();

        if (((!Character.isDigit(car))) && (txt_monto_depositar.getText().contains(".")) && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Solo se puede ingresar numeros\ncon su punto decimal", "ERROR", ERROR_MESSAGE);
        } else if (((car < '0') || (car > '9')) && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Solo se puede ingresar numeros\ncon su punto decimal", "ERROR", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txt_monto_depositarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNroCuenta;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JTextField txt_monto_depositar;
    // End of variables declaration//GEN-END:variables
}
