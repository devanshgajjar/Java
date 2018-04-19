import java.util.Scanner;
class java20_prog
{
public static void main(String[] args)
{
int cap,tran,res,dis1,dis2,dis3,total,t1,t2,t3;
Scanner s=new Scanner(System.in);
System.out.print("Enter Transistor :");
tran=s.nextInt();
System.out.print("Enter Resistor :");
res=s.nextInt();
System.out.print("Enter capacitor :");
cap=s.nextInt();
t1=tran*5;
t2=res*3;
t3=cap*15;
if(t1>=1000)
{
dis1=t1-(t1*10/100);
System.out.println("Your total amout of Transistor is " +dis1);
}
else
System.out.println("Your total amout of Transistor is " +t1);
if(t2>=500)
{
dis2=t2-(t2*5/100);
System.out.println("Your total amout of Resistor is " +dis2);
}
else
System.out.println("Your total amout of Resistor is " +t2);
if(t3>=2000)
{
dis3=t3-(t3*10/100);
System.out.println("Your total amout of capacitor is " +dis3);
}
else
System.out.println("Your total amout of capacitor  is " +t3);
}
}




