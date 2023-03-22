//Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector.

package guia5;

import java.util.Scanner;

public class guia3_extra4 {
    public static void main(String[] args) {
        double[] promedios = new double[10];
        int cantA = 0, cantD = 0, nota;
        double prom;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < promedios.length; i++) {
            prom = 0;
            System.out.println("Ingrese la nota de Primer trabajo práctico evaluativo del alumno " + (i + 1));
            nota = sc.nextInt();
            prom += nota*0.1; // prom = prom + nota;
            System.out.println("Ingrese la nota de Segundo trabajo práctico evaluativo del alumno " + (i + 1));
            nota = sc.nextInt();
            prom += nota*0.15;// prom = prom + nota;
            System.out.println("Ingrese la nota de Primer Integrador del alumno " + (i + 1));
            nota = sc.nextInt();
            prom += nota*0.25;// prom = prom + nota;
            System.out.println("Ingrese la nota de Segundo integrador del alumno " + (i + 1));
            nota = sc.nextInt() ;
            prom += nota*0.50;// prom = prom + nota;
            promedios[i] = prom;
        }
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] >= 7) {
                cantA++;
            } else {
                cantD++;
            }
        }
        System.out.println("La cantidad de aprobados es " + cantA);
        System.out.println("La cantidad de desaprobados es " + cantD);
    }
    
}
