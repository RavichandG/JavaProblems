import java.util.Scanner;
public class FibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i=0;i<n;i++)
        {
            int c = a+b;
            System.out.println(a);
            a = b;
            b = c;
        }
    }
}
