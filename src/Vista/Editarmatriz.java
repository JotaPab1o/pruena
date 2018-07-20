/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.conectar;
import static Vista.Muestras.idMuestras;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ESTACION 4
 */
public final class Editarmatriz extends javax.swing.JFrame {
static String nombrelaboratorio;
static int idlaboratorio =0;
ResultSet ResultSet;
static int idclienteeditar=0;
static int idMatrizeditar=0;
int fila = 0;
String Nommbrefila = "";
static int id =0;
String Nombreanalisis = "";


    /**
     * Creates new form Editarmatriz
     */
    public Editarmatriz() throws SQLException {
        initComponents();
        obtenerDatos();
        CargacomboLaboratorio();
        llenarMatriz();
        llenarAnalisis();
        llenarTabla();
        llenarCliente();
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtregistroeditar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtObservacioneditar = new javax.swing.JTextField();
        txtSotaeditar = new javax.swing.JTextField();
        dateingresoeditar = new com.toedter.calendar.JDateChooser();
        datemuestreoeditar = new com.toedter.calendar.JDateChooser();
        cmbLaboratorioeditar = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbMatrizeditar = new javax.swing.JComboBox<>();
        cmbClienteeditar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEditarAnalisis = tablaEditarAnalisis = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        btnAgregareditar = new javax.swing.JButton();
        btnBorrareditar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cmbAnalisiseditar = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("N° de Registro");

        jLabel4.setText("Fecha de muestreo");

        jLabel2.setText("Fecha de Ingreso");

        jLabel8.setText("Laboratorio");

        jLabel9.setText("N° Sota");

        jLabel7.setText("Observaciones");

        cmbLaboratorioeditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        cmbLaboratorioeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLaboratorioeditarActionPerformed(evt);
            }
        });

        jLabel5.setText("Cliente");

        jLabel6.setText("Matriz");

        cmbMatrizeditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));

        cmbClienteeditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(56, 56, 56)
                        .addComponent(txtObservacioneditar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel9))
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSotaeditar)
                            .addComponent(txtregistroeditar)
                            .addComponent(dateingresoeditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datemuestreoeditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbLaboratorioeditar, 0, 402, Short.MAX_VALUE)
                            .addComponent(cmbMatrizeditar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbClienteeditar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbClienteeditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbMatrizeditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtregistroeditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateingresoeditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(datemuestreoeditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbLaboratorioeditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSotaeditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtObservacioneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        tablaEditarAnalisis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaEditarAnalisis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEditarAnalisisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEditarAnalisis);

        btnAgregareditar.setText("AGREGAR");
        btnAgregareditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregareditarActionPerformed(evt);
            }
        });

        btnBorrareditar.setText("Borrar");
        btnBorrareditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrareditarActionPerformed(evt);
            }
        });

        jLabel11.setText("Analisis");

        cmbAnalisiseditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione..." }));
        cmbAnalisiseditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAnalisiseditarActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBorrareditar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(cmbAnalisiseditar, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregareditar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(968, 968, 968)
                        .addComponent(jButton2)
                        .addGap(22, 22, 22)
                        .addComponent(jButton1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(cmbAnalisiseditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAgregareditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBorrareditar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

       
        
        try {
        guardarMatriz();
        guardarMuestras();
        dispose();
    } catch (SQLException ex) {
        Logger.getLogger(Editarmatriz.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbLaboratorioeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLaboratorioeditarActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_cmbLaboratorioeditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea salir?");

        if(confirmar==JOptionPane.OK_OPTION){

                dispose(); //cierra Jframe
    
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAgregareditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregareditarActionPerformed
        guardarMuestras();

        // insertaranalisis();
        // llenarTabla();
    }//GEN-LAST:event_btnAgregareditarActionPerformed

    private void btnBorrareditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrareditarActionPerformed
          if(validacionSeleccionarfila() ){
         
            JOptionPane.showMessageDialog(this, "Selecciona una fila");
        }
        else{
                System.out.println("fila borrada");
        conectar cc= new conectar();
        Connection cn= cc.conexion();
        String query = ("DELETE FROM analisis WHERE nombre = '"+Nommbrefila+"' AND fk_idmuestras = '"+Muestras.idMuestras+"'");
            try {
                PreparedStatement pst= cn.prepareStatement(query);
           //     pst.setInt(1, row);
            int n = pst.executeUpdate();
            llenarTabla();
            } catch (Exception e) {
                Logger.getLogger(Ingresomatriz11.class.getName()).log(Level.SEVERE, null, e);
            }
            

   //     DELETE FROM analisis 
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrareditarActionPerformed

    private void tablaEditarAnalisisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEditarAnalisisMouseClicked
 obtenerFila();        // TODO add your handling code here:
    }//GEN-LAST:event_tablaEditarAnalisisMouseClicked

    private void cmbAnalisiseditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAnalisiseditarActionPerformed
        Nombreanalisis = (String) cmbAnalisiseditar.getSelectedItem();        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAnalisiseditarActionPerformed

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
            java.util.logging.Logger.getLogger(Editarmatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editarmatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editarmatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editarmatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Editarmatriz().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Editarmatriz.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    
     public void obtenerDatos (){
    
     txtregistroeditar.setText(Integer.toString((Muestras.nregistro)));
     dateingresoeditar.setDate(Muestras.fechaIngreso);
     datemuestreoeditar.setDate(Muestras.fechaMuestreo);
     cmbLaboratorioeditar.getModel().setSelectedItem(String.valueOf(Muestras.fk_laboratorios));
     txtSotaeditar.setText(Integer.toString(Muestras.nsota));
   //  txtInformeloqeditar.setText(Integer.toString(Muestras.informe_loq));
     txtObservacioneditar.setText(Muestras.observaciones);
     cmbClienteeditar.getModel().setSelectedItem(String.valueOf(Muestras.cliente));
     cmbMatrizeditar.getModel().setSelectedItem(String.valueOf(Muestras.matriz));
  
     
 //labelID.setText(Integer.toString(Lista.id_muestrasLoq));
     
 }
    
  void CargacomboLaboratorio(){
                   String cmb= "SELECT * FROM laboratorios";
        try {
            Statement st=cn.createStatement();
            ResultSet set = st.executeQuery(cmb);
            // Bucle while para la consulta
            while (set.next()){
                // rellena el combobox a partir de la consulta
                cmbLaboratorioeditar.addItem(set.getString("nombre"));
            } // cn.close();

        } catch (SQLException e) {
            System.err.println("error consulta");
        } 
  }
  
      private void llenarAnalisis(){
            String cmb= "SELECT * FROM listaanalisis";
        try {
            Statement st=cn.createStatement();
            ResultSet set = st.executeQuery(cmb);
            // Bucle while para la consulta
            while (set.next()){
                // rellena el combobox a partir de la consulta
                cmbAnalisiseditar.addItem(set.getString("nombre"));
            }  //<cn.close();

        } catch (SQLException e) {
            System.err.println("error consulta");
        }   
    }
  private void llenarMatriz() throws SQLException{
            String cmb= "SELECT * FROM listamatrices";
        try {
            Statement st=cn.createStatement();
            ResultSet set = st.executeQuery(cmb);
            // Bucle while para la consulta
            while (set.next()){
                // rellena el combobox a partir de la consulta
                cmbMatrizeditar.addItem(set.getString("nombre"));
            }  //<cn.close();

        } catch (SQLException e) {
            System.err.println("error consulta");
        }
    
    }
  
  
    private void llenarCliente(){
            String cmb= "SELECT * FROM clientes";
        try {
            Statement st=cn.createStatement();
            ResultSet set = st.executeQuery(cmb);
            // Bucle while para la consulta
            while (set.next()){
                // rellena el combobox a partir de la consulta
                cmbClienteeditar.addItem(set.getString("nombre"));
            }  //<cn.close();

        } catch (SQLException e) {
            System.err.println("error consulta");
        }   
    }
  void buscarIDfkLaboratorio(){
    
      conectar cc = new conectar();
Connection cn = cc.conexion();

      nombrelaboratorio = (String) cmbLaboratorioeditar.getSelectedItem();

     String cmb ="SELECT * FROM laboratorios WHERE nombre LIKE '"+nombrelaboratorio+"'";
               
      try {
          Statement st= cn.createStatement();
          ResultSet set = st.executeQuery(cmb);
            while(set.next()){
                idlaboratorio = set.getInt("idLaboratorios");
System.out.println(idlaboratorio);
            }cn.close();
      } catch (Exception e) {
          System.out.println("SIN ID LABORATORIO"+idlaboratorio);
      }
  }
  
  
  
  
  
  
 void guardarMatriz() throws SQLException{
                conectar cc= new conectar();
                Connection cn= cc.conexion();
        buscarCliente();
        buscarMatriz();
        String upd ="UPDATE matrices SET nombre = ?, fk_clientes = '"+idclienteeditar+"' WHERE id_matrices = '"+Muestras.idMatriz+"'";
                 
        try {
         PreparedStatement pst=cn.prepareStatement(upd);
         pst.setString(1, cmbMatrizeditar.getSelectedItem().toString());
         int n= pst.executeUpdate();
                 
        System.out.println("Matriz guardada");
     } catch (Exception e) {
          Logger.getLogger(Editarmatriz.class.getName()).log(Level.SEVERE, null, e);
     }
 } 
 
 
 
 
void guardarMuestras(){
       conectar cc= new conectar();
        Connection cn= cc.conexion();
        buscarIDfkLaboratorio();
        //"UPDATE muestras m INNER JOIN laboratorios l ON m.fk_laboratorios = l.idLaboratorios SET nregistro = ?, fechaingreso= ?, fechaMuestreo= ?, fk_laboratorios=?, nsota=?, informe_loq=?,observaciones=?, WHERE idMuestras = '"+Muestras.idMuestras+"'";
        String sql="UPDATE muestras SET nregistro = ?, fechaIngreso = ?, fechaMuestreo = ?, fk_laboratorios = "+idlaboratorio+", nsota = ?, observaciones = ? WHERE idMuestras ='"+Muestras.idMuestras+"'";
// UPDATE muestras m INNER JOIN laboratorios i ON mfk_labortarios = l.idLaboratorios SET 
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(txtregistroeditar.getText()) );
            pst.setDate(2, new java.sql.Date(dateingresoeditar.getDate().getTime()));
            pst.setDate(3, new java.sql.Date(datemuestreoeditar.getDate().getTime()));
            pst.setInt(4, Integer.parseInt(txtSotaeditar.getText()));
 //           pst.setInt(5, Integer.parseInt(txtInformeloqeditar.getText()));
            pst.setString(5, txtObservacioneditar.getText());
            int n= pst.executeUpdate();
            pst.close();
            JOptionPane.showMessageDialog(null, "Muestra actualizada");

        } catch (SQLException ex) {
            Logger.getLogger(Editarmatriz.class.getName()).log(Level.SEVERE, null, ex);
        }            
}

    void guardarAnalisisEditar(){
    
    conectar cc=new conectar();
    Connection cn=cc.conexion();
    String sql="UPDATE analisis SET nombre = ? WHERE fk_idmuestras = '"+Ingresomatriz11.idMuestra+"'";
    try {
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1,cmbAnalisiseditar.getSelectedItem().toString());
    } catch (Exception e) {
    }
}
    
    
      void llenarTabla() throws SQLException{
     
         
     DefaultTableModel modelo = new DefaultTableModel();
                String query = "SELECT * FROM analisis WHERE fk_idmuestras ='"+Muestras.idMuestras+"'";
                PreparedStatement pst = cn.prepareStatement(query);
                ResultSet  = pst.executeQuery();
                modelo.setColumnIdentifiers(new Object[]{"Analisis"});
                try {
                    while(ResultSet.next()){
                        
                        modelo.addRow(new Object[]{ResultSet.getString("nombre")});
                      
                    }
                    tablaEditarAnalisis.setModel(modelo);
                   
     } catch (Exception e) {
                    System.out.println("error");
     }
       
     }
   
    void buscarCliente() throws SQLException{

        String sql = "SELECT * FROM clientes WHERE nombre LIKE '"+cmbClienteeditar.getSelectedItem()+"'";
        PreparedStatement pst = cn.prepareStatement(sql);
        ResultSet=pst.executeQuery();
               
                try {
                    while(ResultSet.next()){
                        
                       idclienteeditar = Integer.parseInt(ResultSet.getString("idClientes"));
 
                    }
                    
     } catch (Exception e) {
                    System.out.println("error");
     }
       
                
   }
    
    
    void buscarMatriz() throws SQLException{
         
         
        String sql = "SELECT * FROM clientes WHERE nombre LIKE '"+Muestras.cliente+"'";
        PreparedStatement pst = cn.prepareStatement(sql);
        ResultSet=pst.executeQuery();
               
                try {
                    while(ResultSet.next()){
                        
                       idclienteeditar = Integer.parseInt(ResultSet.getString("nregistro"));
 
                    }
                    
     } catch (Exception e) {
                    System.out.println("error");
     }
       
         
         
     }
   
    
                   boolean validacionSeleccionarfila(){
         
         if(Muestras.idMuestras==0){
             
              return true; 
         }else{

            return false;
        }
              }
                   
                       public void obtenerFila(){
        
         DefaultTableModel modelo = (DefaultTableModel)tablaEditarAnalisis.getModel();
            fila = tablaEditarAnalisis.getSelectedRow();
            Nommbrefila = (String) modelo.getValueAt(fila,0);
            System.out.println(Nommbrefila);
    }

  public void insertaranalisis() throws SQLException{
       
            String add="INSERT INTO analisis ( nombre, fk_idmuestras) VALUES ('"+cmbAnalisiseditar.getSelectedItem()+"','"+idMuestras+"')";
            try { 
            PreparedStatement pst = cn.prepareStatement(add);
            int result =pst.executeUpdate(add);
            
      
        } catch (SQLException ex) {
            Logger.getLogger(Ingresomatriz11.class.getName()).log(Level.SEVERE, null, ex);
        
        }
            
            
    }

 
 
  
                       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregareditar;
    private javax.swing.JButton btnBorrareditar;
    private javax.swing.JComboBox<String> cmbAnalisiseditar;
    private javax.swing.JComboBox<String> cmbClienteeditar;
    private javax.swing.JComboBox<String> cmbLaboratorioeditar;
    private javax.swing.JComboBox<String> cmbMatrizeditar;
    private com.toedter.calendar.JDateChooser dateingresoeditar;
    private com.toedter.calendar.JDateChooser datemuestreoeditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEditarAnalisis;
    private javax.swing.JTextField txtObservacioneditar;
    private javax.swing.JTextField txtSotaeditar;
    private javax.swing.JTextField txtregistroeditar;
    // End of variables declaration//GEN-END:variables
conectar cc = new conectar();
Connection cn = cc.conexion();
}
