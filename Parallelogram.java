/*
 * Name: Andrew Roney
 * Date: 02/01/2023
 * Project: Project 1
 * Description: This file contains the class definition for the Parallelogram class. It is a subclass of Polygon_ and is used to draw a parallelogram.
 *  It uses the upper left and lower right points to calculate the points of the parallelogram. It then uses the draw function from Polygon_ to draw the parallelogram. It also uses the color to fill the parallelogram.
 */

import java.awt.*;

public class Parallelogram extends Polygon_ {
    private int[] xPoints;
    private int[] yPoints;
    private Color color;

    //Constructor: creates a parallelogram with the given color, upper left point, lower right point, and offset
    public Parallelogram(Color color, Point upperLeft, Point lowerRight, int xOffset){
        super(color);
        this.color = color;
        int x1 = upperLeft.x;
        int y1 = upperLeft.y;
        int x2 = lowerRight.x;
        int y2 = lowerRight.y;

        xPoints = new int[] {x1, x2, x2 - xOffset, x1 - xOffset};//X points are the same as the rectangle, but the x2 point is moved to the left by the offset
        yPoints = new int[] {y1, y1, y2, y2};//Y points are the same as the rectangle
    }

    //Method: draws the parallelogram
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillPolygon(xPoints, yPoints, 4);
    }
}
