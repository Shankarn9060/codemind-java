import java.util.*;
class Positions
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r,k,t;
		int v[]=new int[n];
		for (k=0;k<n;k++)
		    v[k]=sc.nextInt();
	    int j=sc.nextInt();
	    for(k=0;k<j;k++)
	    {
	        t=v[n-1];
	        for(r=n-1;r>0;r--)
	        {
	            v[r]=v[r-1];
	        }
	        v[r]=t;
	    }
	    for (k=0;k<n;k++)
	        System.out.print(v[k]+" ");
    }
}