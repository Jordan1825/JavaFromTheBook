import java.util.Scanner;
public class Exercise18_3RecursionGCD {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first whole number.");
        int m = input.nextInt();

        System.out.println("Enter the second whole number");
        int n = input.nextInt();

        System.out.println("The GCD of " + m + " and " + n + " is " + gcd(m, n));

    }
    public static int gcd(int m, int n) {
        if (m % n == 0) {
            return n;
        }
        return gcd(n, m % n);
    }
}
