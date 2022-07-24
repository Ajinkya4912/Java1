//write a program which accept number from user and display its digit in reverce  order.
import java.util.*;

class Number
{
  private int iNo;
  
  public void Accept()
  {
	  Scanner sobj=new Scanner(System.in);
	  System.out.println("Enter number");
	  this.iNo=sobj.nextInt();
  }
  public void Display()
  {
	  System.out.println("value is:"+this.iNo);
  }
  public void Revercenumber()
  {   int iDigit=0;  
  int iRev=0;
	  while(iNo>0)
	  {
		  iDigit=iNo%10;
		  System.out.print(+iDigit);
	     iNo=iNo/10;
	  }  
  }
}
class Reverce
{
public static void main(String[] arg)
{
   Number eobj=new Number();
   
   eobj.Accept();
   eobj.Display();
   eobj.Revercenumber();
}
}
