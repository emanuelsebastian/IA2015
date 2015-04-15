package clase;

public class Alumno extends Persona {
    
    public double nota_media;
    
    public Alumno(String n, String r, int e,double nota_media) {
        super(n,r,e);
        this.nota_media=nota_media;
    }
    
    @Override
    public String toString() {
        return super.toString()+", Nota "+nota_media+" ; ";
    }
            
}
