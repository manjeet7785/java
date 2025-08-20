

public class MaxiSum {

    public static void MaxSubArray(int nums[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += nums[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max Sum = " + maxSum);
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        MaxSubArray(num);
    }
}
