import java.util.*;
class sol
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            for(int l=j+1;l<=n;l++)
            {
                if(a[j]==a[l-1])
                {
                    s++;
                }
            }
        }
        System.out.println(s);
    }
}