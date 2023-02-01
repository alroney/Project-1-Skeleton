/*
 * Name: Andrew Roney
 * Date: 02/01/2023
 * Project: Project 1
 * Description: This file contains the class definition for the SolidPolygon class.
 *  It is a subclass of Polygon_ and is used to draw a solid polygon.
 *  It uses the vertices to calculate the points of the polygon.
 *  It then uses the draw function from Polygon_ to draw the polygon.
 *  It also uses the color to fill the polygon.
*/

import java.awt.*;

abstract class SolidPolygon extends Polygon_ {
    //Constructor: creates a new SolidPolygon object
    public SolidPolygon(Color color, int vertices){
        super(color, vertices);
    }
}
