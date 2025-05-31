package com.mycompany.login.presentacion;

import com.mycompany.login.negocio.ControladoraNegocio;
import com.mycompany.login.negocio.User;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelAdmin extends javax.swing.JFrame {

    ControladoraNegocio control = null;
    User isUser = null;

    public PanelAdmin(ControladoraNegocio control, User isUser) {
        initComponents();
        this.control = control;
        this.isUser = isUser;

        tableUsers.setBackground(new java.awt.Color(69, 69, 69));
        tableUsers.setForeground(new java.awt.Color(255, 255, 255));
        tableUsers.getTableHeader().setBackground(new java.awt.Color(37, 37, 37));
        tableUsers.getTableHeader().setForeground(new java.awt.Color(1, 135, 71));
        jScrollPane1.getViewport().setBackground(new java.awt.Color(69, 69, 69));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsers = new javax.swing.JTable();
        btnDeleteUser = new javax.swing.JButton();
        btnCreateUser = new javax.swing.JButton();
        btnEditUser = new javax.swing.JButton();
        btnReloadTable = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(37, 37, 37));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Administrador de Usuarios");

        jSeparator1.setBackground(new java.awt.Color(1, 135, 71));
        jSeparator1.setForeground(new java.awt.Color(1, 135, 71));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));

        tableUsers.setBackground(new java.awt.Color(51, 51, 51));
        tableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableUsers.setSelectionBackground(new java.awt.Color(1, 135, 71));
        tableUsers.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tableUsers);

        btnDeleteUser.setBackground(new java.awt.Color(1, 135, 71));
        btnDeleteUser.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnDeleteUser.setForeground(new java.awt.Color(204, 204, 204));
        btnDeleteUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\Matias Altamiranda\\Downloads\\icono\\IconosForLogin\\iloveimg-resized (1)\\borrar-usuario.png")); // NOI18N
        btnDeleteUser.setText("Borrar Usuario");
        btnDeleteUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 37, 37), 1, true));
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        btnCreateUser.setBackground(new java.awt.Color(1, 135, 71));
        btnCreateUser.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnCreateUser.setForeground(new java.awt.Color(204, 204, 204));
        btnCreateUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\Matias Altamiranda\\Downloads\\icono\\IconosForLogin\\iloveimg-resized (1)\\agregar-usuario.png")); // NOI18N
        btnCreateUser.setText("Crear Usuario");
        btnCreateUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 37, 37), 1, true));
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        btnEditUser.setBackground(new java.awt.Color(1, 135, 71));
        btnEditUser.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnEditUser.setForeground(new java.awt.Color(204, 204, 204));
        btnEditUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\Matias Altamiranda\\Downloads\\icono\\IconosForLogin\\iloveimg-resized (1)\\usuario-Editar.png")); // NOI18N
        btnEditUser.setText("Editar Usuario");
        btnEditUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 37, 37), 1, true));
        btnEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditUserActionPerformed(evt);
            }
        });

        btnReloadTable.setBackground(new java.awt.Color(1, 135, 71));
        btnReloadTable.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnReloadTable.setForeground(new java.awt.Color(204, 204, 204));
        btnReloadTable.setIcon(new javax.swing.ImageIcon("C:\\Users\\Matias Altamiranda\\Downloads\\icono\\IconosForLogin\\actualizar.png")); // NOI18N
        btnReloadTable.setText("Actualizar Tabla");
        btnReloadTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 37, 37), 1, true));
        btnReloadTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadTableActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(37, 37, 37));
        btnExit.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 204, 204));
        btnExit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Matias Altamiranda\\Downloads\\icono\\IconosForLogin\\salir.png")); // NOI18N
        btnExit.setText("Salir");
        btnExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(1, 135, 71), 1, true));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Usuario : ");

        lblUser.setBackground(new java.awt.Color(37, 37, 37));
        lblUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(1, 135, 71));
        lblUser.setText("Administrador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCreateUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReloadTable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1)
                                .addGap(669, 669, 669)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUser)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblUser))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReloadTable, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.lblUser.setText(isUser.getUserName());
        reloadTable();
    }//GEN-LAST:event_formWindowOpened

    private void reloadTable() {
        DefaultTableModel tabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"#", "Usuario", "Rol", "Descripcion Rol"};
        tabla.setColumnIdentifiers(titulos);

        List<User> userList = control.getUsers();

        if (userList != null) {
            for (User usr : userList) {

                Object[] objeto = {usr.getId(), usr.getUserName(), usr.getUnRol().getTipoRol(), usr.getUnRol().getDescripcion()};
                tabla.addRow(objeto);
            }
            tableUsers.setModel(tabla);

        }
    }


    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnReloadTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadTableActionPerformed
        reloadTable();
    }//GEN-LAST:event_btnReloadTableActionPerformed

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        CreateUser screenCreate = new CreateUser(control);
        screenCreate.setVisible(true);
        screenCreate.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        if (tableUsers.getRowCount() > 0) {
            if (tableUsers.getSelectedRow() != -1) {
                int userId = Integer.parseInt(String.valueOf(tableUsers.getValueAt(tableUsers.getSelectedRow(), 0)));
                control.deleteUser(userId);
                mostrarMensaje("Elemento borrado con exito", "info", "Eliminado");
                reloadTable();
            } else {
                mostrarMensaje("No se selecciono un elemento", "error", "Atención");
            }

        } else {
            mostrarMensaje("Tabla vacia", "error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditUserActionPerformed
       if (tableUsers.getRowCount() > 0) {
            if (tableUsers.getSelectedRow() != -1) {
                int userId = Integer.parseInt(String.valueOf(tableUsers.getValueAt(tableUsers.getSelectedRow(), 0)));
                
                EditUser screenEdit = new EditUser(control,userId);
                screenEdit.setVisible(true);
                screenEdit.setLocationRelativeTo(null);
               
            } else {
                mostrarMensaje("No se selecciono un elemento", "error", "Atención");
            }

        } else {
            mostrarMensaje("Tabla vacia", "error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEditUserActionPerformed

    public void mostrarMensaje(String cuerpo, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(cuerpo);
        if (tipo.equals("info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnEditUser;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReloadTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTable tableUsers;
    // End of variables declaration//GEN-END:variables
}
