public class Fibonacci {
    /* Find Nth Fibonacci using DP */
    public int Fib(int n){
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
    public static void main(String args[]){
        Fibonacci fb = new Fibonacci();
        System.out.println(fb.Fib(0));
        System.out.println(fb.Fib(1));
        System.out.println(fb.Fib(2));
        System.out.println(fb.Fib(3));
        System.out.println(fb.Fib(4));
    }
}
