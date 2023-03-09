/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
package encuentro1_1;

import java.util.Scanner;

/**
 *
 * @author drago
 */
public class encentro1_4 {
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
        System.out.println("escribe los grados que quieres convertir a Fahrenheit");
        float grados = leer.nextInt();
        float faren = 32 + (9 * grados/ 5);
        System.out.println("Los grados que ingresaste serian: " + faren + " Fahrenheits");

    }
    
}
