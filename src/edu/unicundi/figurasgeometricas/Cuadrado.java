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
public class Cuadrado extends CuadradoRectangulo{

    public Cuadrado(int coordenadaX1, int coordenadaX2, int coordenadaX3, int coordenadaY1, int coordenadaY2, int coordenadaY3, int coordenadaX4, int coordenadaY4) {
        super(coordenadaX1, coordenadaX2, coordenadaX3, coordenadaY1, coordenadaY2, coordenadaY3, coordenadaX4, coordenadaY4);
    }

    @Override
    public void hallarArea(){
        setArea((int) Math.pow(getLado1(), 2));
    }
    @Override
    public void hallarPerimetro(){
        setPerimetro(getLado1()*4);
    }
    
}
