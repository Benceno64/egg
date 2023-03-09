/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
package encuentro1_1;

import java.util.Scanner;


/**
 *
 * @author drago
 */
public class encuentro1_3 {
    //metodo main
    public static void main(String[] args) {
        //Scanner
        Scanner leer = new Scanner (System.in);
        //pedimos al usuario una frase
    System.out.println("escribe una frase");
    //se lee ka frase
    String frase = leer.nextLine();
    // a continuacion la frase en mayuscula
     System.out.println("La frase en mayuscula es " + frase.toUpperCase() );
     //ahora en minuscula
     System.out.println("La frase en minuscula es " +  frase.toLowerCase() );
     
}

}