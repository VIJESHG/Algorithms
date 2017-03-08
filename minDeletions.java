import java.util.*;
public class minDeletions {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = s.nextInt();
		}
		int max = 1;
		Map<Integer,Integer> arr = new HashMap<>();
		for(int each: a){
			if(!arr.containsKey(each)){
				arr.put(each,1);
			}
			else{
				arr.put(each,arr.get(each)+1);
				if(max < arr.get(each))
					max = arr.get(each);
			}
		}
		System.out.println(n-max);
	}
}