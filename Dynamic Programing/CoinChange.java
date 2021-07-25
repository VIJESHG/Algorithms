
public class CoinChange {
    /* Find the number of ways to achieve change using given coins */
    public int coinChangeCountRec(int[] arr,int size, int sum){
        if(size == 0 || sum < 0)
            return 0;
        else if(sum == 0)
            return 1;
        return coinChangeCountRec(arr,size-1,sum)+coinChangeCountRec(arr,size,sum-arr[size-1]);
    }
    public int coinChangeCountMem(int[] arr,int size, int sum){
        int[][] mem = new int[size+1][sum+1];
        for (int i = 0; i < size+1; i++) {
            mem[i][0] = 1;
        }
        for (int i = 1; i < sum+1; i++) {
            mem[0][i] = 0;
        }
        for (int i = 1; i < size+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                mem[i][j] = mem[i-1][j];
                if(j - arr[i-1] >= 0){
                    mem[i][j] = mem[i-1][j] + mem[i][j-arr[i-1]];
                }
            }
        }
        
        return mem[size][sum];
    }
    /* Coin change using minimum number of coins */
    public int minCoinChange(int[] arr,int size,int sum){
        int[][] mem = new int[size+1][sum+1];
        for (int i = 0; i < size+1; i++) {
            mem[i][0] = 0;
        }
        for (int i = 1; i < sum+1; i++) {
            mem[0][i] = Integer.MAX_VALUE-1;
        }
        for (int i = 1; i < size+1; i++) {
            for (int j = 1; j < sum+1; j++) {
              if(j % arr[i-1] == 0){
                  mem[i][j] = Math.min(mem[i-1][j], j/arr[i-1]);
              } 
              if(j - arr[i-1] >= 0){
                  mem[i][j] = Math.min(mem[i-1][j],1+mem[i][j-arr[i-1]]);
              } 
              else
                mem[i][j] = mem[i-1][j];
            }
        }
        return mem[size][sum];
    }
    public void print2DArray(int[][] arr,int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String args[]){
        CoinChange cc = new CoinChange();
        int[] arr = {1,2,3};
        System.out.println(cc.coinChangeCountRec(arr,3,5));
        System.out.println(cc.coinChangeCountMem(arr,3,5));
        System.out.println(cc.minCoinChange(arr,3,5));
    }
}

