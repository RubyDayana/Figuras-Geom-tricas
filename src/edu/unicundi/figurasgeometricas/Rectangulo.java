/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometricas;

/**
 *
 * @author PIPE
 */
public class Rectangulo extends CuadradoRectangulo{

    public Rectangulo(int coordenadaX1, int coordenadaX2, int coordenadaX3, int coordenadaY1, int coordenadaY2, int coordenadaY3, int coordenadaX4, int coordenadaY4) {
        super(coordenadaX1, coordenadaX2, coordenadaX3, coordenadaY1, coordenadaY2, coordenadaY3, coordenadaX4, coordenadaY4);
    }

    @Override
    public void hallarPerimetro() {
        setPerimetro(getLado1()+getLado2()+getLado3()+getLado4());
    }

    @Override
    public void hallarArea() {
        setArea(getLado1()*getLado2());
    }
    
}
