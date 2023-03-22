//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas.Crear un programa que 
//permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos, es decir,
//están entre el 1 y el 9.
package guia5;

import java.util.Scanner;

public class guia5_6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz= new int[3][3];
        
        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            int valor;
        do {   
        System.out.println("ingrese los valores de la matriz (solo valores del 1 al 9");
        valor=leer.nextInt();
        matriz[i][j] = valor;
        } while (valor<1 && valor>10);
    }
        }
    int a;
            a = matriz[0][0] + matriz[0][1] + matriz[0][2];
    int b;
            b = matriz[1][0] + matriz[1][1] + matriz[1][2];
    int c;
            c = matriz[2][0] + matriz[2][1] + matriz[2][2];
    int d;
            d = matriz[0][0] + matriz[1][0] + matriz[2][0];
    int e;
            e = matriz[0][1] + matriz[1][1] + matriz[2][1];
    int f;
            f = matriz[0][2] + matriz[1][2] + matriz[2][2];
    int g;
            g = matriz[0][0] + matriz[1][1] + matriz[2][2];
    int h;
            h = matriz[2][0] + matriz[1][1] + matriz[0][2];
    
     if (a== b && a==c && a== d && a== e && a== f && a== g && a==h && b== a && b==c && b== d && b== e && b== f && b== g && b==h && c== a && c==b && c== d && c== e && c== f && c== g && c==h && d== c && d==b && d== c && d== e && d== f && d== g && d==h && e== a && e==b && e== c && e== d && e== f && e== g && e==h && f== b && f==c && f== d && f== e && f== a && f== g && f==h && g== b && g==c && g== d && g== e && g== f && g== a && g==h && h== b && h==c && h== d && h== e && h== f && h== g && h==a )  {
            System.out.println("felicidades, la suma de tus numeros resulto en un cubo magico");   
            }
     else 
                System.out.println("el cubo no es magico");
     for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matriz[i][j] = matriz[i][j] * -1;
            System.out.print("[" + matriz[i][j] + "]");
      }
        System.out.println("");
    }
    }
    
    }

