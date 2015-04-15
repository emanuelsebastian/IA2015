import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelIngresoDatos extends JPanel{
    
    public JLabel nombre, apellido_padre, apellido_madre, edad, nota_media;
    public JTextField ingresar_nombre,ingresar_apellido_padre,
            ingresar_apellido_madre,ingresar_edad,ingresar_nota_media;
    
    public PanelIngresoDatos() {
        //configuracion automatica de componentes en forma de grid
        this.setLayout(new GridLayout(5,5));
        //instanciacion
        nombre=new JLabel("Nombre");
        ingresar_nombre=new JTextField();
        apellido_padre=new JLabel("Apellidos Padre");
        ingresar_apellido_padre=new JTextField();
        apellido_madre=new JLabel("Apellidos Madre");
        ingresar_apellido_madre=new JTextField();
        edad=new JLabel("Edad");
        ingresar_edad=new JTextField();
        nota_media=new JLabel("Edad");
        ingresar_nota_media=new JTextField();
        //añadimos componentes al panel
        add(nombre,0);
        add(ingresar_nombre,1);
        add(apellido_padre,2);
        add(ingresar_apellido_padre,3);
        add(apellido_madre,4);
        add(ingresar_apellido_madre,5);
        add(edad,6);
        add(ingresar_edad,7);
        add(nota_media,8);
        add(ingresar_nota_media,9);
    }
    
    
}
