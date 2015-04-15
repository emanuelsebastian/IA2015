/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructura_datos.pila;

import java.lang.reflect.Array;


public class PilaEstatica<T> extends Pila<T> {

    private T[] elementos;
    private int cima;

    public PilaEstatica (String nombrePila,int n) {
      super(nombrePila);
      elementos=(T[]) new Object[n];
      cima=-1;
   }

    @Override
    public boolean EsVacia() {  return cima==-1; }
    
    @Override
    public void Apilar(T x) {
      ++cima;
      elementos[cima]=x;
    }

    @Override
    public void Desapilar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T Cima() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object clone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
