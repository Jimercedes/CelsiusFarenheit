/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.celsiusfarenheit;

/**
 *
 * @author JUAN MERCEDES
 */
public class CalculadoraBase {
    
    public double calculoCF(double a ,double b,double c){
        double formula = a* b + c ; 
                
        return formula;   
      
        
    }
    
    public double calculoCK(double a, double b){
        double formula = a + b;
        
        return formula;
    }
    
    public int multiplicar(int a, int b){
        int multiplica = a * b;
        
        return multiplica;
    }
    public int dividir(int a, int b){
        int divide = a/b;
        
        return divide;
    }
}
