/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import tasks.Task;

/**
 *
 * @author shiha
 */
public class AddTask extends javax.swing.JFrame {

    Task task;
    /**
     * Creates new form AddTask
     */
    public AddTask() {
       // setSize(200, 200);
        initComponents();
        setSize(520,480);
        
        setPreferredSize(new Dimension(200,200));
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        date = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        weight = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        time_input = new javax.swing.JFormattedTextField();
        reminder = new javax.swing.JCheckBox();
        create_tag = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tags_list = new javax.swing.JList();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        title.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(title);
        title.setBounds(120, 40, 380, 24);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Title:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 40, 41, 20);

        desc.setBackground(new java.awt.Color(255, 255, 255));
        desc.setColumns(20);
        desc.setRows(5);
        jScrollPane1.setViewportView(desc);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 80, 380, 110);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Description:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 80, 70, 30);

        date.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(date);
        date.setBounds(120, 210, 143, 24);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Due Date:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 207, 60, 30);

        weight.setBackground(new java.awt.Color(153, 153, 153));
        weight.setForeground(new java.awt.Color(0, 0, 0));
        weight.setMaximum(10);
        weight.setMinimum(1);
        weight.setValue(1);
        getContentPane().add(weight);
        weight.setBounds(120, 250, 160, 40);

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Weight:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 270, 50, 16);

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tags:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 260, 60, 30);

        cancel.setBackground(new java.awt.Color(204, 204, 204));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(390, 390, 69, 32);

        submit.setBackground(new java.awt.Color(204, 204, 255));
        submit.setText("Submit");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(450, 390, 70, 32);

        time_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_inputActionPerformed(evt);
            }
        });
        getContentPane().add(time_input);
        time_input.setBounds(380, 210, 120, 20);

        reminder.setText("Reminder");
        reminder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reminderActionPerformed(evt);
            }
        });
        getContentPane().add(reminder);
        reminder.setBounds(280, 210, 83, 30);

        create_tag.setText("Create New Tag");
        create_tag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_tagMouseClicked(evt);
            }
        });
        create_tag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_tagActionPerformed(evt);
            }
        });
        getContentPane().add(create_tag);
        create_tag.setBounds(270, 390, 110, 32);

        tags_list.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        tags_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(tags_list);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(380, 260, 120, 120);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        backgroundLabel.setText("jLabel1");
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 520, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void time_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time_inputActionPerformed

    private void reminderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reminderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reminderActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       
        
    }//GEN-LAST:event_submitActionPerformed

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
         
        
        if(!title.getText().equals("")){
            task = new Task(title.getText(), desc.getText(), weight.getValue());
            
            if(!date.getDate().equals("") ) {
                task.setDueDate(date.getDate().toString());
            }
        }
        if(task != null){
            Main.db.addTask(task);
        }
        
        dispose();
    }//GEN-LAST:event_submitMouseClicked

    private void create_tagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_tagMouseClicked
        // TODO add your handling code here:
        NewTag2 tag = new NewTag2();
    }//GEN-LAST:event_create_tagMouseClicked

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
            // TODO add your handling code here:
            dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void create_tagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_tagActionPerformed
        // TODO add your handling code here:
        NewTag2 tag = new NewTag2();
    }//GEN-LAST:event_create_tagActionPerformed

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
            java.util.logging.Logger.getLogger(AddTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTask().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton cancel;
    private javax.swing.JButton create_tag;
    private org.jdesktop.swingx.JXDatePicker date;
    private javax.swing.JTextArea desc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox reminder;
    private javax.swing.JButton submit;
    private javax.swing.JList tags_list;
    private javax.swing.JFormattedTextField time_input;
    private javax.swing.JTextField title;
    private javax.swing.JSlider weight;
    // End of variables declaration//GEN-END:variables
}
