import java.util.Scanner;
class rob{
    public static void main(String args[]){
        int v,i,c=0;
        Scanner sc=new Scanner(System.in);
        v=sc.nextInt();
        for(i=0;i<v;i++){
            int k,t,r=0;
            k=sc.nextInt();
            t=k;
            while(t>0){
                r=r*10+(t%10);
                t=t/10;
            }
            if(r==k){
                c++;
            }
        }
        System.out.println(c);
        sc.close();
    }
}