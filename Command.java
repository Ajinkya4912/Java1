import java.util.*;

class Command
{
	public static void main(String arg[])
	{
		System.out.println("Total number of arguments are : "+arg.length);	// 6

		System.out.println("Command line arguments are : ");
		for(int i = 0; i < arg.length; i++)
		{
			System.out.println(arg[i]);
		}
	}
}