package Interview_150;

import java.util.Scanner;

class Solution {
    public int subarraySum(int[] nums) {
        int tSum = 0;  // Variable to store the total sum of all subarray contributions.
        
        // Iterate through each element of the array.
        for (int i = 0; i < nums.length; i++) {
            // Calculate the start index of the subarray.
            int startIndex = Math.max(0, i - nums[i]);
            
            // Calculate the number of subarrays that include nums[i].
            // Contribution of nums[i] is its value multiplied by the number of subarrays it appears in.
            tSum += nums[i] * (i - startIndex + 1);
        }
        
        return tSum;  // Return the total sum of contributions.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: Read the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        // Input: Read the elements of the array
        int[] nums = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        // Create Solution object and call the subarraySum function
        Solution solution = new Solution();
        int result = solution.subarraySum(nums);
        
        // Output: Print the result
        System.out.println("Total sum of all subarray contributions: " + result);
        
        sc.close();
    }
}