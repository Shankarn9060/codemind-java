import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    long m=sc.nextLong();
		    long x=sc.nextLong();
			if (m==1)
                if(x%2==0)
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            else if(x%2==1)
                if(m%2==0)
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            else 
                System.out.println("Impossible");
		}
    }
}