/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.gui;

import java.awt.Color;

/**
 *
 * @author Valeria
 */
public class PrincipalAlumno extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalAlumno
     */
    public PrincipalAlumno() {
        initComponents();
        panelCursos.setVisible(false);
        panelCursosDisponibles.setVisible(false);
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
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbRow = new javax.swing.JLabel();
        lbCursos = new javax.swing.JLabel();
        lbInicio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        metroTableUI1 = new win8.swing.MetroTableUI();
        panelCursos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        metroTableUI2 = new win8.swing.MetroTableUI();
        btnUnirseGrupo1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        panelCursosDisponibles = new javax.swing.JPanel();
        btnUnirseGrupo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(246, 246, 246));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(30, 86, 160));
        jLabel6.setText("Mis tareas");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 80, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/cabecera-tabla.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 70, 310, 50));

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

        metroTableUI1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tareas"
            }
        ));
        jScrollPane1.setViewportView(metroTableUI1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 60, 320, 660));

        panelCursos.setBackground(new java.awt.Color(255, 255, 255));
        panelCursos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(30, 86, 160));
        jLabel7.setText("Cursos");
        panelCursos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 200, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/cabecera-tabla.png"))); // NOI18N
        panelCursos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 270, 50));

        metroTableUI2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cursos"
            }
        ));
        jScrollPane2.setViewportView(metroTableUI2);

        panelCursos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 300, 210));

        btnUnirseGrupo1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        btnUnirseGrupo1.setForeground(new java.awt.Color(255, 255, 255));
        btnUnirseGrupo1.setText("Unirse");
        btnUnirseGrupo1.setBorder(null);
        btnUnirseGrupo1.setContentAreaFilled(false);
        btnUnirseGrupo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirseGrupo1ActionPerformed(evt);
            }
        });
        panelCursos.add(btnUnirseGrupo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 110, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/buttonimg.png"))); // NOI18N
        panelCursos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jPanel1.add(panelCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 360, 290));

        panelCursosDisponibles.setBackground(new java.awt.Color(255, 255, 255));
        panelCursosDisponibles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUnirseGrupo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        btnUnirseGrupo.setForeground(new java.awt.Color(255, 255, 255));
        btnUnirseGrupo.setText("Unirse");
        btnUnirseGrupo.setBorder(null);
        btnUnirseGrupo.setContentAreaFilled(false);
        panelCursosDisponibles.add(btnUnirseGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 110, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/buttonimg.png"))); // NOI18N
        panelCursosDisponibles.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

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
        panelCursosDisponibles.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 110, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/buttonimgdes.png"))); // NOI18N
        panelCursosDisponibles.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel12.setText("Cursos disponibles:");
        panelCursosDisponibles.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelCursosDisponibles.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 240, 30));

        jPanel1.add(panelCursosDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 410, 230));

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

    private void lbInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInicioMousePressed
        // TODO add your handling code here:
        PrincipalAlumno p = new PrincipalAlumno();
        p.setVisible(true);
    }//GEN-LAST:event_lbInicioMousePressed

    private void lbCursosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCursosMousePressed
        // TODO add your handling code here:
        
        panelCursos.setVisible(true);
        
    }//GEN-LAST:event_lbCursosMousePressed

    private void lbRowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRowMousePressed
        // TODO add your handling code here:
        panelCursos.setVisible(false);
    }//GEN-LAST:event_lbRowMousePressed

    private void lbCursosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCursosMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lbCursosMouseReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        panelCursosDisponibles.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnUnirseGrupo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirseGrupo1ActionPerformed
        // TODO add your handling code here:
        panelCursos.setVisible(false);
        panelCursosDisponibles.setVisible(true);
        
    }//GEN-LAST:event_btnUnirseGrupo1ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnUnirseGrupo;
    private javax.swing.JButton btnUnirseGrupo1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel lbCursos;
    private javax.swing.JLabel lbInicio;
    private javax.swing.JLabel lbRow;
    private javax.swing.JLabel lbRow1;
    private javax.swing.JLabel lbRow2;
    private javax.swing.JLabel lbRow3;
    private javax.swing.JLabel lbRow4;
    private win8.swing.MetroTableUI metroTableUI1;
    private win8.swing.MetroTableUI metroTableUI2;
    private javax.swing.JPanel panelCursos;
    private javax.swing.JPanel panelCursosDisponibles;
    // End of variables declaration//GEN-END:variables
}