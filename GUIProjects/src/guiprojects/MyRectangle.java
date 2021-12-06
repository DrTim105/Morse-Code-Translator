
package guiprojects;

//Class MyRectangle: to draw rectangles(filled or empty)
import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle
{
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private Color myColor;
    boolean myFlag;
    
    public MyRectangle()
    {
        this(0, 0, 0, 0, Color.BLACK, false);
    }
    
    public MyRectangle(int x1, int y1, int x2, int y2, Color color, boolean flag)
    {
        setCoordinates(x1, x2, y1, y2);
        setColor(color);
        setFlag(flag);
    }
    
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
    
    public void setFlag(boolean flag)
    {
        myFlag = flag;
    }
    
    public int getUpperLeftX()
    {
        int x = 0;
        if (x1 < x2)
            x = x1;
        else if (x2 < x1 )
            x = x2;
        
        return x;
    }
    
    public int getUpperLeftY()
    {
        int y = 0;
        if (y1 < y2)
            y = y1;
        else if (y2 < y1)
            y = y2;
        
        return y;
    }
    
    public int getWidth()
    {
        int width = 0;
        width = x1 - x2;
      
        return Math.abs(width);
    }
    
    public int getHeight()
    {
        int height = 0;
        height = y1 - y2;
        
        return Math.abs(height);
    }
    
    public Color getColor()
    {
        return myColor;
    }
    
    public boolean getFlag()
    {
        return myFlag;
    }
    
    //method to draw shapes; uses flag to determine whether to fill or not
    public void draw(Graphics g)
    {
        g.setColor(getColor());
        if (getFlag() == true) 
            g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        else if (getFlag() == false)
            g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
    }
}
