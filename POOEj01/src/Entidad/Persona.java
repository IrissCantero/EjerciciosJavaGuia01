/*
EJERCICIO PERSONA – ATRIBUTOS
Seguiremos trabajando sobre la clase Persona que creamos y ahora deberás sumarle 3 atributos 
que creas pertinentes
 */
package Entidad;
import java.util.Date;

public class Persona {
    public String nombre;
    public Date fechaDeNac;
    public String signo;
    public String genero;
    public String altura;
    

    public Persona(String nombre, Date nacimiento, String signo, String genero, String altura) {
        this.nombre = nombre;
        this.fechaDeNac = nacimiento;
        this.signo = signo;
        this.genero = genero;
        this.altura = altura;
    }

    public Persona() {
        
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
    
    public String getNombre (){
        return nombre;
    }

    public Date getFechaDeNac() {
        return fechaDeNac;
    }

    public String getSigno() {
        return signo;
    }

    public String getGenero() {
        return genero;
    }

    public String getAltura() {
        return altura;
    }
}
