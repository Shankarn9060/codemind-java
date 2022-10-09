import java.util.*;
class Add_Digits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        while(n>0)
        {
            s+=(n%10);
            n=n/10;
            if(s>10 && n==0)
            {
                n=s;
                s=0;
            }
        }
        System.out.println(s);
    }
}