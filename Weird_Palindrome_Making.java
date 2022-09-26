import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i;
		for(i=0;i<N;i++)
		{
		    int n=sc.nextInt();
		    int s=0,k;
		    int v[]=new int[n];
		    for(k=0;k<n;k++)
		    {
			    v[k]=sc.nextInt();
			    s+=(v[k]%2);
		    }
		    System.out.println(s/2);
		}
    }
}