package Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate { // Class names should start with an uppercase letter
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        ContainsDuplicate checker = new ContainsDuplicate(); // Create an instance of the class
        boolean hasDuplicate = checker.hasDuplicate(nums); // Call the method
        System.out.println("Has duplicate: " + hasDuplicate); // Print the result

        scanner.close();
    }

    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}