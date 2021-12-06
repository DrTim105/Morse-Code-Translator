
/*
Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see
that your heart rate stays within a safe range suggested by your trainers and doctors. According to the
American Heart Association (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736),
the formula for calculating your maximum heart rate in beats per minute is 220 minus your age in
years. Your target heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are estimates provided by the AHA. Maximum and target heart rates may vary based on the
health, fitness and gender of the individual. Always consult a physician or qualified health care professional before beginning or modifying an exercise program.] Create a class called HeartRates. The
class attributes should include the person’s first name, last name and date of birth (consisting of separate attributes for the month, day and year of birth). Your class should have a constructor that receives this data as parameters. For each attribute provide set and get methods. The class also should
include a method that calculates and returns the person’s age (in years), a method that calculates and
returns the person’s maximum heart rate and a method that calculates and returns the person’s target
heart rate. Write a Java application that prompts for the person’s information, instantiates an object
of class HeartRates and prints the information from that object—including the person’s first name,
last name and date of birth—then calculates and prints the person’s age in (years), maximum heart
rate and target-heart-rate range.
*/
package guiprojects;

public class HeartRates
{
   private String firstName;
   private String lastName;
   private Integer month;
   private Integer day;
   private Integer year;
   private Integer age;
   private Integer maxHeartRate;
   private double minTargetHeartRate;
   private double maxTargetHeartRate;
   
   public HeartRates(String name1, String name2, int mm, int dd, int yy )
   {
       firstName = name1;
       lastName = name2;
       month = mm;
       day = dd;
       year = yy;
       
   }
   
   public void setFirstName(String fname)
   {
       firstName = fname;
   }
   
   public void setLastName(String lname)
   {
       lastName = lname;
   }
   
   public void setMonth(int mm)
   {
       month = mm;
   }
   
   public void setDay( int dd)
   {
       day = dd;
   }
   
   public void setYear(int yy)
   {
       year = yy;
   }
   
   public String getFirstName()
   {
       return firstName;
   }
   
   public String getLastName()
   {
       return lastName;
   }
   
   public int getMonth()
   {
       return month;
   }
   
   public int getDay()
   {
       return day;
   }
   
   public int getYear()
   {
       return year;
   }
   
   public void setAge(int ag)
   {
       age = ag ;
   }
   
   public int getAge()
   {
       return age = 2018 - year ;
   }
   
   public void setMaxHeartRate(int max)
   {
       maxHeartRate = max ;
   }
   
   public int getMaxHeartRate()
   {
       return maxHeartRate = 220 - age;
   }
   
   public void setMinTargetHeartRate(double THR)
   {
       minTargetHeartRate = THR;
   }
   
   public double getMinTargetHeartRate()
   {
       return minTargetHeartRate = (0.5 * maxHeartRate);
   }
   
   public void setMaxTargetHeartRate(double THR)
   {
       maxTargetHeartRate = THR ;
   }
   
   public double getMaxTargetHeartRate()
   {
       return minTargetHeartRate = (0.85 * maxHeartRate);
   }
   
   public void displayMessage()
   {
       System.out.printf("First Name: %s\nLast Name: %s\nDate Of Birth: %d/%d/%d\nAge: %d\nMaximum Heart Rate: %d\nTarget Heart Range: %f - %f\n", getFirstName(), getLastName(), getDay(), getMonth(), getYear(), getAge(),getMaxHeartRate(), getMinTargetHeartRate(), getMaxTargetHeartRate() );
   }
}