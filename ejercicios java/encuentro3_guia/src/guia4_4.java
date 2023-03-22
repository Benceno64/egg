
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drago
 */
public class guia4_4 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float num;
        System.out.println("ingrese el numero al que quiera conocer su primocidad");
        num = read.nextFloat();
        verdadMentira(num);
        System.out.println(verdadMentira(num));
    }

    public static boolean verdadMentira(float num) {
        if (num % 2 == 0 && num !=2 ) return false;
        for (int i = 3; i < num; i+=2) {
            if(num%i==0)
                return false;
        }
        if (num == 0 || num == 1 || num == 4) {
    return false;
        }
        return true;
    }
}