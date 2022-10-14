import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a=0,b;
		int c[]=new int[n];
		for(b=0;b<n;b++)
		{
			c[b]=sc.nextInt();
			if (c[b]%m!=0)
			{
			    a++;
			}
		}
		System.out.print(a);
    }
}