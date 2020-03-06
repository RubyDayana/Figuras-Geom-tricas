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
     * Este método obtiene los valores de las coordenadas y el índice de
     * selelción de la figura y grafica la figura seleccionada.
     *
     * @param seleccionFigura obtiene el índice de selección de la figura
     * @param coordenada1X obtiene el valor de x de la coordenada 1
     * @param coordenada1Y obtiene el valor de y de la coordenada 1
     * @param coordenada2X obtiene el valor de x de la coordenada 2
     * @param coordenada2Y obtiene el valor de y de la coordenada 2
     * @param coordenada3X obtiene el valor de x de la coordenada 3
     * @param coordenada3Y obtiene el valor de y de la coordenada 3
     * @param coordenada4X obtiene el valor de x de la coordenada 4
     * @param coordenada4Y obtiene el valor de y de la coordenada 4
     * @param g
     */
    protected void paintComponent(int seleccionFigura, int coordenada1X, int coordenada1Y, int coordenada2X, int coordenada2Y, int coordenada3X, int coordenada3Y, int coordenada4X, int coordenada4Y, Graphics g) {
        super.paintComponent(g);

        switch (seleccionFigura) {
            case 1:

                g.drawLine((int) coordenadaX(coordenada1X), (int) coordenadaY(coordenada1Y), (int) coordenadaX(coordenada2X), (int) coordenadaY(coordenada2Y));
                g.drawLine((int) coordenadaX(coordenada2X), (int) coordenadaY(coordenada2Y), (int) coordenadaX(coordenada3X), (int) coordenadaY(coordenada3Y));
                g.drawLine((int) coordenadaX(coordenada3X), (int) coordenadaY(coordenada3Y), (int) coordenadaX(coordenada1X), (int) coordenadaY(coordenada1Y));
                break;

            case 2:
                g.drawLine((int) coordenadaX(coordenada1X), (int) coordenadaY(coordenada1Y), (int) coordenadaX(coordenada2X), (int) coordenadaY(coordenada2Y));
                g.drawLine((int) coordenadaX(coordenada2X), (int) coordenadaY(coordenada2Y), (int) coordenadaX(coordenada3X), (int) coordenadaY(coordenada3Y));
                g.drawLine((int) coordenadaX(coordenada3X), (int) coordenadaY(coordenada3Y), (int) coordenadaX(coordenada4X), (int) coordenadaY(coordenada4Y));
                g.drawLine((int) coordenadaX(coordenada4X), (int) coordenadaY(coordenada4Y), (int) coordenadaX(coordenada1X), (int) coordenadaY(coordenada1Y));
                //g.fillRect(coordenada1X, coordenada1Y, coordenada3X, coordenada3Y);
                break;

            case 3:
                g.drawLine((int) coordenadaX(coordenada1X), (int) coordenadaY(coordenada1Y), (int) coordenadaX(coordenada2X), (int) coordenadaY(coordenada2Y));
                g.drawLine((int) coordenadaX(coordenada2X), (int) coordenadaY(coordenada2Y), (int) coordenadaX(coordenada3X), (int) coordenadaY(coordenada3Y));
                g.drawLine((int) coordenadaX(coordenada3X), (int) coordenadaY(coordenada3Y), (int) coordenadaX(coordenada4X), (int) coordenadaY(coordenada4Y));
                g.drawLine((int) coordenadaX(coordenada4X), (int) coordenadaY(coordenada4Y), (int) coordenadaX(coordenada1X), (int) coordenadaY(coordenada1Y));
                //g.fillRect(coordenada1X, coordenada1Y, coordenada3X, coordenada3Y);
                break;
        }

        //repaint();
    }

    /**
     * Este método convierta las coordenadas en X a coordenadas que se pueden
     * pintar en el plano cartesiano
     *
     * @param x
     * @return
     */
    private double coordenadaX(double x) {
        Interfaz plano = new Interfaz();
        double xReal = x + plano.getPlanoCartesiano().getWidth() / 2;
        return xReal;
    }

    /**
     * Este método convierta las coordenadas en Y a coordenadas que se pueden
     * pintar en el plano cartesiano
     *
     * @param y
     * @return
     */
    private double coordenadaY(double y) {
        Interfaz plano = new Interfaz();
        double yReal = -y + plano.getPlanoCartesiano().getHeight() / 2;
        return (yReal);
    }

    /**
     * Este método obtiene el índice de selección del color y pinta la figura
     * del color seleccionadado.
     *
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
