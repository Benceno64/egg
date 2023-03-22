package guia5;

import java.util.Scanner;
public class guia5_3 {
  public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
           System.out.println("ingrese el tamaño del vector");
           int num = leer.nextInt();
           int [] vector =new int[num];
           for (int i = 0; i< vector.length; i++) {
               System.out.println("ingrese valores de hasta 5 digitos");
               int numvalor= leer.nextInt();
           vector[i] =numvalor;
    }
    for (int i = 0; i< vector.length; i++) {
   String numString = Integer.toString(vector[i]);
   int longitud = numString.length();
        if (longitud==5) {
            System.out.println("el numero en posicion " + i  + " tiene 5 digitos");  
        }
         if (longitud==4) {
            System.out.println("el numero en posicion " + i  + " tiene 4 digitos");
         }
          if (longitud==3) {
            System.out.println("el numero en posicion " + i  + " tiene 3 digitos");
          }
           if (longitud==2) {
            System.out.println("el numero en posicion " + i  + " tiene 2 digitos");
           }
            if (longitud==1) {
               System.out.println("el numero en posicion " + i + " tiene 1 digito");
}
}
}
}