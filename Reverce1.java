//Accept number from user and  check wheter it conatin 0 or not.

import java.util.*;

class Number
{
	
	private int iNo;
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number");
		iNo=sobj.nextInt();
	}
	public void  Display()
	{
		System.out.println("Value is:"+this.iNo);
	}
	public boolean Checknumber()
	{
		boolean bFlag=false;
		int iDigit=0;
		while(iNo>0)
		{
			iDigit=iNo%10;
			if(iDigit==0)
			{
			   bFlag=true;
			   break;
			}
			iNo=iNo/10;
		}
		return bFlag;
	}
}
class Reverce1
{
	public static void main(String[] arg)
	{
		boolean bRet=false;
		Number nobj=new Number();
		
		
		nobj.Accept();
		nobj.Display();
		bRet=nobj.Checknumber();
		
		if(bRet==true)
		{
			System.out.println("0 is presnt");
		}
		else
		{
			System.out.println("0 is not present");
		}
	}
}