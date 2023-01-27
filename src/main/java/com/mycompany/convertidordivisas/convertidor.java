
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


package com.mycompany.convertidordivisas;

/**
 *
 * @author juangoon
 */
public class convertidor extends javax.swing.JFrame {
    int cantidad=0;
    double conversion=0;
    String de="DOP";
    String a="DOP";
    
    /**
     * Creates new form convertidor
     */
    public convertidor() {
        initComponents();
        this.setTitle("Conversor de Monedas");
        this.setLocationRelativeTo(null);
    }

    public String  aMoneda(double cantidad, String moneda){
        return "# "+Math.round(cantidad*1000.0)/1000.00+" "+moneda;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSlider();
        lblCantidad = new javax.swing.JLabel();
        cboD = new javax.swing.JComboBox<>();
        cboA = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JButton();
        lblResultados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setText("CANTIDAD A CONVERTIR");

        spnCantidad.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        spnCantidad.setMinimum(1);
        spnCantidad.setPaintLabels(true);
        spnCantidad.setPaintTicks(true);
        spnCantidad.setValue(1);
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });

        lblCantidad.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        lblCantidad.setText("1");

        cboD.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        cboD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "GBP", "JPY", "KRW", "DOP" }));
        cboD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDActionPerformed(evt);
            }
        });

        cboA.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        cboA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "GBP", "JPY", "KRW", "DOP" }));
        cboA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setText("De");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setText("A");

        btnConvertir.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnConvertir.setText("Salir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        lblResultados.setBackground(new java.awt.Color(255, 255, 255));
        lblResultados.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblResultados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(lblResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(spnCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(lblCantidad))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cboD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(90, 90, 90)
                                        .addComponent(cboA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel3)
                                        .addGap(150, 150, 150)
                                        .addComponent(jLabel4))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(btnConvertir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCantidad)
                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addComponent(lblResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
       cantidad = spnCantidad.getValue();
       lblCantidad.setText(""+cantidad);
       convertir();
       
    }//GEN-LAST:event_spnCantidadStateChanged

    private void cboDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDActionPerformed
       de=cboD.getSelectedItem().toString();
       convertir();
    }//GEN-LAST:event_cboDActionPerformed

    private void cboAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAActionPerformed
       a=cboA.getSelectedItem().toString();
       convertir();
    }//GEN-LAST:event_cboAActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnConvertirActionPerformed
    public void convertir(){
        switch(de){
            case "DOP":
                if(a.equals("USD")){
                    conversion=cantidad*0.018;
                }else if(a.equals("EUR")){
                   conversion=cantidad*0.016;
                }else if(a.equals("GBP")){
                   conversion=cantidad*0.014;
                   
                   }else if(a.equals("JPY")){
                   conversion=cantidad*2.26;
                   
                   }else if(a.equals("KRW")){
                   conversion=cantidad*21.86;
                   
                   }else {
                       conversion=cantidad;
                   }
                break;
                  case "EUR":
                if(a.equals("USD")){
                    conversion=cantidad*1.09;
                }else if(a.equals("DOP")){
                   conversion=cantidad*61.28;
                }else if(a.equals("GBP")){
                   conversion=cantidad*0.88;
                   
                   }else if(a.equals("JPY")){
                   conversion=cantidad*138.37;
                   
                   }else if(a.equals("KRW")){
                   conversion=cantidad*1339.32;
                   
                   }else {
                       conversion=cantidad;
                   }
                break;
                  case "USD":
                if(a.equals("DOP")){
                    conversion=cantidad*56.40;
                }else if(a.equals("EUR")){
                   conversion=cantidad*0.92;
                }else if(a.equals("GBP")){
                   conversion=cantidad*0.18;
                   
                   }else if(a.equals("JPY")){
                   conversion=cantidad*127.38;
                   
                   }else if(a.equals("KRW")){
                   conversion=cantidad*1232.71;
                   
                   }else {
                       conversion=cantidad;
                   }
                break;
                  case "GBP":
                if(a.equals("USD")){
                    conversion=cantidad*1.23;
                }else if(a.equals("EUR")){
                   conversion=cantidad*1.13;
                }else if(a.equals("DOP")){
                   conversion=cantidad*69.23;
                   
                   }else if(a.equals("JPY")){
                   conversion=cantidad*156.42;
                   
                   }else if(a.equals("KRW")){
                   conversion=cantidad*1513.63;
                   
                   }else {
                       conversion=cantidad;
                   }
                break;
                  case "JPY":
                if(a.equals("USD")){
                    conversion=cantidad*0.0079;
                }else if(a.equals("EUR")){
                   conversion=cantidad*0.0072;
                }else if(a.equals("GBP")){
                   conversion=cantidad*0.0064;
                   
                   }else if(a.equals("DOP")){
                   conversion=cantidad*0.44;
                   
                   }else if(a.equals("KRW")){
                   conversion=cantidad*9.68;
                   
                   }else {
                       conversion=cantidad;
                   }
                break;
                  case "KRW":
                if(a.equals("USD")){
                    conversion=cantidad*0.00081;
                }else if(a.equals("EUR")){
                   conversion=cantidad*0.00075;
                }else if(a.equals("GBP")){
                   conversion=cantidad*0.00066;
                   
                   }else if(a.equals("JPY")){
                   conversion=cantidad*0.10;
                   
                   }else if(a.equals("DOP")){
                   conversion=cantidad*0.046;
                   
                   }else {
                       conversion=cantidad;
                   }
                break;
        }
        lblResultados.setText(aMoneda(cantidad, de)+" ->"+aMoneda(conversion, a));
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
              
       // }
    }
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
            java.util.logging.Logger.getLogger(convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(convertidor.class.getName()).log(java.util.logging.Level.SEVERE, spnCantidad);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new convertidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JComboBox<String> cboA;
    private javax.swing.JComboBox<String> cboD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblResultados;
    private javax.swing.JSlider spnCantidad;
    // End of variables declaration//GEN-END:variables

    
}
