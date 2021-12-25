class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_ones = 0;
        int curr_max=0;
        for (int i =0; i < nums.length; i++){
            if(nums[i] == 1){
                curr_max++;
                if(curr_max > max_ones)
                    max_ones = curr_max;
                
            }
            else{
                if(curr_max > max_ones)
                    max_ones = curr_max;
                curr_max = 0;
            }
        }
        return max_ones;
    }
}