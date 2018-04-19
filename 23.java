import java.util.Scanner;
class square
{
public static void main(String[] args)
{
int n,a;
Scanner s=new Scanner(System.in);
System.out.print("Enter a  number: ");
n=s.nextInt();
for(int i=0; i<=n; i++)
{
a=i*i;
System.out.println("Square is " +a);
}
}
}
