import java.util.*;
public class T3
{
    public static void main()
    {
        String name,father_nm,mother_nm,sec;
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        age=sc.nextInt();
        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("Enter your fathers name");
        father_nm=sc.next();
        System.out.println("Enter your mothers name");
        mother_nm=sc.next();
        System.out.println("My age is "+age); 
        System.out.println("My name is "+name);
        System.out.println("My fathers name is "+father_nm);
        System.out.println("My mothers name is "+mother_nm);
    }
}