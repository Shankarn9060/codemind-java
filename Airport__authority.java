import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k,j,a=0;
		int v[]=new int[n];
		for (k=0;k<n;k++)
		{
			v[k]=sc.nextInt();
		}
		int r=sc.nextInt();
		for (k=0;k<n;k++)
		{
            if (v[k]<=r)
                a++; 
            else
                a=a+2;
		}
		System.out.print(a);
    }
}