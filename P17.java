
import java.util.*;
public class P17
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int l = sc.nextInt();
        System.out.println("Enter the bredth of the rectangle");
       
        int b = sc.nextInt();
        int A = (l*b);
        System.out.println("Area of rectangle="+A);
        int p = 2*l+2*b;
        System.out.println("Perimeter of rectangle="+p);
    }
}