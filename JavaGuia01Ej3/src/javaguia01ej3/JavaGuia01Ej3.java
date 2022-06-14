/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package javaguia01ej3;
import java.util.Scanner;

public class JavaGuia01Ej3 {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
       String frase;
       
        System.out.print("Ingrese una frase: ");
        frase= leer.nextLine();
         System.out.print("En MAYUSCULA: ");  
        System.out.println(frase.toUpperCase());  
     
        System.out.print("En minuscula: "); 
        System.out.println(frase.toLowerCase());

     }
    
}
