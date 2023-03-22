//Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas 
//por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe
//preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
import java.util.Scanner;


public class guia4_2 {
   public static void main(String[] args) {
        menorMayor();
    }

    public static void menorMayor() {
        Scanner read = new Scanner(System.in);
        int edad;
        String nombre, op = "";
        while (!op.equals("no")) {
            System.out.println("ingrese el nombre de la persona");
            nombre = read.next();
            System.out.println("ingrese su edad");
            edad = read.nextInt();
            System.out.print(nombre + " ");
            System.out.println(" ");
            if (edad >= 18) {
                System.out.println("es mayor de edad");

            } else {
                System.out.println("es menor de edad");
            }
            System.out.println("queres seguir ingresando info? ");
            op = read.next();
        }
    }
}
