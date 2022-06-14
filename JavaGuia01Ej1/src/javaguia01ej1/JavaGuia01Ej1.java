/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
dos. El programa deberá después mostrar el resultado de la suma
 */
package javaguia01ej1;
import java.util.Scanner;

public class JavaGuia01Ej1 {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
         int num1, num2;
        System.out.println("Ingrese dos numeros enteros: ");
               num1 = leer.nextInt();
               num2= leer.nextInt();
        System.out.println("La suma entre "+ num1+ " y "+ num2+"  = "+ (num1+num2));


    }
    
}
