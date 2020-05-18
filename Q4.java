
import java.util.*;
public class Q4
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        int g=a%b;
        System.out.println("Sum of the numbers ="+c);
        System.out.println("Difference between two numbers ="+d);
        System.out.println("Multiplication between two numbers ="+e);
        System.out.println("Division between two numbers ="+f);
        System.out.println("Remainder of two numbers ="+g);
    }
}