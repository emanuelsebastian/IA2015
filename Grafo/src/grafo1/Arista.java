/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package grafo1;

/**
 *
 * @author Alumno
 */
public class Arista<T> {

   public Vertice<T> origen;
   public Vertice<T> destino;
   
    public Arista(Vertice<T> or, Vertice<T> des){
        origen=or;
        destino= des;
        or.InsertarArista(this);
    }
    
   @Override
    public String toString(){
        return destino.toString();
    }
}
