/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma

package encuentro1_1;

import java.util.Scanner; 

/**
 *
 * @author drago
 */
public class Encuentro1_1 {

    /**
     * @param args the command line arguments
     */
   public static void main (String[] args){
    
         Scanner leer = new Scanner(System.in);
         System.out.println("ingresa un numero entero");
         int num1 = leer.nextInt();
         System.out.println("ingresa el segundo numero");
         int num2 = leer.nextInt();
         int suma = num1 + num2;
         System.out.println("el resultado es " + suma);
    }
}
