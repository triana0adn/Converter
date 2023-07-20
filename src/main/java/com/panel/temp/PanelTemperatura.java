/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.panel.temp;
import menu.MenuOpcion;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Triana  Gonzalez Lemus
 */
public class PanelTemperatura extends javax.swing.JFrame {

    
    
     double temp;
    
    private String [] temperaturasItem = {
    "Fahrenheit",
    "Kelvin"
    };
    

    
    public PanelTemperatura() {
        initComponents();
        
          //llama al metodo 
        cargarTemperaturas();
    }

   
    //llena el combobox con llos items del arreglo temperaturas.
    private void cargarTemperaturas(){
        for (int i = 0; i < temperaturasItem.length; i++) {
            itemperatura.addItem(temperaturasItem[i]);
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        background = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCelcius = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        resultado_final_temp = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JButton();
        itemperatura = new javax.swing.JComboBox<>();
        btnsalir = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel2.setText("Conversor de temperatura");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 230, 60));

        txtCelcius.setForeground(new java.awt.Color(102, 102, 102));
        txtCelcius.setText("Ingrese temperatura en ºC");
        txtCelcius.setBorder(null);
        txtCelcius.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCelciusMouseClicked(evt);
            }
        });
        background.add(txtCelcius, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 330, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 330, 10));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel3.setText("ºC");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 30, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel4.setText("ºK");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 30, 30));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel5.setText("ºF");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 30, 30));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setText(" Seleccione una opcion:");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/temp1.png"))); // NOI18N
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, 240));

        resultado_final_temp.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        resultado_final_temp.setForeground(new java.awt.Color(51, 51, 51));
        background.add(resultado_final_temp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 240, 100));

        btnConvertir.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });
        background.add(btnConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 150, 30));

        itemperatura.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        itemperatura.setForeground(new java.awt.Color(255, 255, 255));
        itemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemperaturaActionPerformed(evt);
            }
        });
        background.add(itemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 330, -1));

        btnsalir.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        background.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 150, -1));

        btnmenu.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnmenu.setText("Volver al menu");
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });
        background.add(btnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        //codigo boton salir.
        System.exit(WIDTH);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        //lleva al menu principal.
        MenuOpcion mopt = new MenuOpcion ();
        mopt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed

        try {
        //obtiene lo ingresado en celcius, lo guarda en variable temp.
         temp = Double.parseDouble(txtCelcius.getText());
        //obtiene el item seleccionado en el combobox, lo convierte a string.
         String temperaturabox = itemperatura.getSelectedItem().toString();
         
         
         
         //conexion puente  con la clase calculoTemp.
         CalculoTemp ct = new CalculoTemp();
         
         
         ct.setTemp(temp);
         ct.setItemperatura(temperaturabox);
        
         
         //ejecuta el metodo con los calculos
         
         ct.calcularTemp();
         
         //muestra el resultado en el jtextarea.
         resultado_final_temp.setText(""+ "El resultado es :"+ ct.calcularTemp() +"º");
         
         
         
         
           } catch (NumberFormatException e) {
            //muestra un mensaje de error si el dato ingresado es nulo.
            JOptionPane.showMessageDialog(null, "Error, Debe ingresar un dato" );

        
        }
        
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void txtCelciusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCelciusMouseClicked
        //al hacer click borra el dato ingresado para ingresar el nuevo.
            txtCelcius.setText("");

    }//GEN-LAST:event_txtCelciusMouseClicked

    private void itemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemperaturaActionPerformed

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
            java.util.logging.Logger.getLogger(PanelTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelTemperatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnsalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> itemperatura;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel resultado_final_temp;
    private javax.swing.JTextField txtCelcius;
    // End of variables declaration//GEN-END:variables
}
