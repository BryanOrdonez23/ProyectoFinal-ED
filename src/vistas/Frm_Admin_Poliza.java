/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Controlador.txt;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.Poliza;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import vistas.modeloTablas.ModeloTablaPolizas;

/**
 *
 * @author CNH
 */
public class Frm_Admin_Poliza extends javax.swing.JFrame {

    ModeloTablaPolizas modelo = new ModeloTablaPolizas();
    txt ControladorTxt = new txt();
    private List<Poliza> poliza;
    private SimpleDateFormat dateFormat;

    public void cargarTabla() {
        try {
            modelo.setLista(ControladorTxt.ListadoSolicitudesPolizas());
            jTable1.setModel(modelo);
            jTable1.updateUI();

        } catch (IOException ex) {
            Logger.getLogger(Frm_Admin_Creditos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Creates new form Frm_Admin_Poliza
     */
    public Frm_Admin_Poliza() {
        initComponents();
        this.setResizable(false);
        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        cargarTabla();
        textCuenta.setEditable(false);
        textMonto.setEditable(false);
        textTiempo.setEditable(false);
        textTasa.setEditable(false);
        textnombreTitular.setEditable(false);
        txtDireccion.setEditable(false);
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
        btn_cerrarSesion = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtbuscarCuenta = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttomSeleccionar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textnombreTitular = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textMonto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textTiempo = new javax.swing.JTextField();
        textCuenta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textTasa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        buttomAceptarPolizas = new javax.swing.JButton();
        buttomRechazarPolizas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OFICIAL DE POLIZA");

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OFICIAL DE POLIZAS");

        btn_cerrarSesion.setBackground(new java.awt.Color(255, 255, 51));
        btn_cerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btn_cerrarSesion.setText("Cerrar Sesion");
        btn_cerrarSesion.setBorderPainted(false);
        btn_cerrarSesion.setContentAreaFilled(false);
        btn_cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cerrarSesionMouseExited(evt);
            }
        });
        btn_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cerrarSesion)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cerrarSesion)
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Cuentas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Numero de Cuenta: ");

        txtbuscarCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarCuentaKeyTyped(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton9.setText("Buscar");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 102, 0));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Listado de Cuentas");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton10))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtbuscarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9)))
                .addContainerGap(279, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtbuscarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solicitudes de polizas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        buttomSeleccionar.setBackground(new java.awt.Color(0, 153, 51));
        buttomSeleccionar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttomSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        buttomSeleccionar.setText("Seleccionar");
        buttomSeleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttomSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomSeleccionarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion de la poliza  solicitada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Nombre del Titular:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("# de cuenta:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Monto de la poliza:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Duracion de la poliza:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Tasa de interes:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Direccion:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(44, 44, 44)
                        .addComponent(textCuenta))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(8, 8, 8)
                        .addComponent(textnombreTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(60, 60, 60)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textTasa, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(34, 34, 34)
                        .addComponent(textMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(textMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textnombreTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(textTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(textTasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        buttomAceptarPolizas.setBackground(new java.awt.Color(255, 255, 0));
        buttomAceptarPolizas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttomAceptarPolizas.setForeground(new java.awt.Color(0, 51, 153));
        buttomAceptarPolizas.setText("Aceptar Poliza");
        buttomAceptarPolizas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttomAceptarPolizas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomAceptarPolizasActionPerformed(evt);
            }
        });

        buttomRechazarPolizas.setBackground(new java.awt.Color(255, 255, 0));
        buttomRechazarPolizas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttomRechazarPolizas.setForeground(new java.awt.Color(0, 51, 153));
        buttomRechazarPolizas.setText("Rechazar Poliza");
        buttomRechazarPolizas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttomRechazarPolizas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomRechazarPolizasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttomRechazarPolizas, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttomAceptarPolizas, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(buttomAceptarPolizas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttomRechazarPolizas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttomSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(342, 342, 342))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttomSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (txtbuscarCuenta.getText().length() > 0) {
            try {
                if (ControladorTxt.existeCuenta(txtbuscarCuenta.getText())) {
                    // TODO add your handling code here:
                    Dlg_BuscarCuenta ndlg = new Dlg_BuscarCuenta(this, rootPaneCheckingEnabled, txtbuscarCuenta.getText());
                    ndlg.setVisible(true);
                    txtbuscarCuenta.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "El numero de cuenta bancaria que digito no existe"
                            + "\nCompruebe los datos ingresados", "ERROR", ERROR_MESSAGE);
                }
            } catch (IOException ex) {
                Logger.getLogger(Frm_Admin_Creditos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar el numero de cuenta a buscar", "WARNING", WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        Dlg_ListadoCuentas nlist = new Dlg_ListadoCuentas(this, rootPaneCheckingEnabled);
        nlist.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btn_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarSesionActionPerformed
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea Cerrar Sesion?", "YES-NO", YES_NO_OPTION);
        if (opcion == 0) {
            Pagina_Inicio loginAdmin = new Pagina_Inicio();
            loginAdmin.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_cerrarSesionActionPerformed

    private void buttomSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttomSeleccionarActionPerformed
        int fila = jTable1.getSelectedRow();
        if (fila >= 0) {
            textCuenta.setText(jTable1.getValueAt(fila, 0).toString());
            textnombreTitular.setText(jTable1.getValueAt(fila, 1).toString());
            txtDireccion.setText(jTable1.getValueAt(fila, 2).toString());
            textMonto.setText(jTable1.getValueAt(fila, 3).toString());
            textTiempo.setText(jTable1.getValueAt(fila, 4).toString());
            textTasa.setText("15%");
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }
    }//GEN-LAST:event_buttomSeleccionarActionPerformed

    private void txtbuscarCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarCuentaKeyTyped
        char car = evt.getKeyChar();

        if (((!Character.isDigit(car))) && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Solo se puede ingresar numeros", "ERROR", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtbuscarCuentaKeyTyped

    private void buttomAceptarPolizasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttomAceptarPolizasActionPerformed
        try {
            if (textCuenta.getText().length() > 0 && textMonto.getText().length() > 0 && textTiempo.getText().length() > 0 && textTasa.getText().length() > 0 && textnombreTitular.getText().length() > 0 && txtDireccion.getText().length() > 0) {
                JOptionPane.showMessageDialog(null, "La poliza ha sido guardada con exito", "INFORMACION", INFORMATION_MESSAGE);
                ControladorTxt.cuentaBancariaPolizas(textCuenta.getText());
                ControladorTxt.ActualizarSolicitudesPolizas(ControladorTxt.eliminarSolicitudesPolizas(textCuenta.getText()));
                cargarTabla();
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una cuenta en la tabla", "WARNING", WARNING_MESSAGE);
            }

        } catch (IOException ex) {
            Logger.getLogger(Frm_Admin_Poliza.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_buttomAceptarPolizasActionPerformed

    private void buttomRechazarPolizasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttomRechazarPolizasActionPerformed
        try {
            JOptionPane.showMessageDialog(null, "La solicitud de poliza ha sido rechazada con exito", "INFORMACION", INFORMATION_MESSAGE);
            ControladorTxt.ActualizarSolicitudesPolizas(ControladorTxt.eliminarSolicitudesPolizas(textCuenta.getText()));
            cargarTabla();
            limpiarCampos();
        } catch (IOException ex) {
            Logger.getLogger(Frm_Admin_Poliza.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttomRechazarPolizasActionPerformed

    private void btn_cerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarSesionMouseEntered
         btn_cerrarSesion.setForeground(Color.CYAN);
    }//GEN-LAST:event_btn_cerrarSesionMouseEntered

    private void btn_cerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarSesionMouseExited
         btn_cerrarSesion.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_cerrarSesionMouseExited

    private void limpiarCampos() {
        textCuenta.setText("");
        textMonto.setText("");
        textTiempo.setText("");
        textTasa.setText("");
        textnombreTitular.setText("");
        txtDireccion.setText("");
    }

//    private void cargarPrestamos() {
//        txt txt = new txt();
//
//        try {
//            poliza = txt.leer();
//
//            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//
//            for (Prestamo pr : prestamos) {
//                model.addRow(crearFilaTabla(pr));
//            }
//        } catch (IOException e) {
////            JOptionPane.showMessageDialog(this, "Error al abrir el archivo. " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//        } catch (ParseException e) {
//            JOptionPane.showMessageDialog(this, "El archivo no tiene el formato de fechas correcto. " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//        }
//    }
//    private Object[] crearFilaTabla(Prestamo pr) {
//        return new Object[]{
//            pr.getCuentaBancaria().getNum_Cuenta(),
//            pr.getMonto_final(),
//            pr.getCuota_mensual(),
//            pr.getTasa(),
//            dateFormat.format(pr.getFecha_inicio_prestamo()),
//            dateFormat.format(pr.getFecha_final_prestamo())
//        };
//    }
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
            java.util.logging.Logger.getLogger(Frm_Admin_Poliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Admin_Poliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Admin_Poliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Admin_Poliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Admin_Poliza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrarSesion;
    private javax.swing.JButton buttomAceptarPolizas;
    private javax.swing.JButton buttomRechazarPolizas;
    private javax.swing.JButton buttomSeleccionar;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textCuenta;
    private javax.swing.JTextField textMonto;
    private javax.swing.JTextField textTasa;
    private javax.swing.JTextField textTiempo;
    private javax.swing.JTextField textnombreTitular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtbuscarCuenta;
    // End of variables declaration//GEN-END:variables
}
