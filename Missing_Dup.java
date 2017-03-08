import java.util.*;
public class Missing_Dup {
	public static void main(String[] args) {
		int a[] = {1,4,5,6,10,8};
		int b[] = {1,4,5,6,10};
		if(a.length > b.length){
			for(int i = 0; i < a.length; i++){
				if(Arrays.binarySearch(b, a[i]) < 0){
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}
