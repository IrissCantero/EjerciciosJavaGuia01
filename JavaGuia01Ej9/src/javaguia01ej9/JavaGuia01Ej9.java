/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase 
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que 
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar 
la función Substring y equals() de Java
 */
package javaguia01ej9;
import java.util.Scanner;

public class JavaGuia01Ej9 {

    public static void main(String[] args)   {
        Scanner leer= new Scanner(System.in);
        String palabra;
        String letra;
         letra="A";
        System.out.print("Ingrese una palabra: ");
        palabra= leer.nextLine();
        if (palabra.substring(0, 1).equals(letra) ) {
            System.out.println("Correcto");
        }else
            System.out.println("Incorrecto");
        
    }
    
}
