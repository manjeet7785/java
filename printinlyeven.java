
import java.util.Scanner;

class printinlyeven {

    public static void CheckEven(int N) {
        if (N / 2 == 0) {
            for (int i = 0; i < N; i++) {
                System.out.println("This is even " + i);
            }
        } else {
            System.out.println("This is not even");
        }
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int Number = num.nextInt();
        CheckEven(Number);
    }
}
