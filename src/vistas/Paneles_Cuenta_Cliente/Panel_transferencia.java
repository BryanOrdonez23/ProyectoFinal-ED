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
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author mac
 */
public class Panel_transferencia extends javax.swing.JPanel {

    private Controlador_Transaccion controTrans = new Controlador_Transaccion();
    private txt controlTxt = new txt();

    /**
     * Creates new form Panel_transferencia
     */
    public Panel_transferencia() {
        initComponents();
         limpiar();
    }

    /**
     * Se le manda la cedula del frame principal y se carga los datos de acuerdo a esa cedula
     * @param cedula
     * @throws IOException
     */
    public void CargarData(String cedula) throws IOException {
        Object[] obj = controlTxt.BusquedaCuentasCedula(cedula);
        CuentaBancaria c = (CuentaBancaria) obj[0];
        Persona p = (Persona) obj[1];
        lbl_nombres.setText(p.getNombre());
        lbl_nro_cuenta.setText(c.getNum_Cuenta());
        lbl_cedula.setText(p.getCedula());

    }
    /**
     * Se busca la cuenta en el txt 
     * Se invoca al metodo para guardar la transaccion en caso de no haber ningun error 
     * Se invoca al metodo para guardar Cuenta Bancaria, en este se actualiza el saldo sumando el deposito
     */
    private void ok_guardarDeposito() {
        controTrans.setTrans(null);
        String tipo = "DEPOSITO";
        //nro de cuenta a transferir
        controTrans.getTrans().setExternal_NumCuenta(txt_nro_cuenta_transferir.getText());
        controTrans.getTrans().setFecha_trans(new Date());
        controTrans.getTrans().setTipo_trans(tipo);
        controTrans.getTrans().setMonto_trans(Double.parseDouble(txt_monto_transferir.getText()));
        System.out.println("antes");
        if (controTrans.guardarTrans()) {
            try {
                System.out.println("ingreso");
                // JOptionPane.showMessageDialog(null, " Se ha registrado su transaccion");
                controlTxt.guardar_TransaccionesTxt(controTrans.getTrans());
                controlTxt.cuentaBancariaSaldo(txt_nro_cuenta_transferir.getText(), txt_monto_transferir.getText(), tipo);
                //agregar limpiar
            } catch (IOException ex) {
                Logger.getLogger(Panel_trans_deposito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    /**
     * Se busca la cuenta en el txt 
     * se invoca al metodo para guardar la transaccion en caso de no haber ningun error 
     * Se invoca al metodo para guardar Cuenta Bancaria, en este se actualiza el saldo restando el retiro
     */
    private void ok_guardar_Retiro() {
        try {
            //cuenta que transfiere
            String saldoAux = controlTxt.buscarNroCuenta(lbl_nro_cuenta.getText());
            if (Double.parseDouble(txt_monto_transferir.getText()) <= Double.parseDouble(saldoAux)) {
                //doble confirmacion
                int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de realizar esta TRANSFERENCIA ?", "YES-NO", YES_NO_OPTION);//En caso de ser Yes sera = 0
                if (opcion == 0) {
                    controTrans.setTrans(null);
                    String tipo = "RETIRO";
                    controTrans.getTrans().setExternal_NumCuenta(lbl_nro_cuenta.getText());
                    controTrans.getTrans().setFecha_trans(new Date());
                    controTrans.getTrans().setTipo_trans(tipo);
                    controTrans.getTrans().setMonto_trans(Double.parseDouble(txt_monto_transferir.getText()));
                    System.out.println("antes");
                    if (controTrans.guardarTrans()) {
                        try {
                            System.out.println("ingreso");
                            JOptionPane.showMessageDialog(null, " Se ha registrado su TRANSFERENCIA");
                            controlTxt.guardar_TransaccionesTxt(controTrans.getTrans());
                            controlTxt.cuentaBancariaSaldo(lbl_nro_cuenta.getText(), txt_monto_transferir.getText(), tipo);
                            //agregar limpiar
                        } catch (IOException ex) {
                            Logger.getLogger(Panel_trans_retiro.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Su TRANSFERENCIA a sido cancelada, con exito!");

                }
            } else {
                JOptionPane.showMessageDialog(null, "No puede realizar esta TRANSFERENCIA \nSu saldo actual es menor a la cantidad que se desea transferir", "WARNING", WARNING_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(Panel_trans_retiro.class.getName()).log(Level.SEVERE, null, ex);
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

        lbl_nombres = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_nro_cuenta = new javax.swing.JLabel();
        btn_ok = new javax.swing.JButton();
        txt_monto_transferir = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_cedula = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nro_cuenta_transferir = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        lbl_nombres.setText("--------------");

        jPanel1.setBackground(new java.awt.Color(40, 59, 224));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("--TRANSFERENCIA");

        jLabel2.setText("Nro Cuenta:");

        lbl_nro_cuenta.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nro_cuenta.setText("--------");
        lbl_nro_cuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_nro_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
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
                    .addComponent(lbl_nro_cuenta))
                .addContainerGap())
        );

        btn_ok.setText("OK");
        btn_ok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        txt_monto_transferir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_monto_transferirKeyTyped(evt);
            }
        });

        jLabel4.setText("Monto a Transferir :");

        jLabel5.setText("Nombres:");

        jLabel6.setText("Cedula:");

        lbl_cedula.setText("--------------");

        jLabel7.setText("Nro Cuenta:");

        txt_nro_cuenta_transferir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nro_cuenta_transferirKeyTyped(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("*Le recordamos a nuestros usuarios que solo es posible realizar transferencias entre cuentas de esta Cooperativa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nro_cuenta_transferir, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_monto_transferir, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_nombres)
                                .addGap(68, 68, 68)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_cedula)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_nombres)
                        .addComponent(jLabel6)
                        .addComponent(lbl_cedula)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_nro_cuenta_transferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_monto_transferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addComponent(btn_ok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        if (!txt_monto_transferir.getText().equals("") && !txt_monto_transferir.getText().equals("")) {
            try {
                if (controlTxt.existeCuenta(txt_nro_cuenta_transferir.getText())) {
                    ok_guardar_Retiro();
                    ok_guardarDeposito();
                     limpiar();
                }else{JOptionPane.showMessageDialog(null, "La Cuenta Bancaria a transferir no existe\nCompruebe los datos ingresados","WARNING",WARNING_MESSAGE);}
            } catch (IOException ex) {
                Logger.getLogger(Panel_transferencia.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar loa campoa para realizar la TRANSFERENCIA", "WARNING", WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btn_okActionPerformed

    private void txt_nro_cuenta_transferirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nro_cuenta_transferirKeyTyped
         char car = evt.getKeyChar();

        if (((!Character.isDigit(car))) && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Solo se puede ingresar numeros","ERROR",WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txt_nro_cuenta_transferirKeyTyped

    private void txt_monto_transferirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_monto_transferirKeyTyped
      char car = evt.getKeyChar();

        if (((!Character.isDigit(car))) && (txt_monto_transferir.getText().contains(".")) && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Solo se puede ingresar numeros\ncon su punto decimal","ERROR",ERROR_MESSAGE);
        } else if (((car < '0') || (car > '9')) && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Solo se puede ingresar numeros\ncon su punto decimal","ERROR",ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txt_monto_transferirKeyTyped

public void limpiar(){
    txt_monto_transferir.setText("");
    txt_nro_cuenta_transferir.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_nro_cuenta;
    private javax.swing.JTextField txt_monto_transferir;
    private javax.swing.JTextField txt_nro_cuenta_transferir;
    // End of variables declaration//GEN-END:variables
}
