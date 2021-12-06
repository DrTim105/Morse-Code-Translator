
package guiprojects;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class HealthProfileTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        HealthProfile myHealthProfile = new HealthProfile("Salihu", "Timothy", "male", 03, 12, 1999, 1.5, 48.5 );
        
        String firstName = JOptionPane.showInputDialog("First Name: ");
        myHealthProfile.setFirstName(firstName);
        
        String lastName = JOptionPane.showInputDialog("Last Name: ");
        myHealthProfile.setLastName(lastName);
        
        String gend = JOptionPane.showInputDialog("Gender: ");
        myHealthProfile.setGender(gend);
        
        String numb2 = JOptionPane.showInputDialog("Day of Birth: ");
        int day = Integer.parseInt(numb2);
        myHealthProfile.setDay(day);
        
        
        String numb1 = JOptionPane.showInputDialog("Month of Birth: ");
        int month = Integer.parseInt(numb1);
        myHealthProfile.setMonth(month);
       
        
        String numb3 = JOptionPane.showInputDialog("Year of Birth: ");
        int year = Integer.parseInt(numb3);
        myHealthProfile.setYear(year);
        
        String numb4 = JOptionPane.showInputDialog("Height: ");
        double height = Double.parseDouble(numb4);
        myHealthProfile.setHeight(height);
        
        String numb5 = JOptionPane.showInputDialog("Weight: ");
        double weight = Double.parseDouble(numb5);
        myHealthProfile.setWeight(weight);
        
        
        String message = String.format("First Name: %s\nLast Name: %s\nGender: %s\nDate Of Birth: %d/%d/%d\nAge: %d\nHeight: %.2f    Weight: %.2f\nBMI: %.2f\nMaximum Heart Rate: %d\nTarget Heart Range:"
                + " %.2f - %.2f\n\n\nBMI VALUES \nUnderweight: less than 18.5 \n"
                + "Normal:      between 18.5 and 24.9 \nOverweight:  between 25 and 29.9 \n"
                + "Obese:       30 or greater \n\n ", myHealthProfile.getFirstName(), myHealthProfile.getLastName(), myHealthProfile.getGender(),  myHealthProfile.getDay(), myHealthProfile.getMonth(), myHealthProfile.getYear(),
                 myHealthProfile.getAge(), myHealthProfile.getHeight(), myHealthProfile.getWeight(), myHealthProfile.getBodyMassIndex(), myHealthProfile.getMaxHeartRate(), myHealthProfile.getMinTargetHeartRate(), myHealthProfile.getMaxTargetHeartRate());
        
        JOptionPane.showMessageDialog(null, message);
        myHealthProfile.displayMessage();
        
    }
}

