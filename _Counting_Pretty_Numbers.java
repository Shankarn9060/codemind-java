import java.util.*;
import java.lang.*;
import java.io.*;
class PrettyNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner (System.in);
	    int t = sc.nextInt();
		for (int i=1; i<=t ; i++)
		{
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    int count =0;
		    for (; l<=r;l++)
		    {
		        int temp = l%10;
		        if (temp ==2|| temp ==3||temp ==9)
		        {
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}