
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame{
    
    public JLabel etiqueta;
    public PanelIngresoDatos panel_ingreso_datos;
    public JButton boton;
    
    public VentanaPrincipal() {
        //configuracion de al ventana
        this.setTitle("Para cambiar el titulo");
        this.setSize(400,400); //para cambiar el tamaño
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().setBackground(Color.WHITE);
        //configuracion de los elementos
        etiqueta= new JLabel("FORMULARIO INGRESO DATOS");
        etiqueta.setBackground(Color.RED);
        etiqueta.setBounds(40,40,80,80);
        etiqueta.setOpaque(true);
        //
        panel_ingreso_datos=new PanelIngresoDatos();
        //
        boton=new JButton(" Añadir alumno ");
        //lo añadimos
        this.getContentPane().add(etiqueta,BorderLayout.NORTH);
        this.getContentPane().add(panel_ingreso_datos,BorderLayout.CENTER);
        this.getContentPane().add(boton,BorderLayout.SOUTH);    
    } 
}
