/*
 * 
 */
import java.awt.*;

public class SolidPolygon extends Polygon_ {
    private Color color;
    private int[] xPoints;
    private int[] yPoints;
    private int vertices;

    public SolidPolygon(Color color, int vertices){
        super(color);
        this.color = color;
        this.vertices = vertices;
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillPolygon(xPoints, yPoints, vertices);
    }
}
