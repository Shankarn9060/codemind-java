import java.util.*;
class Compound_Interest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double n=a*(Math.pow((1+((double)b/100)),c));
        System.out.format("%.2f",n);
    }
}