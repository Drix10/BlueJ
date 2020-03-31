import java.util.*;
public class P20
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter P,R,T,");
        float p = sc.nextInt();
        
        float r = sc.nextInt();
        float t = sc.nextInt();
        float s = (p*r*t)/100;
        System.out.println("Simple intrest"+s);
        float i = s;
        float a = p+i;
        System.out.println("Amount"+a);
    }
}