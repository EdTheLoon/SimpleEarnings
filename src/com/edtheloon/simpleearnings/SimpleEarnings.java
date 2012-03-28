/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edtheloon.simpleearnings;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author adrian
 */
public class SimpleEarnings extends javax.swing.JFrame {

    /**
     * Creates new form SimpleEarnings
     */
    public SimpleEarnings() {
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

        lblInfo = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        lblResults = new javax.swing.JLabel();
        pnlDetails = new javax.swing.JPanel();
        lblHoursWeek1 = new javax.swing.JLabel();
        txtHoursWeek1 = new javax.swing.JTextField();
        lblHoursWeek2 = new javax.swing.JLabel();
        txtHoursWeek2 = new javax.swing.JTextField();
        lblHoursWeek3 = new javax.swing.JLabel();
        txtHoursWeek3 = new javax.swing.JTextField();
        lblHoursWeek4 = new javax.swing.JLabel();
        txtHoursWeek4 = new javax.swing.JTextField();
        lblPayRate = new javax.swing.JLabel();
        txtPayRate = new javax.swing.JTextField();
        lblTaxAllowance = new javax.swing.JLabel();
        txtTaxAllowance = new javax.swing.JTextField();
        lblTaxRate = new javax.swing.JLabel();
        txtTaxRate = new javax.swing.JTextField();
        lblOtherDeductions = new javax.swing.JLabel();
        txtOtherDeductions = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Earnings Calculator");
        setName("mainFrame");

        lblInfo.setText("<html><center>This Java application uses data you provide to calculate your earnings. It calculates your gross pay, tax paid and net pay.</center>");

        btnCalculate.setText("Calculate");
        btnCalculate.setToolTipText("Calculate your earnings");
        btnCalculate.setNextFocusableComponent(txtHoursWeek1);
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblResults.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblResults.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResults.setText("Input your data and then press 'Calculate'");

        pnlDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));

        lblHoursWeek1.setText("Hours (Wk 1)");

        txtHoursWeek1.setToolTipText("The amount of hours you worked in week 1");
        txtHoursWeek1.setNextFocusableComponent(txtHoursWeek2);

        lblHoursWeek2.setText("Hours (Wk 2)");

        txtHoursWeek2.setToolTipText("The amount of hours you worked in week 2");
        txtHoursWeek2.setNextFocusableComponent(txtHoursWeek3);

        lblHoursWeek3.setText("Hours (Wk 3)");

        txtHoursWeek3.setToolTipText("The amount of hours you worked in week 3");
        txtHoursWeek3.setNextFocusableComponent(txtHoursWeek4);
        txtHoursWeek3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoursWeek3ActionPerformed(evt);
            }
        });

        lblHoursWeek4.setText("Hours (Wk 4)");

        txtHoursWeek4.setToolTipText("The amount of hours you worked in week 4");
        txtHoursWeek4.setNextFocusableComponent(txtPayRate);

        lblPayRate.setText("Pay Rate");

        txtPayRate.setToolTipText("Your rate of pay");
        txtPayRate.setNextFocusableComponent(txtTaxAllowance);

        lblTaxAllowance.setText("Tax Allowance");

        txtTaxAllowance.setToolTipText("Your tax allowance");
        txtTaxAllowance.setNextFocusableComponent(txtTaxRate);

        lblTaxRate.setText("Tax Rate (eg 0.25)");

        txtTaxRate.setToolTipText("Your tax rate. 25% should be entered as 0.25");
        txtTaxRate.setNextFocusableComponent(txtOtherDeductions);

        lblOtherDeductions.setText("Other Deductions");

        txtOtherDeductions.setToolTipText("Any other deductions such as G.A.Y.E");
        txtOtherDeductions.setNextFocusableComponent(btnCalculate);

        javax.swing.GroupLayout pnlDetailsLayout = new javax.swing.GroupLayout(pnlDetails);
        pnlDetails.setLayout(pnlDetailsLayout);
        pnlDetailsLayout.setHorizontalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addComponent(lblHoursWeek1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHoursWeek1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHoursWeek2)
                            .addComponent(lblHoursWeek3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoursWeek3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoursWeek2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addComponent(lblHoursWeek4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHoursWeek4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPayRate)
                    .addComponent(lblTaxAllowance)
                    .addComponent(lblTaxRate)
                    .addComponent(lblOtherDeductions))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPayRate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTaxAllowance, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTaxRate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtOtherDeductions, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlDetailsLayout.setVerticalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPayRate)
                    .addComponent(txtPayRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTaxAllowance)
                    .addComponent(txtTaxAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTaxRate)
                    .addComponent(txtTaxRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOtherDeductions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOtherDeductions)))
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoursWeek1)
                    .addComponent(txtHoursWeek1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoursWeek2)
                    .addComponent(txtHoursWeek2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoursWeek3)
                    .addComponent(txtHoursWeek3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoursWeek4)
                    .addComponent(txtHoursWeek4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalculate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResults)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // Gather the data from the text fields
        getFieldData();
        // Calculate earnings
        calculateEarnings();
        // Display earnings
        displayEarnings();
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void txtHoursWeek3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoursWeek3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoursWeek3ActionPerformed

    // Member variables
    private Double hoursWk1, hoursWk2, hoursWk3, hoursWk4, payRate, taxRate,
                   otherDeductions, totalHours, grossPay, taxPaid, netPay;
    private int taxAllowance;
    
    /**
     * Gathers data from the text fields
     */
    public void getFieldData() {
        hoursWk1 = Double.parseDouble(txtHoursWeek1.getText());
        hoursWk2 = Double.parseDouble(txtHoursWeek2.getText());
        hoursWk3 = Double.parseDouble(txtHoursWeek3.getText());
        hoursWk4 = Double.parseDouble(txtHoursWeek4.getText());
        payRate = Double.parseDouble(txtPayRate.getText());
        taxAllowance = Integer.parseInt(txtTaxAllowance.getText());
        taxRate = Double.parseDouble(txtTaxRate.getText());
        otherDeductions = Double.parseDouble(txtOtherDeductions.getText());
    }
    
    /**
     * Calculate the earnings
     */
    public void calculateEarnings() {
        totalHours = hoursWk1 + hoursWk2 + hoursWk3 + hoursWk4;
        grossPay = totalHours * payRate;
        taxPaid = (grossPay - (taxAllowance / 12)) * taxRate;
        netPay = grossPay - taxPaid - otherDeductions;
    }
    
    public void displayEarnings() {
        NumberFormat nf = NumberFormat.getInstance(Locale.ENGLISH);
        nf.setMinimumFractionDigits(2);
        lblResults.setText("Gross: £" + nf.format(grossPay)
                         + " | Tax: £" + nf.format(taxPaid)
                         + " | Net: £" + nf.format(netPay));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SimpleEarnings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpleEarnings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpleEarnings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpleEarnings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SimpleEarnings().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JLabel lblHoursWeek1;
    private javax.swing.JLabel lblHoursWeek2;
    private javax.swing.JLabel lblHoursWeek3;
    private javax.swing.JLabel lblHoursWeek4;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblOtherDeductions;
    private javax.swing.JLabel lblPayRate;
    private javax.swing.JLabel lblResults;
    private javax.swing.JLabel lblTaxAllowance;
    private javax.swing.JLabel lblTaxRate;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JTextField txtHoursWeek1;
    private javax.swing.JTextField txtHoursWeek2;
    private javax.swing.JTextField txtHoursWeek3;
    private javax.swing.JTextField txtHoursWeek4;
    private javax.swing.JTextField txtOtherDeductions;
    private javax.swing.JTextField txtPayRate;
    private javax.swing.JTextField txtTaxAllowance;
    private javax.swing.JTextField txtTaxRate;
    // End of variables declaration//GEN-END:variables
}
