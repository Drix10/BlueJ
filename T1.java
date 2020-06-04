
import java.util.*;
public class T1
{
    public static void main()
    {
        int a,b;
        int sum,sub,pro;
        double div,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        sub=a-b;
        pro=a+b;
        div=a/b;
        rem=a%b;
        System.out.println("The addition ="+sum);
        System.out.println("The subtraction ="+sub);
        System.out.println("The product ="+pro);
        System.out.println("The quotient ="+div);
        System.out.println("The remainder ="+rem);
    }
}
        