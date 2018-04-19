import java.util.Scanner;
class java19_prog
{
public static void main(String[] args)
	{
		int n1,n2,n3,n4,n5,n6,total;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter First Subject marks : ");
		n1=s.nextInt();
		System.out.print("Enter Second Subject marks : ");
		n2=s.nextInt();
		System.out.print("Enter Third Subject marks : ");
		n3=s.nextInt();
		System.out.print("Enter Fourth Subject marks : ");
		n4=s.nextInt();
		System.out.print("Enter Fifth Subject marks : ");
		n5=s.nextInt();
		System.out.print("Enter Sixth Subject marks :  ");
		n6=s.nextInt();
	if(n1<=40)
		System.out.print("Fail");
	else
		{
			total=(n1+n2+n3+n4+n5+n6)/6;
		if(total<=40)
			System.out.print("Fail");
		else
			{
			if(total>=60)
				System.out.print("First class");
			else if(total>=48 && total<60)
				System.out.print("Second class");
			else
				System.out.print("Pass");

			}	
		}
	}	
}