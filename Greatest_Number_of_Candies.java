import java.util.*;
class Candies
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int r=sc.nextInt();
        int b=a[0];
        for(int c:a)
        {
            if(b<c)
            {
                b=c;
            }
        }
        for(int c:a)
        {
            if((r+c)>=b)
            {
                System.out.print("True ");
            }
            else
            {
                System.out.print("False ");
            }
        }
    }
}