
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