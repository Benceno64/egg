/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author drago
 */
public class guia3_guia3 {
    public static void main(String[] args){
    //Escriba un programa que valide si una nota está entre 0 y 10, sino está 
       //entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
       Scanner leer= new Scanner(System.in);
       int nota = leer.nextInt();
       
       while (nota < 0 || nota > 10){
           System.out.println("La nota es incorrecta, ingresela nuevamente.");
           nota = leer.nextInt();
       }
        System.out.println("Su nota es de: "+nota);
    
}
}