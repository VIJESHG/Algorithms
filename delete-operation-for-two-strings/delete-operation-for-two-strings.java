class Solution {
    public int minDistance(String text1, String text2) {
        int l1 = text1.length();
        int l2 = text2.length();
        int[][] memo = new int[l1+1][l2+1];
        int common = 0;
        for(int i = 1; i < l1+1; i++){
            for(int j = 1; j < l2+1; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    memo[i][j] = 1 + memo[i-1][j-1];
                }
                else{
                    memo[i][j] = Math.max(memo[i][j-1],memo[i-1][j]);
                }
            }
        }
        
        common = memo[l1][l2]*2;
        
        return Math.abs(common - (l1+l2));
    }
}