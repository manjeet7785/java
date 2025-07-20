
import java.util.*;

public class Day1 {

    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Here Start My Array");
        System.out.println("Physics :" + marks[0]);
        System.out.println("Chemistry :" + marks[1]);
        System.out.println("MathsMatic :" + marks[2]);
        marks[2] = marks[2] + 1;
        System.out.println("Updated MathsMatic marks  :" + marks[2]);

        var sum = marks[0] + marks[1] + marks[2];

        var percentage = (sum * 100) / 300;
        System.out.println("Sum of the Marks" + sum);

        System.out.println("percentage : " + percentage);

    }
}
