/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.celsiusfarenheit;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author JUAN MERCEDES
 */
public class CelsiusFarenheitClass implements CelsiusFarenheitInterf{

        static Scanner entrada = new Scanner(System.in);
    public void calcular() {
        
        int opcion =0;
        double celsius;
        double total;
        
     
        
        do{
            
        System.out.println("Menu de conversion");
        System.out.println("1.-Conversion de Celsius a Farenheint");
        System.out.println("2.-Salir del programa");
        
        opcion = entradavalida(entrada);
        
     
        switch(opcion){
            case 1:
                System.out.print("Digite los Grados Celsius para convertir a Farenheint ");
                celsius = entradavalida(entrada);
                total = celsius *1.8 +32;
                
                System.out.println("La conversion es: "+total+"ºF");
                System.out.println("");
                break;
                
            case 2:
                System.out.println("Estas saliendo del programa");
                break;
        }
       
                
                
        
        
        
    }while(opcion !=2);

           
    }
    

    
    public static int entradavalida(Scanner entrada){
        int entrada2 = 0;
        boolean entradaValida = false;
        
        while(!entradaValida){
            try{
                entrada2 = entrada.nextInt();
                entradaValida = true;
            }catch (InputMismatchException e){
                System.out.println("Error - Intentalo otra vez mmg ");
                entrada.next();
            }
        }
        return entrada2;
        
    }
        
    
    
}
