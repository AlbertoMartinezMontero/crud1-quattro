package it.iad2.eserciziocrud;

public class UICrud extends javax.swing.JFrame implements UIAutomabileCrud {

    private AutomaCrud automa;

    public UICrud() {
        initComponents();
        automa = new AutomaCrud(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonModifica = new javax.swing.JButton();
        jButtonConferma = new javax.swing.JButton();
        jButtonAnnulla = new javax.swing.JButton();
        jButtonRimuovi = new javax.swing.JButton();
        jLabelCercaPerCodice = new javax.swing.JLabel();
        jButtonCerca = new javax.swing.JButton();
        jTextDescrizione = new javax.swing.JTextField();
        jTextCodice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAdd = new javax.swing.JButton();
        jButtonSeleziona = new javax.swing.JButton();

        jButton7.setText("jButton7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonModifica.setText("Modifica");

        jButtonConferma.setText("Conferma");

        jButtonAnnulla.setText("Annulla");

        jButtonRimuovi.setText("Rimuovi");

        jLabelCercaPerCodice.setText("Cerca per codice");

        jButtonCerca.setText("Cerca");

        jTextDescrizione.setText("Descrizione");
        jTextDescrizione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDescrizioneActionPerformed(evt);
            }
        });

        jTextCodice.setText("Codice");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextCodice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonModifica)
                            .addComponent(jLabelCercaPerCodice))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jButtonCerca))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonConferma)
                                .addGap(12, 12, 12)))
                        .addGap(14, 14, 14)
                        .addComponent(jButtonAnnulla)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonRimuovi)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCodice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModifica)
                    .addComponent(jButtonConferma)
                    .addComponent(jButtonAnnulla)
                    .addComponent(jButtonRimuovi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCercaPerCodice)
                    .addComponent(jButtonCerca))
                .addGap(15, 15, 15))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButtonAdd.setText("Aggiungi");

        jButtonSeleziona.setText("Seleziona");
        jButtonSeleziona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelezionaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAdd)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSeleziona)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButtonAdd))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButtonSeleziona))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSelezionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelezionaActionPerformed
    }//GEN-LAST:event_jButtonSelezionaActionPerformed

    private void jTextDescrizioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDescrizioneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDescrizioneActionPerformed

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
            java.util.logging.Logger.getLogger(UICrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UICrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UICrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UICrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UICrud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAnnulla;
    private javax.swing.JButton jButtonCerca;
    private javax.swing.JButton jButtonConferma;
    private javax.swing.JButton jButtonModifica;
    private javax.swing.JButton jButtonRimuovi;
    private javax.swing.JButton jButtonSeleziona;
    private javax.swing.JLabel jLabelCercaPerCodice;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCodice;
    private javax.swing.JTextField jTextDescrizione;
    // End of variables declaration//GEN-END:variables

    @Override
    public void vaiStatoRicerca() {
        jButtonAnnulla.setVisible(false);
        jButtonCerca.setVisible(true);
        jButtonConferma.setVisible(true);
        jButtonModifica.setVisible(false);
        jButtonAdd.setVisible(false);
        jButtonRimuovi.setVisible(false);
        jButtonSeleziona.setVisible(false);
        jLabelCercaPerCodice.setVisible(true);
        jLabelCodice.setVisible(true);
        jLabelDescrizione.setVisible(true);
        jPanel1.setVisible(true);
        jScrollPane1.setVisible(true);
        jTable1.setEnabled(false);
    }

    @Override
    public void vaiStatoAggiungi() {
        jButtonAnnulla.setVisible(true);
        jButtonCerca.setVisible(false);
        jButtonConferma.setVisible(true);
        jButtonModifica.setVisible(true);
        jButtonAdd.setVisible(false);
        jButtonRimuovi.setVisible(true);
        jButtonSeleziona.setVisible(false);
        jLabelCercaPerCodice.setVisible(false);
        jLabelCodice.setVisible(true);
        jLabelDescrizione.setVisible(true);
        jPanel1.setVisible(true);
        jScrollPane1.setVisible(true);
        jTable1.setVisible(false);
    }

    @Override
    public void vaiStatoVisualizza() {
        jButtonAnnulla.setVisible(true);
        jButtonCerca.setVisible(true);
        jButtonConferma.setVisible(true);
        jButtonModifica.setVisible(true);
        jButtonAdd.setVisible(false);
        jButtonRimuovi.setVisible(true);
        jButtonSeleziona.setVisible(true);
        jLabelCercaPerCodice.setVisible(true);
        jLabelCodice.setVisible(true);
        jLabelDescrizione.setVisible(true);
        jPanel1.setVisible(true);
        jScrollPane1.setVisible(true);
        jTable1.setVisible(true);
    }

    @Override
    public void vaiStatoModifica() {
        jButtonAnnulla.setVisible(true);
        jButtonCerca.setVisible(true);
        jButtonConferma.setVisible(true);
        jButtonModifica.setVisible(true);
        jButtonAdd.setVisible(false);
        jButtonRimuovi.setVisible(true);
        jButtonSeleziona.setVisible(true);
        jLabelCercaPerCodice.setVisible(true);
        jLabelCodice.setVisible(true);
        jLabelDescrizione.setVisible(true);
        jPanel1.setVisible(true);
        jScrollPane1.setVisible(true);
        jTable1.setVisible(true);

    }

    @Override
    public void vaiStatoRimuovi() {
        jButtonAnnulla.setVisible(true);
        jButtonCerca.setVisible(false);
        jButtonConferma.setVisible(true);
        jButtonModifica.setVisible(false);
        jButtonAdd.setVisible(false);
        jButtonRimuovi.setVisible(true);
        jButtonSeleziona.setVisible(true);
        jLabelCercaPerCodice.setVisible(false);
        jLabelCodice.setVisible(true);
        jLabelDescrizione.setVisible(true);
        jPanel1.setVisible(true);
        jScrollPane1.setVisible(true);
        jTable1.setVisible(true);

    }

    @Override
    public void vaiStatoMessaggio(String s) {
  
    }
}
