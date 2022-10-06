import java.util.*;
class Phone
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int k=0;
        long v=sc.nextLong();
        while(v>0)
        {
            v=v/10;
            k++;
            if(k==10 && v==0)
            {
                k--;
            }
        }
        if(k==9)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}