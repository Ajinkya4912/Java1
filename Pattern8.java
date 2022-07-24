//Accept number of rows and colmns from user and display below pattern
/*
input: iRow=3 iCol=4
output: * # * #
        * # * #
		* # * #
*/
import java.util.*;

class Pattern
{
  private int iRow,iCol;
  
  public Pattern(int a,int b)
  {
	  iRow=a;
	  iCol=b;
  }
  public void DisplayPattern()
  {
	  int i=0,j=0;
	  
	  for(i=1;i<=iRow;i++)
	  {
		  for(j=1;j<=iCol;j++)
		  {
			  if(j%2!=0)
			  {
				  System.out.print("*");
				  System.out.print(" ");
			  }
			  else
			  {
				  System.out.print("#");
				  System.out.print(" ");
			  }
		  }
		  System.out.println(" ");
	  }
  }
}
class Pattern8
{
   public static void main(String[] arg)
   {
	   int iNo1=0,iNo2=0;
	   Scanner sobj=new Scanner(System.in);
	   
	   System.out.println("Enter Rows");
	   iNo1=sobj.nextInt();
	   
	   System.out.println("Enter Column");
	   iNo2=sobj.nextInt();
	   
	   Pattern obj=new Pattern(iNo1,iNo2);
	   obj.DisplayPattern();
   }
}