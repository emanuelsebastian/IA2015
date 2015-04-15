/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructura_datos.cola;


interface Cola<T> { // TAD COLA
    
   String tipo_estructura_datos="TAD COLA";
   
   default String getTipo()  {
      return tipo_estructura_datos;
   }

   public void poner(T n);
   public void quitar();
   public void colavacia();
   public boolean esvacia();
   public void vaciar();
   public T primero();
   public String nombre_cola();
   public T clone();
   @Override String toString();
   @Override boolean equals ( Object x );
  
}
