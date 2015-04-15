/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto2d;

import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author EMANUEL
 */
public class Celda  extends JComponent implements Constantes{

    //cordenada x y
    public int x;
    public int y;
    //anchura altura
    public int altura;
    public int anchura;

   
    public Celda(int x, int y) {
        this.x = x;
        this.y = y;
        this.altura = x + sizeCell;
        this.anchura = y + sizeCell;
    }

    // metodo para dibujar celda
    @Override
    public void paintComponent(Graphics graphics) {
        graphics.drawRect(x, y, sizeCell, sizeCell);
    }

}
