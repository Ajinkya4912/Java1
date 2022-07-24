//Minimum Number of Matrix...
import java.util.*;
class Program30
{
	public static void main(String[] arg)
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number of Rows");
		int iRow=sobj.nextInt();
		
		System.out.println("Enter the number of Columns");
		int iCol=sobj.nextInt();
		
		
		int Arr[][]=new int[iRow][iCol];
		int i=0,j=0;
		int iMin=Arr[0][0];
		System.out.println("Enter the Elemnts");
	     for(i=0;i<iRow;i++)
		 {
			 for(j=0;j<iCol;j++)
			 {
				 Arr[i][j]=sobj.nextInt();
			 }
		 }
		 
		  for(i=0;i<iRow;i++)
		 {
			 for(j=0;j<iCol;j++)
			 {
				 if(iMin<Arr[i][j])
				 {
					 iMax=Arr[i][j];
					 
				 }
			 }
		 }
		System.out.println("Minimum Number is:"+iMax);
	}
}