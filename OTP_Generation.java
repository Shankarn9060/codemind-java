import java.util.*;
class OTP
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine(),t="";
        for (int i=0;i<s.length();i++)
        {
            int c=Integer.valueOf(s.charAt(i));
            int d=Math.abs(48-c);
            if (c%2!=0)
            {
                t+=(d*d);
            }
        }
        System.out.print(t);
    }
}