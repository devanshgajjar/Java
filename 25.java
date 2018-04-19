import java.util.Scanner;
class square
{
public static void main(String[] args)
{
int n,a,reverse = 0;;
Scanner s=new Scanner(System.in);
System.out.print("Enter a  number: ");
n=s.nextInt();
while(n!= 0){
reverse = (reverse*10)+(n%10);
n= n/10;
}
System.out.print(reverse);
}
}