
import java.util.Scanner;

public class checktrianglevalidornot {

    public static void triangleC(int a, int b, int c) {

        if (a > 0 && b > 0 && c > 0
                && (a + b > c)
                && (a + c > b)
                && (b + c > a)) {
            System.out.println("The triangle with sides valid");
        } else {
            System.out.println("The triangle with sides " + a + ", " + b + ", and " + c + " is NOT VALID.");
        }
    }

    public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        System.out.println("The Checking Start Here");
        int oneSide = triangle.nextInt();
        int secondSide = triangle.nextInt();
        int thirdSide = triangle.nextInt();
        triangleC(oneSide, secondSide, thirdSide);
    }
}
