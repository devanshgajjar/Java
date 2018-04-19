import java.util.Scanner;

class fourteen_program
{
 public static void main(String args[])
  {
	  int n;
    Scanner s = new Scanner(System.in);
	System.out.println("Enter a number:");
	n=s.nextInt();
	if(n>=0)
	{
     	System.out.println(n+ "Positive number");
	}
	else
	System.out.println(n+ "Negative number");
  }
  
}