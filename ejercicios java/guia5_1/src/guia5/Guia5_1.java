//Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
package guia5;

import java.util.Scanner;

public class Guia5_1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //dimensionamos  y declaramos el vector de la siguiente forma
        int[] vector = new int[100];
       for (int i = 0; i < vector.length; i++) {
     vector[i]=i;
       }
    for (int i  = vector.length -1; i >= 0 ; i--) {
        System.out.println(vector[i]);
    }
    
    }
    }    

