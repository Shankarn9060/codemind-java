import java.util.*;
class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int a=c;
        int b=0;
        while(c>0)
        {
            b=b*10+(c%10);
            c/=10;
        }
        if(b==a)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}