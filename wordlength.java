/* Java Program Example - Find Length of String */
      
import java.util.Scanner;

public class wordlength
{
   public static void main(String args[])
   {
    String str;
	int len;
	
	Scanner  sobj =  new Scanner (System.in);
	System.out.println("Enter your name:");
	str= sobj.nextLine();
	len= str.length();
	System.out.println("Length of  Entered String is "+ len);
   }
}
      
