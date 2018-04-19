import java.util.Scanner;
class number
{
public static void main(String[] args)
{
int n,a=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter a number");
n=s.nextInt();
for(int i=1; i<=n; i++)
{
a=a+i;
}
System.out.print(a);}}