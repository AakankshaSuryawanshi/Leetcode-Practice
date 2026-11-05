import java.util.*;

public class disspearedNumbers{

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int n = nums.length;

        List<Integer> result = new ArrayList<>();

        boolean[] found = new boolean[n + 1];

        // Step 1: Mark numbers present in array
        for(int i = 0; i < n; i++) {
            found[nums[i]] = true;
        }

        // Step 2: Find missing numbers
        for(int i = 1; i <= n; i++) {

            if(found[i] == false) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> ans = findDisappearedNumbers(nums);

        System.out.println("Missing numbers: " + ans);
    }
}