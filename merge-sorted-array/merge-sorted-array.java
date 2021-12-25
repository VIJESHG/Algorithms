class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int each : nums2){
            nums1[m] = each;
            m++;
        }
        Arrays.sort(nums1);
    }
}