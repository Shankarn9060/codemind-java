import java.util.Scanner;
class LargestDigit 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt ();
        int reminder,Largest=0;
        while (num>0)
        {
            reminder=num%10;
            if(Largest<reminder) 
            {
                Largest=reminder;
            }
            num=num/10;
        }
        System.out.println(Largest);
        sc.close();
    }
}