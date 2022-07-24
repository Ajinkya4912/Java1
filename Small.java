//Accept N number from user and Display Smallest Number.
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
	public int Smaller()
	{
		int iCnt=0;
		int Smallest=Arr[0];
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(Arr[iCnt]<Smallest)
			{
				Smallest=Arr[iCnt];
			}
	    }
		return Smallest;
	}
}
class Small
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
	   iRet=obj.Smaller();
	   System.out.println("Smallest Number of array is:"+iRet);
   }
}