/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package javaguia01ej11;
import java.util.Scanner;

public class JavaGuia01Ej11 {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
             Scanner leer= new Scanner(System.in);
             
        double num1,num2;
        int operacion;
        String respuesta;
        System.out.println("Ingrese dos nùmeros enteros:");
        
        num1=leer.nextDouble();
        num2= leer.nextDouble();

        do {
            
        System.out.println("Elija una opcion del menu: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar ");
        System.out.println("3. Multiplicar ");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        
        
        operacion= leer.nextInt();
        switch (operacion){
            case 1:
                System.out.println("Sumar: la suma de "+num1+" y "+num2 +"=" + (num1+ num2));
                break;
            case 2:    
                System.out.println("Resta: la resta de "+num1+" y "+num2 +"=" +(num1- num2));
                break;
            case 3:   
                System.out.println("Multiplicaciòn : la multiplicaciòn de "+num1+" y "+num2 +"=" +(num1* num2));
                break;
            case 4:
                System.out.println("Divisiòn: la divisiòn de "+num1+" y "+num2 +"=" +(num1/ num2));
                break;
            case 5:
                System.out.println("Salir");
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
               respuesta= leer.nextLine();        
               while(respuesta.equalsIgnoreCase("S"));
             continue;
             
            default:
                System.out.println(" Opcion incorrecta ");
                break;
        }
          
    } while (operacion!=5);  
               
                   } 

          
        
} 
       
    
    

