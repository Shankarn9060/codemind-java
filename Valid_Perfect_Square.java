import java.util.*;
class Valid
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int m=sc.nextInt();
            int a=0;
            for(int j=0;j<(m);j++)
            {
                if(j*j==m)
                {
                    a=1;
                    break;
                }
            }
            if(a!=0)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}