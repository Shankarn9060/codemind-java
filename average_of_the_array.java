import java.util.*;
class aoa
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        for(int i=0;i<n;i++)
        {
            a+=sc.nextInt();
        }
        System.out.format("%.2f",(float)a/n);
    }
}