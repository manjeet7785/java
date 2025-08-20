
public class SubArray {

    public static void printSubarrays(int[] arr) {
        int total = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");

                }
                total++;
                System.out.println("");
            }
            System.out.println(" ");
        }
        System.out.println("Total subarrays: " + total);
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        printSubarrays(num);
    }
}
