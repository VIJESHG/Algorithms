class Solution {
    public int coinChange(int[] coins, int amount) {
        int size = coins.length;
        int[][] mem = new int[size+1][amount+1];
        for (int i = 0; i < size+1; i++) {
            mem[i][0] = 0;
        }
        for (int i = 1; i < amount+1; i++) {
            mem[0][i] = Integer.MAX_VALUE-1;
        }
        for (int i = 1; i < size+1; i++) {
            for (int j = 1; j < amount+1; j++) {
              if(j % coins[i-1] == 0){
                  mem[i][j] = Math.min(mem[i-1][j], j/coins[i-1]);
              } 
              if(j - coins[i-1] >= 0){
                  mem[i][j] = Math.min(mem[i-1][j],1+mem[i][j-coins[i-1]]);
              } 
              else
                mem[i][j] = mem[i-1][j];
            }
        }
        return mem[size][amount] > amount ? -1 : mem[size][amount]; 
    }
}