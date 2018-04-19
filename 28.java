import java.util.Scanner;
class rev
{
public static void main(String[] args)
{
int n,a,reverse = 0,b=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter a  number: ");
n=s.nextInt();
b=n;
while(n!= 0){
reverse = (reverse*10)+(n%10);
n= n/10;
}
if(reverse == b)
System.out.print("number is palindrome number");
else
System.out.print("number is not palindrome number");
}
}