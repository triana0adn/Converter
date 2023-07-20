/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.panel.divisas;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Calculos {
      private String valor_1;
    private String valor_2;
    private double valor;
    private double resultado_final;
    private String monedas [];
    private int  cambiobox1 [];
    private double cambiobox2 [];

    public int[] getCambiobox1() {
        return cambiobox1;
    }

    public void setCambiobox1(int[] cambiobox1) {
        this.cambiobox1 = cambiobox1;
    }

    public double[] getCambiobox2() {
        return cambiobox2;
    }

    public void setCambiobox2(double[] cambiobox2) {
        this.cambiobox2 = cambiobox2;
    }
   

    public String[] getMonedas() {
        return monedas;
    }

    public void setMonedas(String[] monedas) {
        this.monedas = monedas;
    }

    public String getValor_1() {
        return valor_1;
    }

    public void setValor_1(String valor_1) {
        this.valor_1 = valor_1;
    }

    public String getValor_2() {
        return valor_2;
    }

    public void setValor_2(String valor_2) {
        this.valor_2 = valor_2;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getResultado_final() {
        return resultado_final;
    }

    public void setResultado_final(double resultado_final) {
        this.resultado_final = resultado_final;
    }

    public Calculos() {
        
        
    }
    
     
    public double calcular (){
        
        
        
        
        
         String  de = "USD";
         String a = "a";
         int i = 0; 
         
         
         switch (de) {
             
            case "USD":
                     try {
                         
                         
                      if (valor_1.equals("CLP-Peso Chileno") && valor_2.equals("USD-DOLAR")) {
                    resultado_final = valor * cambiobox2[0];
                    
                } else if (valor_1.equals("USD-DOLAR") && valor_2.equals("CLP-Peso Chileno"))
                   resultado_final = valor * cambiobox1 [0] ;
                
         
                  if (valor_1.equals("CLP-Peso Chileno") && valor_2.equals("EUR-EURO")) {
                    resultado_final = valor * cambiobox2[1];
                } else if (valor_1.equals("EUR-EURO") && valor_2.equals("CLP-Peso Chileno"))
                   resultado_final = valor * cambiobox1 [1] ;
                
                
                 if (valor_1.equals("CLP-Peso Chileno") && valor_2.equals("GBP-Libra Esterlina")) {
                    resultado_final = valor * cambiobox2[2];
                } else if (valor_1.equals("GBP-Libra Esterlina") && valor_2.equals("CLP-Peso Chileno"))
                   resultado_final = valor * cambiobox1 [2];
                 
                   if (valor_1.equals("CLP-Peso Chileno") && valor_2.equals("JPY-Yen")) {
                    resultado_final = valor * cambiobox2[3];
                } else if (valor_1.equals("JPY-Yen") && valor_2.equals("CLP-Peso Chileno"))
                   resultado_final = valor * cambiobox1[3];
                   
               
                   if (valor_1.equals("CLP-Peso Chileno") && valor_2.equals("KRW-Won SurCoreano")) {
                    resultado_final = valor * cambiobox2[4];
                } else if (valor_1.equals("KRW-Won SurCoreano") && valor_2.equals("CLP-Peso Chileno"))
                   resultado_final = valor * cambiobox1[4];   
                   
                   
                     }catch(Exception e){
                         JOptionPane.showMessageDialog(null, "Debe seleccionar un valor válido en ambos JComboBox.", "Error", JOptionPane.ERROR_MESSAGE);
                     }
                
                break;
  
            }
                
    
         
         
         
       
      return resultado_final;  
      
        }
    
    
    
}
