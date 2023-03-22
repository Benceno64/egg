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
public class guia3_guia4 {
    public static void main(String[] args){
        Scanner leer= new Scanner(System.in);
        int num;
        int suma= 0;
        int cont = 1;
        do {
            num = leer.nextInt();
            cont = cont +1;
            if (num > 0) {
                suma = suma+num;
            } else if (num == 0) {
                System.out.println("Se capturo el numero cero");
                break;
            }
                
        } while (cont <= 20);
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
}
