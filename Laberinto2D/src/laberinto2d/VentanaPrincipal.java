/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto2d;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author EMANUEL
 */
public class VentanaPrincipal extends JFrame implements Constantes {

    public Lienzo lienzo;

    public VentanaPrincipal() {
        lienzo = new Lienzo();
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(lienzo);
        this.setSize(lienzo.getWidth(), lienzo.getHeight());
    }
}
