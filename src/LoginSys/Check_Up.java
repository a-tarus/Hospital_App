package LoginSys;

import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Check_Up extends javax.swing.JFrame {

    public Check_Up() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DoctorsName = new javax.swing.JTextField();
        PatientFirstName = new javax.swing.JTextField();
        PatientLastName = new javax.swing.JTextField();
        TemperatureTxt = new javax.swing.JTextField();
        PulseRateTxt = new javax.swing.JTextField();
        RespirationRateTxt = new javax.swing.JTextField();
        BloodPressureTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtComment = new javax.swing.JTextArea();
        SaveButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 48)); // NOI18N
        jLabel1.setText("CHECK-UP");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Doctor`s Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Patient`s First Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Patient`s Last Name");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Temperature");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Pulse Rate ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Respiration Rate ");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Blood Pressure");

        DoctorsName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DoctorsName.setToolTipText("Doctor`s Name");

        PatientFirstName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PatientFirstName.setToolTipText("Patient`s First Name");

        PatientLastName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PatientLastName.setToolTipText("Patient`s Last Name");
        PatientLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientLastNameActionPerformed(evt);
            }
        });

        TemperatureTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TemperatureTxt.setToolTipText("Temperature");
        TemperatureTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemperatureTxtActionPerformed(evt);
            }
        });

        PulseRateTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PulseRateTxt.setToolTipText("Pulse Rate");

        RespirationRateTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        RespirationRateTxt.setToolTipText("Respiration Rate");

        BloodPressureTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BloodPressureTxt.setToolTipText("Blood Pressure");

        TxtComment.setColumns(20);
        TxtComment.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TxtComment.setRows(5);
        TxtComment.setText("Comments...");
        jScrollPane1.setViewportView(TxtComment);

        SaveButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SaveButton.setText("SAVE");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        ResetButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ResetButton.setText("RESET");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        ExitButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ExitButton.setText("EXIT");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DoctorsName)
                                    .addComponent(BloodPressureTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                    .addComponent(RespirationRateTxt)
                                    .addComponent(PulseRateTxt)
                                    .addComponent(TemperatureTxt)
                                    .addComponent(PatientLastName)
                                    .addComponent(PatientFirstName)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(SaveButton)
                        .addGap(57, 57, 57)
                        .addComponent(ResetButton)
                        .addGap(49, 49, 49)
                        .addComponent(ExitButton)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DoctorsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PatientFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PatientLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TemperatureTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PulseRateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(RespirationRateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(BloodPressureTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(ResetButton)
                    .addComponent(ExitButton))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PatientLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientLastNameActionPerformed

    private void TemperatureTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemperatureTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TemperatureTxtActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        String Doc = DoctorsName.getText().toString();
        String First = PatientFirstName.getText().toString();
        String Last = PatientLastName.getText().toString();
        String Temperature = TemperatureTxt.getText().toString();
        String Pulse = PulseRateTxt.getText().toString();
        String Respiration = RespirationRateTxt.getText().toString();
        String Blood = BloodPressureTxt.getText().toString();
        String Comment = TxtComment.getText().toString();
        
        
        try {
            
            FileWriter writer = new FileWriter("Check-Up.txt", true);
                writer.write(Doc);
                writer.write(System.getProperty("line.separator"));
                writer.write(First);
                writer.write(System.getProperty("line.separator"));
                writer.write(Last);
                writer.write(System.getProperty("line.separator"));
                writer.write(Temperature);
                writer.write(System.getProperty("line.separator"));
                writer.write(Pulse);
                writer.write(System.getProperty("line.separator"));
                writer.write(Respiration);
                writer.write(System.getProperty("line.separator"));
                writer.write(Blood);
                writer.write(System.getProperty("line.separator"));
                writer.write(Comment);
                writer.write(System.getProperty("line.separator"));
                writer.close();
                JOptionPane.showMessageDialog(rootPane, "Saved");
                                
        }
        catch   (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        Application Info = new Application();
            Info.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        DoctorsName.setText(null);
        PatientFirstName.setText(null);
        PatientLastName.setText(null);
        TemperatureTxt.setText(null);
        PulseRateTxt.setText(null);
        RespirationRateTxt.setText(null);             
        BloodPressureTxt.setText(null);
        TxtComment.setText(null);  
        
    }//GEN-LAST:event_ResetButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Check_Up().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BloodPressureTxt;
    private javax.swing.JTextField DoctorsName;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField PatientFirstName;
    private javax.swing.JTextField PatientLastName;
    private javax.swing.JTextField PulseRateTxt;
    private javax.swing.JButton ResetButton;
    private javax.swing.JTextField RespirationRateTxt;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField TemperatureTxt;
    private javax.swing.JTextArea TxtComment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}