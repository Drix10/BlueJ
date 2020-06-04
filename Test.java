
import java.util.*;
public class Test
{
    public static void main ()
    {
        
        
        double km,rate=0.0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Distance travelled");
        km=sc.nextInt();
        
       
        if(km<=1)
     {
         rate=25;
        }
     else if(1<km && km<=6)
     {
       rate=10;
        }
     else if(6<km && km<=12)
     {
         rate=15;
        }
     
        else if(12<km && km<=18)
        {
            rate=20;
        }
        else if(km>18)
       {
           rate=28;
        }
        else
        System.out.println("wrong input");
      System.out.println("Distance travelled"+"        "+"Billing Amount");
      System.out.println(km+"                       "+rate);
      
    }} 
   