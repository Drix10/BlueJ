import java.util.*;
public class Q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your name: ");
        String name=sc.next();
        System.out.println("Enter the mark of the first subject: ");
        int m1=sc.nextInt();
        System.out.println("Enter the mark of the second subject: ");
        int m2=sc.nextInt();
        System.out.println("Enter the mark of the second subject: ");
        int m3=sc.nextInt();
        int total=m1+m2+m3;
        int average=total/3;
        System.out.println("Name is "+name);
        System.out.println("First subject mark is "+m1);
        System.out.println("Second subject mark is "+m2);
        System.out.println("Third subject mark is "+m3);
        System.out.println("Total is "+total);
        System.out.println("Average is "+average);
    }
}
