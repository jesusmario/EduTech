/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.gui;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.itson.eduTech.entidades.Archivo;
import mx.itson.eduTech.entidades.Entrega;
import mx.itson.eduTech.entidades.Envio;
import static mx.itson.eduTech.gui.Principal.alumno;
import static mx.itson.eduTech.gui.Principal.maestro;
import static mx.itson.eduTech.gui.PrincipalAlumno.curso;
import static mx.itson.eduTech.gui.PrincipalAlumno.tarea;
import mx.itson.eduTech.negocio.EntregaNegocio;
import mx.itson.eduTech.negocio.EnvioNegocio;

/**
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
public class TareaAlumno extends javax.swing.JFrame {

    DefaultTableModel modelo;
    static Entrega entrega = new Entrega();

    /**
     * Creates new form TareaAlumno
     */
    public TareaAlumno() {
        initComponents();
        tbEnvios.getColumnModel().getColumn(0).setMaxWidth(0);
        tbEnvios.getColumnModel().getColumn(0).setMinWidth(0);
        tbEnvios.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tbEnvios.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        panelSubirTarea.setVisible(false);
        lbNombreAlumno.setText(Principal.alumno.getNombre());
        cargarTarea();
    }

    /**
     * Metodo que permite cargar la tarea del curso.
     */
    public void cargarTarea() {

        lbNombreCurso.setText(curso.getNombre());
        lbNombreAsignacion.setText(tarea.getNombre());
        txtDescripcion.setText(tarea.getDescripcion());
        String formato = "AM";
        if (tarea.getFormatoHora() == 1) {
            formato = "PM";
            tarea.getFechaLimite().setHours(tarea.getFechaLimite().getHours() - 12);
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
        String fecha = sdf.format(tarea.getFechaLimite()) + " " + formato;
        lbFechaAsignacion.setText(fecha);
        lbFechaTarea.setText(sdf2.format(tarea.getFechaCreacion()));
        cargarEnvios();
    }

    /**
     * Metodo que permite cargar el envio de la tarea del alumno.
     */
    public void cargarEnvios() {
        EntregaNegocio en = new EntregaNegocio();
        entrega = en.obtenerEntrega(alumno, tarea);
        if (entrega != null) {
            modelo = (DefaultTableModel) tbEnvios.getModel();
            modelo.getDataVector().clear();
            List<Envio> envios = entrega.getEnvios();
            if (!envios.isEmpty()) {
                for (Envio envio : envios) {
                    String aTiempo = "A tiempo";
                    int compararFecha = tarea.getFechaLimite().compareTo(envio.getFecha());
                    if (compararFecha == -1) {
                        aTiempo = "Reatardo";
                    }
                    modelo.addRow(new Object[]{
                        envio.getId(),
                        aTiempo
                    });
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Aún no ha presentado ninguna entrega");
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
        lbNombreAlumno = new javax.swing.JLabel();
        lbRow1 = new javax.swing.JLabel();
        lbRow = new javax.swing.JLabel();
        lbCursos = new javax.swing.JLabel();
        lbInicio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEnvios = new win8.swing.MetroTableUI();
        jLabel6 = new javax.swing.JLabel();
        lbNombreCurso = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbNombreAsignacion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbFechaAsignacion = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbFechaTarea = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lbDescripcionTarea1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panelSubirTarea = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcionEnvio = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtNombreArchivo = new javax.swing.JTextField();
        btnEnviarTarea = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNombreAlumno.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        lbNombreAlumno.setForeground(new java.awt.Color(255, 255, 255));
        lbNombreAlumno.setText("Nombre del usuario");
        jPanel1.add(lbNombreAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(992, 0, 270, 70));

        lbRow1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lbRow1.setForeground(new java.awt.Color(255, 255, 255));
        lbRow1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/sort-down16.png"))); // NOI18N
        lbRow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbRow1MousePressed(evt);
            }
        });
        jPanel1.add(lbRow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 50, 70));

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
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, 70));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(246, 246, 246));
        jLabel5.setText("edu");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/open-book 32.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/barras-EduTec.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(30, 86, 160));
        jLabel10.setText("Presentaciones de asignación.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1009, 230, 350, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/cabecera-tabla.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 230, 350, 60));

        tbEnvios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Tareas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbEnvios.setRowHeight(40);
        tbEnvios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEnviosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbEnvios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 230, 370, 220));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/folder32.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 40, 40));

        lbNombreCurso.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        lbNombreCurso.setText("Nombre de la materia");
        jPanel1.add(lbNombreCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 170, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/titulo-tarea.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1370, 70));

        lbNombreAsignacion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        lbNombreAsignacion.setText("Nombre de la asignación");
        jPanel1.add(lbNombreAsignacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(246, 246, 246));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 1300, 10));

        lbFechaAsignacion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lbFechaAsignacion.setText("Fecha");
        jPanel1.add(lbFechaAsignacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(246, 246, 246));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 960, -1));

        lbFechaTarea.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        lbFechaTarea.setText("Fecha en la que se posteo la tarea");
        jPanel1.add(lbFechaTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        btnEnviar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.setBorder(null);
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 460, 110, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/buttonimg.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 460, -1, -1));

        lbDescripcionTarea1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        lbDescripcionTarea1.setText("Descripción de la tarea");
        jPanel1.add(lbDescripcionTarea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 690, 90, 40));

        panelSubirTarea.setBackground(new java.awt.Color(246, 246, 246));
        panelSubirTarea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Subir tarea");
        panelSubirTarea.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/barras-EduTec.png"))); // NOI18N
        panelSubirTarea.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 40));

        txtDescripcionEnvio.setText("Añadir comentario (Opcional)");
        jScrollPane2.setViewportView(txtDescripcionEnvio);

        panelSubirTarea.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 540, 120));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/clip24.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelSubirTarea.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 50, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/buttonimg.png"))); // NOI18N
        panelSubirTarea.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 50, 30));

        txtNombreArchivo.setText("jTextField1");
        panelSubirTarea.add(txtNombreArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 490, 30));

        btnEnviarTarea.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        btnEnviarTarea.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarTarea.setText("Enviar");
        btnEnviarTarea.setBorder(null);
        btnEnviarTarea.setContentAreaFilled(false);
        btnEnviarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarTareaActionPerformed(evt);
            }
        });
        panelSubirTarea.add(btnEnviarTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 110, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/buttonimg.png"))); // NOI18N
        panelSubirTarea.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

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
        panelSubirTarea.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 110, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/eduTech/imagenes/buttonimgdes.png"))); // NOI18N
        panelSubirTarea.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        jPanel1.add(panelSubirTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 600, 340));

        txtDescripcion.setEditable(false);
        txtDescripcion.setColumns(20);
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtDescripcion);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 680, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInicioMousePressed
        this.dispose();
        PrincipalAlumno p = new PrincipalAlumno();
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

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        panelSubirTarea.setVisible(true);
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        panelSubirTarea.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEnviarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarTareaActionPerformed
        Envio e = new Envio();
        if (a != null) {
            e.setArchivo(a);
            e.setComentario(txtDescripcion.getText());
            e.setFecha(new Date());

        }

        if (entrega != null) {
            EntregaNegocio en = new EntregaNegocio();
            entrega.getEnvios().add(e);
            en.editarEntrega(entrega);
            JOptionPane.showMessageDialog(this, "El envío se realizó correctamente");
            cargarTarea();
            txtNombreArchivo.setText("");
            txtDescripcionEnvio.setText("Añadir comentario (Opcional)");
            panelSubirTarea.setVisible(false);
        } else {
            Entrega ent = new Entrega();
            ent.setIdAlumno(alumno.getId());
            ent.setCalificacion("0");
            ent.setIdTarea(tarea.getId());
            List<Envio> envios = new ArrayList<>();
            envios.add(e);
            ent.setEnvios(envios);
            EntregaNegocio en = new EntregaNegocio();
            int id = en.guardar(ent);
            entrega = en.obtenerPorId(id);
            JOptionPane.showMessageDialog(this, "El envío se realizó correctamente");
            cargarTarea();
            txtNombreArchivo.setText("");
            txtDescripcionEnvio.setText("Añadir comentario (Opcional)");
            panelSubirTarea.setVisible(false);
        }

    }//GEN-LAST:event_btnEnviarTareaActionPerformed

    private void lbRow1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRow1MousePressed
        alumno = null;
        maestro = null;
        this.dispose();
        new Principal().setVisible(true);
    }//GEN-LAST:event_lbRow1MousePressed
    Archivo a = new Archivo();
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int ventana = fileChooser.showOpenDialog(null);
        if (ventana == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String nombreArchivo = String.valueOf(file.getName());
            String peso = String.valueOf(file.getTotalSpace() * 0.001);
            System.out.println(peso);
            a = new Archivo();
            a.setNombre(nombreArchivo);
            a.setPeso(peso);
            txtNombreArchivo.setText(nombreArchivo);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    static Envio envio;
    private void tbEnviosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEnviosMouseClicked
        int fila = tbEnvios.getSelectedRow();
        if (fila != -1) {
            modelo = (DefaultTableModel) tbEnvios.getModel();
            EnvioNegocio en = new EnvioNegocio();
            int id = (int) modelo.getValueAt(fila, 0);
            envio = en.obtenerPorId(id);
            this.dispose();
            new MostrarTarea().setVisible(true);
        }
    }//GEN-LAST:event_tbEnviosMouseClicked

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        this.dispose();
        new PrincipalAlumno().setVisible(true);
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        this.dispose();
        new PrincipalAlumno().setVisible(true);
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        this.dispose();
        new PrincipalAlumno().setVisible(true);
    }//GEN-LAST:event_jLabel2MousePressed

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
            java.util.logging.Logger.getLogger(TareaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TareaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TareaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TareaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TareaAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnEnviarTarea;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbCursos;
    private javax.swing.JLabel lbDescripcionTarea1;
    private javax.swing.JLabel lbFechaAsignacion;
    private javax.swing.JLabel lbFechaTarea;
    private javax.swing.JLabel lbInicio;
    private javax.swing.JLabel lbNombreAlumno;
    private javax.swing.JLabel lbNombreAsignacion;
    private javax.swing.JLabel lbNombreCurso;
    private javax.swing.JLabel lbRow;
    private javax.swing.JLabel lbRow1;
    private javax.swing.JPanel panelSubirTarea;
    private win8.swing.MetroTableUI tbEnvios;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextPane txtDescripcionEnvio;
    private javax.swing.JTextField txtNombreArchivo;
    // End of variables declaration//GEN-END:variables
}
