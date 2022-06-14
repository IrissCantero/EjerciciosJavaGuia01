/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por 
pantalla.
 */
package javaguia01ej2;
import java.util.Scanner;

public class JavaGuia01Ej2 {

    public static void main(String[] args) {
         Scanner leer= new Scanner(System.in);
           String nombre;

         System.out.println(" Ingresa tu nombre : ");
         nombre = leer.nextLine();
         System.out.println("El nombre ingresado es: " + nombre);
    }
    
}