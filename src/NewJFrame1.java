/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shqia0005
 */
public class NewJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        HAPPYBIRTHDAYLabel1 = new javax.swing.JLabel();
        NameLabel2 = new javax.swing.JLabel();
        BirthdayLabel3 = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        birthdayInput = new javax.swing.JTextField();
        EnterButton1 = new javax.swing.JButton();
        Output = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        EditMenu2 = new javax.swing.JMenu();
        Cut = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.pink);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ObjectProperty.create(), this, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HAPPYBIRTHDAYLabel1.setBackground(new java.awt.Color(255, 204, 204));
        HAPPYBIRTHDAYLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        HAPPYBIRTHDAYLabel1.setForeground(new java.awt.Color(153, 0, 0));
        HAPPYBIRTHDAYLabel1.setText("HAPPY BIRTHDAY");
        getContentPane().add(HAPPYBIRTHDAYLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 103));

        NameLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameLabel2.setForeground(new java.awt.Color(204, 0, 0));
        NameLabel2.setText("Enter Your Name");
        getContentPane().add(NameLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 109, 121, 38));

        BirthdayLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BirthdayLabel3.setForeground(new java.awt.Color(204, 0, 0));
        BirthdayLabel3.setText("Enter Your Birthday");
        getContentPane().add(BirthdayLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 165, -1, 38));

        nameInput.setText("jTextField1");
        nameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputActionPerformed(evt);
            }
        });
        getContentPane().add(nameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 120, 201, -1));
        nameInput.getAccessibleContext().setAccessibleName("");

        birthdayInput.setText("jTextField2");
        getContentPane().add(birthdayInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 176, 201, -1));

        EnterButton1.setLabel("Enter");
        EnterButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(EnterButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        Output.setBackground(new java.awt.Color(204, 255, 255));
        Output.setText("jLabel1");
        getContentPane().add(Output, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 264, 280, 33));

        FileMenu1.setText("File");

        jMenu3.setText("Save");
        FileMenu1.add(jMenu3);

        jMenu4.setText("Save as");
        FileMenu1.add(jMenu4);

        jMenuBar1.add(FileMenu1);

        EditMenu2.setText("Edit");

        Cut.setText("Cut");
        EditMenu2.add(Cut);

        jMenu1.setText("Copy");
        EditMenu2.add(jMenu1);

        jMenu2.setText("Paste");
        EditMenu2.add(jMenu2);

        jMenuBar1.add(EditMenu2);

        setJMenuBar(jMenuBar1);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInputActionPerformed

    private void EnterButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterButton1ActionPerformed
        String name;
        name = nameInput.getText();
        String birthday;
        birthday = birthdayInput.getText();
        
        
        
        Output.setText(name + "'s birthday is on " + birthday);
        
        
        
        
    }//GEN-LAST:event_EnterButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BirthdayLabel3;
    private javax.swing.JMenu Cut;
    private javax.swing.JMenu EditMenu2;
    private javax.swing.JButton EnterButton1;
    private javax.swing.JMenu FileMenu1;
    private javax.swing.JLabel HAPPYBIRTHDAYLabel1;
    private javax.swing.JLabel NameLabel2;
    private javax.swing.JLabel Output;
    private javax.swing.JTextField birthdayInput;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField nameInput;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
