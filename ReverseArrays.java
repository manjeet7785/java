
public class ReverseArrays {

    public static void Reverse(int num[]) {
        int first = 0;
        int last = num.length - 1;
        while (first < last) {
            int value = num[last];
            num[last] = num[first];
            num[first] = value;

            last--;
            first++;
        }
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 7, 8, 10};

        Reverse(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
        }

        System.out.println(" ");
    }

}
