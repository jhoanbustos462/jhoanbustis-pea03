/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;






import java.awt.List;
import java.awt.event.ActionEvent;
import static java.nio.file.Files.delete;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import logica.Conexion;
import logica.Servicio;
import model.Multa;
import model.Respuesta;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author diego
 */
public class Registro extends javax.swing.JFrame {

    ArrayList<Multa> lstMultas = new ArrayList<>();
    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        initComponents2();
        Servicio servicio = new Servicio();
        lstMultas = servicio.getMultas();
        if(lstMultas == null) {
            System.err.println("La lista es null");
        } else {
            System.err.println("LISTA: "+lstMultas.size());
        }
        llenarTabla();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbTipos = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMultas = new javax.swing.JTable();
        btnBorrar = new javax.swing.JButton();
        btnReporte1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPunto = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        lbDniError = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DNI");

        jLabel2.setText("Tipo");

        cmbTipos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "::: Selec. Multa :::", "Alta velocidad", "Luz roja", "Mal estacionado", "Pico placa" }));

        jLabel3.setText("Monto");

        jLabel4.setText("Correo");

        tbMultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "DNI", "Multa", "Monto", "Correo", "Puntos", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbMultas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbMultas);

        btnBorrar.setText("Borrar");
        btnBorrar.setEnabled(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnReporte1.setText("Reporte");
        btnReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Punto");

        btnRefresh.setText("Refrescar");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.setEnabled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lbDniError.setForeground(new java.awt.Color(255, 51, 51));

        jLabel6.setText("fecha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnReporte1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnRegistrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBorrar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(txtMonto, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(lbDniError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbTipos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCorreo))
                                    .addComponent(btnRefresh)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(170, 170, 170))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmbTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(lbDniError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar)
                    .addComponent(btnReporte1)
                    .addComponent(btnRefresh)
                    .addComponent(btnRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initComponents2() {
        txtDNI.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
              warn();
            }
            public void removeUpdate(DocumentEvent e) {
              warn();
            }
            public void insertUpdate(DocumentEvent e) {
              warn();
            }

            public void warn() {
                String dni = txtDNI.getText();
                btnRegistrar.setEnabled(false);
                if(dni.length() == 0) {
                    lbDniError.setText(null);
                    return;
                }
                if(!dni.matches("[0-9]+")) {
                    lbDniError.setText("El número de DNI es incorrecto.");
                    return;
                } else {
                    lbDniError.setText(null);
                }
                if(dni.length() != 8) {
                    lbDniError.setText("El número de DNI tiene que ser 8 caracteres.");
                    return;
                } else {
                    lbDniError.setText(null);
                }
                btnRegistrar.setEnabled(true);
            }
        });
    }
    
    int idMultaModif = 0;
    
    private void setearDatos() {
        String dni    = tbMultas.getModel().getValueAt(tbMultas.getSelectedRow(), 1  )+"";
        String multa  = tbMultas.getModel().getValueAt(tbMultas.getSelectedRow(), 2  )+"";
        String monto  = tbMultas.getModel().getValueAt(tbMultas.getSelectedRow(), 3 )+"";
        String correo = tbMultas.getModel().getValueAt(tbMultas.getSelectedRow(), 4  )+"";
        String punto  = tbMultas.getModel().getValueAt(tbMultas.getSelectedRow(), 5  )+"";
        String idMulta = tbMultas.getModel().getValueAt(tbMultas.getSelectedRow(), 6  )+"";
        System.err.println(dni+" - "+multa+" - "+monto+" - "+correo+" - "+punto+" - "+idMulta);
        idMultaModif = Integer.parseInt(idMulta);
        txtDNI.setText(dni);
        txtDNI.setEnabled(false);
        cmbTipos.setSelectedItem(multa);
        txtMonto.setText(monto);
        txtCorreo.setText(correo);
        txtPunto.setText(punto);
        btnRegistrar.setText("Actualizar");
        btnBorrar.setEnabled(true);
    }
    
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "¿Estas seguro de borrar la muta?", "Warning", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            Servicio servicio = new Servicio();
            Respuesta rpta = new Respuesta();
            rpta = servicio.borrarMulta(idMultaModif);
            System.err.println(rpta.toString());
            if(rpta.getCodigo() == 0) {
                for(Multa m : lstMultas) {
                    if(m.getIdMulta() == idMultaModif) {
                        lstMultas.remove(m);
                        break;
                    }
                }
                limpiarForm();
                llenarTabla();
            }
            JOptionPane.showMessageDialog(this, rpta.getMsj());
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        Servicio servicio = new Servicio();
        lstMultas = servicio.getMultas();
        llenarTabla();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        try {
            String dni = txtDNI.getText();
            if(!dni.matches("[0-9]+")) {
                lbDniError.setText("El número de DNI es incorrecto.");
                return;
            }
            if(dni.length() != 8) {
                lbDniError.setText("El número de DNI tiene que ser 8 caracteres.");
                return;
            }
            String multa  = cmbTipos.getSelectedItem().toString();
            String montoTexto = txtMonto.getText();
            // validar
            
            String correo = txtCorreo.getText();
            int punto     = Integer.parseInt(txtPunto.getText());
            String fecha  = txtFecha.getText();
            //validarCampos();
            Date fechaMulta = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);  
            Double monto  = Double.parseDouble(montoTexto);
            
            Multa objMulta = new Multa();
            objMulta.setDni(dni);
            objMulta.setMulta(multa);
            objMulta.setMonto(monto);
            objMulta.setCorreo(correo);
            objMulta.setPunto(punto);
            objMulta.setFecha((java.sql.Date) fechaMulta);

            Servicio servicio = new Servicio();
            Respuesta rpta = new Respuesta();
            if(idMultaModif == 0) {
                rpta = servicio.insertarMulta(objMulta);
            } else {
                objMulta.setIdMulta(idMultaModif);
                rpta = servicio.actualizarMulta(objMulta);
            }
            System.err.println(rpta.toString());
            if(rpta.getCodigo() == 0) {
                if(idMultaModif == 0) {
                    lstMultas.add(objMulta);
                } else {
                    for(Multa m : lstMultas) {
                        if(m.getIdMulta() == objMulta.getIdMulta()) {
                            m.setCorreo(correo);
                            m.setMonto(monto);
                            m.setMulta(multa);
                            m.setPunto(punto);
                            break;
                        }
                    }
                }
                limpiarForm();
                llenarTabla();
            }
            JOptionPane.showMessageDialog(this, rpta.getMsj());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte1ActionPerformed
        // TODO add your handling code here:
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(Registro.class.getResource("../reportes/PieChart.jasper"));
//            Map parametros = new HashMap<String, Object>();
//            parametros.put("PRECIO", 1200);
//            parametros.put("PRECIO2", 3300);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, Conexion.startConeccion());
            JasperViewer jv = new JasperViewer(jp);
            jv.show();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnReporte1ActionPerformed

    private void limpiarForm() {
        txtDNI.setText(null);
        cmbTipos.setSelectedIndex(0);
        txtMonto.setText(null);
        txtCorreo.setText(null);
        txtPunto.setText(null);
        btnRegistrar.setText("Registrar");
        txtDNI.setEnabled(true);
    }
    
    private void llenarTabla() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"#", "DNI", "Multa", "Monto", "Correo", "Punto", "Id"}, 0);
        
//        DefaultTableModel model = (DefaultTableModel) tbMultas.getModel();
//        model.setNumRows(0);
        int i = 1;
        for(Multa m : lstMultas) {
            model.addRow(new Object[]{i, m.getDni(), m.getMulta(), m.getMonto(), m.getCorreo(), m.getPunto(), m.getIdMulta()});
            i++;
        }
        tbMultas = new JTable(model);
        tbMultas.removeColumn(tbMultas.getColumnModel().getColumn(6));
        ListSelectionListener lel = new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                if(!event.getValueIsAdjusting()) {
                    setearDatos();
                }
            }
        };
        tbMultas.getSelectionModel().addListSelectionListener(lel);
        jScrollPane1.setViewportView(tbMultas);
    }
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnReporte1;
    private javax.swing.JComboBox<String> cmbTipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDniError;
    private javax.swing.JTable tbMultas;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtPunto;
    // End of variables declaration//GEN-END:variables
}
