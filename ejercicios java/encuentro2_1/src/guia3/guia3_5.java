//Escriba un programa en el cual se ingrese un valor limite positivo, y a continuacion solicite 
//numeros al usuario hasta que la suma de los numeros introducidos supere el limite inicial.
package guia3;

import java.util.Scanner;

public class guia3_5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("elija un numero para ser el limite");
        int limite = leer.nextInt();
        int cont= 0;
        do{  System.out.println("ahora ingrese numeros hasta sumar el numero limite");
        int num = leer.nextInt();
         cont = cont + num; 
        }while (cont <= limite);
        System.out.println("el numero ha sobrepasado el limite de :"+ limite + " "   + cont);
    }
    }     
    
    

