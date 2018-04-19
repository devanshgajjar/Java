import java.util.Scanner;
class prime
{
public static void main(String[] args)
{
int n,a=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number to check prime or not ");
n=s.nextInt();
for(int i=2; i<n; i++)
{
if(n%i==0){
	a=0;
	break;
}
else	{
	a=1;
	}
}
if(a==0)
System.out.print("number is not prime");
else
System.out.print("number is  prime");
}
}
