/*
 *Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package JavaGuia01Ej10;
import java.util.Scanner;

public class JavaGuia01Ej10 {
    
    public static void main(String[] args) {
             Scanner leer= new Scanner(System.in);
             int num;   
       
        int suma = 0;

        do {
            System.out.println("introdusca numeros positivos");
            num= leer.nextInt();
            suma=suma+num;
            
        } while (!(suma>50));
        System.out.println("La suma de los números ingresados es: " +suma+" Supera el limite inicial");
        
        }
    
}
