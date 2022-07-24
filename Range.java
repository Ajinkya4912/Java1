//Accept N number from user and Range between two number 

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
		System.out.println("Value of Arrays");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.println(+Arr[iCnt]);
		}
	}
	public void Range(int star,int end)
	{
		System.out.println("Range Between");
		int iCnt=0;
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if((Arr[iCnt]<end)&&(star<end))
			{
				System.out.println(+Arr[iCnt]);
			}
		}
	}
}
class Range
{
  public static void main(String[] arg)
  {
	  int ilength=0,iValue1=0,iValue2=0;
	  Scanner sobj=new  Scanner(System.in);
	  System.out.println("Enter value of Constructor");
	  ilength=sobj.nextInt();
	  System.out.println("Entrer first Range");
	  iValue1=sobj.nextInt();
	  
	  System.out.println("Entrer Second Range");
	  iValue2=sobj.nextInt();
	  
	  ArrayX obj=new ArrayX(ilength);
	  obj.Accept();
	  obj.Display();
	  obj.Range(iValue1,iValue2);
  }  
}