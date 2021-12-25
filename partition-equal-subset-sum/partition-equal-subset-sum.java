class Solution {
    public boolean isSubsetSumDP(int arr[],int sum){
        boolean[][] table = new boolean[arr.length+1][sum+1];
        for(int i=0; i <= arr.length; i++){
            table[i][0] = true;
        }
        for(int i=1; i <= sum; i++){
            table[0][sum] = false;
        }
        for(int i = 1; i <=arr.length; i++){
            for (int j = 1; j <= sum; j++) {
                table[i][j] = table[i-1][j];
                if(j - arr[i-1] >= 0){
                    if(j - arr[i-1] == 0)
                        table[i][j] = true;
                    else
                        table[i][j] = table[i-1][j-arr[i-1]] || table[i][j];
                }
                    
            }
        }
        return table[arr.length][sum];
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        if(sum % 2 == 0)
            return isSubsetSumDP(nums,sum/2);
        return false;
    }
}