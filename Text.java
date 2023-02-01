/*
 * Name: Andrew Roney
 * Date: 02/01/2023
 * Project: Project 1
 * Description: This file contains the class definition for the Text class.
 *  It is a subclass of Image and is used to draw text.
 *  It uses the color, location, and text to draw the text.
 */

import java.awt.*;

public class Text extends Image{
    private String text;
    private Color color;
    private Point location;

    public Text(Color color, Point location, String text){
        super(color);
        this.color = color;
        this.location = location;
        this.text = text;
    }
    
    public void draw(Graphics g){
        g.setColor(color);
        g.drawString(text, location.x, location.y);
    }
}
