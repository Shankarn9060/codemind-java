import java.util.Scanner;
class Table 
{
    public static void main(String args[]) 
    {
        int v,k,l;
        Scanner sc=new Scanner(System.in);
        v=sc.nextInt();
        l=sc.nextInt();
        for(k=1;k<=l;k=k+2)
        {
            System.out.println(v+" x "+k+" = "+v*k);   
        }
        sc.close();
    }
}