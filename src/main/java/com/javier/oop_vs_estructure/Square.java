package com.javier.oop_vs_estructure;

public class Square {

    // ATTRIBUTES
    private Coord[] squareCoords = new Coord[4];

    // CONSTRUCTORS
    public Square() {
    }

    public Square(Coord[] squareCoords) {
        this.squareCoords = squareCoords;
    }

    // SOME METHODS THAT YOU NEED
    
    
    // METHODS GETTER, SETTERS AND TOSTRING 
    public Coord[] getSquareCoords() {
        return squareCoords;
    }

    public void setSquareCoords(Coord[] squareCoords) {
        this.squareCoords = squareCoords;
    }

    @Override
    public String toString() {
        return "Square{" + "squareCoords=" + squareCoords + '}';
    }
    
}
