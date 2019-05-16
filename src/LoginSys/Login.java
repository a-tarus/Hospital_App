package LoginSys;

    import javax.swing.JOptionPane;
    import java.awt.Toolkit;
    import java.awt.event.WindowEvent;
    import LoginSys.Application;


public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        EmployeeLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        UsernameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        EmployeeLabel.setFont(new java.awt.Font("Garamond", 1, 48)); // NOI18N
        EmployeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmployeeLabel.setText("Employee login");
        EmployeeLabel.setToolTipText("");

        UsernameLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        UsernameLabel.setText("USERNAME");

        PasswordLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PasswordLabel.setText("PASSWORD");

        LoginButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LoginButton.setText("LOGIN");
        LoginButton.setToolTipText("LoginButton");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        ResetButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ResetButton.setText("RESET");
        ResetButton.setToolTipText("ResetButton");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        ExitButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ExitButton.setText("EXIT");
        ExitButton.setToolTipText("ExitButton");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        PasswordField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PasswordField.setToolTipText("Password");

        UsernameField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        UsernameField.setToolTipText("Username");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("If you having trouble login in please \nCall Tec Support at (808) 561-8947\nOr Email techsupport@itsystems.net  ");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(UsernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                .addComponent(PasswordField)))
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(LoginPanelLayout.createSequentialGroup()
                                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(57, 57, 57)
                                    .addComponent(ResetButton)
                                    .addGap(66, 66, 66)
                                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addComponent(UsernameLabel)
                        .addGap(44, 44, 44)
                        .addComponent(PasswordLabel))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton)
                    .addComponent(ResetButton)
                    .addComponent(ExitButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(LoginPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        String password = PasswordField.getText();
        String username = UsernameField.getText();
        
            if (password.contains("Pass")&& (username.contains("User")))
               
            {
                UsernameField.setText(null);
                PasswordField.setText(null);
                SystemExit();
              
            Application Info = new Application();
            Info.setVisible(true);
            //making a new page 
           
            }        
            else
            {
                JOptionPane.showMessageDialog(null,"Username or Password are invalid!",
                        "Login Error",JOptionPane.ERROR_MESSAGE);
                    PasswordField.setText(null);
                    UsernameField.setText(null);       
            }
            this.dispose();
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
        //closes the page 
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        UsernameField.setText(null);
        PasswordField.setText(null);
        //It will clear the text areas  
    }//GEN-LAST:event_ResetButtonActionPerformed

    
    public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmployeeLabel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton ResetButton;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
private void SystemExit()
{
WindowEvent winCloseing = new WindowEvent (this,WindowEvent.WINDOW_CLOSING);
}
}
