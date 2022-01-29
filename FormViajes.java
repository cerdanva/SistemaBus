/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.BusDaoJDBC;
import Datos.DestinoDaoJDBC;
import Datos.ProgramViajeDaoJDBC;
import Logica.Bus;
import Logica.Destino;
import Logica.FormatoFecha;
import Logica.ProgramacionViaje;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.*;
import java.time.format.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;



/**
 *
 * @author Cerdan Victor A.
 */
public final class FormViajes extends javax.swing.JDialog {

    DestinoDaoJDBC destinos= new DestinoDaoJDBC();
    BusDaoJDBC bus= new BusDaoJDBC();
    Bus b;
    Destino des;
    FormatoFecha formatFecha=new FormatoFecha();
    List<ProgramacionViaje> viajes;
    public FormViajes(java.awt.Frame parent, boolean modal) throws SQLException, ParseException {
        super(parent, modal);
        initComponents();
        cargarCombox();
        cargarTabla();
        pruebaTxt();
        setLocationRelativeTo(parent);
    }
    public void cargarCombox() throws SQLException{
       destinos.cargarCboxDestino(cboxDestino);
       bus.cargarCboxBus(cboxBus);
    }
    public void pruebaTxt() throws SQLException, ParseException{
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h-mm");
       LocalTime hsCFormato= LocalTime.now();
       MaskFormatter mascara= new MaskFormatter("##:##");
       
       JFormattedTextField mio=new JFormattedTextField(mascara);
       txtPrueba=mio;
       txtPrueba.setToolTipText("Formato hs(00 a 23) hora:minutos");
    }
    private void cargarTabla(){
        DefaultTableModel modelo= new DefaultTableModel();
        ProgramViajeDaoJDBC tablaViaje=new ProgramViajeDaoJDBC();
        try {
            viajes=tablaViaje.seleccionar();
            modelo.setColumnIdentifiers(new Object[]{"IdProgr","IdBus","IdDestino","Origen","Fecha","Hora"});
            for (ProgramacionViaje viaje:viajes){
                modelo.addRow(new Object[]{viaje.getIdProgramacion(),viaje.getIdBus(),viaje.getIdDestino(),viaje.getOrigen(),viaje.getFechaProgram(),viaje.getHsProgram()});
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormBus.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaViajes.setModel(modelo);
        tablaViajes.setEnabled(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIdViaje = new javax.swing.JLabel();
        lblIdBus = new javax.swing.JLabel();
        lblIdDestino = new javax.swing.JLabel();
        lblOrigen = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        txtIdViaje = new javax.swing.JTextField();
        txtOrigen = new javax.swing.JTextField();
        cboxBus = new javax.swing.JComboBox<>();
        cboxDestino = new javax.swing.JComboBox<>();
        lblHs = new javax.swing.JLabel();
        JChFecha = new com.toedter.calendar.JDateChooser();
        txtHs = new com.toedter.components.JSpinField();
        jLabel1 = new javax.swing.JLabel();
        txtMin = new com.toedter.components.JSpinField();
        jLabel2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtPrueba = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaViajes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Programar Viaje Nuevo")));

        lblIdViaje.setText("IdViaje");

        lblIdBus.setText("Bus");

        lblIdDestino.setText("Destino");

        lblOrigen.setText("Origen");

        Fecha.setText("Fecha");

        txtIdViaje.setEditable(false);
        txtIdViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdViajeActionPerformed(evt);
            }
        });

        cboxBus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxBusItemStateChanged(evt);
            }
        });

        cboxDestino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxDestinoItemStateChanged(evt);
            }
        });

        lblHs.setText("Hora de Salida");

        txtHs.setMaximum(23);
        txtHs.setMinimum(0);

        jLabel1.setText("HS");

        txtMin.setMaximum(59);
        txtMin.setMinimum(0);
        txtMin.setName("spinMin"); // NOI18N

        jLabel2.setText("MIN");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIdViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIdBus, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxBus, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIdDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JChFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHs, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHs, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(txtPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdViaje)
                            .addComponent(txtIdViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIdBus)
                        .addComponent(cboxBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdDestino)
                            .addComponent(cboxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOrigen)
                            .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtHs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Fecha)
                                .addGap(18, 18, 18)
                                .addComponent(lblHs))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(JChFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        tablaViajes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaViajes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdViajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdViajeActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtOrigen.getText().isEmpty() || JChFecha.getDate()==null ){
            JOptionPane.showMessageDialog(this, "Favor de completar campo Origen");
        }else{
            ProgramacionViaje viaje= new ProgramacionViaje();
                     
            viaje.setIdBus(b.getIdBus());
            viaje.setIdDestino(des.getIdDestino());
            viaje.setOrigen(txtOrigen.getText());
            //Se convierte la fecha del jChoosser a fecha sql
            viaje.setFechaProgram(formatFecha.JDateADateSql(JChFecha.getDate()));
            //Se convierte hs ingresada con formato
            String hsProgramada= formatFecha.formatHs(txtHs.getValue(),txtMin.getValue());
            viaje.setHsProgram(hsProgramada);
                                   
            ProgramViajeDaoJDBC programViaje=new ProgramViajeDaoJDBC();
            try {
                programViaje.insertar(viaje);
                JOptionPane.showMessageDialog(this, "alta realizado");
                cargarTabla();
                txtOrigen.setText("");
                //txtCiudad.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(FormPasajero.class.getName()).log(Level.SEVERE, null, ex);
            }
            
     } 
      
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cboxBusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxBusItemStateChanged
        b= (Bus)this.cboxBus.getSelectedItem();  
    }//GEN-LAST:event_cboxBusItemStateChanged

    private void cboxDestinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxDestinoItemStateChanged
        des=(Destino)this.cboxDestino.getSelectedItem();
    }//GEN-LAST:event_cboxDestinoItemStateChanged

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fecha;
    private com.toedter.calendar.JDateChooser JChFecha;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cboxBus;
    private javax.swing.JComboBox<String> cboxDestino;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHs;
    private javax.swing.JLabel lblIdBus;
    private javax.swing.JLabel lblIdDestino;
    private javax.swing.JLabel lblIdViaje;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JTable tablaViajes;
    private com.toedter.components.JSpinField txtHs;
    private javax.swing.JTextField txtIdViaje;
    private com.toedter.components.JSpinField txtMin;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JFormattedTextField txtPrueba;
    // End of variables declaration//GEN-END:variables
}
