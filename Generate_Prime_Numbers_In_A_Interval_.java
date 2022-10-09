import java.util.*;
class Generate_pni
{
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
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(prm(i))
            {
                System.out.println(i);
            }
        }
    }
}