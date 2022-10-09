import java.util.*;
class HCF
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int hcf=arr[0],j=1;
        while(j<n)
        {
            if(arr[j]%hcf==0)
            {
                j++;
            }
            else
            {
                hcf=arr[j]%hcf;
            }
        }
        System.out.println(hcf);
    }
}