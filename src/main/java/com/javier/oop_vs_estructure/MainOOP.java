package com.javier.oop_vs_estructure;


public class MainOOP {


    public static void main(String[] args) {
        // Let's create coord x,y with class Coord
        Coord coord = new Coord(0, 1);
        
        // Let's create four coods for a square
        Coord coord1 = new Coord(0, 0);
        Coord coord2 = new Coord(0, 5);
        Coord coord3 = new Coord(5, 5);
        Coord coord4 = new Coord(5, 0);
        
        // let's compact coords into an array for better management
        Coord[] squareCoods = {coord1, coord2, coord3, coord4};
        
        // let's create a new class to represent Square
    }
    
}
