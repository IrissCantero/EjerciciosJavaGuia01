/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().

 */
package javaguia01ej12;
import java.util.Scanner;

public class JavaGuia01Ej12 {

   
    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        String cadena;
        int correctas, incorrectas,longitud, longitud2;
        correctas=0;
        incorrectas=0;
        longitud=0;
        longitud2=0;
        do {
                System.out.println("Ingrese una cadena de 5 caracteres, que inicie con X y termine con O");
                 
                cadena= leer.nextLine();
                
                if (cadena.substring(0, 1).equalsIgnoreCase("X")&& cadena.substring(4, 5).equalsIgnoreCase("O")) {
                    System.out.println("Correctas");
                    correctas++;
            } else 
                    System.out.println("incorrectas");
                incorrectas++;
            
                
              } while (!"&&&&&".equals(cadena));
       
    if (cadena.length()==5) {
               longitud= longitud + correctas;
                    System.out.println("lacantidad de cadenas correctas ingresadas son: "+longitud);
            }else
                  longitud2= longitud2+incorrectas;
                System.out.println("La cantidad de cadena incorrectas ingresaddas son: "+longitud2);
     
    } 
}