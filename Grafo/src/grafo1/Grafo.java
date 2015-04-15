
package grafo1;

import java.util.ArrayList;


public class Grafo<T> {
    public  ArrayList<Vertice> vertices;
    
    
    public Grafo(){
        vertices= new ArrayList<>();
        
    }
    
    public void insertarVertice(Vertice<T> v){
        vertices.add(v);
        
    }
    @Override
    public String toString(){
        String cadena="";
        for (int i=0; i<vertices.size();i++){
            cadena+="\n"+vertices.get(i).toString();
        }
        return cadena;
    }
}

