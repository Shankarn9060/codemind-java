import java.util.Scanner;
class Disk
{
	public static void main(String args[])
	{
		int t,s,b;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		s=sc.nextInt();
		b=sc.nextInt();
		

		System.out.println(t*s*b*512*2);
		
		sc.close();
	}

}