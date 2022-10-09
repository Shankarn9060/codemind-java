import java.util.*;
class Even_Odd_mixed
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0;
        int n=sc.nextInt();
        while(n>0)
        {
            if((n%10)%2==0)
            {
                a++;
            }
            else
            {
                b++;
            }
            n=n/10;
        }
        if(a!=0 && b==0)
        {
            System.out.println("Even");
        }
        else if(a==0 && b!=0)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Mixed");
        }
    }
}