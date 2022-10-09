import java.util.*;
class Small_factorials
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=1;
            while(a>0)
            {
                b*=a;
                a--;
            }
            System.out.println(b);
        }
    }
}