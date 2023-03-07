/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;

/**
 *
 * @author drago
 */
public class holamundo {
    public static void main(String[] args) {
        // SE CREA UNA VARIABLE SCANNER PARA LEER LOS DATOS DEL USUARIO
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("ingresa tu nombre");
        nombre = leer.next( );
        System.out.println("holamundo soy" + nombre + " y estoy programando en yaba");
    }
    
}
