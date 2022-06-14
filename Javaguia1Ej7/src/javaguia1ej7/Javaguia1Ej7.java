/*EJERCICIO 7
Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos 
que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y 
permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente
     */
package javaguia1ej7;

import java.util.Scanner;

public class Javaguia1Ej7 {

    public static void main(String[] args) {
   
            Scanner leer = new Scanner(System.in);
      int tipoMotor;
        System.out.println("Elija la opción de tipo de  motor de bomba para mover fluidos : ");
        System.out.println("Tipo de motor 1");
        System.out.println("Tipo de motor 2");
        System.out.println("Tipo de motor 3");
        System.out.println("Tipo de motor 4");
        
        tipoMotor = leer.nextInt();
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2: 
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de homigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba opción "+ tipoMotor);
        }
    }
    
}
