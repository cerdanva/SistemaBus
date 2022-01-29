/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.ClienteDao;
import Logica.Cliente;
import javax.swing.JOptionPane;
import Datos.ClienteDaoJDBC;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cerdan Victor
 */
public class FormPasajero extends javax.swing.JDialog {

    private List<Cliente> clientes;
    
    public FormPasajero(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLlNombre = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLApellido = new javax.swing.JLabel();
        jTextApellido = new javax.swing.JTextField();
        jLDNI = new javax.swing.JLabel();
        jTextDNI = new javax.swing.JTextField();
        jLSexo = new javax.swing.JLabel();
        jRBMasculino = new javax.swing.JRadioButton();
        jRBFemennino = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblPatente2 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnBuscarPasajero = new javax.swing.JButton();
        btnActivarTable = new javax.swing.JToggleButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Datos del Pasajero"));

        jLlNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLlNombre.setText("Nombre");

        jLApellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLApellido.setText("Apellido");

        jTextApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextApellidoActionPerformed(evt);
            }
        });

        jLDNI.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLDNI.setText("DNI");

        jLSexo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLSexo.setText("Sexo");

        buttonGroup2.add(jRBMasculino);
        jRBMasculino.setText("Masculino");

        buttonGroup2.add(jRBFemennino);
        jRBFemennino.setText("Femenino");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblCelular.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCelular.setText("Celular");

        lblemail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblemail.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLlNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jRBMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRBFemennino)))
                                .addGap(11, 11, 11)))
                        .addContainerGap(233, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCelular)
                            .addComponent(lblemail)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLlNombre)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLApellido)
                    .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDNI)
                    .addComponent(jTextDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLSexo))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRBMasculino)
                        .addComponent(jRBFemennino)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCelular)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblemail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 18, Short.MAX_VALUE))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar/Eliminar"));

        lblPatente2.setText("Ingrese DNI ");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "DNI", "Sexo", "Celular", "Email"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        btnBuscarPasajero.setText("Buscar");
        btnBuscarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPasajeroActionPerformed(evt);
            }
        });

        btnActivarTable.setText("Modificar Tabla");
        btnActivarTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarTableActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar Datos");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPatente2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnActivarTable)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatente2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPasajero))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActivarTable)
                    .addComponent(btnActualizar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextApellidoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (jTextApellido.getText().isEmpty() || jTextNombre.getText().isEmpty() || jTextDNI.getText().isEmpty() || txtCelular.getText().isEmpty() || txtEmail.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Favor de completar los campos vacios");

        }else{
            Cliente cliente= new Cliente();
            cliente.setNombreCliente(jTextNombre.getText());
            cliente.setApellidoCliente(jTextApellido.getText());
            cliente.setDniCliente(jTextDNI.getText());
            cliente.setCelularCliente(txtCelular.getText());
            cliente.setEmailCliente(txtEmail.getText());
            if (jRBMasculino.isEnabled()){
                cliente.setSexoCliente("M");
            }
            else{
                cliente.setSexoCliente("F");
            }

            ClienteDao clienteDao=new ClienteDaoJDBC();
            try {
                clienteDao.insertar(cliente);
                JOptionPane.showMessageDialog(this, "alta realizado");
                jTextApellido.setText("");
                jTextNombre.setText("");
                jTextDNI.setText("");
                txtCelular.setText("");
                txtEmail.setText("");
                
            } catch (SQLException ex) {
                Logger.getLogger(FormPasajero.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPasajeroActionPerformed
        try {
            DefaultTableModel modelo= new DefaultTableModel();
            ClienteDao clienteDao=new ClienteDaoJDBC();
            
            this.clientes= clienteDao.buscarPasajero(txtDni.getText());
            
            this.clientes.forEach((pasajero) -> {
                modelo.setColumnIdentifiers(new Object[]{"Id","Nombre","Apellido","DNI","Sexo","Celular","Email"});
                
                modelo.addRow(new Object[]{pasajero.getIdCliente(),pasajero.getNombreCliente(),pasajero.getApellidoCliente(),pasajero.getDniCliente(),pasajero.getSexoCliente(),pasajero.getCelularCliente(),pasajero.getEmailCliente()});
            });
            jTable2.setModel(modelo);
            jTable2.setEnabled(false);
        
        } catch (SQLException ex) {
            Logger.getLogger(FormPasajero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarPasajeroActionPerformed

    private void btnActivarTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarTableActionPerformed
        if (this.btnActivarTable.isSelected()){
            jTable2.setEnabled(true);
        }else{
            jTable2.setEnabled(false);
        }
    
    }//GEN-LAST:event_btnActivarTableActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (btnActivarTable.isSelected()){
           int fila=jTable2.getSelectedRow();
           
           int id=Integer.parseInt(jTable2.getValueAt(fila, 0).toString());
           String nombre=jTable2.getValueAt(fila, 1).toString();
           String apellido=jTable2.getValueAt(fila, 2).toString();
           String dni=jTable2.getValueAt(fila, 3).toString();
           String sexo=jTable2.getValueAt(fila, 4).toString();
           String cel=jTable2.getValueAt(fila, 5).toString();
           String email=jTable2.getValueAt(fila, 6).toString();
           
            System.out.println(id);
            System.out.println(nombre);
            System.out.println(apellido);
            System.out.println(dni);
            System.out.println(sexo);
            System.out.println(cel);
            System.out.println(email);
            Cliente pasajero= new Cliente(id, nombre, apellido, dni, sexo, email, email);
           
           ClienteDaoJDBC cli=new ClienteDaoJDBC();
        try {
            cli.actualizar(pasajero);
            JOptionPane.showMessageDialog(this, "Pasajero actualizado en BD");
            
        } catch (SQLException ex) {
            Logger.getLogger(FormPasajero.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
           
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnActivarTable;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscarPasajero;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLDNI;
    private javax.swing.JLabel jLSexo;
    private javax.swing.JLabel jLlNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRBFemennino;
    private javax.swing.JRadioButton jRBMasculino;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextDNI;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblPatente2;
    private javax.swing.JLabel lblemail;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}