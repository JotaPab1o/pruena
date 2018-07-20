/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Modelo.conectar;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTACION 4
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Form
     */
    public Home() {
        initComponents();
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
        btnRecepcionmuestra = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnInstrumentos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 110, 1808, 13));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/Logo_Dashboard.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 142, 274, 79));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 53, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1795, 790));
        jPanel2.setVerifyInputWhenFocusTarget(false);
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
        jPanel2.add(btnHomeIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 28, -1, -1));

        btnConfiguracionIzq.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnConfiguracionIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/iconos/Config.jpg"))); // NOI18N
        btnConfiguracionIzq.setText("Configuracion");
        btnConfiguracionIzq.setBorderPainted(false);
        btnConfiguracionIzq.setContentAreaFilled(false);
        btnConfiguracionIzq.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(btnConfiguracionIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 108, -1, -1));

        btnHerramientasIzq.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnHerramientasIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/iconos/Herramientas_1.jpg"))); // NOI18N
        btnHerramientasIzq.setText("Herramientas");
        btnHerramientasIzq.setBorderPainted(false);
        btnHerramientasIzq.setContentAreaFilled(false);
        jPanel2.add(btnHerramientasIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 190, -1, -1));

        btnUsuariosIzq.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUsuariosIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/iconos/Usuarios.jpg"))); // NOI18N
        btnUsuariosIzq.setText("Usuarios");
        btnUsuariosIzq.setBorderPainted(false);
        btnUsuariosIzq.setContentAreaFilled(false);
        jPanel2.add(btnUsuariosIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 281, -1, -1));

        jPanel1.setBackground(new java.awt.Color(235, 235, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRecepcionmuestra.setBackground(new java.awt.Color(255, 255, 255));
        btnRecepcionmuestra.setForeground(new java.awt.Color(255, 255, 255));
        btnRecepcionmuestra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/iconos/RecepcionMuestra.png"))); // NOI18N
        btnRecepcionmuestra.setBorder(null);
        btnRecepcionmuestra.setBorderPainted(false);
        btnRecepcionmuestra.setContentAreaFilled(false);
        btnRecepcionmuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecepcionmuestraActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecepcionmuestra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1479, 7));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 1479, 10));

        btnInstrumentos.setBackground(new java.awt.Color(255, 255, 255));
        btnInstrumentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/iconos/IngresoMuestra.png"))); // NOI18N
        btnInstrumentos.setBorderPainted(false);
        btnInstrumentos.setContentAreaFilled(false);
        btnInstrumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstrumentosActionPerformed(evt);
            }
        });
        jPanel1.add(btnInstrumentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 123, 120));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Libro de muestras");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Ingreso de muestras");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 0, 1500, 610));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("DataLabs 0.0.1");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 443, -1, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 91, 261, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 5, 261, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 172, 261, 11));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 253, 276, 10));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 333, 276, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 239, 1750, 610));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/salirdark.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1779, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/Wallpaper.jpg"))); // NOI18N
        jLabel3.setFocusable(false);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 8, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/userdark.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1585, 60, 48, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Usuario");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1638, 86, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecepcionmuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecepcionmuestraActionPerformed
       //asegura que solo se pueda abrir una vez la ventana al presionar
       //el boton y si se presiona mas de una vez notifica con un mensaje que 
       //la ventana ya esta abierta
           if(Ventanamuestra==false){
               try {
                   Home1 Home1=new Home1();
                   Home1.setVisible(true);
                   Ventanamuestra=true;
               } //termina if
               catch (SQLException ex) {
                   Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           else{
              JOptionPane.showMessageDialog(null,"La ventana MUESTRAS ya esta abierta");
           }
    }//GEN-LAST:event_btnRecepcionmuestraActionPerformed

    private void btnInstrumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstrumentosActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_btnInstrumentosActionPerformed

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

    private void btnHomeIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeIzqActionPerformed
Home Dash = new Home();
Dash.setVisible(true);
    }//GEN-LAST:event_btnHomeIzqActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
public static boolean Ventanamuestra=false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfiguracionIzq;
    private javax.swing.JButton btnHerramientasIzq;
    private javax.swing.JButton btnHomeIzq;
    private javax.swing.JButton btnInstrumentos;
    private javax.swing.JButton btnRecepcionmuestra;
    private javax.swing.JButton btnUsuariosIzq;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
         conectar cc= new conectar();
         Connection cn= cc.conexion();
//    static class lblusu {
//
//        static void setText(String usuario) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        public lblusu() {
//        }
//    }

}
