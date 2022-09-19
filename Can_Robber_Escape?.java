import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        int a,i,b=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=0;i<a;i++)
        {
            int c;
            c=sc.nextInt();
            if(c%2!=0)
            {
                b++;
            }
        }
        if(b<=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        sc.close();
    }
}