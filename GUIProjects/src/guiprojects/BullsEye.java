
/*
program to draw a bull’s-eye that alternates between two random colors
*/
package guiprojects;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;

public class BullsEye extends JPanel
{
    public void paintComponent(Graphics g)
    {
        Random randomNumbers = new Random();
        int r1 = randomNumbers.nextInt(256);
        int g1 = randomNumbers.nextInt(256);
        int b1 = randomNumbers.nextInt(256);
        
        int r2 = randomNumbers.nextInt(256);
        int g2 = randomNumbers.nextInt(256);
        int b2 = randomNumbers.nextInt(256);
        
        Color bullsEye1 = new Color(r1, g1, b1);
        Color bullsEye2 = new Color(r2, g2, b2);
        super.paintComponent(g);
        
        
        g.setColor(bullsEye1);
        g.fillOval(10, 10, 200, 200);
        
        g.setColor(bullsEye2);
        g.fillOval(30, 30, 160, 160);
        
        g.setColor(bullsEye1);
        g.fillOval(50, 50, 120, 120);
        
        g.setColor(bullsEye2);
        g.fillOval(70, 70, 80, 80);
        
        g.setColor(bullsEye1);
        g.fillOval(90, 90, 40, 40);
    }
}
