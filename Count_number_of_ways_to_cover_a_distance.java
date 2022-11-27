import java.util.*;
class sol
{
    public static int numway(int vk)
    {   
        if (vk<0)
        {
            return 0;
        }
        if (vk==0)
        {
            return 1;
        }
        return numway(vk-1)+numway(vk-2)+numway(vk-3);
    }
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int vk=sc.nextInt();
        System.out.println(numway(vk));
    }
}