package Interview_150;

/**
 * Problem Statement:
 *
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place
 * such that each unique element appears only once. The relative order of the elements should be kept the same.
 * Then return the number of unique elements in nums.
 *
 * Consider the number of unique elements of nums to be k. To get accepted, you need to do the following things:
 * 1. Change the array nums such that the first k elements of nums contain the unique elements 
 *    in the order they were present in nums initially.
 * 2. The remaining elements of nums are not important as well as the size of nums.
 * 3. Return k.
 *
 * Custom Judge:
 * The judge will test your solution with the following code:
 *
 * int[] nums = [...]; // Input array
 * int[] expectedNums = [...]; // The expected answer with correct length
 *
 * int k = removeDuplicates(nums); // Calls your implementation
 *
 * assert k == expectedNums.length;
 * for (int i = 0; i < k; i++) {
 *     assert nums[i] == expectedNums[i];
 * }
 * If all assertions pass, then your solution will be accepted.
 *
 * Example 1:
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 *
 * Example 2:
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 *
 * Constraints:
 * - 1 <= nums.length <= 3 * 10^4
 * - -100 <= nums[i] <= 100
 * - nums is sorted in non-decreasing order.
 */

 public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        // Edge case: if array length is 0 or 1, return length
        if (nums.length == 0) return 0;

        // Initialize a pointer for the position of the next unique element
        int uniqueIndex = 0;

        // Traverse the array from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is not equal to the last unique element
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++; // Move the pointer for unique elements
                nums[uniqueIndex] = nums[i]; // Update the unique element position
            }
        }

        // Return the count of unique elements (uniqueIndex + 1)
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();

        // Example 1
        int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("Output: " + k1 + ", nums = " + java.util.Arrays.toString(nums1));
        // Output: 2, nums = [1, 2, _]

        // Example 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("Output: " + k2 + ", nums = " + java.util.Arrays.toString(nums2));
        // Output: 5, nums = [0, 1, 2, 3, 4, _, _, _, _, _]
    }
}
