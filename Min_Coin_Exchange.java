import java.util.Scanner;
public class Coin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
		int i = a.length - 1;
		int count = 0;
		int n = s.nextInt();
		while(n != 0){
			if((n >= a[i]) && (n > 0)){
				n -= a[i];
				System.out.println(a[i]);
				count++;
			}
			else{
				i--;
			}
		}
		System.out.println(count);
		s.close();
	}
}
