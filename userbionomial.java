
import java.util.*;

public class userbionomial {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int bionmialCoff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int bionmialCoff = fact_n / (fact_r * fact_nmr);
        return bionmialCoff;

    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Stsrt the binomialCoff");
        int a = ob.nextInt();
        System.out.println("The value of n :=" + a);
        int b = ob.nextInt();
        System.out.println("The value of n :=" + b);
        System.err.println("final bionimail answer ===" + bionmialCoff(a, b));
    }
}
