import java.util.*;
class aoa
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=0;
        int b[]=new int[n];
        int avg=0;
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
            avg+=b[i];
        }
        avg=avg/n;
        for(int j=0;j<n;j++)
        {
            if(avg==b[j])
            {
                a=1;
                break;
            }
        }
        if(a==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}