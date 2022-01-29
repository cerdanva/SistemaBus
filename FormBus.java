package Presentacion;

import Datos.BusDaoJDBC;
import Datos.ChoferDaoJDBC;
import Logica.Bus;
import Logica.Chofer;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cerdan Victor.
 */
public class FormBus extends javax.swing.JDialog {

    List<Bus> buses;
    Chofer ch;
    ChoferDaoJDBC chDao=new ChoferDaoJDBC();
    public FormBus(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        initComponents();
        cargarTabla();
        cargarCombox();
        setLocationRelativeTo(parent);
    }

    private void cargarCombox() throws SQLException{
        chDao.cargarCboxChofer(cboxChofer);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPatente = new javax.swing.JLabel();
        txtPatente = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblCapacidad = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBus = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtChofer = new javax.swing.JLabel();
        cboxChofer = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrar Buses");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dar de alta Unidad"));

        lblPatente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatente.setText("Patente");

        txtPatente.setEnabled(false);

        lblModelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblModelo.setText("Modelo");

        txtModelo.setEnabled(false);

        lblCapacidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCapacidad.setText("Capacidad");

        txtCapacidad.setEnabled(false);
        txtCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadActionPerformed(evt);
            }
        });

        btnGuardar.setText("Grabar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tablaBus.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaBus);

        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblId.setText("Id");

        txtId.setEnabled(false);

        txtChofer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtChofer.setText("Chofer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtChofer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPatente, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(lblCapacidad, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(lblModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(txtPatente, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(txtCapacidad, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(cboxChofer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar))
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnModificar)
                    .addComponent(btnActualizar)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(btnEliminar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnGuardar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatente)
                            .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCapacidad)
                            .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChofer)
                    .addComponent(cboxChofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadActionPerformed
       
    }//GEN-LAST:event_txtCapacidadActionPerformed
    private void cargarTabla(){
        DefaultTableModel modelo= new DefaultTableModel();
        BusDaoJDBC busJdbc=new BusDaoJDBC();
        try {
            buses=busJdbc.seleccionar();
            modelo.setColumnIdentifiers(new Object[]{"Id","Patente","Modelo","Capacidad"});
            for (Bus bus:buses){
                modelo.addRow(new Object[]{bus.getIdBus(),bus.getPatente(),bus.getModeloBus(),bus.getCapacidadBus()});
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormBus.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaBus.setModel(modelo);
        tablaBus.setEnabled(false);
        
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String patente=JOptionPane.showInputDialog("Introduce patente del bus a buscar");
        if (patente!=null){
            DefaultTableModel modelo= new DefaultTableModel();
            BusDaoJDBC busJdbc=new BusDaoJDBC();
            Bus bus;
            try {
                bus=busJdbc.buscar(patente);
                if (bus!=null){
                   modelo.setColumnIdentifiers(new Object[]{"Id","Patente","Modelo","Capacidad"});
                   modelo.addRow(new Object[]{bus.getIdBus(),bus.getPatente(),bus.getModeloBus(),bus.getCapacidadBus()});
                   tablaBus.setModel(modelo);
                   tablaBus.setEnabled(false);
                }else{
                   JOptionPane.showMessageDialog(this, "no existe el Bus");
                   modelo.setColumnIdentifiers(new Object[]{"Id","Patente","Modelo","Capacidad"});
                   modelo.addRow(new Object[]{null,null,null,null});
                   tablaBus.setModel(modelo);
                   tablaBus.setEnabled(false);
                                 
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(FormBus.class.getName()).log(Level.SEVERE, null, ex);
            }              
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       if (txtPatente.getText().isEmpty() || txtModelo.getText().isEmpty() || txtCapacidad.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Favor de completar los campos vacios");
        }else{
            Bus bus= new Bus();
            bus.setPatente(txtPatente.getText());
            bus.setModeloBus(txtModelo.getText());
            bus.setCapacidadBus(Integer.parseInt(txtCapacidad.getText()));
                        
            BusDaoJDBC busDao=new BusDaoJDBC();
            try {
                busDao.insertar(bus);
                JOptionPane.showMessageDialog(this, "alta realizado");
                this.cargarTabla();
                txtCapacidad.setText("");
                txtModelo.setText("");
                txtPatente.setText("");
                
        
            } catch (SQLException ex) {
                Logger.getLogger(FormPasajero.class.getName()).log(Level.SEVERE, null, ex);
            }

        } 
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtCapacidad.setEnabled(true);
        txtModelo.setEnabled(true);
        txtPatente.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnModificar.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
            String patente=JOptionPane.showInputDialog("Introduce patente del bus a modifcar");
            BusDaoJDBC busDao=new BusDaoJDBC();
            Bus bus;      
        try {
            bus = busDao.buscar(patente);
            if (bus!=null){
                busDao.eliminar(bus);
                JOptionPane.showMessageDialog(this, "Bus Eliminado");
                this.cargarTabla();
            }else{
                JOptionPane.showMessageDialog(this, "no existe el bus");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FormBus.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtId.setText("");
        txtCapacidad.setText("");
        txtModelo.setText("");
        txtPatente.setText("");
        txtCapacidad.setEnabled(false);
        txtModelo.setEnabled(false);
        txtPatente.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnActualizar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
             String patente=JOptionPane.showInputDialog("Introduce patente del bus a buscar");
        if (patente!=null){
            DefaultTableModel modelo= new DefaultTableModel();
            BusDaoJDBC busJdbc=new BusDaoJDBC();
            Bus bus;
            try {
                bus=busJdbc.buscar(patente);
                if (bus!=null){
                  txtCapacidad.setText(bus.getCapacidadBus()+"");
                  txtModelo.setText(bus.getModeloBus());
                  txtPatente.setText(bus.getPatente());
                  txtId.setText(bus.getIdBus()+"");
                  txtId.setEnabled(false);
                  txtCapacidad.setEnabled(true);
                  txtModelo.setEnabled(true);
                  txtPatente.setEnabled(true);
                  btnModificar.setEnabled(false);
                  btnActualizar.setEnabled(true);
                  btnCancelar.setEnabled(true);
                  btnNuevo.setEnabled(false);
                }else{
                   JOptionPane.showMessageDialog(this, "no existe el Bus");
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(FormBus.class.getName()).log(Level.SEVERE, null, ex);
            }              
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
            if (txtPatente.getText().isEmpty() || txtModelo.getText().isEmpty() || txtCapacidad.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Favor de completar los campos vacios");
        }else{
            Bus bus= new Bus();
            bus.setPatente(txtPatente.getText());
            bus.setModeloBus(txtModelo.getText());
            bus.setCapacidadBus(Integer.parseInt(txtCapacidad.getText()));
            bus.setIdBus(Integer.parseInt(txtId.getText()));
                        
            BusDaoJDBC busDao=new BusDaoJDBC();
            try {
                busDao.actualizar(bus);
                JOptionPane.showMessageDialog(this, "Bus Actualizado");
                this.cargarTabla();
                txtCapacidad.setText("");
                txtModelo.setText("");
                txtPatente.setText("");
                txtId.setText("");
                btnActualizar.setEnabled(false);
                btnModificar.setEnabled(true);
                btnNuevo.setEnabled(true);
                btnCancelar.setEnabled(false);
            } catch (SQLException ex) {
                Logger.getLogger(FormPasajero.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboxChofer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCapacidad;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPatente;
    private javax.swing.JTable tablaBus;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JLabel txtChofer;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables
}
