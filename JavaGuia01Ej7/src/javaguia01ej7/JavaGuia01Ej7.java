/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar 
la función equals() en Java
 */
package javaguia01ej7;
import java.util.Scanner;

public class JavaGuia01Ej7 {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
      String frase1;
      String frase2;
      frase2= "eureka";
        System.out.print("Ingrese una frase: ");
        frase1= leer.nextLine();
        
        if (frase1.equals(frase2)) {
            System.out.println("Correcto");  
        } else 
            System.out.println("Incorrecto");
    
    }  
}
