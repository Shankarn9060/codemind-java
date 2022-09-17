import java.util.Scanner;
class LCM
{
   public static void main(String args[])
   {
      int a,b,max,step,lcm=0;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();

      if(a>b)
      {
         max=step=a;
      }
      else
      {
         max=step=b;
      }

      while(a!=0)
      {
         if(max % a==0 && max % b==0)
         {
            lcm=max;
            break;
         }
         max+=step;
      }
      System.out.println(lcm);
   }
}