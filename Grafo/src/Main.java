
import grafo1.Arista;
import grafo1.Grafo;
import grafo1.Vertice;



public class Main {
    
    public static void main(String[] args) {
        
        Grafo<Integer> grafo=new Grafo<>();
        
        Vertice<Integer> v1= new Vertice<>(1);
        Vertice<Integer> v2= new Vertice<>(2);
        Vertice<Integer> v3= new Vertice<>(3);
        
        
        Arista<Integer> a1=new Arista<>(v1,v2);
        Arista<Integer> a2=new Arista<>(v1,v3);
        
        
        grafo.insertarVertice(v1);
        grafo.insertarVertice(v2);
        grafo.insertarVertice(v3);
        
        System.out.println(grafo.toString());
        
    }
    
}
