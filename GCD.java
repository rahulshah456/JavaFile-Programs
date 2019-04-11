import java.util.Scanner;

public class GCD {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int a,b,gcd = 1;
        System.out.println("Enter any two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();


        for(int i = 1; i <=a && i <= b; ++i)
        {
            // Checks if i is factor of both integers
            if(a % i==0 && b % i==0)
                gcd = i;
        }

        System.out.printf("G.C.D of %d and %d is %d", b, a, gcd);
    }

}