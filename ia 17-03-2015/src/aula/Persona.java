/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula;

public class Persona {
    
    private String rut;
    private String nombre;
    private int edad;
public Persona (String r, String n, int e)
    {
    rut=r;
    nombre=n;
    edad=e;
    }
    
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString(){
        String cadena="";
        cadena+="[ Rut "+rut+" Nombre "+nombre+" Edad "+ edad+" ]";
        return cadena;
    }
    
    public boolean equals(Object x){
        Persona aux;
       if (x instanceof Persona){
           aux=(Persona) x;
           return this.rut.equals(aux.rut);
       }else return false;
        
        
    }
    
}
