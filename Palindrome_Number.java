import java.util.*;
class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=a;
            int c=0;
            while(a>0)
            {
                c=c*10+(a%10);
                a/=10;
            }
            if(c==b)
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