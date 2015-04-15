/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructura_datos;

public class Nodo<T> {

   public T info;
   public Nodo enlace;
  
   public Nodo(T info) { 

      this.info=info;
      this.enlace=null;

   }
  
}

