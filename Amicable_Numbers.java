import java.util.*;
class Amicable
{
    public static int fac(int n)
    {
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s+=i;
            }
        }
        return s;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int vk=sc.nextInt();
        int kv=sc.nextInt();
        int v=fac(vk),k=fac(kv);
        if(v==kv)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}