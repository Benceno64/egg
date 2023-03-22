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
public class guia3_guia1 {
    public static void main(String[] args){

   Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
       

        if (num1 > 25 || num2 > 25) {
            if (num1 > 25 && num2 > 25) {
                System.out.println("Ambos números ingresados son mayores que 25");
            } else {
                System.out.println("Uno de ellos es mayor a 25");
        }} else {
            System.out.println("Ninguna es mayor de 25");
        }
    }
}
