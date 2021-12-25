class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder revString = new StringBuilder();
        revString.append(s);
        revString.reverse();
        int l1 = s.length();
        int l2 = revString.length();
        int[][] memo = new int[l1+1][l2+1];
        for(int i = 1; i < l1+1; i++){
            for(int j = 1; j < l2+1; j++){
                if(s.charAt(i-1) == revString.charAt(j-1)){
                    memo[i][j] = 1 + memo[i-1][j-1];
                }
                else{
                    memo[i][j] = Math.max(memo[i][j-1],memo[i-1][j]);
                }
            }
        }
        return memo[l1][l2];
    }
}