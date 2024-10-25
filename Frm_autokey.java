/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package week_01;

/**
 *
 * @author NITRO-5
 */
public class Frm_autokey extends javax.swing.JFrame {

    /**
     * Creates new form Frm_autokey
     */
    public Frm_autokey() {
        initComponents();
    }
 public static String encryptAutoKey(String text, String key) {
        StringBuilder result = new StringBuilder();
        String extendedKey = key + text; 
        for (int i = 0; i < text.length(); i++) {
            char p = text.charAt(i);
            char k = extendedKey.charAt(i);
            char c = (char) ((p + k - 2 * 'A') % 26 + 'A'); 
            result.append(c); }
        return result.toString();  }

    public static String decryptAutoKey(String cipher, String key) {
        StringBuilder result = new StringBuilder();
        String extendedKey = key;

        for (int i = 0; i < cipher.length(); i++) {
            char c = cipher.charAt(i);
            char k = extendedKey.charAt(i);
            char p = (char) ((c - k + 26) % 26 + 'A'); 
            result.append(p);
            extendedKey += p;
        }
        return result.toString();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_giaima = new javax.swing.JButton();
        btn_mahoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_vanban = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_banma = new javax.swing.JTextArea();
        txt_khoa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_giaima.setText("giải mã");
        btn_giaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_giaimaActionPerformed(evt);
            }
        });

        btn_mahoa.setText("mã hóa");
        btn_mahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mahoaActionPerformed(evt);
            }
        });

        txt_vanban.setColumns(20);
        txt_vanban.setRows(5);
        jScrollPane1.setViewportView(txt_vanban);

        txt_banma.setColumns(20);
        txt_banma.setRows(5);
        jScrollPane2.setViewportView(txt_banma);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Chương trình AuToKey");

        jLabel2.setText("van ban");

        jLabel3.setText("khoa");

        jLabel4.setText("ban ma");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addComponent(txt_khoa)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_mahoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_giaima)
                        .addGap(40, 40, 40)))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_khoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_mahoa)
                    .addComponent(btn_giaima))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_mahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mahoaActionPerformed
        // TODO add your handling code here:
        String plain = txt_vanban.getText().toUpperCase(); 
        String key = txt_khoa.getText().toUpperCase(); 
        String cipher = encryptAutoKey(plain, key);
        txt_banma.setText(cipher);
    }//GEN-LAST:event_btn_mahoaActionPerformed

    private void btn_giaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_giaimaActionPerformed
        // TODO add your handling code here:
        String cipher = txt_banma.getText().toUpperCase(); 
        String key = txt_khoa.getText().toUpperCase(); 
        String plain = decryptAutoKey(cipher, key);
        txt_vanban.setText(plain);
    }//GEN-LAST:event_btn_giaimaActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_autokey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_autokey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_autokey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_autokey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_autokey().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_giaima;
    private javax.swing.JButton btn_mahoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txt_banma;
    private javax.swing.JTextField txt_khoa;
    private javax.swing.JTextArea txt_vanban;
    // End of variables declaration//GEN-END:variables
}
