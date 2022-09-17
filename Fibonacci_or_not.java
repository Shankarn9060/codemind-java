import java.util.Scanner;
class Fibonacci
{    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm = 0;
         
        while (thirdTerm < inputNumber)
        {
            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
         
        if(thirdTerm == inputNumber)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }   
}