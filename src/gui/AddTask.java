
package gui;

public class AddTask extends javax.swing.JFrame {

   
    public AddTask() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setForeground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(120, 40, 350, 24);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Title:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 40, 41, 16);

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 80, 350, 110);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Description:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 80, 70, 16);

        jXDatePicker1.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jXDatePicker1);
        jXDatePicker1.setBounds(120, 210, 139, 24);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Due Date:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 210, 60, 16);

        jSlider1.setBackground(new java.awt.Color(153, 153, 153));
        jSlider1.setForeground(new java.awt.Color(0, 0, 0));
        jSlider1.setMaximum(10);
        jSlider1.setMinimum(1);
        getContentPane().add(jSlider1);
        jSlider1.setBounds(120, 270, 220, 20);

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Weight:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 270, 50, 16);

        jComboBox1.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(120, 310, 65, 26);

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tags:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 306, 60, 30);

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Create New Tag:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(240, 310, 100, 16);

        jTextField2.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(350, 310, 120, 24);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Cancel");
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 350, 69, 32);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setText("Submit");
        getContentPane().add(jButton2);
        jButton2.setBounds(410, 350, 70, 32);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        backgroundLabel.setText("jLabel1");
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 500, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddTask().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    // End of variables declaration//GEN-END:variables
}
