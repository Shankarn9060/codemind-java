import java.util.*;
class Palindromes
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            int a=i,b=0;
            while(a>0)
            {
                b=b*10+(a%10);
                a/=10;
            }
            if(b==i)
            {
                System.out.print(b+" ");
            }
        }
    }
}