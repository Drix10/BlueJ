import java.util.*;
public class T2
{
    public static void main()
    {
        int l,b,h;
        int vol,tot_sur;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length,breadth and height");
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        vol=l*b*h;
        tot_sur=(l*b*+b*h+1*h);
        System.out.println("The volume ="+vol);
        System.out.println("The total surface area ="+tot_sur);
    }
}