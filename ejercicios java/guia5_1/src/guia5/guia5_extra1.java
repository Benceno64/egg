//Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
package guia5;

import java.util.Scanner;

public class guia5_extra1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int dimension= leer.nextInt();
        int [] vector = new int [dimension];
        int contador = 0;
        int valor;
        for (int i = 0; i < dimension; i++) {
            System.out.println("ponga un valor");
            valor = leer.nextInt();
            contador =contador + valor;
        }
        System.out.println("La suma de todos sus valores es " + contador);
    }   
}
