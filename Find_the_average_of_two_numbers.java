import java.util.Scanner;
class avgr
{
	public static void main(String args[])
	{
		int a,b;
		float avg;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
        avg=(float)(a+b)/2;

		System.out.format("%.4f",avg);
		
		sc.close();
	}

}