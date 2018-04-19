class tenth_program
{
 public static void main(String args[])
 {
  int basic_salary=3500,da,hra,pf,it,ma=1000;
  da=basic_salary*70/100;
  hra=basic_salary*15/100;
  pf=basic_salary*8/100;
  it=basic_salary*12/100;
  int net_salary=basic_salary+da+hra+ma-pf-it;
  System.out.println("Net Salary=" +net_salary);
 }
}
