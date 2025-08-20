
public class Linear {

    public static int linearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {1, 23, 85, 75, 100, 10};
        int key = 10;

        int result = linearSearch(number, key);

        System.out.println(number[result]);

    }

}
