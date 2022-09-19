import java.util.Scanner;
class Sol
{
	public static void main(String args[])
	{
		int a,b=0,i;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for (i=0;i<a;i++)
		{
		    int c;
		    c=sc.nextInt();
		    b+=c;
		}
		System.out.println(b);
		sc.close();
	}
}