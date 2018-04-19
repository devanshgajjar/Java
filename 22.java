import java.util.Scanner;
class java22_prog
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Entre a number:");
n=s.nextInt();
for(int i=0; i<=n; i++)
System.out.print(i+",");
}
}