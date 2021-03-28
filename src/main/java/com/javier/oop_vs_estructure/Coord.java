package com.javier.oop_vs_estructure;

public class Coord {

    // ATTRIBUTES
    private int xCoord;
    private int yCoord;

    // CONSTRUCTORS
    public Coord() {
    }

    public Coord(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    // SOME METHODS THAT YOU NEED
    // METHODS GETTER, SETTERS AND TOSTRING 

    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    @Override
    public String toString() {
        return "Coord{" + "xCoord=" + xCoord + ", yCoord=" + yCoord + '}';
    }
    
}
