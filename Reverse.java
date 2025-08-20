
public class Reverse {

    public static void ReverseValue(int[] nums) {
        for (int i = nums.length - 1; i > -1; i--) {
            System.out.print(nums[i]);
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 4, 3, 2, 6, 5};
        System.out.println("My Reverse Value");
        ReverseValue(nums);
    }

}
