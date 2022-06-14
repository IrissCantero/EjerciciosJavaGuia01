/*
EJERCICIO 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada 
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se 
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las 
vocales acentuadas) se mantienen sin cambios.
 */
package javaguia1ej11;
import java.util.Scanner;

public class JavaGuia1Ej11 {

    
    public static void main(String[] args){
  Scanner leer= new Scanner(System.in);
 String frase;
        System.out.println("Ingrese una frase o palabra: ");
  frase=  leer.nextLine();
  frase = frase.replace("a","@");
  frase = frase.replace("e","#");
  frase = frase.replace("i","¡");
  frase = frase.replace("o","%");
  frase = frase.replace("u","*");
        System.out.println(frase);

    }
}
