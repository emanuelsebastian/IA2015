import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    
    public static void main (String [] args) {
        //Objetos y variables que voy a utilizar
        /*Scanner lector=new Scanner(System.in);
        Scanner lector2=new Scanner(System.in);
        int nElementos=0;
        //Primer mensaje para pedir de cuantos elementos se compone el nombre
        System.out.println("Cuantos elementos tiene su nombre y apellidos ?");
        nElementos=lector.nextInt();
        //Creo una array de cadena de nElementos
        String[] nombre_apellidos=new String[nElementos];
        
        //Algoritmos...
        //Algoritmossssssss
        String leer_cadena;
        String aux;
       
        for (int i=0 ; i < nombre_apellidos.length;i++) {
            System.out.println("Introduzca cadena");
            leer_cadena=lector2.nextLine();
           
            aux=leer_cadena.substring(0,1).toUpperCase();
            aux+=leer_cadena.substring(1,leer_cadena.length()).toLowerCase();
            nombre_apellidos[i]=aux;
            aux="";
        }
        
        System.out.print("Su nombre es: ");
        for (String nombre_apellido : nombre_apellidos) {
            System.out.print(nombre_apellido+" ");
        }
        
        System.out.print("\n\n");*/
        
        Scanner lector=new Scanner(System.in);
        String leer_cadena,aux;
        int i=0;
        StringTokenizer separador;
        String[]nombre_apellidos;
        //Primer mensaje para pedir de cuantos elementos se compone el nombre
        System.out.println("Introduzca su nombre y apellidos");
        leer_cadena=lector.nextLine();
        
        separador=new StringTokenizer(leer_cadena,"");
        nombre_apellidos=new String[separador.countTokens()];
        
        while ( separador.hasMoreElements() ) {
            leer_cadena=separador.nextToken();
           
            aux=leer_cadena.substring(0,1).toUpperCase();
            aux+=leer_cadena.substring(1,leer_cadena.length()).toLowerCase();
            nombre_apellidos[i++]=aux;
            aux="";
        }
        
        System.out.print("Su nombre es: ");
        for (String nombre_apellido : nombre_apellidos) {
            System.out.print(nombre_apellido+" ");
        }
        
        System.out.print("\n\n");
    }
}
