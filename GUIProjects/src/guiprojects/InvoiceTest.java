
package guiprojects;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class InvoiceTest
{
    
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        
        Invoice invoice1 = new Invoice();
        
        String hardwareNumber = JOptionPane.showInputDialog("Item Number: ");
        invoice1.setHardwareNumber(hardwareNumber);
        
        String hardwareDescription = JOptionPane.showInputDialog("Item Description: ");
        invoice1.setHardwareDescription(hardwareDescription);
        
        String numb1 = JOptionPane.showInputDialog("Item Quantity: ");
        int hardwareQuantity = Integer.parseInt(numb1);
        invoice1.setHardwareQuantity(hardwareQuantity);
        
        String numb2 = JOptionPane.showInputDialog("Item Price: ");
        double hardwarePrice = Double.parseDouble(numb2);
        invoice1.setHardwarePrice(hardwarePrice);
        
        
        String message = String.format("JLM Hardware Store\n\n Item Number: %s\n Item Description: %s\n Item Quantity: %d\n Item Price: ?%.2f\n\n   Invoice Amount: ?%.2f\n", 
                invoice1.getHardwareNumber(), invoice1.getHardwareDescription(), invoice1.getHardwareQuantity(), invoice1.getHardwarePrice(), invoice1.getInvoiceAmount());
        
        JOptionPane.showMessageDialog(null, message); 
        invoice1.displayMessage();
    }
}



