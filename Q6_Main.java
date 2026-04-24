// Q6. Five basic programs in Java
public class Q6_Main {
    public static void main(String[] args) {

        // Factorial
        int n = 5, fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        System.out.println("Factorial = " + fact);

        // Armstrong
        int num = 153, sum = 0, temp = num;
        while (num > 0) {
            int r = num % 10;
            sum += r * r * r;
            num /= 10;
        }
        System.out.println(sum == temp ? "Armstrong" : "Not Armstrong");

        // Palindrome
        int p = 121, rev = 0, t = p;
        while (p > 0) {
            int r = p % 10;
            rev = rev * 10 + r;
            p /= 10;
        }
        System.out.println(rev == t ? "Palindrome" : "Not Palindrome");

        // Fibonacci
        int a = 0, b = 1;
        System.out.print("Fibonacci: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

        // Pattern
        System.out.println("\nPattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
