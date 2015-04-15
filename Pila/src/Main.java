
import pila.PilaDinamica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Main {
    
    public static void main(String[] args) {
        PilaDinamica<String> pila= new PilaDinamica();
        
        pila.Apilar("A");
        pila.Apilar("B");
        pila.Apilar("C");
    
        System.out.println(pila.toString());
        
       /*pila.Desapilar();
       pila.Desapilar();
       pila.Desapilar();
       pila.Desapilar();
    */
               }
    
    
}
