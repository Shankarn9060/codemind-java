import java.util.Scanner;
class Pandemic
{
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		if (a<=1)
        {
            System.out.println("0");
        }
        else if (a==2)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("2");
        }
    	sc.close();
    }
}