class Solution {
    public int removeDuplicates(int[] nums) {
        int curr_index = 0;
        if(nums == null || nums.length ==0)
            return 0;
        
        nums[curr_index++] = nums[0]; 
        for(int i =1; i < nums.length; i++){
            if(nums[i-1] != nums[i] ){
                nums[curr_index] = nums[i];
                curr_index++;
            }
        }
        return curr_index;
    }
}