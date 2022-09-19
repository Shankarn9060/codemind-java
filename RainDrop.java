import java.util.*;
class Rain_drop
{
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a%3==0 || a%5==0 || a%7==0)
        {
            if(a%3==0)
            {
                System.out.print("Pling");
            }
            if(a%5==0)
            {
                System.out.print("Plang");
            }
            if(a%7==0)
            {
                System.out.print("Plong");
            }
        }
        else
        {
            System.out.print(a);
        }
        sc.close();
    }
}