/*
 EJERCICIO 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package javaguia1ej10;
 import java.util.Scanner;

public class JavaGuia1Ej10 {
    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
         int N;
         for (int i = 0; i < 4; i++) {
        System.out.println("Introduce un números: ");
        N = leer.nextInt(); 
             for (int j =1 ; j<=N && N<= 20; j++) { 
        System.out.print("*");
             }
         } 
         System.out.println(" ");
        System.out.println("Se Introdujeron 4 números "
                + " Fin del programa");
    } 
    
}
