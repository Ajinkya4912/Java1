/*Java Program to to create a jagged array which contains two 1D array*/
import java.util.*;

public class jaggedarry
{
    public static void main(String[] args)
    {
        //Taking Input from the user
        Scanner sobj=new Scanner(System.in);
        
        //Declare number of rows for jagged array
        int m;
        System.out.println("Enter the number of rows for jagged arrays");
        m=sobj.nextInt();     //Initialize the number of rows for jagged array
        
        // Declaring 2-D array with m rows
        int arr[][] = new int[m][];
        
        //Initializing the columns for each rows of jagged array
        System.out.println("Enter the number of columns for each rows of jagged arrays");
        for(int i=0;i<m;i++)
        {
            arr[i]=new int[sobj.nextInt()];
        }
        
        
        // Initializing array
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++)   //For Rows
        {
            for (int j = 0; j < arr[i].length; j++)   //For Columns
            {
                arr[i][j] = sobj.nextInt();
            }
        }
        // Displaying the values of 2D Jagged array
        System.out.println("Elements of 2D Jagged Array");
        for (int i = 0; i < arr.length; i++)     //For Rows
        {
            for (int j = 0; j < arr[i].length; j++)    //For Columns
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}