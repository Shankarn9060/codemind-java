import java.util.*;
class Rotation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=0,r=0;
        for (int i=0;i<t;i++)
        {
            n=sc.nextInt();
            r=sc.nextInt();
            ArrayList<Integer> ar=new ArrayList<Integer>();
            for (int j=0;j<n;j++)
                ar.add(sc.nextInt());
            int c=0;
            Collections.rotate(ar,r);
            for (int el:ar){
                c+=1;
                if (c==n)
                    System.out.print(el);
                else
                    System.out.print(el+" ");
            }
            System.out.println();
        }
    }
}