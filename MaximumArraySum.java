
public class MaximumArraySum {

    public static void MaxiSubArrays(int num[]) {
        int currentNum = 0;
        int MaxiCurr = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = 0; j < num.length; j++) {
                int end = j;
                currentNum = 0;
                for (int k = start; k <= end; k++) {
                    // System.out.print(num[k] + " ");

                    // currentNum = currentNum + num[k];
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        MaxiSubArrays(num);
    }
}
