
import java.util.Scanner;

//Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras.
//La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//(void).
///El cambio de divisas es:
///i. * 0.86 libras es un 1 €
///ii. * 1.28611 $ es un 1 €
///iii. * 129.852 yenes es un 1 €

public class guia4_3 {

  public static void main(String[] args) {
        Scanner  read = new Scanner (System.in);
        float euro;
        String guita = "";
        int cont=0;
        System.out.println("ingrese la cantidad de euros a convertir");
        euro=read.nextFloat();
        do {     
             System.out.println("elegi la moneda a convertir");
             guita = read.next();
              cont = cont + 1 ;
             if (cont >= 1 && !guita.equals("libras") && !guita.equals("dolares") && !guita.equals("yenes")) {
                 System.out.println("error en el nombre de la moneda ingresada");
             }
            
        } while (!guita.equals("libras") && !guita.equals("dolares") && !guita.equals("yenes") );
        conver(guita,euro);
        

    }
    public static void conver(String guita, float euro)  {
        double convertir;
        switch (guita) {
            case "libras":
                System.out.println(euro + " Euros. equivalen a :" + (convertir = euro * 0.86) + " libras");
                break;
            case "dolares":
                System.out.println(euro + " Euros. equivalen a :" + (convertir = euro * 1.28611) + " Dolares");
                break;
            case "yenes":
                System.out.println(euro + " Euros. equivalen a :" + (convertir = euro * 129.852) + " Yenes");
                break;
        }
    }
}
        
    