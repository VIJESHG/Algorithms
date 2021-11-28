/* You are given an integer array nums and an integer target.

You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.

For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
Return the number of different expressions that you can build, which evaluates to target. */
public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length+1;
        int total = 0;
        
        for(int i = 0; i < n-1; i++){
            total += nums[i];
        }
        int m = (target+total)/2 + 1;
         if(total < target ||  (total + target)%2 != 0 || target < -total)
            return 0;
        
        int[][] cache = new int[n][m];
        
        for(int i = 1; i < m; i++){
            cache[0][i] = 0;
        }
        
        for(int i = 0; i < n; i++){
            cache[i][0] = 1;
        }
        
        for(int i = 1; i < n; i++){
            for(int j = 0; j < m; j++){
                if(nums[i-1] <= j){
                    cache[i][j] = cache[i-1][j] + cache[i-1][j-nums[i-1]];
                }
                else{
                    cache[i][j] = cache[i-1][j];
                }
            }
        }
        return cache[n-1][m-1];
    }   

    public static void main(String args[]){
       int[] nums = {1,1,1,1,1};
       int target = 3;
       TargetSum ts = new TargetSum();
       System.out.print(ts.findTargetSumWays(nums, target));
    }
}