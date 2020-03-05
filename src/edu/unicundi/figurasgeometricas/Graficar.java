/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometricas;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Ruby Dayana Cárdenas - Andrés Felipe Gómez
 */
public class Graficar extends JPanel {
    /**
     * Este método obtiene los valores de las coordenadas y el índice de selelción de la figura 
     * y grafica la figura seleccionada.
     * @param seleccionFigura obtiene el índice de selección de la figura
     * @param coordenada1X    obtiene el valor de x de la coordenada 1
     * @param coordenada1Y    obtiene el valor de y de la coordenada 1 
     * @param coordenada2X    obtiene el valor de x de la coordenada 2 
     * @param coordenada2Y    obtiene el valor de y de la coordenada 2 
     * @param coordenada3X    obtiene el valor de x de la coordenada 3
     * @param coordenada3Y    obtiene el valor de y de la coordenada 3 
     * @param coordenada4X    obtiene el valor de x de la coordenada 4
     * @param coordenada4Y    obtiene el valor de y de la coordenada 4
     * @param g 
     */
    protected void paintComponent(int seleccionFigura, int coordenada1X, int coordenada1Y, int coordenada2X, int coordenada2Y, int coordenada3X, int coordenada3Y, int coordenada4X, int coordenada4Y, Graphics g) {
        super.paintComponent(g);
        switch (seleccionFigura) {
            case 1:
                g.drawLine(coordenada1X, coordenada1Y, coordenada2X, coordenada2Y);
                g.drawLine(coordenada2X, coordenada2Y, coordenada3X, coordenada3Y);
                g.drawLine(coordenada3X, coordenada3Y, coordenada1X, coordenada1Y);
                break;

            case 2:
                g.drawLine(coordenada1X, coordenada1Y, coordenada2X, coordenada2Y);
                g.drawLine(coordenada2X, coordenada2Y, coordenada3X, coordenada3Y);
                g.drawLine(coordenada3X, coordenada3Y, coordenada4X, coordenada4Y);
                g.drawLine(coordenada4X, coordenada4Y, coordenada1X, coordenada1Y);
                g.fillRect(coordenada1X, coordenada1Y, coordenada3X, coordenada3Y);
                break;

            case 3:
                g.drawLine(coordenada1X, coordenada1Y, coordenada2X, coordenada2Y);
                g.drawLine(coordenada2X, coordenada2Y, coordenada3X, coordenada3Y);
                g.drawLine(coordenada3X, coordenada3Y, coordenada4X, coordenada4Y);
                g.drawLine(coordenada4X, coordenada4Y, coordenada1X, coordenada1Y);
                g.fillRect(coordenada1X, coordenada1Y, coordenada3X, coordenada3Y);
                break;
        }
        repaint();
    }
    /**
     * Este método obtiene el índice de selección del color y pinta la figura del color seleccionadado.
     * @param opcionColor obtiene el índice de selección del color.
     * @param g 
     */
    public void seleccionarColor(int opcionColor, Graphics g) {
        super.paintComponent(g);
        switch (opcionColor) {
            case 1: {
                g.setColor(Color.blue);
            }
            break;
            case 2: {
                g.setColor(Color.yellow);
            }
            break;
            case 3: {
                g.setColor(Color.red);
            }
            break;
            case 4: {
                g.setColor(Color.green);
            }
            break;
            case 5: {
                g.setColor(Color.magenta);
            }
            break;
            default: {
                g.setColor(Color.black);
            }
        }
        repaint();
    }
}
