
package guiprojects;

//Class DrawPanel: uses class MyLine, MyRectangle, MyOval to draw random shapes
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
    private Random randomNumbers = new Random();
    MyRectangle MyRect = new MyRectangle();
    MyOval MyOv = new MyOval();
    MyLine MyLn = new MyLine();
    
    private MyLine[] lines;
    private MyRectangle[] rectangles;
    private MyOval[] ovals;
        
    public DrawPanel()
    {
        setBackground(Color.WHITE);
        boolean flag = false;
        
        int x = 1 + randomNumbers.nextInt(5);// number of arrays to create
        
        lines = new MyLine[x];
        rectangles = new MyRectangle[x];
        ovals = new MyOval[x];
        
        for (int count = 0; count < x; count++)
        {
            MyOv.setX1(randomNumbers.nextInt(300));
            MyOv.setY1(randomNumbers.nextInt(300));
            MyOv.setX2(randomNumbers.nextInt(300));
            MyOv.setY2(randomNumbers.nextInt(300));
            
            MyRect.setX1(randomNumbers.nextInt(300));
            MyRect.setY1(randomNumbers.nextInt(300));
            MyRect.setX2(randomNumbers.nextInt(300));
            MyRect.setY2(randomNumbers.nextInt(300));
            
            MyLn.setX1(randomNumbers.nextInt(300));
            MyLn.setY1(randomNumbers.nextInt(300));
            MyLn.setX2(randomNumbers.nextInt(300));
            MyLn.setY2(randomNumbers.nextInt(300));
            
            //randomly change flag to indicate whether to fill or not
            int flag1 = 1 + randomNumbers.nextInt(2);
            if (flag1 == 1)
                flag = true;
            else
                flag = false;
            
            MyRect.setFlag(flag);
            MyOv.setFlag(flag);
            
            Color color = new Color(randomNumbers.nextInt(256),
            randomNumbers.nextInt(256), randomNumbers.nextInt(256));
            
            MyRect.setColor(color);
            MyOv.setColor(color);
            MyLn.setColor(color);
            
            //creating arrays of each shape using methods
            lines[count] = new MyLine(MyLn.getX1(), MyLn.getX2(), 
                    MyLn.getY1(), MyLn.getY2(), MyLn.getColor());
            
            rectangles[count] = new MyRectangle(MyRect.getUpperLeftX(), MyRect.getUpperLeftY(),
                MyRect.getWidth(), MyRect.getHeight(), MyRect.getColor(), MyRect.getFlag());
            
            ovals[count] = new MyOval(MyOv.getUpperLeftX(), MyOv.getUpperLeftY(),
                MyOv.getWidth(), MyOv.getHeight(), MyOv.getColor(), MyOv.getFlag());
            
        }
    }
    
    @Override
    public void  paintComponent(Graphics g)
    {
        super.paintComponent(g);

        //reiterating through each array to draw shape
        for (MyLine line : lines)
            line.draw(g);
        
        for (MyRectangle rect : rectangles)
            rect.draw(g);
        
        for (MyOval oval : ovals)
            oval.draw(g);
    }
    
}
