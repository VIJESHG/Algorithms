/**
 * Problem Statement:
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * 
 * Example 1:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 step to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * 
 * Example 2:
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 step to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * 
 * Constraints:
 * 1 <= nums.length <= 10^5
 * -2^31 <= nums[i] <= 2^31 - 1
 * 0 <= k <= 10^5
 */

 class Solution {
    // Helper method to reverse a portion of the array
    public void reverseArr(int[] nums, int start, int end) {
        // Swap elements from start to end to reverse the array
        while (start < end) {
            int temp = nums[start]; // Temporarily store the value at the start index
            nums[start] = nums[end]; // Assign the value at the end index to the start index
            nums[end] = temp; // Assign the temporary value to the end index
            start++; // Move the start pointer forward
            end--; // Move the end pointer backward
        }
    }

    // Main method to rotate the array
    public void rotate(int[] nums, int k) {
        int len = nums.length; // Length of the array

        // Effective rotations needed (k may be greater than array length)
        int eff_rotation = k % len;

        // Step 1: Reverse the entire array
        reverseArr(nums, 0, len - 1);

        // Step 2: Reverse the first 'k' elements to correct their order
        reverseArr(nums, 0, eff_rotation - 1);

        // Step 3: Reverse the remaining 'n-k' elements to correct their order
        reverseArr(nums, eff_rotation, len - 1);
    }
}