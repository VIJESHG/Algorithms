class Solution {
    public int fib(int n) {
        int[] mem = new int[n+1];
        if(n <= 1)
            return n;
        for(int i =0 ; i <=n; i++){
            if(i <= 1)
                mem[i] = i;
            else
                mem[i] = mem[i-1]+mem[i-2];
        }
        return mem[n]; 
    }
}