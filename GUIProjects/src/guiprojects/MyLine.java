
package guiprojects;

//Class MyLine: to draw lines
import java.awt.Color;
import java.awt.Graphics;

public class MyLine
{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color myColor;
    
    // no-argument constructor
    public MyLine()
    {
        this(0, 0, 0, 0, Color.BLACK);
    }
    
    public MyLine(int x1, int y1, int x2, int y2, Color color)
    {
        setCoordinates(x1, x2, y1, y2); //calling method setCoordinates to initialize variables
        setColor(color);
    }
    
    //call methods to set coordinates
    public void setCoordinates(int x1, int y1, int x2, int y2)
    {
        setX1(x1);
        setX2(x2);
        setY1(y1);
        setY2(y2);
    }
    
    public void setX1(int x)
    {
        if(x >= 0)
            x1 = x;
        else
            x1 = 0;
    }
    
    public void setY1(int y)
    {
        if(y >= 0)
            y1 = y;
        else
            y1 = 0;
    }
    
    public void setX2(int x)
    {
        if(x >= 0)
            x2 = x;
        else
            x2 = 0;
    }
    
    public void setY2(int y)
    {
        if(y >= 0)
            y2 = y;
        else
            y2 = 0;
    }
    
    public void setColor(Color color)
    {
        myColor = color;
    }
    
    public int getX1()
    {
        return x1;
    }
    
    public int getX2()
    {
        return x2;
    }
    
    public int getY1()
    {
        return y2;
    }
    
    public int getY2()
    {
        return y2;
    }
    
    public Color getColor()
    {
        return myColor;
    }
    
    public void draw(Graphics g)
    {
        g.setColor(myColor);
        g.drawLine(getX1(), getX2(), getY1(), getY2());
    }
}