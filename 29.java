import java.util.Scanner;
class ser1
{
public static void main(String[] args)
{
int n,a=1,b=1;
Scanner s=new Scanner(System.in);
System.out.print("Enter a number");
n=s.nextInt();
for(int i=1; i<=n; i++)
{
a=a+i*b;
b=b*-1;
System.out.print("\n"+a);
}
System.out.print(a);
}
}