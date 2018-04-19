import java.util.Scanner;
class Thirteen_program
{
 public static void main(String args[]) 
  {
    int d,m,y,n;
     Scanner s= new Scanner(System.in);
	 System.out.println("Enter a number of days:");
	 n=s.nextInt();
	 
     y= n/365;
	 m=(n-(y*365))/30;
	 d=(n%365)-(30*m);
     System.out.println("...................................");
	System.out.println("Day:" +d);
	System.out.println("Month:" +m);
	System.out.println("Year:" +y);
	System.out.println(".....................................");
  }
}