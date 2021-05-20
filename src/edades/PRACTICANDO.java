/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edades;

import static edades.EDADES.main;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PRACTICANDO extends javax.swing.JFrame {

    /**
     * Creates new form PRACTICANDO
     */
    public PRACTICANDO() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        TXTMARIO = new java.awt.TextField();
        button1 = new java.awt.Button();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        TXTJUAN = new java.awt.TextField();
        TXTMARIA = new java.awt.TextField();
        TXTRESULTADO = new java.awt.TextArea();
        button2 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\correcto-removebg-preview.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 210));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\correcto.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 110, 90));

        label1.setText("MARIO");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));
        getContentPane().add(TXTMARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 40, -1));

        button1.setLabel("EJECUTAR");
        button1.setName(""); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        label2.setText("JUAN");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        label3.setText("MARIA");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));
        getContentPane().add(TXTJUAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 40, -1));
        getContentPane().add(TXTMARIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 40, -1));
        getContentPane().add(TXTRESULTADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 200, 90));

        button2.setLabel("LIMPIAR");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
int edad1,edad2,edad3;
       edad1=Integer.parseInt(TXTJUAN.getText());
      
       edad2=Integer.parseInt(TXTMARIA.getText());
       edad3=Integer.parseInt(TXTMARIO.getText());
       
       if (edad1 >=18 && edad1<=100  && edad2 >=18 && edad2<=100 && edad3>=18 && edad3<=100){
           
            if (edad1 == edad2 && edad2 == edad3){
           TXTRESULTADO.setText("LOS TRES TIENEN LA MISMA EDAD");
            
           
       }else if (edad1 > edad2 && edad1 > edad3){
           TXTRESULTADO.setText("JUAN TIENE.." + edad1 +  "..AÑOS Y ES MAYOR QUE MARIA Y MARIO");
           
           
       }
       else if (edad2 > edad1 && edad2 > edad3){
             TXTRESULTADO.setText( "MARIA TIENE.." + edad2 +  "..AÑOS Y ES MAYOR QUE JUAN Y MARIO");
           
       }
       else{
            TXTRESULTADO.setText( "MARIO TIENE.." + edad3 +  "..AÑOS Y ES MAYOR QUE JUAN Y MARIA");
         
       }       
           }
       else{
           TXTRESULTADO.setText("INGRESE NUEVAS EDADES MAYORES A 17");
            
          
       } 
       
       
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
TXTJUAN.setText(""); 
TXTMARIA.setText("");
TXTMARIO.setText("");
TXTRESULTADO.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed

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
            java.util.logging.Logger.getLogger(PRACTICANDO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRACTICANDO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRACTICANDO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRACTICANDO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRACTICANDO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField TXTJUAN;
    private java.awt.TextField TXTMARIA;
    private java.awt.TextField TXTMARIO;
    private java.awt.TextArea TXTRESULTADO;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    // End of variables declaration//GEN-END:variables
}
