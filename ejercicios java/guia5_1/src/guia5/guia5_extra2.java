//Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
package guia5;

import java.util.Scanner;

public class guia5_extra2 {
        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Escriba el tamaño de los vectores:");
            int tamaño = leer.nextInt();
            int[] vector1 = new int[tamaño];
            int[] vector2 = new int[tamaño];

            System.out.println("Ok, ahora vamos a llenar el primer vector.");
            for (int i = 0; i < tamaño; i++) {
                System.out.println("Ingrese el valor:");
                int valor1 = leer.nextInt();
                vector1[i] = valor1;
            }

            System.out.println("Ok, ahora el segundo vector.");
            boolean valoresIguales = true; // variable de bandera para verificar si los valores son iguales
            for (int i = 0; i < tamaño; i++) {
                System.out.println("Ingrese el valor:");
                int valor2 = leer.nextInt();
                vector2[i] = valor2;

                if (vector1[i] != vector2[i]) {
                    valoresIguales = false;
                    break;
                }
            }

            if (valoresIguales) {
                System.out.println("Todos los valores de ambos vectores son iguales.");
            } else {
                System.out.println("Los valores de ambos vectores no son iguales.");
            }
        }
    }
