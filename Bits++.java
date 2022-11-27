import java.util.*;
class bits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int x=0;
        for (int k=0;k<t;k++)
        {
            sc.nextLine();
            String s=sc.next();
            if (s.indexOf('+')>=0)
            {
                x+=1;
            }
            else
            {
                x-=1;
            }
        }
        System.out.print(x);
    }
}