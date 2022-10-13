import java.util.*;
class sol
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,r=0;
        while(n>0)
        {
            System.out.print(r+" ");
            r=a+b;
            b=a;
            a=r;
            n--;
        }
    }
}