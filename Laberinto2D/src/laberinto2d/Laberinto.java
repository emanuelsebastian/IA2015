/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto2d;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author EMANUEL
 */
public class Laberinto extends JComponent implements Constantes {

    public int ancho,largo;
    public Celda[][] casillas;

    public Laberinto(){
        casillas = new Celda[heightGameWorld][widthGameWorld];
        for (int i = 0; i < heightGameWorld; i++) {
            for (int j = 0; j < widthGameWorld; j++) {
                casillas[i][j] = new Celda(i + (i * sizeCell), j + (j * sizeCell));
            }
        }

        this.ancho = widthGameWorld * sizeCell;
        this.largo = heightGameWorld * sizeCell;
    }

    @Override
    public void paintComponent(Graphics g) {
        for (int i = 0; i < heightGameWorld; i++) {

            for (int j = 0; j < widthGameWorld; j++) {

                casillas[i][j].paintComponent(g);
            }
        }
    }
    
    
    @Override
    public void update(Graphics g) {
        for (int i = 0; i<heightGameWorld ; i++) {
            for (int j = 0; j<widthGameWorld ; j++) {
                if (casillas[i][j].seleccionado) {
                    casillas[i][j].update(g);
                    g.setColor(Color.BLUE);
                }
            }
        }


        }
}

