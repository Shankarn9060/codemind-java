import java.util.*;
class Pattern
{
	public static void main(String[] args)
	{
	    int r;
	    Scanner sc=new Scanner(System.in);
	    r=sc.nextInt();
		for(int i=0;i<r;i++)
		{
		    for(int j=r;j>=1;j--)
		    {
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
	}
}