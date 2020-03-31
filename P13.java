
import java.util.*;
public class P13
{
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = scan.nextInt();
        System.out.print("Enter second number:");
        int num2 = scan.nextInt();
        scan.close();
        int product= num1*num2;
        System.out.println("output:"+product);
    }
}