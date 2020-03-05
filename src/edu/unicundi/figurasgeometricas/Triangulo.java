/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometricas;

/**
 *
 * @author Andres Gomez - Ruby Cardenas
 */
public class Triangulo extends FigurasGeometricas {

    private String tipoTriangulo;

    public String getTipoTriangulo() {
        return tipoTriangulo;
    }

    public Triangulo(int coordenadaX1, int coordenadaX2, int coordenadaX3, int coordenadaY1, int coordenadaY2, int coordenadaY3) {
        super(coordenadaX1, coordenadaX2, coordenadaX3, coordenadaY1, coordenadaY2, coordenadaY3);
    }

    @Override
    public void hallarArea() {
        float heron;
        heron = getPerimetro() / 2;
        setArea((int) Math.sqrt(heron * (heron - getLado1()) * (heron - getLado2()) * (heron - getLado3())));
    }

    public void hallarAreaEquilatero() {
        setArea((int) (Math.sqrt(3) * (Math.pow(2, getLado2()))));
    }

    @Override
    public void hallarPerimetro() {
        setPerimetro(getLado1() + getLado2() + getLado3());
    }

    public void hallaTipo() {
        if (getLado1() == getLado2() && getLado2() == getLado2()) {
            tipoTriangulo = "Equilatero";
        } else if (getLado1() == getLado2() || getLado2() == getLado3()) {
            tipoTriangulo = "Isoceles";
        } else if ((Math.pow(getLado1(), 2) + Math.pow(getLado2(), 2) == (Math.pow(getLado3(), 2)))) {
            tipoTriangulo = "Rectangulo";
        } else {
            tipoTriangulo = "Escaleno";
        }
    }
}
