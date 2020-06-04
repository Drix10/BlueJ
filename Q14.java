
import java.util.*;
class Q14
{
    public static void main(String[]args)
    {
     int a,b;
     double d=0.0,total=0.0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the the number of days stayed in the hotel");
     a=sc.nextInt();
     b=850;
     if(a>=1 && a<=5)
     {
         d=.1*(a*b);
         total=(a*b)-d;
        }
     else if(a>5 && a<=10)
     {
         d=.15*(a*b);
         total=(a*b)-d;
        }
     else if(a>10 && a<=20)
     {
         d=.2*(a*b);
         total=(a*b)-d;
        }
     else if(a>20)
     {
         d=.25*(a*b);
         total=(a*b)-d;
        }
        else
        System.out.println("wrong input");
        
     System.out.println("Discount="+d);
     System.out.println("Total="+total);
    }} 
