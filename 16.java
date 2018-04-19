import java.util.Scanner;
 
class Sixteen_Program
{
  public static void main(String args[])
  {
	int y;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the year:");
	y=s.nextInt();
	if(y % 4 == 0)
        {
            if( y % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( y % 400 == 0)
                   System.out.println(y+"is leap year");
                else
                   System.out.println(y+"is not leap year");
            }
            else
               System.out.println(y+"is leap year");
        }
        else
           System.out.println(y+"is not leap year"); 

      
  }
	
}