import java.util.*;
class SPS
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=0;
        int k=1;
        while(n>0)
        {
            v+=(n%10);
            k*=(n%10);
            n/=10;
        }
        System.out.println(k-v);
    }
}