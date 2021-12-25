class Solution {
    public String longestPalindrome(String str) {
       int size = str.length();
        int start = 0;
        int result = 1;
        boolean[][] mem = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            mem[i][i] = true;
            if(i < size-1)
            if((str.charAt(i) == str.charAt(i+1)) ){
                mem[i][i+1] = true;
                start = i;
                result = 2;
            }
        }
        for (int i = 2; i < size; i++) {
            for(int j = 0; j < size - i; j++){
                int k = i+j;
                if(mem[j+1][k-1] && (str.charAt(j) == str.charAt(k))){
                    if(i+1 > result){
                        start = j;
                        result = i+1;
                    }
                    mem[j][k] = true;
                }
            }
        }
        return str.substring(start,start+result);
    }
}