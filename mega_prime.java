import java.util.*;
class mp
{
    public static boolean prm(int a)
    {
        int r=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
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
        int r=sc.nextInt();
        if(prm(r))
        {
            int b=0;
            int c=0;
            while(r>0)
            {
                if(prm(r%10))
                {
                    b++;
                }
                c++;
                r/=10;
            }
            if(b==c)
            {
                System.out.println("Mega Prime");
            }
            else
            {
                System.out.println("Not Mega Prime");
            }
        }
        else
        {
            System.out.println("Not Mega Prime");
        }
    }
}