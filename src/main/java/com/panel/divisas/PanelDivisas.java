/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.panel.divisas;
import javax.swing.JOptionPane;
import menu.MenuOpcion;

/**
 *
 * @author Triana Gonzalez Lemus
 */
public class PanelDivisas extends javax.swing.JFrame {
    /* Se genera variable valor */
    double valor;

    //se genera un arreglo con los items del combobox a llenar
    private String[] monedas = {
        "USD-DOLAR",
        "EUR-EURO",
        "GBP-Libra Esterlina",
        "JPY-Yen",
        "KRW-Won SurCoreano",
        "CLP-Peso Chileno",};
    //se declara un arreglo con los valores de cada moneda
    private int[] cambiobox1 = {803, 874, 804, 800, 802, 0};
    //se declara otro arreglo con los valores inversos a las moneda 
    private double[] cambiobox2 = {0.00125, 0.00114, 0.00098, 0.17996, 1.64186, 0};


    /**
     * Creates new form PanelDivisas
     */
    public PanelDivisas() {
        initComponents();
         cargarMonedas();
    }
    
    
       //se crea un metodo para llenar el arreglo monedas con los items del combobox.
    private void cargarMonedas() {
        for (int i = 0; i < monedas.length; i++) {
            valor_1.addItem(monedas[i]);
            valor_2.addItem(monedas[i]);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelBackground = new javax.swing.JPanel();
        texto_ingreso = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        resultado_final = new javax.swing.JLabel();
        valor_1 = new javax.swing.JComboBox<>();
        valor_2 = new javax.swing.JComboBox<>();
        ConvertirDivisa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelBackground.setBackground(new java.awt.Color(255, 255, 255));

        texto_ingreso.setForeground(new java.awt.Color(153, 153, 153));
        texto_ingreso.setText("Ingrese monto a convertir");
        texto_ingreso.setBorder(null);
        texto_ingreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                texto_ingresoMouseClicked(evt);
            }
        });
        texto_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_ingresoActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Convertidor de divisa");

        resultado_final.setBackground(new java.awt.Color(102, 102, 102));
        resultado_final.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        resultado_final.setForeground(new java.awt.Color(153, 153, 153));
        resultado_final.setText("El monto es : $");

        valor_1.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        valor_1.setForeground(new java.awt.Color(255, 255, 255));
        valor_1.setBorder(null);

        valor_2.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        valor_2.setForeground(new java.awt.Color(255, 255, 255));
        valor_2.setBorder(null);

        ConvertirDivisa.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        ConvertirDivisa.setText("Convertir");
        ConvertirDivisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertirDivisaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Converter\\src\\main\\resources\\exchange-rate (1).png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel5.setText("Convertidor de Divisa");

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        jLabel6.setText("De:");

        jLabel7.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        jLabel7.setText("A:");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Converter\\src\\main\\resources\\transfer (1).png")); // NOI18N

        btnMenu.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnMenu.setText("Menu Principal");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelBackgroundLayout = new javax.swing.GroupLayout(jpanelBackground);
        jpanelBackground.setLayout(jpanelBackgroundLayout);
        jpanelBackgroundLayout.setHorizontalGroup(
            jpanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBackgroundLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jpanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jpanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelBackgroundLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jpanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(texto_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(124, 124, 124))
                            .addGroup(jpanelBackgroundLayout.createSequentialGroup()
                                .addComponent(valor_2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(jpanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valor_1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(24, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelBackgroundLayout.createSequentialGroup()
                                .addGroup(jpanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(164, 164, 164))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelBackgroundLayout.createSequentialGroup()
                                .addComponent(resultado_final, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ConvertirDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        jpanelBackgroundLayout.setVerticalGroup(
            jpanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBackgroundLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGroup(jpanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelBackgroundLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jpanelBackgroundLayout.createSequentialGroup()
                        .addGroup(jpanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelBackgroundLayout.createSequentialGroup()
                                .addGroup(jpanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpanelBackgroundLayout.createSequentialGroup()
                                        .addGap(124, 124, 124)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelBackgroundLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)))
                                .addGroup(jpanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpanelBackgroundLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(valor_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpanelBackgroundLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(valor_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jpanelBackgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(58, 58, 58)
                                .addComponent(texto_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)))
                .addComponent(ConvertirDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelBackgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(resultado_final, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanelBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(btnMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir)
                        .addGap(81, 81, 81))))
        );

        getContentPane().add(jpanelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texto_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_ingresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_ingresoActionPerformed

    private void ConvertirDivisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertirDivisaActionPerformed
         //text_ingreso jtextfield en donde se ingresa el valor a convertir.

        try {

            valor = Double.parseDouble(texto_ingreso.getText());
            
            // valor 1 y 2, muestra la seleccion de cada item en el combobox.
            String valor1 = valor_1.getSelectedItem().toString();
            String valor2 = valor_2.getSelectedItem().toString();
            

            //conecta con la clase calculo.
            Calculos c = new Calculos();

            //setear los valores hacia los metodos. 
            c.setValor(valor);
            c.setMonedas(monedas);
            c.setCambiobox1(cambiobox1);
            c.setCambiobox2(cambiobox2);
            c.setValor_1(valor1);
            c.setValor_2(valor2);

            //ejecutar el metodo
            c.calcular();
            //mostrar el resultado en el jtextarea.
            resultado_final.setText("" + "El resultado es: "+"$"+ c.calcular());
             
          

        } catch (NumberFormatException e) {
            //muestra un mensaje de error si el dato ingresado es nulo.
            JOptionPane.showMessageDialog(null, " Error, Debe ingresar un dato" );

        
        }

    }//GEN-LAST:event_ConvertirDivisaActionPerformed

    private void texto_ingresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texto_ingresoMouseClicked
         //genera la accion al presionar mouse se borra el dato anterior.
        texto_ingreso.setText("");
    }//GEN-LAST:event_texto_ingresoMouseClicked

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        //lleva al menu principal.
        MenuOpcion mopt = new MenuOpcion ();
        mopt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       //codigo boton salir.
        System.exit(WIDTH);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(PanelDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelDivisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConvertirDivisa;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpanelBackground;
    private javax.swing.JLabel resultado_final;
    private javax.swing.JTextField texto_ingreso;
    private javax.swing.JComboBox<String> valor_1;
    private javax.swing.JComboBox<String> valor_2;
    // End of variables declaration//GEN-END:variables
}
