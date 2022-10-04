import java.util.*;
class Absolute
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=(int)(Math.log10(a));
        int n=sc.nextInt();
        int c=a%((int)(Math.pow(10,n)));
        int d=a/((int)(Math.pow(10,b-n+1)));
        System.out.print(Math.abs(c-d));
    }
}
