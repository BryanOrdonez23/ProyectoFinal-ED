/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.Paneles_Cuenta_Cliente;

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
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author mac
 */
public class Panel_solicitar_poliza extends javax.swing.JPanel {

    txt controlTxt = new txt();

    /**
     * Creates new form Panel_solicitar_poliza
     */
    public Panel_solicitar_poliza() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_monto_prestamo = new javax.swing.JTextField();
        buttomEnviar = new javax.swing.JButton();
        txt_tiempo_devolucion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        lbl_cedula = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_nro_cuenta = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_fecha = new javax.swing.JLabel();

        setBackground(new java.awt.Color(133, 142, 229));

        txt_monto_prestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_monto_prestamoKeyTyped(evt);
            }
        });

        buttomEnviar.setText("ENVIAR");
        buttomEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttomEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomEnviarActionPerformed(evt);
            }
        });

        jLabel4.setText("Tiempo de Devolución:");

        jLabel5.setText("Nombres:");

        jLabel6.setText("Cedula:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jLabel3.setText("Descripción:");

        lbl_cedula.setText("--------------");

        lbl_nombres.setText("--------------");

        jLabel7.setText("Valor Nominal");

        jPanel1.setBackground(new java.awt.Color(40, 59, 224));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("--SOLICITUD DE POLIZA");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
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

        jLabel8.setText("Fecha de Emision");

        lbl_fecha.setText("------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_tiempo_devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_monto_prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel8))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_nombres)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_cedula)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_fecha)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(451, 451, 451)
                .addComponent(buttomEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_nombres)
                        .addComponent(jLabel6)
                        .addComponent(lbl_cedula)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_monto_prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(lbl_fecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_tiempo_devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttomEnviar)
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttomEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttomEnviarActionPerformed
        if (!txt_monto_prestamo.getText().equals("")) {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea solicitar esta poliza?", "YES-NO", YES_NO_OPTION);
            if (opcion == 0) {
                try {
                    String direccion = controlTxt.buscarDireccion(lbl_cedula.getText());
                    controlTxt.guardar_SolicitudPoliza(lbl_nro_cuenta.getText(), lbl_nombres.getText(), direccion, txt_monto_prestamo.getText(), txt_tiempo_devolucion.getText(), lbl_fecha.getText());
                    limpiar();
                } catch (IOException ex) {
                    Logger.getLogger(Panel_solicitar_prestamo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Su solicitud de poliza ha sido cancelada, con exito!", "Info", INFORMATION_MESSAGE);
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar el campo para realizar el prestamo", "WARNING", WARNING_MESSAGE);
        }


    }//GEN-LAST:event_buttomEnviarActionPerformed

    private void txt_monto_prestamoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_monto_prestamoKeyTyped
        char car = evt.getKeyChar();

        if (((!Character.isDigit(car))) && (txt_monto_prestamo.getText().contains(".")) && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Solo se puede ingresar numeros\ncon su punto decimal", "ERROR", ERROR_MESSAGE);
        } else if (((car < '0') || (car > '9')) && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Solo se puede ingresar numeros\ncon su punto decimal", "ERROR", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txt_monto_prestamoKeyTyped

    public void CargarData(String cedula) throws IOException {
        Object[] obj = controlTxt.BusquedaCuentasCedula(cedula);
        CuentaBancaria c = (CuentaBancaria) obj[0];
        Persona p = (Persona) obj[1];
        lbl_nombres.setText(p.getNombre());
        lbl_cedula.setText(cedula);
        lbl_fecha.setText(new Date().toString());
        lbl_nro_cuenta.setText(c.getNum_Cuenta());
    }

    public void limpiar() {
        txt_monto_prestamo.setText("");
        txt_tiempo_devolucion.setText("");
        txtDescripcion.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttomEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_nro_cuenta;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txt_monto_prestamo;
    private javax.swing.JTextField txt_tiempo_devolucion;
    // End of variables declaration//GEN-END:variables
}
