

package clase;

import java.math.BigDecimal;
import java.util.Objects;


public class Persona {
    
    public String nombre;
    public String rut;
    public int edad;
    
    public Persona(String n, String r, int e) {
        nombre=n;
        rut=r;
        edad=e;
    }
    
    @Override
    public boolean equals(Object x) {
         Persona aux;
         if ( x instanceof Persona) {
             aux=(Persona) x;
             return this.toString().equals(aux.toString());
         }return false;
    }        

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.toString());
        return hash;
    }
            
    @Override
    public String toString() {
        return " Rut "+rut+" , Nombre "+nombre+" , Edad "+edad;
    }
    
}