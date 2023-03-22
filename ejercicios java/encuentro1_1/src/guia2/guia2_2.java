/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

package guia2;

import java.util.Scanner;

/**
 *
 * @author drago
 */
public class guia2_2 {
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        System.out.println("ingresa tu nombre");
        String nombre = leer.nextLine();
        System.out.println("tu nombre es " + nombre);
}
}