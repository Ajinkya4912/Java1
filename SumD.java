//Accept N number from user and return Differnce between Largest Number Smallest Number.
import java.util.*;

class ArrayX
{
	private int Arr[];
	
	public ArrayX(int iNo)
	{
		Arr=new int[iNo];
	}
	
	public void Accept()
	{
		int iCnt=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
	}
	public void Display()
	{
		int iCnt=0;
		System.out.println("Value of Array are:");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.println(+Arr[iCnt]);
		}
	}
	public int Sum()
	{
		int iCnt=0;
		int iDigit=0;
		int iSum=0;
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			while(Arr[iCnt]>0)
			{
				iDigit=Arr[iCnt]%10;
				iSum=iSum+iDigit;
				Arr[iCnt]=Arr[iCnt]/10;
			}
		}
		return iSum;
	}
}
class SumD
{
   public static void main (String[] arg)
   {
	   int ilength=0;
	   int iRet=0;
	   Scanner sobj=new Scanner(System.in);
	   System.out.println("Enter value of Constructor");
	   ilength=sobj.nextInt();
	   
	   ArrayX obj=new ArrayX(ilength);
	   
	   obj.Accept();
	   obj.Display();
	   iRet=obj.Sum();
	   System.out.println("Summation of Digit is:"+iRet);
   }
}