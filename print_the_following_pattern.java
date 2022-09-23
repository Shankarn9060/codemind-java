import java.util.*;
class pat
{
	public static void main(String[] args)
	{
	    int r;
	    Scanner sc=new Scanner(System.in);
	    r=sc.nextInt();
		for(int i=r;i>=1;i--)
		{
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(j);
		    }
		    System.out.println();
		}
	}
}