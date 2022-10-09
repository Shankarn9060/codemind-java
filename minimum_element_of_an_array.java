import java.util.*;
class Minimum
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
        int min=a[0];
        for(int j=0;j<n;j++)
        {
            if(min>a[j])
            {
                min=a[j];
            }
        }
        if(n==0)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(min);
        }
    }
}