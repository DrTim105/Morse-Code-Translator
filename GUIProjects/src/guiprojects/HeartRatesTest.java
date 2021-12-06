
package guiprojects;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class HeartRatesTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        HeartRates myHeartRate = new HeartRates("Salihu", "Timothy", 03, 12, 1999 );
        
        String firstName = JOptionPane.showInputDialog("First Name: ");
        myHeartRate.setFirstName(firstName);
        
        String lastName = JOptionPane.showInputDialog("Last Name: ");
        myHeartRate.setLastName(lastName);
        
        String numb2 = JOptionPane.showInputDialog("Day of Birth: ");
        int day = Integer.parseInt(numb2);
        myHeartRate.setDay(day);
        
        
        String numb1 = JOptionPane.showInputDialog("Month of Birth: ");
        int month = Integer.parseInt(numb1);
        myHeartRate.setMonth(month);
       
        
        String numb3 = JOptionPane.showInputDialog("Year of Birth: ");
        int year = Integer.parseInt(numb3);
        myHeartRate.setYear(year);
        
        String message = String.format("First Name: %s\nLast Name: %s\nDate Of Birth: %d/%d/%d\nAge: %d\nMaximum Heart Rate: %d\nTarget Heart Range:"
                + " %.2f - %.2f\n ", myHeartRate.getFirstName(), myHeartRate.getLastName(), myHeartRate.getDay(), myHeartRate.getMonth(), myHeartRate.getYear(),
                myHeartRate.getAge(), myHeartRate.getMaxHeartRate(), myHeartRate.getMinTargetHeartRate(), myHeartRate.getMaxTargetHeartRate());
        
        JOptionPane.showMessageDialog(null, message);
        myHeartRate.displayMessage();
        
        
    }
}