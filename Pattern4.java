//Accept  number from user and display below pattern.
/*
input : 8
output: 2 4 6 8 10 12 14 16
*/
import java.lang.*;
import java.util.*;

class Number
{
	private int iNo;
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number");
		this.iNo=sobj.nextInt();
	}
	public void Display()
	{
		int iCnt=0;
		for(iCnt=1;iCnt<=iNo*2;iCnt++)
		{
		if(iCnt%2==0)
		{
			System.out.print(+iCnt);
			System.out.print(" ");
		}
		}
	}
}
class Pattern4
{
	public static void main(String[] arg)
	{
		Number nobj=new Number();
		
		nobj.Accept();
		nobj.Display();
	}
}
