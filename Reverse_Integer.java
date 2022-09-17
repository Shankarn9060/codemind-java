import java.util.Scanner;
class Reverse
{
    public static void main(String[] arg)
    {
        int a,res=0,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0)
        {
            a=n%10;
            res=(res*10)+a;
            n=n/10;
        }
        System.out.println(res);
    }
}