import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String vk=sc.nextLine();
        int sum=0;
        for (int i=0;i<vk.length();i++)
        {
            if (Character.isDigit(vk.charAt(i)))
            {
                sum+=vk.charAt(i)-'0';
            }
        }
        System.out.print(sum);
    }
}