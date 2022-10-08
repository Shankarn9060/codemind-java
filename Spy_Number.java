import java.util.*;
class Spy
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0;
        int c=1;
        while(a>0)
        {
            b+=(a%10);
            c*=(a%10);
            a/=10;
        }
        if(b==c)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}