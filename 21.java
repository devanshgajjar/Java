import java.util.Scanner;
class java21_prog
{
public static void main(String[] args)
{
int bas,total;
Scanner s=new Scanner(System.in);
System.out.print("Enter Basic Salary: ");
bas=s.nextInt();
if(bas<=2000)
{
total=(bas*5/100)+bas;
System.out.print("Your total Salary is "+total);
}
else if(bas>2000 && bas<=5000)
{
total=(bas*7/100)+bas;
System.out.print("Your total Salary is "+total);
}
else if(bas>5000 && bas<=7000)
{
total=(bas*9/100)+bas;
System.out.print("Your total Salary is "+total);
}
else if(bas>7000)
{
total=(bas*12/100)+bas;
System.out.print("Your total Salary is "+total);
}
else
System.out.print("Your total Salary is" +bas);
}
}