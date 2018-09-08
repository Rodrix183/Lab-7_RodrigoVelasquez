package lab7_rodrigovelasquez;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Tander extends javax.swing.JFrame {

    public Tander() {
        initComponents();
        this.setLocationRelativeTo(this);
        DefaultListModel modelo_lista = (DefaultListModel) jl_TodosUsuarios.getModel();
        AdministrarUsuarios au = new AdministrarUsuarios("./usuarios.rdx");
        au.cargarArchivo();
        //meter todos los usuarios
        Usuario u = new Usuario();
        for (int i = 0; i < au.getLista_usuarios().size(); i++) {
            modelo_lista.addElement(au.getLista_usuarios().get(i).toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Registro = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_registroContra = new javax.swing.JTextField();
        tf_registroUser = new javax.swing.JTextField();
        tf_registroNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_registroEdad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rb_M = new javax.swing.JRadioButton();
        rb_F = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        rb_Si = new javax.swing.JRadioButton();
        rb_No = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lb_foto = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Descripcion = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        tf_Intereses = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jd_VentanaTander = new javax.swing.JDialog();
        jtp_MENU = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_TodosUsuarios = new javax.swing.JList<>();
        jToolBar1 = new javax.swing.JToolBar();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_ListaAmigos = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jl_ListaSolicitudes = new javax.swing.JList<>();
        jButton10 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jl_ListaBloqueados = new javax.swing.JList<>();
        jButton11 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jl_INBOX = new javax.swing.JList<>();
        jPanel7 = new javax.swing.JPanel();
        jdc_Fecha = new com.toedter.calendar.JDateChooser();
        jButton8 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_LugarCita = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tf_ConQuien = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_ListaCitas = new javax.swing.JList<>();
        jLabel19 = new javax.swing.JLabel();
        cb_ListaInteresados = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        CRUD = new javax.swing.JPopupMenu();
        jmi_Eliminar = new javax.swing.JMenuItem();
        jd_Modificar = new javax.swing.JDialog();
        jButton15 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        rb2 = new javax.swing.JRadioButton();
        tf_modifName = new javax.swing.JTextField();
        tf_modifUser = new javax.swing.JTextField();
        tf_modifPass = new javax.swing.JTextField();
        tf_modifInteres = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        rbs = new javax.swing.JRadioButton();
        rbn = new javax.swing.JRadioButton();
        lb_foto1 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        ta_modifDes = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        tf_modifEdad = new javax.swing.JTextField();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tf_user = new javax.swing.JTextField();
        pf_contra = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        jd_Registro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Registro");
        jd_Registro.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 11, -1, -1));

        jLabel6.setText("Usuario");
        jd_Registro.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 74, -1, -1));

        jLabel7.setText("Nombre Completo");
        jd_Registro.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 43, -1, -1));

        jLabel8.setText("Contraseña");
        jd_Registro.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 106, -1, -1));
        jd_Registro.getContentPane().add(tf_registroContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 103, 200, -1));
        jd_Registro.getContentPane().add(tf_registroUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 71, 200, -1));
        jd_Registro.getContentPane().add(tf_registroNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 40, 243, -1));

        jLabel9.setText("Edad");
        jd_Registro.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 134, -1, -1));
        jd_Registro.getContentPane().add(tf_registroEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 131, 85, -1));

        jLabel10.setText("Sexo");
        jd_Registro.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, -1, -1));

        buttonGroup1.add(rb_M);
        rb_M.setText("M");
        jd_Registro.getContentPane().add(rb_M, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 183, -1, -1));

        buttonGroup1.add(rb_F);
        rb_F.setText("F");
        jd_Registro.getContentPane().add(rb_F, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 183, -1, -1));

        jLabel11.setText("Premium");
        jd_Registro.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        buttonGroup2.add(rb_Si);
        rb_Si.setText("Si");
        jd_Registro.getContentPane().add(rb_Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 236, -1, -1));

        buttonGroup2.add(rb_No);
        rb_No.setText("No");
        jd_Registro.getContentPane().add(rb_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 236, -1, -1));

        jButton2.setText("Guardar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jd_Registro.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 420, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_foto, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_foto, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        jd_Registro.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 40, -1, -1));

        jButton3.setText("Seleccionar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jd_Registro.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 102, -1, -1));

        ta_Descripcion.setColumns(20);
        ta_Descripcion.setRows(5);
        jScrollPane1.setViewportView(ta_Descripcion);

        jd_Registro.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 265, 198, 137));

        jLabel12.setText("Descripcion");
        jd_Registro.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 245, -1, -1));

        jPanel9.setBackground(new java.awt.Color(0, 255, 255));

        jLabel17.setText("Intereses");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(437, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(tf_Intereses, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(245, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_Intereses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );

        jd_Registro.getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 490));

        jtp_MENU.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtp_MENUStateChanged(evt);
            }
        });

        jl_TodosUsuarios.setModel(new DefaultListModel()
        );
        jScrollPane2.setViewportView(jl_TodosUsuarios);

        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        jButton4.setText("Agregar Amigo");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton5.setText("Ver Perfil");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton13.setText("Estoy Interesado");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton13);

        jl_ListaAmigos.setModel(new DefaultListModel()
        );
        jScrollPane4.setViewportView(jl_ListaAmigos);

        jLabel16.setText("Lista Amigos:");

        jButton9.setText("Eliminar");
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton12.setText("Bloquear");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jButton12)))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jButton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jtp_MENU.addTab("Usuarios", jPanel2);

        jl_ListaSolicitudes.setModel(new DefaultListModel()
        );
        jScrollPane6.setViewportView(jl_ListaSolicitudes);

        jButton10.setText("Aceptar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton10)
                .addContainerGap(426, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton10)))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jtp_MENU.addTab("Solicitudes", jPanel3);

        jl_ListaBloqueados.setModel(new DefaultListModel()
        );
        jScrollPane5.setViewportView(jl_ListaBloqueados);

        jButton11.setText("Desbloquear");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addContainerGap(379, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jtp_MENU.addTab("Bloqueados", jPanel4);

        jButton14.setText("Redactar Mensaje");

        jl_INBOX.setModel(new DefaultListModel()
        );
        jScrollPane7.setViewportView(jl_INBOX);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jButton14)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jtp_MENU.addTab("Inbox", jPanel6);

        jButton8.setText("Crear Cita");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jLabel13.setText("Fecha");

        jLabel14.setText("Lugar");

        jLabel15.setText("Usuarios");

        jl_ListaCitas.setModel(new DefaultListModel()
        );
        jScrollPane3.setViewportView(jl_ListaCitas);

        jLabel19.setText("Citas Hechas");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15)
                    .addComponent(jButton8)
                    .addComponent(jLabel13)
                    .addComponent(jdc_Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addComponent(tf_LugarCita)
                    .addComponent(tf_ConQuien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cb_ListaInteresados, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel13)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jdc_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_LugarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_ConQuien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton8))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_ListaInteresados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jtp_MENU.addTab("Agenda", jPanel7);

        jButton6.setText("Logout");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setText("Modificar");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(367, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(258, 258, 258))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jtp_MENU.addTab("Opciones", jPanel8);

        javax.swing.GroupLayout jd_VentanaTanderLayout = new javax.swing.GroupLayout(jd_VentanaTander.getContentPane());
        jd_VentanaTander.getContentPane().setLayout(jd_VentanaTanderLayout);
        jd_VentanaTanderLayout.setHorizontalGroup(
            jd_VentanaTanderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtp_MENU)
        );
        jd_VentanaTanderLayout.setVerticalGroup(
            jd_VentanaTanderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtp_MENU, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jmi_Eliminar.setText("jMenuItem1");
        CRUD.add(jmi_Eliminar);

        jButton15.setText("Guardar Cambios");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });

        jLabel18.setText("Nombre");

        jLabel20.setText("User");

        jLabel21.setText("Contrasena");

        buttonGroup3.add(rb1);
        rb1.setText("M");

        jLabel22.setText("Sexo");

        jLabel23.setText("Premium");

        buttonGroup3.add(rb2);
        rb2.setText("F");

        jLabel24.setText("Foto Perfil");

        jLabel25.setText("Intereses");

        buttonGroup4.add(rbs);
        rbs.setText("Si");

        buttonGroup4.add(rbn);
        rbn.setText("No");

        jButton16.setText("Seleccionar");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });

        ta_modifDes.setColumns(20);
        ta_modifDes.setRows(5);
        jScrollPane8.setViewportView(ta_modifDes);

        jLabel26.setText("Descripcion");

        jLabel27.setText("Edad");

        javax.swing.GroupLayout jd_ModificarLayout = new javax.swing.GroupLayout(jd_Modificar.getContentPane());
        jd_Modificar.getContentPane().setLayout(jd_ModificarLayout);
        jd_ModificarLayout.setHorizontalGroup(
            jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ModificarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(191, 191, 191))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ModificarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ModificarLayout.createSequentialGroup()
                        .addGroup(jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_ModificarLayout.createSequentialGroup()
                                .addGroup(jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_ModificarLayout.createSequentialGroup()
                                        .addComponent(rb1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rb2))
                                    .addComponent(jLabel22)
                                    .addGroup(jd_ModificarLayout.createSequentialGroup()
                                        .addGroup(jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel20))
                                        .addGap(18, 18, 18)
                                        .addGroup(jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_modifName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jd_ModificarLayout.createSequentialGroup()
                                                .addComponent(tf_modifUser, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton16))))
                                    .addGroup(jd_ModificarLayout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_modifPass, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10))
                            .addGroup(jd_ModificarLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_modifEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(lb_foto1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                    .addGroup(jd_ModificarLayout.createSequentialGroup()
                        .addGroup(jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addGroup(jd_ModificarLayout.createSequentialGroup()
                                .addComponent(rbs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))))
                        .addGroup(jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_ModificarLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(tf_modifInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jd_ModificarLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton15)))))
                .addGap(31, 31, 31))
        );
        jd_ModificarLayout.setVerticalGroup(
            jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ModificarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ModificarLayout.createSequentialGroup()
                        .addGroup(jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(tf_modifName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_ModificarLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(tf_modifUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jd_ModificarLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jButton16)))
                        .addGap(18, 18, 18)
                        .addGroup(jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(tf_modifPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(tf_modifEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb1)
                            .addComponent(rb2)))
                    .addComponent(lb_foto1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ModificarLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(9, 9, 9)
                        .addGroup(jd_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbs)
                            .addComponent(rbn)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_modifInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jButton15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ModificarLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Tander");

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        jButton1.setText("Login");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel4.setText("Registrar Aca!");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addComponent(tf_user)
                    .addComponent(pf_contra)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pf_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        //registrar el usuario
        this.dispose();
        jd_Registro.pack();
        jd_Registro.setLocationRelativeTo(this);
        jd_Registro.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        boolean val = false;
        String name = tf_registroNombre.getText();
        String user = tf_registroUser.getText();
        String pass = tf_registroContra.getText();
        String descrip = ta_Descripcion.getText();
        String sexo = "";

        if (rb_M.isSelected()) {
            sexo = "M";
        } else if (rb_F.isSelected()) {
            sexo = "F";
        } else {
            sexo = "";
        }

        String premium = "";
        if (rb_Si.isSelected()) {
            premium = "Si";
        } else if (rb_No.isSelected()) {
            premium = "No";
        } else {
            premium = "";
        }

        int age = Integer.parseInt(tf_registroEdad.getText());
        if (age < 18) {
            val = false;
        } else {
            val = true;
        }

        if (name != "" && pass != "" && user != ""
                && descrip != "" && tf_registroEdad.getText() != "" && tf_Intereses.getText() != "") {
            val = true;
        } else {
            JOptionPane.showMessageDialog(jd_Registro, "Es menor de edad");
            val = false;
        }

        if (pass.length() < 8) {
            JOptionPane.showMessageDialog(jd_Registro, "Contraseña corta");
            val = false;
        } else {
            val = true;
        }

        String[] tokens = tf_Intereses.getText().split(",");
        if (tokens.length < 10) {
            JOptionPane.showMessageDialog(jd_Registro, "Deben ser 10");
            val = false;
        } else {
            val = true;
        }

        if (val == true) {
            //lista_usuarios.add(new Usuario(name, user, pass, age, sexo, premium, icono, descrip));
            Usuario u = new Usuario(name, user, pass, age, sexo, premium, lb_foto.getIcon(), descrip);
            AdministrarUsuarios au = new AdministrarUsuarios("./usuarios.rdx");
            au.getLista_usuarios().add(new Usuario(name, user, pass, age, sexo, premium, lb_foto.getIcon(), descrip));
            au.cargarArchivo();
            au.setUsuario(u);
            au.escribirArchivo();

            tf_registroNombre.setText("");
            tf_registroUser.setText("");
            tf_registroContra.setText("");
            tf_registroEdad.setText("");
            ta_Descripcion.setText("");
            //tf_Intereses.setText("");
            System.out.println("" + name + ""
                    + "\n" + user + "\n" + pass + "\n" + sexo + "\n" + premium + "\n" + descrip);
            JOptionPane.showMessageDialog(jd_Registro, "Registro Exitoso!");
            this.setVisible(true);
        } else if (val == false) {
            JOptionPane.showMessageDialog(jd_Registro, "Campos Vacios!");
            this.setVisible(true);
        }
        jd_Registro.dispose();

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagen", "jpg", "png", "jpeg", "gif");
            jfc.setFileFilter(filtro);
            File archivo = null;
            int op = jfc.showOpenDialog(jd_Registro);
            if (op == JFileChooser.APPROVE_OPTION) {
                archivo = jfc.getSelectedFile();
                Image foto = Toolkit.getDefaultToolkit().createImage(archivo.getPath()).getScaledInstance(150, 150, 0);
                this.lb_foto.setIcon(new ImageIcon(foto));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        AdministrarUsuarios au = new AdministrarUsuarios("./usuarios.rdx");
        au.cargarArchivo();
        actual = tf_user.getText();
        for (Usuario user : au.getLista_usuarios()) {
            if (tf_user.getText().equals(user.getUser()) && pf_contra.getText().equals(user.getPass())) {
                jd_VentanaTander.setModal(true);
                jd_VentanaTander.pack();
                jd_VentanaTander.setLocationRelativeTo(this);
                jd_VentanaTander.setVisible(true);

            } else {
                //JOptionPane.showMessageDialog(this, "Datos Erroneos");
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jtp_MENUStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtp_MENUStateChanged

    }//GEN-LAST:event_jtp_MENUStateChanged

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        //Bloquear SOLO A AMIGOS
        AdministrarUsuarios au = new AdministrarUsuarios("./usuarios.rdx");
        au.cargarArchivo();
        DefaultListModel modelo = (DefaultListModel) jl_ListaAmigos.getModel();
        modelo.removeElement(au.getLista_usuarios().get(jl_ListaAmigos.getSelectedIndex()));
        String nombre = au.getLista_usuarios().get(jl_ListaAmigos.getSelectedIndex()).getNombre();
        String user = au.getLista_usuarios().get(jl_ListaAmigos.getSelectedIndex()).getUser();
        String pass = au.getLista_usuarios().get(jl_ListaAmigos.getSelectedIndex()).getPass();
        int edad = au.getLista_usuarios().get(jl_ListaAmigos.getSelectedIndex()).getEdad();
        String sexo = au.getLista_usuarios().get(jl_ListaAmigos.getSelectedIndex()).getSexo();
        String premium = au.getLista_usuarios().get(jl_ListaAmigos.getSelectedIndex()).getPremium();
        Icon imagen = au.getLista_usuarios().get(jl_ListaAmigos.getSelectedIndex()).getImg();
        String descripcion = au.getLista_usuarios().get(jl_ListaAmigos.getSelectedIndex()).getDescripcion();
        au.getLista_usuarios().get(jl_ListaAmigos.getSelectedIndex()).getLista_block().add(
                new Usuario(nombre, user, pass, edad, sexo, premium, imagen, descripcion));
        au.getLista_usuarios().remove(jl_ListaAmigos.getSelectedIndex());

    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        //eliminar
        if (jl_ListaAmigos.getSelectedIndex() >= 0) {
            AdministrarUsuarios au = new AdministrarUsuarios("./usuarios.rdx");
            au.cargarArchivo();
            DefaultListModel modelo = (DefaultListModel) jl_ListaAmigos.getModel();
            modelo.removeElement(au.getLista_usuarios().get(jl_ListaAmigos.getSelectedIndex()));
            au.getLista_usuarios().remove(jl_ListaAmigos.getSelectedIndex());
        }
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        //ver detalles de usuario
        if (jl_TodosUsuarios.getSelectedIndex() >= 0) {
            DefaultListModel modelo = (DefaultListModel) jl_TodosUsuarios.getModel();
            AdministrarUsuarios au = new AdministrarUsuarios("./usuarios.rdx");
            au.cargarArchivo();
            String nombre = "";
            String user = "";
            int edad = 0;
            String sexo = "";
            String descripcion = "";
            String premium = "";
            for (Usuario us : au.getLista_usuarios()) {
                if (us.equals(au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()))) {
                    nombre = us.getNombre();
                    user = us.getUser();
                    edad = us.getEdad();
                    sexo = us.getSexo();
                    descripcion = us.getDescripcion();
                    premium = us.getPremium();
                }
            }
            JOptionPane.showMessageDialog(jd_VentanaTander, "Nombre: " + nombre + "\nUsuario: " + user + "\nEdad: " + edad
                    + "\nSexo: " + sexo + "\nDescripcion: " + descripcion + "\nPremium: " + premium);
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        //agregar amigo
//        hgf
        if (jl_TodosUsuarios.getSelectedIndex() >= 0) {
            DefaultListModel modelo = (DefaultListModel) jl_TodosUsuarios.getModel();
            DefaultListModel modeloAmigos = (DefaultListModel) jl_ListaAmigos.getModel();
            AdministrarUsuarios au = new AdministrarUsuarios("./usuarios.rdx");
            au.cargarArchivo();

            String nombre = au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()).getNombre();
            String user = au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()).getUser();
            String pass = au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()).getPass();
            int edad = au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()).getEdad();
            String sexo = au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()).getSexo();
            String premium = au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()).getPremium();
            Icon imagen = au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()).getImg();
            String descripcion = au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()).getDescripcion();
            
            modelo.addElement(au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()).getLista_agregas().add(new Usuario(nombre, user, pass, edad, sexo, premium, imagen, descripcion)));
            modeloAmigos.addElement(au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()));
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        jd_VentanaTander.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked

    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        //interesado
        if (jl_TodosUsuarios.getSelectedIndex() >= 0) {
            AdministrarUsuarios au = new AdministrarUsuarios("./usuarios.rdx");
            au.cargarArchivo();
            DefaultListModel modelo = (DefaultListModel) jl_TodosUsuarios.getModel();

            String nombre = au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()).getNombre();
            String user = au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()).getUser();
            String pass = au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()).getPass();
            int edad = au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()).getEdad();
            String sexo = au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()).getSexo();
            String premium = au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()).getPremium();
            Icon imagen = au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()).getImg();
            String descripcion = au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()).getDescripcion();
            au.getLista_usuarios().get(jl_TodosUsuarios.getSelectedIndex()).getLista_interesados().add(new Usuario(nombre, user, pass, edad, sexo, premium, imagen, descripcion));
            //cb_ListaInteresados.addItem(new Usuario(nombre, user, pass, edad, sexo, premium, imagen, descripcion));
        }
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        // Modificar
        AdministrarUsuarios au = new AdministrarUsuarios("./usuarios.rdx");
        au.cargarArchivo();
        for (Usuario u : au.getLista_usuarios()) {
            if (u.equals(actual)) {
                tf_modifName.setText(u.getNombre());
                tf_modifUser.setText(u.getUser());
                tf_modifPass.setText(u.getPass());
                ta_modifDes.setText(u.getDescripcion());
                tf_modifEdad.setText(Integer.toString(u.getEdad()));
                tf_modifInteres.setText("");
                if (u.getSexo() == "M") {
                    rb1.setSelected(true);
                } else {
                    rb2.setSelected(true);
                }

                if (u.getPremium() == "Si") {
                    rbs.setSelected(true);
                } else {
                    rbn.setSelected(true);
                }
            }
        }

        boolean val = false;
        String name = tf_modifName.getText();
        String user = tf_modifUser.getText();
        String pass = tf_modifPass.getText();
        String descrip = ta_modifDes.getText();
        String sexo = "";

        if (rb1.isSelected()) {
            sexo = "M";
        } else if (rb2.isSelected()) {
            sexo = "F";
        } else {
            sexo = "";
        }

        String premium = "";
        if (rbs.isSelected()) {
            premium = "Si";
        } else if (rbn.isSelected()) {
            premium = "No";
        } else {
            premium = "";
        }

        int age = Integer.parseInt(tf_modifEdad.getText());
        if (age < 18) {
            val = false;
        } else {
            val = true;
        }

        if (name != "" && pass != "" && user != ""
                && descrip != "" && tf_registroEdad.getText() != "" && tf_Intereses.getText() != "") {
            val = true;
        } else {
            JOptionPane.showMessageDialog(jd_VentanaTander, "Es menor de edad");
            val = false;
        }

        if (pass.length() < 8) {
            JOptionPane.showMessageDialog(jd_VentanaTander, "Contraseña corta");
            val = false;
        } else {
            val = true;
        }

        String[] tokens = tf_modifInteres.getText().split(",");
        if (tokens.length < 10) {
            JOptionPane.showMessageDialog(jd_VentanaTander, "Deben ser 10");
            val = false;
        } else {
            val = true;
        }

        if (val == true) {
            //lista_usuarios.add(new Usuario(name, user, pass, age, sexo, premium, icono, descrip));
            //Usuario u = new Usuario(name, user, pass, age, sexo, premium, lb_foto.getIcon(), descrip);

            int c = 0;
            for (int i = 0; i < au.getLista_usuarios().size(); i++) {
                if (au.getLista_usuarios().get(i).getUser().equals(tf_modifUser.getText())) {
                    au.getLista_usuarios().get(i).setNombre(name);
                    au.getLista_usuarios().get(i).setUser(user);
                    au.getLista_usuarios().get(i).setPass(pass);
                    au.getLista_usuarios().get(i).setEdad(Integer.parseInt(tf_modifEdad.getText()));
                    au.getLista_usuarios().get(i).setDescripcion(descrip);
                    au.getLista_usuarios().get(i).setSexo(sexo);
                    au.getLista_usuarios().get(i).setPremium(premium);
                    au.getLista_usuarios().get(i).setImg(lb_foto1.getIcon());
                }
            }

            au.escribirArchivo();

            tf_registroNombre.setText("");
            tf_registroUser.setText("");
            tf_registroContra.setText("");
            tf_registroEdad.setText("");
            ta_Descripcion.setText("");
            //tf_Intereses.setText("");
//            System.out.println("" + name + ""
//                    + "\n" + user + "\n" + pass + "\n" + sexo + "\n" + premium + "\n" + descrip);
            JOptionPane.showMessageDialog(jd_Registro, "Guardad Exitoso!");
            this.setVisible(true);
        } else if (val == false) {
            JOptionPane.showMessageDialog(jd_Registro, "Campos Vacios!");
            this.setVisible(true);
        }
        jd_Registro.dispose();
    }//GEN-LAST:event_jButton15MouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagen", "jpg", "png", "jpeg", "gif");
            jfc.setFileFilter(filtro);
            File archivo = null;
            int op = jfc.showOpenDialog(jd_VentanaTander);
            if (op == JFileChooser.APPROVE_OPTION) {
                archivo = jfc.getSelectedFile();
                Image foto = Toolkit.getDefaultToolkit().createImage(archivo.getPath()).getScaledInstance(150, 150, 0);
                this.lb_foto1.setIcon(new ImageIcon(foto));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        jd_Modificar.setModal(true);
        jd_Modificar.pack();
        jd_Modificar.setLocationRelativeTo(this);
        jd_Modificar.setVisible(true);
    }//GEN-LAST:event_jButton7MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tander.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tander.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tander.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tander.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tander().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu CRUD;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> cb_ListaInteresados;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDialog jd_Modificar;
    private javax.swing.JDialog jd_Registro;
    private javax.swing.JDialog jd_VentanaTander;
    private com.toedter.calendar.JDateChooser jdc_Fecha;
    private javax.swing.JList<String> jl_INBOX;
    private javax.swing.JList<String> jl_ListaAmigos;
    private javax.swing.JList<String> jl_ListaBloqueados;
    private javax.swing.JList<String> jl_ListaCitas;
    private javax.swing.JList<String> jl_ListaSolicitudes;
    private javax.swing.JList<String> jl_TodosUsuarios;
    private javax.swing.JMenuItem jmi_Eliminar;
    private javax.swing.JTabbedPane jtp_MENU;
    private javax.swing.JLabel lb_foto;
    private javax.swing.JLabel lb_foto1;
    private javax.swing.JPasswordField pf_contra;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb_F;
    private javax.swing.JRadioButton rb_M;
    private javax.swing.JRadioButton rb_No;
    private javax.swing.JRadioButton rb_Si;
    private javax.swing.JRadioButton rbn;
    private javax.swing.JRadioButton rbs;
    private javax.swing.JTextArea ta_Descripcion;
    private javax.swing.JTextArea ta_modifDes;
    private javax.swing.JTextField tf_ConQuien;
    private javax.swing.JTextField tf_Intereses;
    private javax.swing.JTextField tf_LugarCita;
    private javax.swing.JTextField tf_modifEdad;
    private javax.swing.JTextField tf_modifInteres;
    private javax.swing.JTextField tf_modifName;
    private javax.swing.JTextField tf_modifPass;
    private javax.swing.JTextField tf_modifUser;
    private javax.swing.JTextField tf_registroContra;
    private javax.swing.JTextField tf_registroEdad;
    private javax.swing.JTextField tf_registroNombre;
    private javax.swing.JTextField tf_registroUser;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
    //ArrayList<Usuario> lista_usuarios = new ArrayList<>();
    String actual = "";
    String us_act = "", pass_act = "", name_act = "", sex_act = "", prem_act = "", descrip_act = "";
    int age_act = 0;
}
