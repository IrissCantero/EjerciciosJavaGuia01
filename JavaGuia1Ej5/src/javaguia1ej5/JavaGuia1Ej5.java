/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ej5;

import java.util.Scanner;
        
public class JavaGuia1Ej5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
   
        char caracter; 
        System.out.print("Introduce un carácter: ");
        caracter = leer.next().charAt(0);       
        System.out.println("Carácter introducido -> " + caracter);   
        
        long ln;
        System.out.print("Introduzca un número: ");
        ln = leer.nextLong();
                
        double radio;
        System.out.print("Introduzca número decimal: ");
         radio = leer.nextDouble();
    }
   
}
