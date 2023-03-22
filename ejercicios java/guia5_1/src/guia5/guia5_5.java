//Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
//pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
package guia5;

import java.util.Scanner;

public class guia5_5 {
public static void main(String[] args) {
int[][] matriztraspuesta= new int[3][3];
    System.out.println("MATRIZ A");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matriztraspuesta[i][j]=(int) (Math.random()*10);
            System.out.print("[" + matriztraspuesta[i][j] + "]");
        }
        System.out.println("");
    }
    System.out.println("MATRIZ TRASPUESTA (AT)");
for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matriztraspuesta[i][j] = matriztraspuesta[i][j] * -1;
            System.out.print("[" + matriztraspuesta[i][j] + "]");
      }
        System.out.println("");
    }
  }
}
