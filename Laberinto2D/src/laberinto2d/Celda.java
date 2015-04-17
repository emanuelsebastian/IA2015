/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto2d;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
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
    
    boolean seleccionado; // estado de la celda

   
    public Celda(int x, int y) {
        this.x = x;
        this.y = y;
        this.altura = x + sizeCell;
        this.anchura = y + sizeCell;
    }
    
    @Override
    public void update(Graphics g) {
        if (seleccionado) {
            g.drawRect(x, y, sizeCell, sizeCell);
            g.fillRect(x, y, sizeCell, sizeCell);
        }else {
            g.drawRect(x, y, sizeCell, sizeCell);
        }
    }

    // metodo para dibujar celda
    @Override
    public void paintComponent(Graphics g) {
        //g.drawRect(x, y, sizeCell, sizeCell);
        update(g);
    }
    
    public boolean dentro_area(int xp, int yp) {
        Rectangle r = new Rectangle(x, y, sizeCell, sizeCell);
        return r.contains(new Point(xp, yp));
    }

}


