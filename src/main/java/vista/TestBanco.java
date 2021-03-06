/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dominio.Personas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KEILY
 */
public class TestBanco extends javax.swing.JFrame {

    ArrayList<Personas> persona = new ArrayList<Personas>();
    DefaultTableModel modelot = new DefaultTableModel();
    private double total;
    int con = 0;

    public TestBanco() {
        initComponents();
        insertar();

    }

    public void mostrarDatos(Personas p) {
        modelot.insertRow(con, new Object[]{});
        modelot.setValueAt(p.getCodigo(), con, 0);
        modelot.setValueAt(p.getNombre(), con, 1);
        modelot.setValueAt(p.getSaldoin(), con, 2);
        con++;
    }

    public void insertar() {

        modelot.addColumn("CÓDIGO");
        modelot.addColumn("NOMBRE");
        modelot.addColumn("SALDO INICIAL");
        tabla.setModel(modelot);
    }

    public void limpiar() {

        txtCodigo.setText("");
        txtNombre.setText("");
        txtSaldoi.setText("");
    }

    public void sumar() {
        double suma = 0;
        for (int i = 0; i < tabla.getRowCount(); i++) {
            suma = suma + Double.parseDouble(modelot.getValueAt(i, 2).toString());
            txtBanco.setText("$" + suma);
        }
        total = suma;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        jPanel = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblEncabezado = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblSaldoin = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtSaldoi = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        lblValor = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBanco = new javax.swing.JTextField();
        rbRetirar = new javax.swing.JRadioButton();
        txtValor = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();
        rbDepositar = new javax.swing.JRadioButton();
        rbEliminar = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(204, 204, 204));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo.setText("CÓDIGO");

        lblEncabezado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEncabezado.setText("CAJA AHORRO ESPE");

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombre.setText("NOMBRE");

        lblSaldoin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaldoin.setText("SALDO INICIAL ");

        btnInsertar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnInsertar.setText("INSERTAR");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        txtSaldoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoiActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        lblValor.setText("VALOR");

        jLabel7.setText("TOT: BANCO");

        txtBanco.setBackground(new java.awt.Color(255, 102, 102));
        txtBanco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        rbRetirar.setText("RETIRAR");
        rbRetirar.setEnabled(false);
        rbRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRetirarActionPerformed(evt);
            }
        });

        txtValor.setEnabled(false);

        btnProcesar.setText("PROCESAR");
        btnProcesar.setEnabled(false);
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        rbDepositar.setText("DEPOSITAR");
        rbDepositar.setEnabled(false);
        rbDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDepositarActionPerformed(evt);
            }
        });

        rbEliminar.setText("ELIMINAR");
        rbEliminar.setEnabled(false);
        rbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addComponent(lblEncabezado)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSaldoi)
                                            .addComponent(lblSaldoin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                        .addComponent(btnInsertar)
                                        .addGap(40, 40, 40))))
                            .addComponent(jScrollPane2))
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rbRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbDepositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(82, 82, 82)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(lblValor))
                                    .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(98, 98, 98))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                        .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82))))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))))))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEncabezado)
                .addGap(35, 35, 35)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre)
                    .addComponent(lblSaldoin)
                    .addComponent(btnInsertar))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaldoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProcesar))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(rbDepositar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbRetirar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbEliminar))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSaldoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoiActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:

        int codigo = Integer.parseInt(txtCodigo.getText());
        double saldoi = Double.parseDouble(txtSaldoi.getText());
        String nombre = txtNombre.getText();

        Personas per = new Personas(codigo, nombre, saldoi);
        persona.add(per);

        modelot.setRowCount(0);
        for (int i = 0; i < persona.size(); i++) {
            Object[] fila = {
                persona.get(i).getCodigo(),
                persona.get(i).getNombre(),
                persona.get(i).getSaldoin()

            };
            modelot.addRow(fila);

        }

        limpiar();
        sumar();


    }//GEN-LAST:event_btnInsertarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        rbDepositar.setEnabled(true);
        rbEliminar.setEnabled(true);
        rbRetirar.setEnabled(true);
        botones.add(rbDepositar);
        botones.add(rbEliminar);
        botones.add(rbRetirar);

    }//GEN-LAST:event_tablaMouseClicked

    private void rbRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRetirarActionPerformed
        // TODO add your handling code here:
        btnProcesar.setEnabled(true);
        txtValor.setEnabled(true);
        rbEliminar.setEnabled(false);
        rbDepositar.setEnabled(false);
    }//GEN-LAST:event_rbRetirarActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        // TODO add your handling code here:
        double l = Double.parseDouble(modelot.getValueAt(tabla.getSelectedRow(), 2).toString());
        Double aumento = Double.parseDouble(txtValor.getText());
        Double n = 0.0;
        if (rbDepositar.isSelected()) {
            n = l + aumento;
            

        } else {
            n = l - aumento;
            if (n < 0) {
                n = n * (-1);
            }
        }

        txtBanco.setText("$" + (n+total));
        btnProcesar.setEnabled(false);
        txtValor.setEnabled(false);


    }//GEN-LAST:event_btnProcesarActionPerformed

    private void rbDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDepositarActionPerformed
        // TODO add your handling code here:
        btnProcesar.setEnabled(true);
        txtValor.setEnabled(true);
        rbEliminar.setEnabled(false);
        rbRetirar.setEnabled(false);
    }//GEN-LAST:event_rbDepositarActionPerformed

    private void rbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEliminarActionPerformed
        // TODO add your handling code here:
        int fselec = tabla.getSelectedRow();

        Double valor = Double.parseDouble(tabla.getValueAt(fselec, 2).toString());
        double totalact = (total - valor);

        txtBanco.setText("$" + totalact);
        if (fselec >= 0) {
            persona.remove(fselec);
            modelot.removeRow(fselec);

        }
        btnProcesar.setEnabled(false);
        txtValor.setEnabled(false);
        rbDepositar.setEnabled(false);
        rbRetirar.setEnabled(false);

    }//GEN-LAST:event_rbEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(TestBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestBanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botones;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSaldoin;
    private javax.swing.JLabel lblValor;
    private javax.swing.JRadioButton rbDepositar;
    private javax.swing.JRadioButton rbEliminar;
    private javax.swing.JRadioButton rbRetirar;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSaldoi;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
