/*Following is the algorithm to find all the prime numbers less than or equal to a given integer n by Eratosthenes’ */
import java.util.*;
class Prime{
		void all_prime(int n){
			boolean[] arr = new boolean[n+1];
			int i;
			for(i = 0; i <= n; i++){
				arr[i] = true;
			}
			for(i = 2; i*i <= n; i++){
				if(arr[i] == true){
					for(int j = i * 2; j <= n; j+=i){
						arr[j] = false;
					}
				}
			}
			for(i = 2; i <= n; i++){
				if(arr[i] == true){
					System.out.print(i + " ");
				}
			}
		}
}
public class Prime_No {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Prime b = new Prime();
		b.all_prime(n);
		s.close();
	}
}
