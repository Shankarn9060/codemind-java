import java.util.Scanner;  
class PositiveOrNegative  
{  
    public static void main(String[] args)   
    {  
        int num;  
        Scanner sc = new Scanner(System.in);   
        num = sc.nextInt();  
        if(num>0)  
        {  
            System.out.println("Positive Number");  
        }  
        else if(num<0)  
        {  
            System.out.println("Negative Number");  
        }   
        else  
        {  
            System.out.println("Zero");  
        }  
    }  
}  