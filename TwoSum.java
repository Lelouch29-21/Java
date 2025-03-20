import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter the target sum:");
        int target = scanner.nextInt();
        TwoSum checker = new TwoSum();
        int[] result = checker.twoSum(nums, target);
        if (result != null) {
            System.out.println("The indices of the two numbers are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
        scanner.close();
    }

    public int[] twoSum(int[] nums, int target) {
        // Use a HashMap to store the difference and index
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null; // Return null if no solution is found
    }
}