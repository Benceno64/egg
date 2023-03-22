//Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector. 
//El programa mostrará dónde se encuentra el numero y si se encuentra repetido
package guia5;

import java.util.Scanner;

public class guia5_2 {
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
           System.out.println("ingrese el tamaño del vector");
           int num = leer.nextInt();
           int [] vector =new int[num];
           System.out.println("ingrese un numero a buscar");
           int numb= leer.nextInt();
           
           for (int i = 0; i< vector.length; i++) {
           vector[i]=(int) (Math.random()*10);
        }
            for (int i = 0; i< vector.length; i++) {
                if (numb==vector[i]) {
                    System.out.println("el numero " + numb + " se encontro en la posicion " + i );
                    
           }   
        }    
    }
}
