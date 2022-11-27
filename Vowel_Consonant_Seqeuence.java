import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer t=new StringBuffer("");
        String vow="aeiouAEIOU";
        int c=0,d=0;
        for (int i=0;i<s.length();i++)
        {
            if (vow.indexOf(s.charAt(i))>=0)
            {
                c+=1;
                if (c==1)
                {
                    t.append("V");
                }
                d=0;
                
            }
            else
            {
                d+=1;
                if (d==1)
                {
                    t.append("C");
                }
                c=0;
            }
        }
        System.out.print(t);
    }
}