
/*
program to draw square-shaped and circular spirals
*/
package guiprojects;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSpiral extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int w = width;
        int h = height;
        int x = w;
        int y = h;
        int var = 20;
        
        // draw square-shaped spirals beginning with the inner spiral
        for(int counter = 0; counter < 10; counter++)
        {
            w = x;
            h = y;
            x = width - var;
            y = height + var;
            
            // first spiral
            g.drawLine(w, h, w, y);
            g.drawLine(w, y, x, y);
            
            w = x;
            h = y;
            x = width + var;
            y = height - var;
            
            // second spiral
            g.drawLine(w, h, w, y);
            g.drawLine(w, y, x, y);
            
            var += 20;
        }
        
        // draw circular spirals 
        int i = getWidth()/2;
        int j = getHeight()/2;
        int var1 = 20;
        int var2 = 10;
        for (int counter = 0; counter < 10; counter++)
        {
            g.drawArc(i - counter * var1, j - counter * var2 * 2, 
                    var1 + counter * var1 * 2, var1 + counter * var1 * 2, 0, 180);
            
            g.drawArc(i - var1 * (1 + counter), j - var2 * (1 + counter * 2),
                    var1 * 2 * (counter + 1), var1 * 2 * (counter + 1), 0, -180);
        }
    }
  
        

}

