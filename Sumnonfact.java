//write a program which accept which accept number from user and display all its Non Factors.

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
	   System.out.println("Value is:"+this.iNo);
   }
   public int DisplayNonFact()
   {
	   int iCnt=0;
	   int iSum=0;
	   
	   for(iCnt=1;iCnt<=iNo;iCnt++)
	   {
		   if(iNo%iCnt!=0)
		   {
			   iSum=iSum+iCnt;
		   }
	   }
	   return iSum;
   }
}
class Sumnonfact
{
  public static void main(String[] arg)
  {
	  int iRet=0;
	  Number nobj=new Number();
	  nobj.Accept();
	  nobj.Display();
	  iRet=nobj.DisplayNonFact();
	  System.out.println("Sumation of non Fcator number is:"+iRet);
	  nobj=null;
	  
  }
}