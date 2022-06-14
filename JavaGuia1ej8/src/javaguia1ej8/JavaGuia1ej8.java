 /*EJERCICIO 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se 
pedirá de nuevo hasta que la nota sea correcta.
     */
package javaguia1ej8;
import java.util.Scanner;

public class JavaGuia1ej8 {

   
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);

 int num;
        System.out.println("ingrese un numero (nota) entre 1 y 10 ");
 num= leer.nextInt();
 
 while ( num>=1 && num <= 10) {
     System.out.println("la nota igresada es correcta ");  
continue;     
} 
        System.out.println(" vuelva a ingresar una nota entre 1 y 10 ");
    }    
}
