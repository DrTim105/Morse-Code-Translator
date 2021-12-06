
package guiprojects;


import javax.swing.JFrame;

public class BullsEyeTest
{
    public static void main(String[] args)
    {
        BullsEye panel = new BullsEye();
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);
    }

}