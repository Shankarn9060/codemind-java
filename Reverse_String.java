import java.util.*;
class ReverseString
{
    public static void main(String args[])
    {
        String initial, rev="";
        Scanner in=new Scanner(System.in);
        initial=in.nextLine();
        int length=initial.length();
        for(int i=length-1;i>=0;i--)
            rev=rev+initial.charAt(i);
        System.out.println(rev);
    }
}