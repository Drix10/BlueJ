import java.util.*;
public class Q3
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in hours");
        int time=sc.nextInt();
        int min=time*60;
        int sec=min*60;
        System.out.println("Time in minutes ="+min);
        System.out.println("Time in seconds ="+sec);
    }
}

