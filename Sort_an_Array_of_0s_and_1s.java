import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t,j,k;
		int v[]=new int[n];
		for(k=0;k<n;k++)
		{
			v[k]=sc.nextInt();
		}
		for(j=0;j<n-1;j++)
        {
            for(k=0;k<n-1;k++)
            {
                if(v[k]>v[k+1])
        	    {
            	    t=v[k+1];
            	    v[k+1]=v[k];
            	    v[k]=t;
        	    }
            }
        }
		for (k=0;k<n;k++)
		{
		    System.out.print(v[k]+" ");
		}
    }
}