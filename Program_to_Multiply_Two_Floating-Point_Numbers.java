import java.util.Scanner;
class floating
{
	public static void main(String args[])
	{
		float a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextFloat();
		b=sc.nextFloat();
		
		System.out.format("%.2f",a*b);
		
		sc.close();
	}

}