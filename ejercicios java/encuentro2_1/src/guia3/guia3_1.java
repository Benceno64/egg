//Crear un programa que dado un número determine si es par o impar.

package guia3;

import java.util.Scanner;

/**
 *
 * @author drago
 */
public class guia3_1 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      System.out.println("ingrese un numero");
      double num=leer.nextInt();
        if (num % 2 == 0){
            System.out.println("su numero es par");
         } else if ( num % 2 != 0) {
                    System.out.println("su numero es impar");
        }
        }      
        }
    
    

