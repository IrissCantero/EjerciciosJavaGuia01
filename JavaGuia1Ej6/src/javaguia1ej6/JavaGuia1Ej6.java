/*Ejercicio6
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o 
alguno de ellos es mayor a 25
     */
package javaguia1ej6;

import java.util.Scanner;

public class JavaGuia1Ej6 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
      
       int num1;
       int num2;
        System.out.println("ingrese dos numeros enteros");
       num1= leer.nextInt();
       num2= leer.nextInt();
      
       if ( num1>= 25 || num2 >= 25 ) {
           System.out.println(" Los numeros igresados son igual o mayor a 25 ");
    } else {
           System.out.println("Los numeros ingresados son menores a 25");
}
       }
}

