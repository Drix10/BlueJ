
import java.util.*;
public class P19
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length,bredth,height");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int v = l*b*h;
        System.out.println("Volume of cuboid="+v);
        int tsa = 2*(l*b+b*h+l*h);
        System.out.println("Total surface area="+tsa);
        int lsa = 2*(l*h+b*h);
        System.out.println("Lateral surface area of cuboid="+lsa);
    }
}