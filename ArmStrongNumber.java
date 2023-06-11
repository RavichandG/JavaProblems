import java.io.*;
import java.util.Scanner;
class ArmStrongNumber
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int a = n%10;         // To get last digit of the number
        int a1 = n/10;     // TO reduce a digit in number
        int b = a1%10;        // To get last digit of the number
        int b1 = a1/10;     // To reduce a digit of number
        int c = b1%10;        // To get last digit of the number
        if(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)==n)
        {
            System.out.println("it is armstrong numbe");
        }
        else {
            System.out.println("it is not arm strong number");
        }
    }
}

