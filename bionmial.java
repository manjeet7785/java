
public class bionmial {

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
        int res = bionmialCoff(5, 2);
        System.out.println(res);
    }

}
