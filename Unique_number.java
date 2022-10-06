import java.util.*;
class paln{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vk=sc.nextInt();
        int kv[]=new int[10];
        while(vk>0){
            int r=vk%10;
            if(kv[r]==1){
                break;
            }
            else{
                kv[r]=1;
            }
            vk/=10;
        }
        if(vk>0){
            System.out.println("Not Unique Number");
        }
        else{
            System.out.println("Unique Number");
        }
    }
}