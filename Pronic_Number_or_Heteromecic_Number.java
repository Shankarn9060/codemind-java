import java.util.*;
class Pronic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=-1;
        for(int i=1;i<a-1;i++)
        {
            if(i*(i+1)==a)
            {
                b=i;
                break;
            }
        }
        if(b!=-1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}