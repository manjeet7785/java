
public class pratice {

    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int bincoff(int n, int r) {
        int a = fact(n);
        int b = fact(r);
        int c = fact(n - r);
        int d = a / (b * c);
        return d;
    }

    public static void main(String[] args) {
        System.out.println(bincoff(5, 2));
    }

}
