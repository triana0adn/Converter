/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.panel.temp;

/**
 *
 * @author Asus
 */
public class CalculoTemp {

    
    private double temp;
    private String temperaturasItem [];
    private double resultado_final_temp;
    private String itemperatura;

    public double getResultado_final_temp() {
        return resultado_final_temp;
    }

    public void setResultado_final_temp(double resultado_final_temp) {
        this.resultado_final_temp = resultado_final_temp;
    }

    public String getItemperatura() {
        return itemperatura;
    }

    public void setItemperatura(String itemperatura) {
        this.itemperatura = itemperatura;
    }
    
    

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String[] getTemperaturasItem() {
        return temperaturasItem;
    }

    public void setTemperaturasItem(String[] temperaturasItem) {
        this.temperaturasItem = temperaturasItem;
    }

    public CalculoTemp() {
    }
    
    
    
    public double calcularTemp(){
        
       
        if (itemperatura.equals("Fahrenheit")) {
            
            resultado_final_temp = temp *  1.8 + 32;
            
        } else if (itemperatura.equals("Kelvin")){
        
          resultado_final_temp = temp + 273.15 ;
        }
        
        
        
        return resultado_final_temp;
    }
    
    

    
}
    

