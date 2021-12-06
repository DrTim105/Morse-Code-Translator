
package guiprojects;

public class HealthProfile
{
   private String firstName;
   private String lastName;
   private String gender;
   private double height;
   private double weight;
   private double bodyMassIndex;
   private Integer month;
   private Integer day;
   private Integer year;
   private Integer age;
   private Integer maxHeartRate;
   private double minTargetHeartRate;
   private double maxTargetHeartRate;
   
   public HealthProfile(String name1, String name2, String gend, int dd, int mm, int yy, double h, double w )
   {
       firstName = name1;
       lastName = name2;
       gender = gend;
       month = mm;
       day = dd;
       year = yy;
       height = h;
       weight = w;
       
   }
   
   public void setFirstName(String fname)
   {
       firstName = fname;
   }
   
   public void setLastName(String lname)
   {
       lastName = lname;
   }
   
   public void setGender(String gend)
   {
       gender = gend;
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
   
   public void setHeight(double h)
   {
       height = h;
   }
   
   public void setWeight(double w)
   {
       weight = w;
   }
   
   public String getFirstName()
   {
       return firstName;
   }
   
   public String getLastName()
   {
       return lastName;
   }
   
   public String getGender()
   {
       return gender;
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
   
   public double getHeight()
   {
       return height;
   }
   
   public double getWeight()
   {
       return weight;
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
   
   public void setBodyMassIndex(double BMI)
   {
       bodyMassIndex = BMI;
   }
   
   public double getBodyMassIndex()
   {
       return bodyMassIndex = weight / (height * height);
   }
   
   public void displayMessage()
   {
       System.out.printf("First Name: %s\nLast Name: %s\nGender: %s\nDate Of Birth: %d/%d/%d\nAge: %d\nHeight: %.2f    Weight%.2f\nBMI: %.2f\nMaximum Heart Rate: %d\nTarget Heart Range:"
                + " %.2f - %.2f\n ",getFirstName(),getLastName(), getGender(),  getDay(), getMonth(), getYear(),
                 getAge(), getHeight(), getWeight(), getBodyMassIndex(), getMaxHeartRate(), getMinTargetHeartRate(), getMaxTargetHeartRate());
       
       System.out.println("BMI VALUES\n" + "Underweight: less than 18.5\n" + "Normal:      between 18.5 and 24.9\n" + "Overweight:  between 25 and 29.9\n" + "Obese:       30 or greater\n" + "\n");
        
        if ( bodyMassIndex >= 30)
            System.out.println("\"You're obese, oga! some fasting will do you good\"");
        if ( bodyMassIndex < 18.5)
            System.out.println("\"You need to eat more oo. \n  Ahan! In fact, contact me if money is your problem\"");
        if ( 18.5 <= bodyMassIndex && bodyMassIndex <= 24.9 )
            System.out.println("\"You dey alright\"");
        if ( 25 <= bodyMassIndex && bodyMassIndex <= 29.9)
            System.out.println("\"Your own problem is not much. Just be gyming regularly \n  but know that if you continue the way you are living your life now ehn, \n   you go dey fat go like dat ni oo\"");
   }
   
   
   
}   
