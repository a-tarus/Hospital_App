package LoginSys;

import java.io.FileWriter;
import java.util.jar.Attributes.Name;
import javax.swing.JOptionPane;


public class Appointments extends javax.swing.JFrame {
    public Appointments() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PatientsLabel = new javax.swing.JLabel();
        DOBLabel = new javax.swing.JLabel();
        InsuranceLabel = new javax.swing.JLabel();
        DateofappLabel = new javax.swing.JLabel();
        PatientsName = new javax.swing.JTextField();
        DateofBirth = new javax.swing.JTextField();
        InsuranceName = new javax.swing.JTextField();
        Dateofapp = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APPOINTMENTS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        PatientsLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PatientsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PatientsLabel.setText("Patient`s Name");
        jPanel1.add(PatientsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        DOBLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DOBLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DOBLabel.setText("Date Of Birth");
        jPanel1.add(DOBLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        InsuranceLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        InsuranceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsuranceLabel.setText("Insurance Name");
        jPanel1.add(InsuranceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        DateofappLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DateofappLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DateofappLabel.setText("Date Of Appointment");
        jPanel1.add(DateofappLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        PatientsName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PatientsName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        PatientsName.setToolTipText("Patient`s Name");
        PatientsName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientsNameActionPerformed(evt);
            }
        });
        jPanel1.add(PatientsName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 170, -1));

        DateofBirth.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DateofBirth.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        DateofBirth.setToolTipText("Month / Day / Year");
        DateofBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateofBirthActionPerformed(evt);
            }
        });
        jPanel1.add(DateofBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 170, -1));

        InsuranceName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        InsuranceName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        InsuranceName.setToolTipText("Insurance Name");
        jPanel1.add(InsuranceName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 170, -1));

        Dateofapp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Dateofapp.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Dateofapp.setToolTipText("Month / Day / Year");
        jPanel1.add(Dateofapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 170, -1));

        SaveButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SaveButton.setText("SAVE");
        SaveButton.setToolTipText("SaveButton");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        ExitButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ExitButton.setText("EXIT");
        ExitButton.setToolTipText("ExitButton");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        ResetButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ResetButton.setText("RESET");
        ResetButton.setToolTipText("ResetButton");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ResetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amon\\Documents\\NetBeansProjects\\Login\\Images\\Appointment Icon.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 510, 500));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PatientsNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientsNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientsNameActionPerformed

    private void DateofBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateofBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateofBirthActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
       
        String Patients = PatientsName.getText().toString();
        String Birth = DateofBirth.getText().toString();
        String Insurance = InsuranceName.getText().toString();
        String Appointment = Dateofapp.getText().toString();
        
        try {
            
            FileWriter writer = new FileWriter("Appointment.txt", true);
                writer.write(Patients);
                writer.write(System.getProperty("line.separator"));
                writer.write(Birth);
                writer.write(System.getProperty("line.separator"));
                writer.write(Insurance);
                writer.write(System.getProperty("line.separator"));
                writer.write(Appointment);
                writer.write(System.getProperty("line.separator"));
                writer.close();
                JOptionPane.showMessageDialog(rootPane, "Saved");
                                
        }
        catch   (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error");
        }    
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        PatientsName.setText(null);
        DateofBirth.setText(null);
        InsuranceName.setText(null);
        Dateofapp.setText(null);  
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        Application Info = new Application();
            Info.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DOBLabel;
    private javax.swing.JTextField DateofBirth;
    private javax.swing.JTextField Dateofapp;
    private javax.swing.JLabel DateofappLabel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel InsuranceLabel;
    private javax.swing.JTextField InsuranceName;
    private javax.swing.JLabel PatientsLabel;
    private javax.swing.JTextField PatientsName;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}