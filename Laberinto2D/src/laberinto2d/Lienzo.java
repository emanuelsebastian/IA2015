/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto2d;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static laberinto2d.Constantes.heightGameWorld;
import static laberinto2d.Constantes.widthGameWorld;

/**
 *
 * @author EMANUEL
 */
public class Lienzo extends Canvas {
    Laberinto laberinto;

    public Lienzo() {
        laberinto = new Laberinto();
        this.setBackground(Color.ORANGE);
        this.setSize(laberinto.ancho, laberinto.largo);
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evt) {
                identificarCelda(evt);
                repaint();
            }
        });
    }
    
    @Override
    public void paint(Graphics g) {
        laberinto.paintComponent(g);

    }
    
    @Override
    public void update(Graphics g) {
        laberinto.update(g);
    }
    
     private void identificarCelda(MouseEvent evt) {
        for (int i = 0; i < heightGameWorld; i++) {
            for (int j = 0; j < widthGameWorld; j++ ) {
                if(laberinto.casillas[i][j].dentro_area(evt.getX(),evt.getY())){
                    laberinto.casillas[i][j].seleccionado = true;
                }
            }
        }
    }

}