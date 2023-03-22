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

public class guia3_guia2 {
    
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 1 número entre 1 y 4");
        
        int tipoMotor = leer.nextInt();

        switch (tipoMotor) {
               case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");

        }
    }
}
    
