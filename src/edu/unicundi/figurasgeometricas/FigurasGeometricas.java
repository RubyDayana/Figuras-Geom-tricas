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
public abstract class FigurasGeometricas implements IOperaciones {

    private int coordenadaX1;
    private int coordenadaX2;
    private int coordenadaX3;
    private int coordenadaY1;
    private int coordenadaY2;
    private int coordenadaY3;
    private int perimetro;
    private float area;
    private int lado1;
    private int lado2;
    private int lado3;

    public FigurasGeometricas(int coordenadaX1, int coordenadaX2, int coordenadaX3, int coordenadaY1, int coordenadaY2, int coordenadaY3) {

        this.coordenadaX1 = coordenadaX1;
        this.coordenadaX2 = coordenadaX2;
        this.coordenadaX3 = coordenadaX3;
        this.coordenadaY1 = coordenadaY1;
        this.coordenadaY2 = coordenadaY2;
        this.coordenadaY3 = coordenadaY3;

    }

    public void hallarLados(int coordenadaX1, int coordenadaX2, int coordenadaX3, int coordenadaY1, int coordenadaY2, int coordenadaY3) {

        this.lado1 = (int) Math.sqrt(Math.pow((coordenadaX2 - coordenadaX1), 2) + Math.pow((coordenadaY2 - coordenadaY1), 2));
        this.lado2 = (int) Math.sqrt(Math.pow((coordenadaX3 - coordenadaX2), 2) + Math.pow((coordenadaY3 - coordenadaY2), 2));
        this.lado3 = (int) Math.sqrt(Math.pow((coordenadaX1 - coordenadaX3), 2) + Math.pow((coordenadaY1 - coordenadaY3), 2));

    }

    public void setCoordenadaX1(int coordenadaX1) {
        this.coordenadaX1 = coordenadaX1;
    }

    public void setCoordenadaX2(int coordenadaX2) {
        this.coordenadaX2 = coordenadaX2;
    }

    public void setCoordenadaX3(int coordenadaX3) {
        this.coordenadaX3 = coordenadaX3;
    }

    public void setCoordenadaY1(int coordenadaY1) {
        this.coordenadaY1 = coordenadaY1;
    }

    public void setCoordenadaY2(int coordenadaY2) {
        this.coordenadaY2 = coordenadaY2;
    }

    public void setCoordenadaY3(int coordenadaY3) {
        this.coordenadaY3 = coordenadaY3;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public int getCoordenadaX1() {
        return coordenadaX1;
    }

    public int getCoordenadaX2() {
        return coordenadaX2;
    }

    public int getCoordenadaX3() {
        return coordenadaX3;
    }

    public int getCoordenadaY1() {
        return coordenadaY1;
    }

    public int getCoordenadaY2() {
        return coordenadaY2;
    }

    public int getCoordenadaY3() {
        return coordenadaY3;
    }

    public float getArea() {
        return area;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

}