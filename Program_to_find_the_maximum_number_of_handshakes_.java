import java.util.Scanner;
class handshakes
{
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		

		System.out.println((int)(a*(a-1)/2));
		
		sc.close();
	}

}