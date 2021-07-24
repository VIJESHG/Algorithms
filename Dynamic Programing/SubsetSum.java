public class SubsetSum {
    /* Subset sum problem with recursion */
    boolean isSubsetSumRec(int[] arr,int size,int sum){
        if(sum == 0)
            return true;
        if(size == 0 || sum < 0)
            return false;
        return isSubsetSumRec(arr, size-1, sum-arr[size-1]) || isSubsetSumRec(arr, size-1, sum);
    }
    /* Subset sum problem with DP */
    boolean isSubsetSumDP(int arr[],int sum){
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
    /* Count of Subset sum using DP */
    int countSubsetSumDP(int arr[],int sum){
        int[][] table = new int[arr.length+1][sum+1];
        for (int i = 0; i < arr.length+1; i++) {
            table[i][0] = 1;
        }
        for (int i = 1; i < sum+1; i++) {
            table[0][i] = 0;
        }
        for (int i = 1; i < arr.length+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                table[i][j] = table[i-1][j];
                if(j-arr[i-1] >= 0){
                    table[i][j] = table[i-1][j-arr[i-1]] + table[i][j]; 
                }
            }
        }
        return table[arr.length][sum];
    }
    /* find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.*/
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        if(sum % 2 == 0)
            return isSubsetSumDP(nums,sum/2);
        return false;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,5,7,4,12};
        int[] arr1 = {1,2,3,5,1};
        int[] arr2 = { 7,4,11};
        SubsetSum ss = new SubsetSum();
        System.out.println(ss.isSubsetSumRec(arr1,arr1.length,12));
        System.out.println(ss.isSubsetSumDP(arr,12));
        System.out.println(ss.countSubsetSumDP(arr,12));
        System.out.println(ss.canPartition(arr2));
    }
}

