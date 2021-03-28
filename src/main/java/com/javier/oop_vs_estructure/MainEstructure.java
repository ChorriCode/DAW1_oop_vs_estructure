/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javier.oop_vs_estructure;

/**
 *
 * @author JavierHS
 */
public class MainEstructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // let's create two integer variables for coordenates x,y
        int x = 1;
        int y = 0;

        // let's create four coords to do square vertice coords, starting with (0,0)
        // And after we wil create a method for print coords
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 5;
        int x3 = 5;
        int y3 = 5;
        int x4 = 5;
        int y4 = 0;

        // let's compact coords into an array for better management
        // And after we wil create a method for print coords
        int[] squareCoods = {x1, y1, x2, y2, x3, y3, x4, y4};

        paintSaquare(x1, y1, x2, y2, x3, y3, x4, y4);
        System.out.println("-------------------------------");
        paintSaquare2(squareCoods);
    }

    public static void paintSaquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        System.out.println("Coord1: (" + x1 + "," + y1 + ")");
        System.out.println("Coord2: (" + x2 + "," + y2 + ")");
        System.out.println("Coord3: (" + x3 + "," + y3 + ")");
        System.out.println("Coord4: (" + x4 + "," + y4 + ")");
    }

    public static void paintSaquare2(int[] squareCoods) {
        for (int i = 0; i < squareCoods.length - 1; i += 2) {
            System.out.println("Coord" + i + ": (" + squareCoods[i] + "," + squareCoods[i + 1] + ")");
        }
    }
}       
