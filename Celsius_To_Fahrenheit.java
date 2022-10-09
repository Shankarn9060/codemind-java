import java.util.*;
class Celsius
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextInt();
        double a=(double)(n*9/5)+32;
        System.out.format("%.2f",a);
    }
}