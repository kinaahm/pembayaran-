/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Smktelkom
 */
public class frametugas1 extends javax.swing.JFrame {

    /**
     * Creates new form frametugas1
     */
    public frametugas1() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hb1 = new javax.swing.JTextField();
        hb2 = new javax.swing.JTextField();
        hb3 = new javax.swing.JTextField();
        tfdiskon = new javax.swing.JTextField();
        buttonhasil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tahasil = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("PEMBAYARAN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 0, 140, 40);

        jLabel2.setText("Harga Barang 1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 50, 90, 30);

        jLabel3.setText("Harga Barang 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 100, 100, 14);

        jLabel4.setText("Harga Barang 3");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 140, 80, 14);

        jLabel5.setText("Diskon");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 180, 34, 14);
        getContentPane().add(hb1);
        hb1.setBounds(150, 50, 240, 30);

        hb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hb2ActionPerformed(evt);
            }
        });
        getContentPane().add(hb2);
        hb2.setBounds(150, 90, 240, 30);
        getContentPane().add(hb3);
        hb3.setBounds(150, 130, 240, 30);
        getContentPane().add(tfdiskon);
        tfdiskon.setBounds(150, 170, 240, 30);

        buttonhasil.setText("PROSES");
        buttonhasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonhasilActionPerformed(evt);
            }
        });
        getContentPane().add(buttonhasil);
        buttonhasil.setBounds(150, 220, 110, 23);

        tahasil.setColumns(20);
        tahasil.setRows(5);
        jScrollPane1.setViewportView(tahasil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 280, 330, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hb2ActionPerformed

    private void buttonhasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonhasilActionPerformed
        int h1 = Integer.parseInt(hb1.getText());
        int h2 = Integer.parseInt(hb2.getText());
        int h3 = Integer.parseInt(hb3.getText());
        int totalharga = h1+h2+h3;
        int diskon = Integer.parseInt(tfdiskon.getText());
        int total = totalharga/100*diskon;
        
         tahasil.setText("Harga Barang 1\t= "+h1+"\nHarga Barang 2\t= "+h2+"\nHarga Barang 3\t= "+h3+"\nTotal Harga\t="+totalharga+"\nDiskon\t= "+diskon+"\nTotal\t="+total);
    }//GEN-LAST:event_buttonhasilActionPerformed

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
            java.util.logging.Logger.getLogger(frametugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frametugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frametugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frametugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frametugas1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonhasil;
    private javax.swing.JTextField hb1;
    private javax.swing.JTextField hb2;
    private javax.swing.JTextField hb3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tahasil;
    private javax.swing.JTextField tfdiskon;
    // End of variables declaration//GEN-END:variables
}
