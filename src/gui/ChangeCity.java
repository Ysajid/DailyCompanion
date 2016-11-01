
package gui;


public class ChangeCity extends javax.swing.JFrame {
    public static String cityName = "Dhaka";
    public ChangeCity() {
        //setVisible(true);
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200,200);
        //String cityName = "Dhaka";
        cityName = cityInput.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cityInput = new javax.swing.JTextField();
        enterCity = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        cityInput.setBackground(new java.awt.Color(204, 204, 255));
        cityInput.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(cityInput);
        cityInput.setBounds(40, 80, 300, 24);

        enterCity.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        enterCity.setForeground(new java.awt.Color(0, 0, 0));
        enterCity.setText("   Enter City Name:");
        getContentPane().add(enterCity);
        enterCity.setBounds(60, 30, 260, 40);

        submit.setBackground(new java.awt.Color(255, 255, 255));
        submit.setForeground(new java.awt.Color(204, 204, 255));
        submit.setText("Submit");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(260, 120, 70, 32);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        backgroundLabel.setText("jLabel1");
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 390, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        setVisible(false);
    }//GEN-LAST:event_submitMouseClicked

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangeCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeCity().setVisible(true);
            }
        });
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JTextField cityInput;
    private javax.swing.JLabel enterCity;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
