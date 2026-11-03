import java.util.Arrays;

public class RemoveDuplicate {

    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        int k = 1;

        for (int i = 1; i < n; i++) {

            if (nums[i] != nums[k - 1]) {

                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        RemoveDuplicate obj = new RemoveDuplicate();

        int[] nums = {1, 1, 2, 2, 3};

        int k = obj.removeDuplicates(nums);

        System.out.println("Unique elements count: " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}