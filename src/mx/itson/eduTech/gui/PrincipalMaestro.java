/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.gui;

/**
 *
 * @author Valeria
 */
public class PrincipalMaestro extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalAlumno
     */
    public PrincipalMaestro() {
        initComponents();
        panelCurso.setVisible(false);
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
        jLabel16 = new javax.swing.JLabel();
        lbRow1 = new javax.swing.JLabel();
        lbRow = new javax.swing.JLabel();
        lbCursos = new javax.swing.JLabel();
        lbInicio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        metroTableUI1 = new win8.swing.MetroTableUI();
        jSeparator1 = new javax.swing.JSeparator();
        btnAgregarTarea = new javax.swing.JButton();
        panelCurso = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnCrear = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(246, 246, 246));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nombre del usuario");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, -1, 70));

        lbRow1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lbRow1.setForeground(new java.awt.Color(255, 255, 255));
        lbRow1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/sort-down16.png"))); // NOI18N
        lbRow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbRow1MousePressed(evt);
            }
        });
        jPanel1.add(lbRow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, 30, 70));

        lbRow.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lbRow.setForeground(new java.awt.Color(255, 255, 255));
        lbRow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/sort-down16.png"))); // NOI18N
        lbRow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbRowMousePressed(evt);
            }
        });
        jPanel1.add(lbRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 30, 60));

        lbCursos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lbCursos.setForeground(new java.awt.Color(255, 255, 255));
        lbCursos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCursos.setText("Cursos");
        lbCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbCursosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbCursosMouseReleased(evt);
            }
        });
        jPanel1.add(lbCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 190, 70));

        lbInicio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lbInicio.setForeground(new java.awt.Color(255, 255, 255));
        lbInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInicio.setText("Inicio");
        lbInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbInicioMousePressed(evt);
            }
        });
        jPanel1.add(lbInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 190, 70));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(246, 246, 246));
        jLabel4.setText("tech");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, 70));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(246, 246, 246));
        jLabel5.setText("edu");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/open-book 32.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/barras-EduTec.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 70));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(30, 86, 160));
        jLabel6.setText("Actividades próximas");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 80, 270, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/cabecera-tabla.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 70, 300, 50));

        metroTableUI1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tareas"
            }
        ));
        jScrollPane1.setViewportView(metroTableUI1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 60, 320, 660));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 980, 10));

        btnAgregarTarea.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnAgregarTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/homework.png"))); // NOI18N
        btnAgregarTarea.setText("Tarea");
        btnAgregarTarea.setBorder(null);
        btnAgregarTarea.setContentAreaFilled(false);
        btnAgregarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTareaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 130, 30));

        panelCurso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel7.setText("Publicar: Tarea.");
        panelCurso.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel8.setText("Nombre:");
        panelCurso.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 70, 20));

        txtNombre.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        panelCurso.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 519, 20));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel9.setText("Descripción:");
        panelCurso.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        panelCurso.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 520, 167));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel10.setText("Máx de pts: ");
        panelCurso.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 130, 20));

        jTextField2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        panelCurso.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 110, 20));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel11.setText("Opciones: ");
        panelCurso.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 90, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelCurso.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 180, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel12.setText("Fecha limite:");
        panelCurso.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jLabel13.setText("Escala:");
        panelCurso.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 100, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelCurso.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 180, -1));

        btnCrear.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Crear");
        btnCrear.setBorder(null);
        btnCrear.setContentAreaFilled(false);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        panelCurso.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 110, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/buttonimg.png"))); // NOI18N
        panelCurso.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(30, 86, 160));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelCurso.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 110, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/buttonimgdes.png"))); // NOI18N
        panelCurso.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, -1, -1));

        jPanel1.add(panelCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 740, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        panelCurso.setVisible(false);
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnAgregarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTareaActionPerformed
        // TODO add your handling code here:
        panelCurso.setVisible(true);
    }//GEN-LAST:event_btnAgregarTareaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void lbInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInicioMousePressed
        // TODO add your handling code here:
        PrincipalMaestro p= new PrincipalMaestro();
        p.setVisible(true);
    }//GEN-LAST:event_lbInicioMousePressed

    private void lbCursosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCursosMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_lbCursosMousePressed

    private void lbCursosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCursosMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbCursosMouseReleased

    private void lbRowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRowMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_lbRowMousePressed

    private void lbRow1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRow1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbRow1MousePressed

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
            java.util.logging.Logger.getLogger(PrincipalMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalMaestro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarTarea;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbCursos;
    private javax.swing.JLabel lbInicio;
    private javax.swing.JLabel lbRow;
    private javax.swing.JLabel lbRow1;
    private win8.swing.MetroTableUI metroTableUI1;
    private javax.swing.JPanel panelCurso;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}