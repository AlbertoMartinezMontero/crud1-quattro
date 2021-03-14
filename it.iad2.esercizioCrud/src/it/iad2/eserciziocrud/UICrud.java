package it.iad2.eserciziocrud;

public class UICrud extends javax.swing.JFrame implements UIAutomabileCrud {

    private AutomaCrud automa;

    public UICrud() {
        initComponents();
        automa = new AutomaCrud(this);
    }

    @Override
    public void vaiStatoRicerca() {
        jLabelCampo.setText("Ricerca Prodotto");
        jButtonAnnulla.setVisible(false);
        jButtonCerca.setVisible(true);
        jButtonConferma.setVisible(false);
        jButtonModifica.setVisible(false);
        jButtonAdd.setVisible(true);
        jButtonAdd.setEnabled(true);
        jButtonRimuovi.setVisible(false);
        jButtonSeleziona.setVisible(true);
        jTextCercaPerCodice.setVisible(true);
        jTextCodice.setVisible(true);
        jTextDescrizione.setVisible(true);
        jPanel1.setVisible(false);
        jScrollPane1.setVisible(true);
    }

    @Override
    public void vaiStatoAggiungi() {
        jLabelCampo.setText("Aggiungi prodotto");

        jButtonAnnulla.setVisible(true);
        jButtonCerca.setVisible(false);
        jButtonConferma.setVisible(true);
        jButtonConferma.setEnabled(true);
        jButtonModifica.setVisible(false);
        jButtonAdd.setVisible(false);
        jButtonRimuovi.setVisible(true);
        jButtonSeleziona.setVisible(false);
        jTextCercaPerCodice.setVisible(false);
        jTextCodice.setVisible(true);
        jTextCodice.setText("");
        jTextCodice.setEnabled(true);
        jTextDescrizione.setVisible(true);
        jTextDescrizione.setText("");
        jTextDescrizione.setEnabled(true);
        jPanel1.setVisible(true);
        jScrollPane1.setVisible(false);
        jTable1.setVisible(false);

    }

    @Override
    public void vaiStatoVisualizza() {
        jLabelCampo.setText("Visualizza Prodotto");
        jButtonAnnulla.setVisible(false);
        jButtonCerca.setVisible(true);
        jButtonConferma.setVisible(false);
        jButtonModifica.setVisible(true);
        jButtonAdd.setVisible(true);
        jButtonRimuovi.setVisible(true);
        jButtonSeleziona.setVisible(true);
        jTextCercaPerCodice.setVisible(true);
        jTextCodice.setVisible(true);
        jTextCodice.setEditable(false);
        jTextDescrizione.setVisible(true);
        jTextDescrizione.setEditable(false);
        jPanel1.setVisible(true);
        jScrollPane1.setVisible(true);
        jTable1.setVisible(true);
    }

    @Override
    public void vaiStatoModifica() {

        jLabelCampo.setText("Modifica Prodotto");

        jButtonAnnulla.setVisible(true);
        jButtonAnnulla.setEnabled(true);
        jButtonCerca.setVisible(false);
        jButtonConferma.setVisible(true);
        jButtonModifica.setVisible(false);
        jButtonAdd.setVisible(false);
        jButtonRimuovi.setVisible(false);
        jButtonSeleziona.setVisible(true);
        jTextCercaPerCodice.setVisible(false);
        jTextCodice.setVisible(true);
        jTextCodice.setEditable(true);
        jTextCodice.setText("Inserire-Codice:");
        jTextDescrizione.setVisible(true);
        jTextDescrizione.setEditable(true);
        jTextDescrizione.setText("Inserire-descrizione:");
        jPanel1.setVisible(true);
        jScrollPane1.setVisible(false);

    }

    @Override
    public void vaiStatoRimuovi() {
        jLabelCampo.setText("Rimuovi Prodotto");
        jButtonAnnulla.setVisible(true);
        jButtonAnnulla.setEnabled(true);
        jButtonCerca.setVisible(true);
        jButtonCerca.setEnabled(true);
        jButtonConferma.setVisible(true);
        jButtonConferma.setEnabled(true);
        jButtonModifica.setVisible(false);
        jButtonModifica.setEnabled(true);
        jButtonAdd.setVisible(true);
        jButtonRimuovi.setVisible(true);
        jButtonSeleziona.setVisible(true);
        jTextCercaPerCodice.setVisible(true);
        jTextCodice.setVisible(true);
        jTextDescrizione.setVisible(true);
        jPanel1.setVisible(true);
        jScrollPane1.setVisible(true);

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
        jTextDescrizione = new javax.swing.JTextField();
        jTextCodice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAdd = new javax.swing.JButton();
        jButtonSeleziona = new javax.swing.JButton();
        jTextCercaPerCodice = new javax.swing.JTextField();
        jButtonCerca = new javax.swing.JButton();
        jLabelCampo = new javax.swing.JLabel();

        jButton7.setText("jButton7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonModifica.setText("Modifica");
        jButtonModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificaActionPerformed(evt);
            }
        });

        jButtonConferma.setText("Conferma");
        jButtonConferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfermaActionPerformed(evt);
            }
        });

        jButtonAnnulla.setText("Annulla");
        jButtonAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnullaActionPerformed(evt);
            }
        });

        jButtonRimuovi.setText("Rimuovi");

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
                        .addComponent(jTextCodice, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jTextDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonModifica)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonConferma)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonAnnulla)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonRimuovi)))
                .addContainerGap(140, Short.MAX_VALUE))
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
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codice", "Descrizione", "Seleziona"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButtonAdd.setText("Aggiungi");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonSeleziona.setText("Seleziona");
        jButtonSeleziona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelezionaActionPerformed(evt);
            }
        });

        jTextCercaPerCodice.setText("Cerca per codice");
        jTextCercaPerCodice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCercaPerCodiceActionPerformed(evt);
            }
        });

        jButtonCerca.setText("Cerca");
        jButtonCerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCercaActionPerformed(evt);
            }
        });

        jLabelCampo.setText("Pagina");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAdd))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextCercaPerCodice, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonCerca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSeleziona)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabelCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonAdd))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSeleziona))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextCercaPerCodice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCerca))))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSelezionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelezionaActionPerformed
        automa.next(new SelezionaEvent());    }//GEN-LAST:event_jButtonSelezionaActionPerformed

    private void jTextDescrizioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDescrizioneActionPerformed
    }//GEN-LAST:event_jTextDescrizioneActionPerformed

    private void jTextCercaPerCodiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCercaPerCodiceActionPerformed
    }//GEN-LAST:event_jTextCercaPerCodiceActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        automa.next(new AddEvent());
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonConfermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfermaActionPerformed
        automa.next(new ConfermaEvent());
    }//GEN-LAST:event_jButtonConfermaActionPerformed

    private void jButtonModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificaActionPerformed
        automa.next(new ModificaEvent());
    }//GEN-LAST:event_jButtonModificaActionPerformed

    private void jButtonAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnullaActionPerformed
automa.next(new AnnullaEvent());    }//GEN-LAST:event_jButtonAnnullaActionPerformed

    private void jButtonCercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCercaActionPerformed
        automa.next(new RicercaEvent());
    }//GEN-LAST:event_jButtonCercaActionPerformed

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
    private javax.swing.JLabel jLabelCampo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCercaPerCodice;
    private javax.swing.JTextField jTextCodice;
    private javax.swing.JTextField jTextDescrizione;
    // End of variables declaration//GEN-END:variables
}
