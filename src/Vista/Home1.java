/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Modelo.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ESTACION 4
 */
public class Home1 extends javax.swing.JFrame {
static int muestras =0;
    /**
     * Creates new form Form
     */
    public Home1() throws SQLException {
        initComponents();
         llamarMuestra();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator9 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnHomeIzq = new javax.swing.JButton();
        btnConfiguracionIzq = new javax.swing.JButton();
        btnHerramientasIzq = new javax.swing.JButton();
        btnUsuariosIzq = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrincipal = tablaPrincipal = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        ;
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 1808, 13));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/Logo_Dashboard.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 274, 79));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 53, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(1795, 610));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHomeIzq.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnHomeIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/iconos/Home.jpg"))); // NOI18N
        btnHomeIzq.setText("Mi Tablero");
        btnHomeIzq.setAlignmentY(0.0F);
        btnHomeIzq.setContentAreaFilled(false);
        btnHomeIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeIzqActionPerformed(evt);
            }
        });
        jPanel2.add(btnHomeIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 28, -1, -1));

        btnConfiguracionIzq.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnConfiguracionIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/iconos/Config.jpg"))); // NOI18N
        btnConfiguracionIzq.setText("Configuracion");
        btnConfiguracionIzq.setBorderPainted(false);
        btnConfiguracionIzq.setContentAreaFilled(false);
        btnConfiguracionIzq.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(btnConfiguracionIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 108, -1, -1));

        btnHerramientasIzq.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnHerramientasIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/iconos/Herramientas_1.jpg"))); // NOI18N
        btnHerramientasIzq.setText("Herramientas");
        btnHerramientasIzq.setBorderPainted(false);
        btnHerramientasIzq.setContentAreaFilled(false);
        jPanel2.add(btnHerramientasIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 190, -1, -1));

        btnUsuariosIzq.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUsuariosIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/iconos/Usuarios.jpg"))); // NOI18N
        btnUsuariosIzq.setText("Usuarios");
        btnUsuariosIzq.setBorderPainted(false);
        btnUsuariosIzq.setContentAreaFilled(false);
        jPanel2.add(btnUsuariosIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 281, -1, -1));

        jPanel1.setBackground(new java.awt.Color(235, 235, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPrincipalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tablaPrincipalMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPrincipal);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1438, 610));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1440, 610));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("DataLabs 0.0.1");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 443, -1, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 91, 261, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 261, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 172, 261, 11));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 253, 261, 10));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 333, 261, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 227, 1720, 610));

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 850, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/salirdark.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1790, 40, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/Wallpaper.jpg"))); // NOI18N
        jLabel3.setFocusable(false);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1932, 1056));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/userdark.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1597, 60, 48, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Usuario");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 86, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            try {
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
        Loginusuario login = new Loginusuario();
        login.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        try {
            Muestras Muestras = new Muestras();
            Muestras.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home1.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnHomeIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeIzqActionPerformed
        Home Home = new Home();
        Home.setVisible(true);
    }//GEN-LAST:event_btnHomeIzqActionPerformed

    private void tablaPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPrincipalMouseEntered
   try {
            llamarMuestra();
            
        } catch (SQLException ex) {
            Logger.getLogger(Muestras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablaPrincipalMouseEntered

    private void tablaPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPrincipalMouseClicked
         DefaultTableModel modelo = (DefaultTableModel)tablaPrincipal.getModel();
     int selectRowIndex = tablaPrincipal.getSelectedRow();
        codigobarras.muestras = (int) modelo.getValueAt(selectRowIndex, 1);
        
        codigobarras codigobarras = new codigobarras();
        codigobarras.setVisible(true);
    }//GEN-LAST:event_tablaPrincipalMouseClicked

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
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Home1().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Home1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
  public void llamarMuestra() throws SQLException{
                    conectar cc= new conectar();
                    Connection cn= cc.conexion();
                DefaultTableModel modelo  = new DefaultTableModel();
                JTable tabla = new JTable(modelo);
                String query = ("SELECT m.idMuestras,m.nregistro, c.nombre, ma.nombre ,m.identificacion , m.fechaMuestreo , m.fechaIngreso,l.nombre, m.nsota, m.observaciones \n" +
                                "FROM muestras m \n" +
                                "INNER JOIN laboratorios l \n" +
                                "	ON m.fk_laboratorios = l.idLaboratorios\n" +
                                "INNER JOIN matrices ma\n" +
                                "	ON m.fk_matrices = ma.id_matrices\n" +
                                "INNER JOIN clientes c\n" +
                                "	ON ma.fk_clientes = c.idClientes");
                PreparedStatement pst = cn.prepareStatement(query);
                ResultSet ResultSet = pst.executeQuery();
                modelo.setColumnIdentifiers(new Object[]{"Id Muestra","Numero Registro","Cliente", "Matriz", "Identificacion", "Fecha Muestreo", "Ingreso Laboratorio", "Analisis Solicitado",
                    "Laboratorio Ejecutante", "Numero Sota","observaciones"});
                System.out.println("INGRESO");
                try {
                    while(ResultSet.next()){
                            int a = ResultSet.getInt("idMuestras");
                            
                        modelo.addRow(new Object[]{ResultSet.getInt("idMuestras"),ResultSet.getInt("nregistro"), ResultSet.getString("c.nombre"), ResultSet.getString("ma.nombre"),ResultSet.getString("identificacion"),ResultSet.getDate("fechaMuestreo"),ResultSet.getDate("fechaIngreso"),Listaanalisis(a),
                            ResultSet.getString("l.nombre"),ResultSet.getInt("nsota"),ResultSet.getString("observaciones")});
                       }
                        tablaPrincipal.setModel(modelo );
                        tablaPrincipal.getColumnModel().getColumn(0).setMaxWidth(0);
                        tablaPrincipal.getColumnModel().getColumn(0).setMinWidth(0);
                        tablaPrincipal.getColumnModel().getColumn(0).setPreferredWidth(0);
                    } catch (SQLException e) {
                    System.out.println("error");
     }
}  
    String Listaanalisis(int a) throws SQLException{
      
 
       String c="";
      
       int numero = 56;
                conectar cc= new conectar();
                Connection cn= cc.conexion();
               
                String query = ("SELECT * FROM analisis WHERE fk_idmuestras ='"+a+"'");
             
                PreparedStatement pst = cn.prepareStatement(query);
                ResultSet ResultSet = pst.executeQuery();
             
                try {
                    while(ResultSet.next()){

                        String a1 =  ResultSet.getString("nombre");
                        
                        c = c+""+a1+",";

                        System.out.println(a1);
                        
                       }
                    } catch (SQLException e) {
                    System.out.println("no se pudo");
     
     }
               cn.close();
        return c;
            
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConfiguracionIzq;
    private javax.swing.JButton btnHerramientasIzq;
    private javax.swing.JButton btnHomeIzq;
    private javax.swing.JButton btnUsuariosIzq;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable tablaPrincipal;
    // End of variables declaration//GEN-END:variables
         conectar cc= new conectar();
         Connection cn= cc.conexion();
}