
import aula.Persona;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         Persona persona= new Persona("23","Pepe",23);
     Persona persona2= new Persona("22","Margarita",45);
     Persona persona3= new Persona("24","Carmelo",45);
        
        ArrayList<Persona> lista_personas = new ArrayList<>();
        
        lista_personas.add(persona);
        lista_personas.add(persona2);
        
        
        System.out.println(lista_personas.toString());
            
        if(lista_personas.contains(persona3)){
            System.out.print("LA PERSONA YA ESTÁ INCLUIDA");
        }else{
            lista_personas.add(persona3);
            System.out.println("SE INSERTO UNA NUEVA PERSONA");
        }
        System.out.println(lista_personas.toString());
       
        }
    }
