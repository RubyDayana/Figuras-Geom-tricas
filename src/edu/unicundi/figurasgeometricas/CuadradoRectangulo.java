/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometricas;

/**
 *
 * @author Andres Gomez - Ruby Cardenas */
public abstract class CuadradoRectangulo extends FigurasGeometricas {

    private int coordenadaX4;
    private int coordenadaY4;

    public int getCoordenadaX4() {
        return coordenadaX4;
    }

    public void setCoordenadaX4(int coordenadaX4) {
        this.coordenadaX4 = coordenadaX4;
    }

    public int getCoordenadaY4() {
        return coordenadaY4;
    }

    public void setCoordenadaY4(int coordenadaY4) {
        this.coordenadaY4 = coordenadaY4;
    }
    private int lado4;
    
    public CuadradoRectangulo(int coordenadaX1, int coordenadaX2, int coordenadaX3, int coordenadaY1, int coordenadaY2, int coordenadaY3, int coordenadaX4, int coordenadaY4) {
        super(coordenadaX1, coordenadaX2, coordenadaX3, coordenadaY1, coordenadaY2, coordenadaY3);
        this.coordenadaX4 = coordenadaX4;
        this.coordenadaY4 = coordenadaY4;

    }

    public void hallarLado() {
        this.lado4 = (int) Math.sqrt(Math.pow((coordenadaX4 - getCoordenadaX3()), 2) + Math.pow((coordenadaY4 - getCoordenadaY3()), 2));
    }

    public int getLado4() {
        return lado4;
    }

  

   

}