import java.util.*;
public class longestWord
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Setance : ");
        String str=sc.nextLine();
        String []words=str.split(" ");
        int max=0;
		String res="";
        for(int i=0;max)
            {
                max=words[i].length();
				res=words[i];
            }
        }
        System.out.print("maximum Length of the words is : " + max);
		System.out.print("maximum Length words is : " + res);
    }
}