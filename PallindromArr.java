class arr{
	int findMin(int a[],int n){
		int ans =0;
		for(int i = 0,j = n-1; i<= j;){
			if(a[i] == a[j]){
				i++;
				j--;
			}
			else if(a[i] > a[j]){
				j--;
				a[j] = a[j] + a[j+1];
				ans++;
			}
			else{
				i++; 
				a[i] = a[i] + a[i-1];
				ans++;
			}
		}
		return ans;
	}
}
public class PallindromArr {
	public static void main(String[] args) {
		int a[] = {1, 4, 5, 1};
		arr b = new arr();
		int c = b.findMin(a, 4);
		System.out.println(c);
	}
}