//a un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá 
//de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá 
//imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
package guia3;

import java.util.Scanner;

public class guia3_4 {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String entrada = scanner.nextLine();

        if (entrada.substring(0, 1).equals("A") || entrada.substring(0, 1).equals("a")) {//tambien puedo usar entrada.substring(0,1).toUpperCase().equals("A")
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
