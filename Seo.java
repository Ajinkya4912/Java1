//Accept N number from user and return differnce between sumation of even or odd. 
import java.util.*;

class ArrayX
{
  private int Arr[];
  
  public ArrayX(int iNo)
  {
	  Arr=new int [iNo];
  }
  public void Accept()
  {
	  int iCnt=0;
	  Scanner sobj=new Scanner(System.in);
	  System.out.println("Enter the Value:");
	  for(iCnt=0;iCnt<Arr.length;iCnt++)
	  {
		  Arr[iCnt]=sobj.nextInt();
	  }
  }
  public void Display()
  {
	  int iCnt=0;
	  System.out.println("Element of Array Are:");
	  for(iCnt=0;iCnt<Arr.length;iCnt++)
	  {
		  System.out.println(+Arr[iCnt]);
	  }
  }
  public int SumDiff()
  {
	  int eSum=0,oSum=0,dSum=0;
	  int iCnt=0;
	  for(iCnt=0;iCnt<Arr.length;iCnt++)
	  {
		  if(Arr[iCnt]%2==0)
		  {
			  eSum=eSum+Arr[iCnt];
		  }
		  else
		  {
			  oSum=oSum+Arr[iCnt];
		  }
	  }
	  dSum=eSum-oSum;
	  return dSum;
  }
}
class Seo
{
	public static void main(String[] arg)
	{
		int ilength=0;int iRet=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the Calue of Constructor");
		ilength=sobj.nextInt();
		
		ArrayX obj=new ArrayX(ilength);
		
		obj.Accept();
		obj.Display();
		iRet=obj.SumDiff();
		System.out.println(+iRet);
	}
}