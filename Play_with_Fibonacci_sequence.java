import java.util.Scanner;
class Fibonacci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c=0;
        System.out.print(a+" "+b+" ");
        for(int i=n; i>2; i--)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}