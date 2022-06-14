/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ej11.pkg2;
import java.util.Scanner;

public class JavaGuia1Ej112 {
    public static void main(String[] args, String á) {
Scanner leer = new Scanner(System.in);  
String frase;
        System.out.println("Ingrese una frase o palabra: ");
frase= leer.nextLine();
  frase = frase.replace("a","@");
  frase = frase.replace("e","#");
  frase = frase.replace("i","¡");
  frase = frase.replace("o","%");
  frase = frase.replace("u","*");
        System.out.println(frase);

      }
    
}


