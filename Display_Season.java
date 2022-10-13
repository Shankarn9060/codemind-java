import java.util.Scanner;
class avg{
    public static void main(String args[]){
        int v,k,r;
        Scanner sc=new Scanner(System.in);
        v=sc.nextInt();
        if(v>=4 && v<=6){
            System.out.println("Summer");
        }
        else if(v>=7 && v<=10){
            System.out.println("Rainy");
        }
        else if(v==11 || v==12 || v==1){
            System.out.println("Winter");
        }
        else if(v==2 || v==3){
            System.out.println("Spring");
        }
        else{
            System.out.println(-1);
        }
        sc.close();
    }
}