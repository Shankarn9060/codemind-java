import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int a,b,c=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int r;
            r=sc.nextInt();
            if(r%b==0)
            {
                c++;
            }
        }
        System.out.println(c);
        sc.close();
    }
}