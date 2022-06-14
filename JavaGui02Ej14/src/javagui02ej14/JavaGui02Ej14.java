/*
 *Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package javagui02ej14;
import java.util.Scanner;

public class JavaGui02Ej14 {
    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        double libras,pesos,yenes,n = 0;
        libras=librasAeuros(n);
        pesos= pesosAeuros(n);
        yenes= yenesAeuros(n);
        System.out.println("ingrese un monto ");
         n= leer.nextDouble();
        System.out.println("Elija la moneda que desea convertir a euros: ");
        System.out.println("1: libras ");
        System.out.println("2: pesos");
        System.out.println("3: yenes ");
      int opciones;
        opciones= leer.nextInt();
    switch (opciones){
        case 1:
            System.out.println("libras "+libras);
      break;
        case 2:
            System.out.println("pesos "+pesos);
      break;      
        case 3:
            System.out.println("yenes "+yenes);
     break;   
        
    }
   
   }
    
    public static double librasAeuros (double n){
         double librasAeuros;
              librasAeuros   = n* 0.86;
         return librasAeuros;
    }
    
    public static double pesosAeuros(double n){
        double pesosAeuros;
        pesosAeuros= n * 1.28611;
        return pesosAeuros;
    }
    
    public static double yenesAeuros(double n){
        double yenesAeuros;
        yenesAeuros= n * 129.852;
        return yenesAeuros;        
    }
}    