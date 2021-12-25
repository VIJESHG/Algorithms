

int climbStairs(int n){
    int mem[n+1];
    mem[0] = 0;
    mem[1] = 1;
    
    if(n == 1 || n == 2){
        return n;
    }
    else{
        mem[2] = 2;
        for(int i =3; i <= n; i++){
            mem[i] = mem[i-1]+mem[i-2];
        }
    }
    
    return mem[n];
}