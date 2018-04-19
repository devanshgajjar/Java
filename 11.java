class eleventh_program
{
 public static void main(String args[])
 {
  int cr=250,pr=200,cpu=50;
  int uc=cr-pr;
  float tb=uc*cpu;
  System.out.println("Electricity Bill");
  System.out.println("--------------------------------------");
  System.out.println("Customer No.      :1010020");
  System.out.println("Customer Name     :Harshada Kuntesh Chapre");
  System.out.println("Past Reading      :" +pr);
  System.out.println("Current Reading   :" +cr);
  System.out.println("Units Consumed    :" +uc);
  System.out.println("Charge per Unit   :" +cpu);
  System.out.println("Past Reading      :" +pr);
  System.out.println("Billed Amount     :" +tb);
  System.out.println("--------------------------------------");
  }
}