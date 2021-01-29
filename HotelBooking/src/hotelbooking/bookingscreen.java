package hotelbooking;

public class bookingscreen extends javax.swing.JFrame {

    int dailyprice = 0;
    int days = 0;
    public static double price = 0;
    double discounted;
    double tempNum;
    public static double saved = 0;

    public bookingscreen() {
        initComponents();
        checkoutButton.setEnabled(false);
    }

    public void discount() {
        discounted = dailyprice;
        price = dailyprice * 7;
        tempNum = dailyprice;
        for (int i = days - 7; i > 0; i--) {
            discounted = (discounted * 20) / 100;
            discounted = tempNum - discounted;
            tempNum = discounted;
            price = price + discounted;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pricesButton = new javax.swing.JButton();
        singleButton = new javax.swing.JButton();
        doubleButton = new javax.swing.JButton();
        familyButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        selfButton = new javax.swing.JButton();
        halfButton = new javax.swing.JButton();
        fullButton = new javax.swing.JButton();
        priceDisplay = new javax.swing.JLabel();
        daysEntered = new javax.swing.JTextField();
        daysText = new javax.swing.JLabel();
        continueButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        checkoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Hotel Booking System");

        pricesButton.setText("Prices & Deals");
        pricesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricesButtonActionPerformed(evt);
            }
        });

        singleButton.setText("Single Room: £50");
        singleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleButtonActionPerformed(evt);
            }
        });

        doubleButton.setText("Double Room: £75");
        doubleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleButtonActionPerformed(evt);
            }
        });

        familyButton.setText("Family Room: £105");
        familyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familyButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Make sure to check out our deals in the top right!");

        selfButton.setText("Self Catering: £0");
        selfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selfButtonActionPerformed(evt);
            }
        });

        halfButton.setText("Half Board: £10");
        halfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halfButtonActionPerformed(evt);
            }
        });

        fullButton.setText("Full Board: £20");
        fullButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullButtonActionPerformed(evt);
            }
        });

        priceDisplay.setText("Current Price per Day: ");

        daysEntered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysEnteredActionPerformed(evt);
            }
        });

        daysText.setText("How many days would you like to stay with us?");

        continueButton.setText("Continue");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        checkoutButton.setText("Continue to Checkout");
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(singleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doubleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(familyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fullButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(halfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pricesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(priceDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(daysEntered)
                    .addComponent(daysText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(singleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(priceDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(daysText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doubleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(halfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(familyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fullButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(daysEntered, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pricesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricesButtonActionPerformed
        pricesDisplay price = new pricesDisplay();
        price.setVisible(true);
        price.setResizable(false);
    }//GEN-LAST:event_pricesButtonActionPerformed

    private void singleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleButtonActionPerformed
        dailyprice = dailyprice + 50;
        singleButton.setEnabled(false);
        doubleButton.setEnabled(false);
        familyButton.setEnabled(false);

        priceDisplay.setText("Current Price per Day: £" + dailyprice);
    }//GEN-LAST:event_singleButtonActionPerformed

    private void doubleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleButtonActionPerformed
        dailyprice = dailyprice + 75;
        singleButton.setEnabled(false);
        doubleButton.setEnabled(false);
        familyButton.setEnabled(false);

        priceDisplay.setText("Current Price per Day: £" + dailyprice);
    }//GEN-LAST:event_doubleButtonActionPerformed

    private void familyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familyButtonActionPerformed
        dailyprice = dailyprice + 105;
        singleButton.setEnabled(false);
        doubleButton.setEnabled(false);
        familyButton.setEnabled(false);

        priceDisplay.setText("Current Price per Day: £" + dailyprice);
    }//GEN-LAST:event_familyButtonActionPerformed

    private void selfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selfButtonActionPerformed
        dailyprice = dailyprice;
        selfButton.setEnabled(false);
        halfButton.setEnabled(false);
        fullButton.setEnabled(false);

        priceDisplay.setText("Current Price per Day: £" + dailyprice);
    }//GEN-LAST:event_selfButtonActionPerformed

    private void halfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halfButtonActionPerformed
        dailyprice = dailyprice + 10;
        selfButton.setEnabled(false);
        halfButton.setEnabled(false);
        fullButton.setEnabled(false);

        priceDisplay.setText("Current Price per Day: £" + dailyprice);
    }//GEN-LAST:event_halfButtonActionPerformed

    private void fullButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullButtonActionPerformed
        dailyprice = dailyprice + 20;
        selfButton.setEnabled(false);
        halfButton.setEnabled(false);
        fullButton.setEnabled(false);

        priceDisplay.setText("Current Price per Day: £" + dailyprice);
    }//GEN-LAST:event_fullButtonActionPerformed

    private void daysEnteredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysEnteredActionPerformed

    }//GEN-LAST:event_daysEnteredActionPerformed

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        
        if (daysEntered.getText().equals("")) {

        } else {
            daysEntered.setEditable(false);
            continueButton.setEnabled(false);

            days = Integer.parseInt(daysEntered.getText());

            if (days <= 7) {
                price = days * dailyprice;
            } else {
                discount();
            }

            priceDisplay.setText("Overall Price: £" + price);
            
            checkoutButton.setEnabled(true);
            
            saved = (dailyprice * days)-(price);
        }  
    }//GEN-LAST:event_continueButtonActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
        checkout purchase = new checkout();
        purchase.setVisible(true);
        purchase.setResizable(false);

        this.setVisible(false);

    }//GEN-LAST:event_checkoutButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dailyprice = 0;
        days = 0;

        singleButton.setEnabled(true);
        doubleButton.setEnabled(true);
        familyButton.setEnabled(true);
        selfButton.setEnabled(true);
        halfButton.setEnabled(true);
        fullButton.setEnabled(true);

        daysEntered.setEditable(true);
        continueButton.setEnabled(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(bookingscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookingscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookingscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookingscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookingscreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JButton continueButton;
    private javax.swing.JTextField daysEntered;
    private javax.swing.JLabel daysText;
    private javax.swing.JButton doubleButton;
    private javax.swing.JButton familyButton;
    private javax.swing.JButton fullButton;
    private javax.swing.JButton halfButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel priceDisplay;
    private javax.swing.JButton pricesButton;
    private javax.swing.JButton selfButton;
    private javax.swing.JButton singleButton;
    // End of variables declaration//GEN-END:variables
}
