//Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente
//menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
//El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
//directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter
//‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

package guia3;

import java.util.Scanner;

public class guia3_6 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        int opcion;
        String confirmar;
        
        boolean salir = true;

        do {
            System.out.println("Ingrese el primer numero");
            num1 = leer.nextInt();
        } while (num1 < 1);

        do {
            System.out.println("Ingrese el segundo numero");
            num2 = leer.nextInt();
        } while (num2 < 1);

        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opcion:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma de los numeros es " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multplicacion es " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La division es " + (num1 / num2));
                    break;
                case 5:
                    System.out.println(" ¿Está seguro que desea salir del programa (S/N)?");
                     confirmar = leer.next();
                    if (confirmar.equals("S")) {
                        salir = false;

                    } 
                    break;
                default:
                    System.out.println("Ingrese un valor valido, entre 1 y 5");
                    

            }
        } while (salir);
    }
}
    
