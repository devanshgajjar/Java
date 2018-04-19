import java.util.Scanner;
class java18_prog
{
public static void main(String[] args)
	{
		int n1,n2,n3;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Number");
		n1=s.nextInt();
		System.out.println("Enter Second Number");
		n2=s.nextInt();
		System.out.println("Enter Third Number");
		n3=s.nextInt();
		if(n1<n2 && n1<n3)
		System.out.print(n1+" is Smallest number");
	else if(n2<n1 && n2<n3)
		System.out.print(n2+" is Smallest number");
	else
		System.out.print(n3+" is Smallest number");
	}
}