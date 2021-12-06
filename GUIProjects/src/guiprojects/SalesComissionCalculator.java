package guiprojects;


//4.19  SALES COMISSION CALCULATOR

import java.util.Scanner;
import javax.swing.JOptionPane;

public class SalesComissionCalculator
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner( System.in );
        
        double itemValue = 0, total = 0, earnings;
        int counter = 0;
        
        String item = JOptionPane.showInputDialog("Enter item Value or -1 to quit ");
        itemValue = Double.parseDouble(item);
        
        while ( itemValue != -1 )
        {
            counter++;
            total += itemValue;
            
            String item2 = JOptionPane.showInputDialog("Enter item Value or -1 to quit ");
            itemValue = Double.parseDouble(item2);
        }
        
        earnings = (double) 200 + (0.09 * total);
        
        String message = String.format("Total Earnings for week: ₦%.2f\n ", earnings);
        JOptionPane.showMessageDialog(null,message);
    }
}
