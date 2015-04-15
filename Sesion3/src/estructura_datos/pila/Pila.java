

package estructura_datos.pila;

abstract class Pila<T> { // TIPO ABSTRACTO DE DATO PILA
   protected String nombrePila;

   public Pila(String nombrePila) {
      this.nombrePila=nombrePila;
   }

   public Pila() {}

   public String getNombrePila() {
      return nombrePila;
   }
   //operaciones
   public abstract void Apilar(T n); //Apila un objeto en la pila
   public abstract void Desapilar(); //Desapila un objeto de la pila
   public abstract boolean EsVacia(); //Nos dice si la pila es vacía
   public abstract T Cima(); //Nos devuelva el objeto de la cima
   //métodos que todo objeto Java debe tener
   @Override
   public abstract boolean equals(Object p); //Nos dice si dos pilas son iguales
   @Override
   public abstract String toString(); //Nos devuelve la información de la pila en cadena
   @Override
   public abstract Object clone();  //Nos devuelve un clone de la pila
        
}   