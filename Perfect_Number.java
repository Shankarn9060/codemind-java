import java.util.*;
class Perfect
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                r+=i;
            }
        }
        if(r==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}