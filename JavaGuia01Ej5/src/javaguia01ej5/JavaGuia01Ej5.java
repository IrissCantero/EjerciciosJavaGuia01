/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
doble, el triple y la raíz cuadrada de ese número. 
 */
package javaguia01ej5;
import java.util.Scanner;
public class JavaGuia01Ej5 {

    
    public static void main(String[] args) {
           Scanner leer= new Scanner(System.in);
       int num;
        System.out.print("Ingrese un número entero: ");
        num= leer.nextInt();
      
        System.out.println("El doble de " + num + " = "+ 2*num);
        System.out.println("El triple de " + num+ " = "+ 3*num);                              
       
        
    }
    
}
