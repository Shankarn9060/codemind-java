import java.util.Scanner;
class Natural
{
	public static void main(String args[])
	{
		int a;
		double sum;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		sum=a*(a+1)/2;

		System.out.format("%.0f",sum);
		
		sc.close();
	}

}