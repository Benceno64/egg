/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author drago
 */
public class guia3_guia5 {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros entre 1 y 20");
        int num1=leer.nextInt();
        while (num1<1 || num1>20){
            System.out.println("El numero debe estar entre 1 y 20");
            num1=leer.nextInt();
        }
        
        int num2=leer.nextInt();
        while (num2<1 || num2>20){
            System.out.println("El numero debe estar entre 1 y 20");
            num2=leer.nextInt();
        }
        
        int num3=leer.nextInt();
        while (num3<1 || num3>20){
            System.out.println("El numero debe estar entre 1 y 20");
            num3=leer.nextInt();
        }
        
        int num4=leer.nextInt();
        while (num4<1 || num4>20){
            System.out.println("El numero debe estar entre 1 y 20");
            num4=leer.nextInt();
        }
        System.out.print(num1 + " ");
        for (int i=1; i<=num1; i++){
            System.out.print("*");
        }
         System.out.println("");
         System.out.print(num2 + " ");
        for (int i=1; i<=num2; i++){
            System.out.print("*");
        }
         System.out.println("");
         System.out.print(num3 + " ");
        for (int i=1; i<=num3; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num4 + " ");
        for (int i=1; i<=num4; i++){
            System.out.print("*");
        }
         System.out.println("");
    
}
}
