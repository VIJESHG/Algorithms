class Solution {
    public int removeElement(int[] nums, int val) {
        int len = 0;
        if(nums.length == 0)
            return 0;
        
        for(int each : nums){
            if(each != val)
                nums[len++] = each;
        }
        return len;
    }
}