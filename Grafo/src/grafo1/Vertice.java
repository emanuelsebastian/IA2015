
package grafo1;

import java.util.ArrayList;


public class Vertice <T>{
    
public T info;   
public ArrayList<Arista<T>> aristas;

    public Vertice(T info){
        this.info=info;
        aristas=new ArrayList<>();
    }
    
    public void InsertarArista(Arista<T> a)
    {
        aristas.add(a);
    }
@Override
    public String toString(){
        return "info: "+info.toString()+"--->"+aristas.toString();
    }
}
