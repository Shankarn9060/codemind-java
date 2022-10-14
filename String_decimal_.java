import java.util.Scanner;
class string_decimal
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=0;j<n;j++)
		{
			sc.nextLine();
			String vk=sc.next();
			int s=0;
			for(int i=0;i<vk.length();i++)
			{
			    char ch=vk.charAt(i);
				if(Character.isDigit(ch))
				{
					s++;
				}
			}
			if(s==vk.length())
			{
			    System.out.println("True");
			}
			else
			{
			    System.out.println("False");
			}
		}
	}
}