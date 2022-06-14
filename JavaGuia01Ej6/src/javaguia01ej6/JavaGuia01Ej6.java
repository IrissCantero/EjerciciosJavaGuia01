/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package javaguia01ej6;
import java.util.Scanner;
public class JavaGuia01Ej6 {

   
    public static void main(String[] args) {
              Scanner leer= new Scanner(System.in);
              
    int num;
        System.out.print(" Igrese un número entero: ");
        num= leer.nextInt();
        
        if (num %2==0) {
            System.out.println("El número " +num+ " es Par");
        } else 
            System.out.println("El número "+num+ " es Impar");
            
        }
        }
 
    

