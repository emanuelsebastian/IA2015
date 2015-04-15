/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pila;

/**
 *
 * @author Alumno
 */
public class PilaDinamica <T> {
 
    public Nodo<T> cima;
    
    public PilaDinamica(){
        
        
        cima=null;
    }
    
    public void Apilar(T x){
        Nodo<T> nuevo_elemento=new Nodo<T>(x);
        Nodo<T> aux;
       
        
        if(cima==null){
            cima=nuevo_elemento;
                    
        }else{
            aux=cima;
            cima=nuevo_elemento;
            cima.enlace=aux;
        }
    }
    
    public void Desapilar(){
        
        cima=cima.enlace;
        
    }
    
    @Override
    public String toString(){
        String cadena="";
        Nodo<T> aux=cima;
        
        while(aux!=null){
            cadena+=""+aux.info.toString();
            aux=aux.enlace;
        }
        return cadena;
    }
    
}
