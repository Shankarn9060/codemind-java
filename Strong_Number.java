import java.util.*;
class Strong
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a;
        int r=0;
        while(a>0)
        {
            int n=a%10;
            int s=1;
            while(n>0)
            {
                s*=n;
                n--;
            }
            r+=s;
            a/=10;
        }
        if(r==b)
        {
            System.out.println("The number "+r+" is a strong number");
        }
        else
        {
            System.out.println("The number "+b+" is not a strong number");
        }
    }
}