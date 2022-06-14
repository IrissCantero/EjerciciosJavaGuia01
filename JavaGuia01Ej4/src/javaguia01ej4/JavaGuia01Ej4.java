/*
 *Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package javaguia01ej4;
import java.util.Scanner;

public class JavaGuia01Ej4 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        double C, F;
         System.out.println("Ingrese los grados Centígrado para saber su equivalencia en Fahrenheit : ");
         C = leer.nextDouble();
         F = 32 + (9 * C / 5);
         System.out.println( C +" ºC = " + F + " ºF");
        
        
    }
    
}
