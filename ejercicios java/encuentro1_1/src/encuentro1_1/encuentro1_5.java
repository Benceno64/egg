/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
//Nota: investigar la función Math.sqrt().

package encuentro1_1;

import java.util.Scanner;

/**
 *
 * @author drago
 */
public class encuentro1_5 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
            System.out.println("escribe un numero entero");
                int num = leer.nextInt();
             System.out.println("el doble de tu numero es " + num * 2 );
                 System.out.println("el triple de tu numero es " + num * 3 );
                    System.out.println("la raiz cuadrada de tu numero es "  + (Math.sqrt(num))) ;                
    }
}
