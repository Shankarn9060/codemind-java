import java.util.*;
class Prime_Palindrome
{
    public static boolean pal(int n)
    {
        int a=n,b=0;
        while(n>0)
        {
            b=b*10+(n%10);
            n=n/10;
        }
        if(b==a)
        {
            return true;
        }
        return false;
    }
    public static boolean prm(int n)
    {
        int r=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                r++;
            }
        }
        if(r==2)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        for(int i=m+1;;i++)
        {
            if(pal(i) && prm(i))
            {
                System.out.println(i);
                break;
            }
        }
    }
}