import java.util.Scanner;
class Series 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int n;
        float sum = 0;
        n = scan.nextInt();
        for(int i=1; i<=n; i++) 
        {
            sum = sum + (1 / (float)i);
        }
        System.out.format("%.2f",sum);
    }
}