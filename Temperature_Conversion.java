import java.util.Scanner;
class Temp
{
	public static void main(String args[])
	{
		double c,f;
		Scanner sc=new Scanner(System.in);
		c=sc.nextDouble();
		
		f=32+(9*c)/5;

		System.out.format("%.2f",f);
		
		sc.close();
	}

}