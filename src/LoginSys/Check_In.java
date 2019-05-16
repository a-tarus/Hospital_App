package LoginSys;

public class Check_In extends javax.swing.JFrame {
    public Check_In() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PatientFirstName = new javax.swing.JTextField();
        PatientsLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        InsuranceName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DateofApp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Check-In");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel1.setText("CHECK-IN`S");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(93, 11, 215, 41);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Patient`s Firstname");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(14, 89, 150, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Patient`s Lastname");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(14, 122, 149, 22);

        PatientFirstName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PatientFirstName.setToolTipText("Patient`s First Name");
        PatientFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientFirstNameActionPerformed(evt);
            }
        });
        jPanel1.add(PatientFirstName);
        PatientFirstName.setBounds(222, 88, 165, 23);

        PatientsLastName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PatientsLastName.setToolTipText("Patient`s Last Name ");
        PatientsLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientsLastNameActionPerformed(evt);
            }
        });
        jPanel1.add(PatientsLastName);
        PatientsLastName.setBounds(222, 122, 165, 23);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Insurance Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(14, 156, 126, 22);

        InsuranceName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        InsuranceName.setToolTipText("Insurance Name");
        InsuranceName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsuranceNameActionPerformed(evt);
            }
        });
        jPanel1.add(InsuranceName);
        InsuranceName.setBounds(222, 156, 165, 22);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Date of Appointment ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(14, 189, 170, 22);

        DateofApp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DateofApp.setToolTipText("Date Of Appointment");
        DateofApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateofAppActionPerformed(evt);
            }
        });
        jPanel1.add(DateofApp);
        DateofApp.setBounds(222, 189, 165, 22);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("CHECK-IN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 240, 123, 31);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(310, 240, 90, 31);

        ResetButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ResetButton.setText("RESET");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ResetButton);
        ResetButton.setBounds(190, 240, 90, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PatientsLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientsLastNameActionPerformed
    }//GEN-LAST:event_PatientsLastNameActionPerformed

    private void PatientFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientFirstNameActionPerformed
    }//GEN-LAST:event_PatientFirstNameActionPerformed

    private void DateofAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateofAppActionPerformed
    }//GEN-LAST:event_DateofAppActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Application Info = new Application();
            Info.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        PatientFirstName.setText(null);
        PatientsLastName.setText(null);
        InsuranceName.setText(null);
        DateofApp.setText(null);
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void InsuranceNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsuranceNameActionPerformed
    }//GEN-LAST:event_InsuranceNameActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Check_In().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DateofApp;
    private javax.swing.JTextField InsuranceName;
    private javax.swing.JTextField PatientFirstName;
    private javax.swing.JTextField PatientsLastName;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}