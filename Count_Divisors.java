import java.util.*;
class cd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int k=sc.nextInt();
        int r=sc.nextInt();
        int c=0;
        for(int i=v;i<=k;i++){
            if(i%r==0){
                c++;
            }
        }
        System.out.println(c);
    }
}