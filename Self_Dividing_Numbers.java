import java.util.*;
class Self_dividing
{
    public static boolean sdn(int n)
    {
        int a=0;
        int b=0;
        int r=n;
        while(n>0)
        {
            int t=n%10;
            if(t!=0 && r%t==0)
            {
                a++;
            }
            b++;
            n/=10;
        }
        if(a==b)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int d=sc.nextInt();
        int r=0;
        for(int i=c;i<=d;i++)
        {
            if(sdn(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}