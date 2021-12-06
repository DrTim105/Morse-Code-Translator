
package guiprojects;

/*
program to create invoice for a hardware store
*/
public class Invoice
{
    private String hardwareNumber;
    private String hardwareDescription;
    private Integer hardwareQuantity;
    private Double hardwarePrice;
    private double invoiceAmount;
    
    public void setHardwareNumber(String name1)
    {
        hardwareNumber = name1;
    }
    
    public void setHardwareDescription(String name2)
    {
        hardwareDescription = name2;
    }
    
    public void setHardwareQuantity(Integer numb1)
    {
        hardwareQuantity = numb1;
    }
    
    public void setHardwarePrice(Double numb2)
    {
        hardwarePrice = numb2;
    }
    
    public String getHardwareNumber()
    {
        return hardwareNumber;
    }
    
    public String getHardwareDescription()
    {
        return hardwareDescription;
    }
    
    public Integer getHardwareQuantity()
    {
        return hardwareQuantity;
    }
    
    public Double getHardwarePrice()
    {
        return hardwarePrice;
    }
    
    
    public double getInvoiceAmount()
    {
        if (hardwareQuantity < 0)
            hardwareQuantity = 0;
        if (hardwarePrice < 0)
            hardwarePrice = 0.0;
        
        return  invoiceAmount =  hardwareQuantity * hardwarePrice;
    }
    
    public void displayMessage()
           
    {
        
        System.out.printf("JLM Hardware Store\n\n Item Number: %s\n Item Description: %s\n Item Quantity: %d\n Item Price: ?%.2f\n\n   Invoice Amount: ?%.2f\n", 
                getHardwareNumber(), getHardwareDescription(), getHardwareQuantity(), getHardwarePrice(), getInvoiceAmount());
    }
}
