
package guiprojects;

import javax.swing.JFrame;

public class DrawSpiralTest
{
    public static void main(String[] args)
    {
        DrawSpiral spiral = new DrawSpiral();
        
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(spiral);
        application.setSize(250, 250);
        application.setVisible(true);

    }
    
}

