class Solution {
    public void rotate(int[] nums, int k) {
     int l = nums.length;
        if(k == 0){
         System.out.println(Arrays.toString(nums));
         return;
     }
     k = k % l;
     reverse(nums,l-k,l-1);
     reverse(nums,0,l-k-1);
     reverse(nums,0,l-1);
    
    System.out.println(Arrays.toString(nums));
    return;
    }
    public void reverse(int nums[],int start,int end){
        int tmp;
        while(start < end){
            tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}