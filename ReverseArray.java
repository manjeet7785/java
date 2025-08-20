
public class ReverseArray {

    public static void reverseArrayLoop(int num[]) {
        // Loop from the last element to the first
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i]);
        }
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 5, 7, 9, 10};

        System.out.println("Reversed array elements:");
        reverseArrayLoop(num);
    }
}
