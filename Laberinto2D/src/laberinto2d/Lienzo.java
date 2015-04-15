/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto2d;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

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
    }

    @Override
    public void paint(Graphics g) {
        laberinto.paintComponent(g);

    }

}