/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import vistas.Paneles_Cuenta_Cliente.Panel_Estado_Cuenta;
import vistas.Paneles_Cuenta_Cliente.Panel_Inicio;
import vistas.Paneles_Cuenta_Cliente.Panel_Perfil;
import vistas.Paneles_Cuenta_Cliente.Panel_solicitar_poliza;
import vistas.Paneles_Cuenta_Cliente.Panel_solicitar_prestamo;
import vistas.Paneles_Cuenta_Cliente.Panel_trans_deposito;
import vistas.Paneles_Cuenta_Cliente.Panel_trans_retiro;
import vistas.Paneles_Cuenta_Cliente.Panel_transferencia;

/**
 *
 * @author mac
 */
public class Frm_Cuenta_Cliente extends javax.swing.JFrame {

    String cedulap;

    private Frm_Cuenta_Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCedulap() {
        return cedulap;
    }

    /**
     * Creates new form Frm_Cuenta_Cliente
     */
    public void setCedulap(String cedulap) {
        this.cedulap = cedulap;
    }

    public Frm_Cuenta_Cliente(String cedula) {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/sslogo.png")).getImage());
        this.setLocationRelativeTo(this);
        panel_contenedor.add(p_inicio);
        try {
            p_inicio.CargarData(cedula);
            
        } catch (IOException ex) {
            Logger.getLogger(Frm_Cuenta_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        panel_trans.setVisible(false);
        setCedulap(cedula);
    }

    Panel_Estado_Cuenta Est_Cuenta = new Panel_Estado_Cuenta();
    Panel_Inicio p_inicio = new Panel_Inicio();
    Panel_trans_deposito p_transaccion_dep = new Panel_trans_deposito();
    Panel_trans_retiro p_transaccion_ret = new Panel_trans_retiro();
    Panel_transferencia p_transferencia = new Panel_transferencia();
    Panel_solicitar_prestamo p_solicitar_prestamo = new Panel_solicitar_prestamo();
    Panel_Perfil p_perfil = new Panel_Perfil();
    Panel_solicitar_poliza p_solicitar_poliza = new Panel_solicitar_poliza();

    public void todo_False() {
        p_inicio.setVisible(false);
        Est_Cuenta.setVisible(false);
        p_transaccion_dep.setVisible(false);
        p_transaccion_ret.setVisible(false);
        p_transferencia.setVisible(false);
        p_solicitar_prestamo.setVisible(false);
        p_perfil.setVisible(false);
        p_solicitar_poliza.setVisible(false);
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
        btn_cerrar_sesion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_EstadoCuenta = new javax.swing.JButton();
        btn_Transferencia = new javax.swing.JButton();
        btn_sol_Poliza = new javax.swing.JButton();
        btn_sol_Prestamo = new javax.swing.JButton();
        btn_mi_Perfil = new javax.swing.JButton();
        panel_trans = new javax.swing.JPanel();
        btn_Trans_dep = new javax.swing.JButton();
        btn_Trans_ret = new javax.swing.JButton();
        btn_Transacciones = new javax.swing.JToggleButton();
        panel_contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(40, 59, 224));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cooperativa de Ahorro y Credito CACIC");

        btn_cerrar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        btn_cerrar_sesion.setText("Cerrar Sesion");
        btn_cerrar_sesion.setBorderPainted(false);
        btn_cerrar_sesion.setContentAreaFilled(false);
        btn_cerrar_sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrar_sesion.setFocusable(false);
        btn_cerrar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cerrar_sesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cerrar_sesionMouseExited(evt);
            }
        });
        btn_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrar_sesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_cerrar_sesion)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cerrar_sesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btn_EstadoCuenta.setBackground(new java.awt.Color(133, 142, 229));
        btn_EstadoCuenta.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btn_EstadoCuenta.setText("Ver Cuenta");
        btn_EstadoCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_EstadoCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_EstadoCuentaMousePressed(evt);
            }
        });

        btn_Transferencia.setBackground(new java.awt.Color(133, 142, 229));
        btn_Transferencia.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btn_Transferencia.setText("Transferencia");
        btn_Transferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Transferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_TransferenciaMousePressed(evt);
            }
        });

        btn_sol_Poliza.setBackground(new java.awt.Color(133, 142, 229));
        btn_sol_Poliza.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btn_sol_Poliza.setText("Solicitar Poliza");
        btn_sol_Poliza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sol_Poliza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_sol_PolizaMousePressed(evt);
            }
        });

        btn_sol_Prestamo.setBackground(new java.awt.Color(133, 142, 229));
        btn_sol_Prestamo.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btn_sol_Prestamo.setText("Solicitar Prestamo");
        btn_sol_Prestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sol_Prestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_sol_PrestamoMousePressed(evt);
            }
        });

        btn_mi_Perfil.setBackground(new java.awt.Color(133, 142, 229));
        btn_mi_Perfil.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btn_mi_Perfil.setText("Mi perfil");
        btn_mi_Perfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_mi_Perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_mi_PerfilMousePressed(evt);
            }
        });

        btn_Trans_dep.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btn_Trans_dep.setText("Deposito");
        btn_Trans_dep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Trans_dep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_Trans_depMousePressed(evt);
            }
        });

        btn_Trans_ret.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btn_Trans_ret.setText("Retiro");
        btn_Trans_ret.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Trans_ret.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_Trans_retMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_transLayout = new javax.swing.GroupLayout(panel_trans);
        panel_trans.setLayout(panel_transLayout);
        panel_transLayout.setHorizontalGroup(
            panel_transLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_Trans_dep, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
            .addComponent(btn_Trans_ret, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
        );
        panel_transLayout.setVerticalGroup(
            panel_transLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_transLayout.createSequentialGroup()
                .addComponent(btn_Trans_dep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Trans_ret)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_Transacciones.setBackground(new java.awt.Color(133, 142, 229));
        btn_Transacciones.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btn_Transacciones.setText("Transacciones");
        btn_Transacciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Transacciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TransaccionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Transacciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_EstadoCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_trans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Transferencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(btn_sol_Poliza, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(btn_sol_Prestamo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(btn_mi_Perfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btn_EstadoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Transacciones, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_trans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Transferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sol_Poliza, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sol_Prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_mi_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panel_contenedor.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EstadoCuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EstadoCuentaMousePressed

        try {
            todo_False();
            Est_Cuenta.setVisible(true);
            panel_contenedor.add(Est_Cuenta);
            Est_Cuenta.CargarData(getCedulap());
        } catch (IOException ex) {
            Logger.getLogger(Frm_Cuenta_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_EstadoCuentaMousePressed

    private void btn_TransferenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TransferenciaMousePressed
        try {
            todo_False();
            p_transferencia.setVisible(true);
            panel_contenedor.add(p_transferencia);
            p_transferencia.CargarData(getCedulap());
            p_transferencia.limpiar();
        } catch (IOException ex) {
            Logger.getLogger(Frm_Cuenta_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_TransferenciaMousePressed

    private void btn_sol_PolizaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sol_PolizaMousePressed
        try {
            todo_False();
            p_solicitar_poliza.setVisible(true);
            panel_contenedor.add(p_solicitar_poliza);
            p_solicitar_poliza.CargarData(getCedulap());
            p_solicitar_poliza.limpiar();
        } catch (IOException ex) {
            Logger.getLogger(Frm_Cuenta_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_sol_PolizaMousePressed

    private void btn_sol_PrestamoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sol_PrestamoMousePressed
        try {
            todo_False();
            p_solicitar_prestamo.setVisible(true);
            panel_contenedor.add(p_solicitar_prestamo);
            p_solicitar_prestamo.CargarData(getCedulap());
            p_solicitar_prestamo.limpiar();
        } catch (IOException ex) {
            Logger.getLogger(Frm_Cuenta_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_sol_PrestamoMousePressed

    private void btn_mi_PerfilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_mi_PerfilMousePressed
        try {
            todo_False();
            p_perfil.setVisible(true);
            panel_contenedor.add(p_perfil);
            p_perfil.CargarData(getCedulap());
            p_perfil.limpiar();
        } catch (IOException ex) {
            Logger.getLogger(Frm_Cuenta_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_mi_PerfilMousePressed

    private void btn_Trans_depMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Trans_depMousePressed
        try {
            todo_False();
            p_transaccion_dep.setVisible(true);
            panel_contenedor.add(p_transaccion_dep);
            p_transaccion_dep.CargarData(cedulap);
            p_transaccion_dep.limpiar();
        } catch (IOException ex) {
            Logger.getLogger(Frm_Cuenta_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_Trans_depMousePressed

    private void btn_Trans_retMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Trans_retMousePressed
        try {
            todo_False();
            p_transaccion_ret.setVisible(true);
            panel_contenedor.add(p_transaccion_ret);
            p_transaccion_ret.CargarData(cedulap);
            p_transaccion_ret.limpiar();
        } catch (IOException ex) {
            Logger.getLogger(Frm_Cuenta_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_Trans_retMousePressed

    private void btn_TransaccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TransaccionesActionPerformed
        // TODO add your handling code here:
        if (btn_Transacciones.isSelected()) {
            panel_trans.setVisible(true);
        } else {
            panel_trans.setVisible(false);
        }


    }//GEN-LAST:event_btn_TransaccionesActionPerformed

    private void btn_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar_sesionActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea Cerrar Sesion?", "YES-NO", YES_NO_OPTION);
        if (opcion == 0) {
            Frm_Principal_Info frm_Principal_Info = new Frm_Principal_Info();
            frm_Principal_Info.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_cerrar_sesionActionPerformed

    private void btn_cerrar_sesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrar_sesionMouseEntered
        btn_cerrar_sesion.setForeground(Color.CYAN);
    }//GEN-LAST:event_btn_cerrar_sesionMouseEntered

    private void btn_cerrar_sesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrar_sesionMouseExited
        btn_cerrar_sesion.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_cerrar_sesionMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Cuenta_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Cuenta_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Cuenta_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Cuenta_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frm_Cuenta_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_EstadoCuenta;
    private javax.swing.JButton btn_Trans_dep;
    private javax.swing.JButton btn_Trans_ret;
    private javax.swing.JToggleButton btn_Transacciones;
    private javax.swing.JButton btn_Transferencia;
    private javax.swing.JButton btn_cerrar_sesion;
    private javax.swing.JButton btn_mi_Perfil;
    private javax.swing.JButton btn_sol_Poliza;
    private javax.swing.JButton btn_sol_Prestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panel_contenedor;
    private javax.swing.JPanel panel_trans;
    // End of variables declaration//GEN-END:variables
}
