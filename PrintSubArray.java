
public class PrintSubArray {

    public static void PrintSub(int nums[]) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = 0; j < nums.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(nums[k]);
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(" Total number of pairs is ==" + total);
    }

    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5};
        PrintSub(nums);
    }
}
