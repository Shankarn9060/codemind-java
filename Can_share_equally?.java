import java.util.*;
class Can_share_equally
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+(2*b);
        if(a==0 && b%2==0)
        {
            System.out.println("YES");
        }
        else if(a==0 && b%2!=0)
        {
            System.out.println("NO");
        }
        else if(c%2==0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        sc.close();
    }
}